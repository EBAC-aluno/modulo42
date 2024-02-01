# Simple API
This is a RESTful API built on microservice architecture.

## Setup
For product and customer services, you need to create MySQL databases and grant all permissions to the MySQL users. Please modify the file `/src/main/resources/application.properties` by replacing the `{database name}`, `{user name}`, and user `{password}` fields.

> [!NOTE]
> The default port is `0`, allowing the application to pick up any random available one.

The gateway and discovery server use ports `8083` and `8090`, respectively, but you can change these values if they are already in use by modifying the `application.yaml` file in the root of these folders.

> [!IMPORTANT]
> The discovery server must be started first, followed by the customer, product, and gateway services, without any particular order.

## Running
To start the application, navigate to the root of each project and run the following Gradle task:
```sh
./gradlew bootRun
```

## REST API Methods

### customer-services 

```bash
curl -X POST \
  http://localhost:8090/api/customer-service \
  -H 'Content-Type: application/json' \
  -d '{
    "name": "Juliano Garcia",
    "gender": "MALE",
    "email": "juliano@gmail.com",
    "birthDay": "1998-02-12",
    "telephone": "22 9 9887 9988",
    "address": {
        "streetName": "Avenida Getúlio Vargas",
        "houseNumber": 34,
        "neighborhoodName": "Setor Central",
        "cityName": "Alto Horizonte",
        "state": "GO",
        "zipCode": "76579-970"
    }
}'
```
```bash
curl -X PUT \
  http://localhost:8090/api/customer-service/{id} \
  -H 'Content-Type: application/json' \
  -d '{
    "name": "Geralda Fuertes",
    "gender": "FEMALE",
    "email": "Geralda Fuertes@example.com",
    "birthDay": "1998-02-12",
    "telephone": "43 9 9887 9988",
    "address": {
        "streetName": "Avenida Getúlio Vargas",
        "houseNumber": 34,
        "neighborhoodName": "Setor Central",
        "cityName": "Alto Horizonte",
        "state": "GO",
        "zipCode": "76579-970"
    }
}'
```
```bash
curl -X DELETE \
  http://localhost:8090/api/customer-service/{id} \
  -H 'Content-Type: application/json'
```
```bash
curl -X GET \
  http://localhost:8090/api/customer-service/{id} \
  -H 'Content-Type: application/json'
```
or
```bash
curl -X GET \
  http://localhost:8090/api/customer-service \
  -H 'Content-Type: application/json'

```
### product-services 
```bash
curl -X POST \
  http://localhost:8090/api/product-service \
  -H 'Content-Type: application/json' \
  -d '{
	"name": "backhoe",
	"description": "big yellow machine",
	"price": "37000"
    }
}'
```
```bash
curl -X PUT \
  http://localhost:8090/api/product-service/{id} \
  -H 'Content-Type: application/json' \
  -d '{
	"name": "backhoe5",
	"description": "big blue machine",
	"price": "37000"
    }
}'
```
```bash
curl -X DELETE \
  http://localhost:8090/api/product-service/{id} \
  -H 'Content-Type: application/json'
```
```bash
curl -X GET \
  http://localhost:8090/api/product-service/{id} \
  -H 'Content-Type: application/json'
```
or
```bash
curl -X GET \
  http://localhost:8090/api/product-service \
  -H 'Content-Type: application/json'
```
