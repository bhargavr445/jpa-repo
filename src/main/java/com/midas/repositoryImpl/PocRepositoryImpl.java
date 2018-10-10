package com.midas.repositoryImpl;

import java.util.List;

import javax.persistence.EntityManager;
import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.midas.model.Subscription;
import com.midas.repository.PocRepository;

@Repository

public class PocRepositoryImpl implements PocRepository {

	@Autowired
	EntityManager em;
	
	@Override
	@Transactional
	public List<Subscription> getSubscriptionsById(int id) {
		// TODO Auto-generated method stub
		List<Subscription> resultList = em.createQuery("SELECT p FROM Subscription p",Subscription.class).getResultList();
		System.out.println(resultList);
		return resultList;
	}

	@Override
	@Transactional
	//(noRollbackFor = Exception.class)
	public int createSubscription(Subscription subscription) {
		// TODO Auto-generated method stub
		try {
			Object subscription1 = null;
			em.persist(subscription);
		}
		catch (Exception e) {
			return 0;
		}
		em.flush();
		return 1;
	}

	@Override
	@Transactional
	public Subscription updateSubscription(Subscription subscription) {
		Subscription subscription2 = em.merge(subscription);
		return subscription2;
	}

	@Override
	@Transactional
	public Subscription getById(String name) {
		// TODO Auto-generated method stub
		Subscription subscription = em.find(Subscription.class, name);
		return subscription;
	}

}
