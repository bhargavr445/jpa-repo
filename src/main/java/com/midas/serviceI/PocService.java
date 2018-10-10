package com.midas.serviceI;

import java.util.List;

import com.midas.model.Subscription;

public interface PocService {
	
	List<Subscription> getSubscriptionsById(int id);

	int createSubscription(Subscription subscription);

	Subscription updateSubscription(Subscription subscription);

	Subscription getById(String name);
}
