package com.pt.programmingblogapp.services;

import com.pt.programmingblogapp.entities.ChatApp_Models;
import com.pt.programmingblogapp.repository.ChatApp_Repository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service

public class ChatApp_Services {
	
	@Autowired
	private ChatApp_Repository chatApp_repository;
	
	public List<ChatApp_Models> getListOfMamaAF(){
		return chatApp_repository.findAll();
		
	}
}
