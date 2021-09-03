package com.pt.programmingblogapp.repository;

import com.pt.programmingblogapp.entities.ChatApp_Models;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository

public interface ChatApp_Repository extends JpaRepository<ChatApp_Models, Integer> {

}
