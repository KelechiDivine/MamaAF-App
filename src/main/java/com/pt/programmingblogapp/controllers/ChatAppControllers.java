package com.pt.programmingblogapp.controllers;

import com.pt.programmingblogapp.entities.ChatApp_Models;
import com.pt.programmingblogapp.services.ChatApp_Services;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class ChatAppControllers {
	
	@Autowired
	private ChatApp_Services chatApp_services;
	
	@GetMapping("/")
	public String index(){
		return "index";
	}

	@GetMapping(value = "/af")
	public List<ChatApp_Models> chatApp_modelsList() {
		return chatApp_services.getListOfMamaAF();
	}
}
