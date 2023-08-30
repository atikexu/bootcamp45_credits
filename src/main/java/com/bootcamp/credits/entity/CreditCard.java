package com.bootcamp.credits.entity;

import java.util.Date;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import com.fasterxml.jackson.annotation.JsonIgnore;

import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
@Document(collection="creditcard")
public class CreditCard {
	@Id
	private String id;
	private String customerId;
	@JsonIgnore
	private Integer typeAccount;
	private String descripTypeAccount;
	private Double creditAmount;
	private Double existingAmount;
	private Date creditDate;
	private String numberCard;
	private String typeCustomer;
}
