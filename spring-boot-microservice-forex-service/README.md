# spring-boot-microservice-forex-service

## Project set up in Eclipse IDE:
- Clone it by clicking clone button above
- Import it as maven project in Eclipse IDE
- NOTE: This application makes a call to a database that is configured in aplication.properties file
- Compile with maven clean install goals
- Right Click on CurrencyConversionMicroserviceApplication.java -> Run As -> Java Application
- Test it by hitting below  given url in the browser:
		http://localhost:8000/forex-microservice/currency-exchange/from/EUR/to/INR
- You should see a result something like this in the browser:
{"id":10002,"from":"EUR","to":"INR","conversionMultiple":80.00,"port":8000}

