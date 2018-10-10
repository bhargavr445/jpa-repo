package com.midas.resource;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.midas.model.Subscription;
import com.midas.serviceI.PocService;
@CrossOrigin(origins = "http://localhost:4200", maxAge = 3600)
@RestController
@RequestMapping(value="/poc")
public class PocController {
	
	@Autowired
	PocService pocService;
	
	@GetMapping(value="/getById/{id}")
	public List<Subscription> getSubscriptionById(@PathVariable(value="id") final Integer id) {
		return pocService.getSubscriptionsById(id);
	}
	
	@PostMapping(value="/createSubscription")
	public int createSubscription(@RequestBody Subscription subscription) {
		int i = pocService.createSubscription(subscription);
		return 1;
	}
	
	@PutMapping(value="/updateSubscription")
	public Subscription updateSubscription(@RequestBody Subscription subscription) {
		return pocService.updateSubscription(subscription);
	}
	
	@GetMapping(value="/getRecordById/{name}")
	public Subscription getById(@PathVariable(value="name") String name) {
		return pocService.getById(name);
	}

}
