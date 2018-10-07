package com.techprimers.jpa.springjpahibernateexample.serviceImpl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.techprimers.jpa.springjpahibernateexample.model.Subscription;
import com.techprimers.jpa.springjpahibernateexample.repository.PocRepository;
import com.techprimers.jpa.springjpahibernateexample.serviceI.PocService;
@Service
public class PocServiceImpl implements PocService {

	@Autowired
	PocRepository pocRepository;
	@Override
	public List<Subscription> getSubscriptionsById(int id) {
		List<Subscription> list = pocRepository.getSubscriptionsById(id);
		return list;
	}

	@Override
	public int createSubscription(Subscription subscription) {
		int createSubscription = pocRepository.createSubscription(subscription);
		return 0;
	}

	@Override
	public Subscription updateSubscription(Subscription subscription) {
		Subscription updatedSubscription = pocRepository.updateSubscription(subscription);
		return updatedSubscription;
	}

	@Override
	public Subscription getById(String name) {
		Subscription subscription = pocRepository.getById(name);
		return subscription;
	}

}
