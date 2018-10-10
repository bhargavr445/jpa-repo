package com.midas.resource;

import com.midas.exception.UsersListEmpty;
import com.midas.model.*;
import com.midas.repository.CategoriesRepository;
import com.midas.repository.UsersRepository;

import io.swagger.annotations.ApiResponse;
import io.swagger.annotations.ApiResponses;
import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

import javax.servlet.http.HttpServletRequest;
@CrossOrigin(origins = "http://localhost:4200", maxAge = 3600)
@RestController
@RequestMapping(value="/rest/users")
public class UsersResource {

	static Logger logger = Logger.getLogger(UsersResource.class);
    @Autowired
    UsersRepository usersRepository;
   
    @Autowired
	 BCryptPasswordEncoder bCryptPasswordEncoder;
    
    @Autowired
    CategoriesRepository categoriesRepository;
    
    @GetMapping(value = "/logIn")
   	public UserRegister logIn(HttpServletRequest req) {
    	UserRegister ur = new UserRegister();
   		//ur.setPassword();
   		ur.setUserName(req.getHeader("userName"));
   	  ur.setPassword(bCryptPasswordEncoder.encode(req.getHeader("password")));
//   		System.out.println(header);
//   		TokenParams tokenParams = new TokenParams();
//   		tokenParams.setAccessToken("AccessToken");
//   		tokenParams.setExpiresIn("20:00 min");
//   		tokenParams.setTokenType("test");
//   		tokenParams.setRole(req.getHeader("role"));
//   		tokenParams.setUserName(req.getHeader("token"));
   		return ur;
   	}
    
    @GetMapping(value ="/all")
    @ApiResponses(value = {
            @ApiResponse(code = 200, message = "Success", response = Users.class),
            @ApiResponse(code = 202, message = "Accepted"),
            @ApiResponse(code = 400, message = "Bad Request"),
            @ApiResponse(code = 500, message = "Failure", response= ExceptionResponse.class)
    })
    public List<Users> getAll() {
         List<Users> findAll = usersRepository.findAll();
         if(findAll == null) {
        	 throw new UsersListEmpty("User empty");
         }
         return findAll;
    }

    @GetMapping(value ="/{name}")
    public List<Users> getUser(@PathVariable(value = "name") final String name) {
        return usersRepository.findByName(name);

    }

    @GetMapping(value ="/id/{id}")
    public Users getId(@PathVariable(value="id") final Integer id) {

        return usersRepository.findOne(id);
    }

    @GetMapping(value ="/update/{id}/{name}")
    public Users update(@PathVariable(value="id") final Integer id, @PathVariable(value="name")
                         final String name) {


        Users users = getId(id);
        users.setName(name);

        return usersRepository.save(users);
    }
    @GetMapping(value ="/getAllCategories")
    public List<Categories> getAllCat() {
    	List<Categories> cat =	categoriesRepository.findAll();
        return cat;
    }
    
    @DeleteMapping(value ="/deleteServer/{id}")
    public String deleteServer(@PathVariable(value="id") final String serverid) {
    	logger.info("Server "+ serverid +" Deleted" );
    	return "sucess";
    	
    }


    
//    @PostMapping("/addCategories")
//    public int addData(@RequestBody Categories categories) {
//    	System.out.println(categories);
//    	return 1;
//    }
}
