package com.saying.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import com.saying.domain.Saying;
import com.saying.service.SayingService;

@Controller
@RequestMapping(value = "/")
public class SayingController {

	@Autowired
	private SayingService sayingService;

	@RequestMapping(method = RequestMethod.GET)
	public @ResponseBody
	Saying getSaying() {
		return sayingService.getRandomSaying();
	}

}
