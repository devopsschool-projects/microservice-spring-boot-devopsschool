# spring-boot-microservice-currency-conversion

## Project set up in Eclipse IDE:
- This application makes a call to another microservice named as spring-boot-microservice-forex-service.
		So, you need to set up spring-boot-microservice-forex-service before this
		Here's the repo url for spring-boot-microservice-forex-service:
		https://bitbucket.org/chetan-cotocus/spring-boot-microservice-forex-service/src/master/
- Clone it by clicking clone button above
- Import it as maven project in Eclipse IDE
- Compile with maven clean install goals
- Right Click on CurrencyConversionMicroserviceApplication.java -> Run As -> Java Application
- Test it by hitting below  given url in the browser:
		http://localhost:8100/currency-conversion-microservice/currency-converter/from/EUR/to/INR/quantity/500
- You should see the result something like this in the browser: {"id":10002,"from":"EUR","to":"INR","conversionMultiple":80.00,"quantity":500,"totalCalculatedAmount":40000.00,"port":8000}
