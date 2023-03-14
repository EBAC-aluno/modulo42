curl -X POST -H "Content-Type: application/json" -d '{
        "name": "Fanta",
        "description": "best soda ever",
        "price": "2.99"
      }' http://localhost:8082/api/product-service

curl -X DELETE http://localhost:8082/api/product-service/1

curl -X PUT -H "Content-Type: application/json" -d '{
        "name": "Corotinho",
        "description": "never tried before",
        "price": "4.00"
   		}
}' http://localhost:8082/api/product-service/2
