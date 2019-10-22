package com.devopsschool.springboot.microservice.example.currencyconversion;

import java.math.BigDecimal;

public class CurrencyConversionBean {

	private Long id;
	private String from;
	private String to;
	private BigDecimal conversionMultiple;
	private BigDecimal quantity;
	private BigDecimal totalCalculatedAmount;
	private int port;

	public CurrencyConversionBean() {

	}

	public CurrencyConversionBean(Long id, String from, String to, BigDecimal conversionMultiple, BigDecimal quantity,
	      BigDecimal totalCalculatedAmount, int port) {
	    super();
	    this.id = id;
	    this.from = from;
	    this.to = to;
	    this.conversionMultiple = conversionMultiple;
	    this.quantity = quantity;
	    this.totalCalculatedAmount = totalCalculatedAmount;
	    this.port = port;
	  }

	public Long getId() {
		return this.id;
	}

	public int getPort() {
		return this.port;
	}

	public BigDecimal getConversionMultiple() {
		return this.conversionMultiple;
	}
	
	public BigDecimal getTotalCalculatedAmount() {
		return this.totalCalculatedAmount;		
	}
	public BigDecimal getQuantity() {
		return this.quantity;
	}

	public String getFrom() {
		return this.from;
	}

	public String getTo() {
		return this.to;
	}
	
}
