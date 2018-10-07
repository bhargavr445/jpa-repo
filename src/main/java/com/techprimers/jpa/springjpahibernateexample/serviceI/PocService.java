package com.techprimers.jpa.springjpahibernateexample.serviceI;

import java.util.List;

import com.techprimers.jpa.springjpahibernateexample.model.Subscription;

public interface PocService {
	
	List<Subscription> getSubscriptionsById(int id);

	int createSubscription(Subscription subscription);

	Subscription updateSubscription(Subscription subscription);

	Subscription getById(String name);
}
