package com.techprimers.jpa.springjpahibernateexample.repository;

import java.util.List;

import com.techprimers.jpa.springjpahibernateexample.model.Subscription;

public interface PocRepository {

	List<Subscription> getSubscriptionsById(int id);

	int createSubscription(Subscription subscription);

	Subscription updateSubscription(Subscription subscription);

	Subscription getById(String id);
}
