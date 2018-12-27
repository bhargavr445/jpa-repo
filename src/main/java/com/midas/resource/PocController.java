package com.midas.resource;

import java.util.List;

import javax.validation.Valid;

import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.ui.Model;
import org.springframework.validation.Errors;
import org.springframework.validation.ObjectError;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;
import org.springframework.validation.BindingResult;
import com.midas.exception.ValidationError;
import com.midas.interceptor.AppInterceptor;
import com.midas.model.ApiErrors;
import com.midas.model.Subscription;
import com.midas.serviceI.PocService;
@CrossOrigin(origins = "http://localhost:4200", maxAge = 3600)
@RestController
@RequestMapping(value="/poc")
public class PocController {
	
	@Autowired
	PocService pocService;
	
	static Logger logger = Logger.getLogger(AppInterceptor.class);
	
	@GetMapping(value="/getById/{id}")
	public List<Subscription> getSubscriptionById(@PathVariable(value="id") final Integer id) {
		return pocService.getSubscriptionsById(id);
	}
	
	@PostMapping(value="/createSubscription")
	public ResponseEntity<String> createSubscription(@RequestBody @Valid Subscription subscription, Errors error, 
			BindingResult bindingResult, RedirectAttributes redirectAttributes) {
		logger.info("Intercepted postHandle calling controller");
		if(error.hasErrors()) {
		List<ObjectError> allErrors = error.getAllErrors();

			logger.info(allErrors.get(0).getDefaultMessage());
			logger.info(allErrors + "Error Objectr");
		//return "Form Not Valid";
		//	throw new ValidationError(allErrors);
			 return  new ResponseEntity(new ApiErrors(error), HttpStatus.BAD_REQUEST);
		}
		 redirectAttributes.addFlashAttribute("subscription", subscription);
	        return new ResponseEntity<>(HttpStatus.OK);
		//int i = pocService.createSubscription(subscription);
		//return "1";
	}
	
	@PutMapping(value="/updateSubscription")
	public Subscription updateSubscription(@RequestBody Subscription subscription) {
		return pocService.updateSubscription(subscription);
	}
	
	@GetMapping(value="/getRecordById/{name}")
	public Subscription getById(@PathVariable(value="name") String name) {
		return pocService.getById(name);
	}
	@GetMapping("/success")
    public String successPage(Model model, @ModelAttribute("form") Subscription form) {
        model.addAttribute("form", form);
        return "success";
    }

}
