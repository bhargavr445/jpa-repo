package com.midas.repository;

import java.util.List;

import com.midas.model.Subscription;

public interface PocRepository {

	List<Subscription> getSubscriptionsById(int id);

	int createSubscription(Subscription subscription);

	Subscription updateSubscription(Subscription subscription);

	Subscription getById(String id);
}
