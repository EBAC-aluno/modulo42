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
