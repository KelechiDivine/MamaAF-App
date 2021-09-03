package com.pt.programmingblogapp.entities;

import lombok.*;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import java.util.Date;

@Entity
@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter

public class ChatApp_Models {
	
		@Id
		@GeneratedValue(strategy = GenerationType.AUTO)
		private int id;
		
		private String title;
		private String body;
		private Date creationDate;
		
}
