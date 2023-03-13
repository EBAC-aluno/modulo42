curl -X POST -H "Content-Type: application/json" -d '{
        "name": "Maria da silva",
        "gender": "FEMALE",
        "email": "mariadasilva@gmail.com",
        "telephone": "43 9 9887 9988", 
        "birthDay": "1998-02-12",
        "address": {
                "streetName": "Avenida Getúlio Vargas",
        	    "houseNumber": "34",
        	    "neighborhoodName": "Setor Central",
        	    "cityName": "Alto Horizonte",
        	    "state": "GO",
        	    "zipCode":"76579-970"
   		}
}' http://localhost:8081/api/customer-service

PUT

curl -X PUT -H "Content-Type: application/json" -d '{
        "name": "Renata da silva",
        "gender": "FEMALE",
        "email": "josedasilva@gmail.com",
        "telephone": "43 9 9887 9988", 
        "birthDay": "1998-02-12",
        "address": {
                "streetName": "Avenida Getúlio Vargas",
        	    "houseNumber": "34",
        	    "neighborhoodName": "Setor Central",
        	    "cityName": "Alto Horizonte",
        	    "state": "MT",
        	    "zipCode":"76579-970"
   		}
}' http://localhost:8081/api/customer-service/1

curl -X DELETE http://localhost:8081/api/customer-service/1


spring.jpa.hibernate.ddl-auto=update
spring.datasource.url=jdbc:mysql://${MYSQL_HOST:localhost}:3306/db_customer_ebac
spring.datasource.username=microserviceUser
spring.datasource.password=secret
spring.datasource.driver-class-name=com.mysql.cj.jdbc.Driver

server.port=8081
