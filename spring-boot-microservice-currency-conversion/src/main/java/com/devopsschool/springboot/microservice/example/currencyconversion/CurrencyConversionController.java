package com.devopsschool.springboot.microservice.example.currencyconversion;

import java.math.BigDecimal;
import java.util.HashMap;
import java.util.Map;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

@CrossOrigin
@RestController
public class CurrencyConversionController {

	private Logger logger = LoggerFactory.getLogger(this.getClass());

	@GetMapping("/currency-conversion-microservice/currency-converter/from/{from}/to/{to}/quantity/{quantity}")
	public CurrencyConversionBean convertCurrency(@PathVariable String from, @PathVariable String to,
			@PathVariable BigDecimal quantity) {

		logger.info("In CurrencyConversionController...");
		logger.info("Received following parameters in the request:");
		logger.info("1. from: " + from);
		logger.info("2. to: " + to);
		logger.info("3. quantity: " + quantity);
		
		logger.info("Now connecting to: " + "http://localhost:8000//forex-microservice/currency-exchange/from/" + from + "/to/" + to);

		Map<String, String> uriVariables = new HashMap<>();
		uriVariables.put("from", from);
		uriVariables.put("to", to);

		ResponseEntity<CurrencyConversionBean> responseEntity = new RestTemplate().getForEntity(
				"http://localhost:8000//forex-microservice/currency-exchange/from/{from}/to/{to}", CurrencyConversionBean.class,
				uriVariables);

		CurrencyConversionBean response = responseEntity.getBody();
		
		logger.info("Connection to forex micro service was successful!");
		logger.info("We have received following parameters in the response from forex micro service: ");
		logger.info("1. id: " + response.getId());
		logger.info("2. from: " + response.getFrom());
		logger.info("3. to: " + response.getTo());
		logger.info("4. conversionMultiple: " + response.getConversionMultiple());
		logger.info("5. port: " + response.getPort());

		return new CurrencyConversionBean(response.getId(), from, to, response.getConversionMultiple(), quantity,
				quantity.multiply(response.getConversionMultiple()), response.getPort());
	}
}
