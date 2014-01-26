package com.saying.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.saying.dao.SayingDAO;
import com.saying.domain.Saying;

@Service("sayingService")
public class SayingService {
	@Autowired
	SayingDAO sayingDAO;

	@Transactional
	public Saying getRandomSaying() {
		return sayingDAO.getRandomSaying();
	}

}
