# Rest End points
- Start Spring Boot Application
- Use Postman/Mozilla REST Client plugin/ Chrome REST client plugin to test
- Add request header 'Content-Type: application/json' 
- To view h2 tables login to [H2 Console](http://localhost:8080/h2-console)


###### Create Employee

- curl -X POST -H 'Content-Type: application/json' -i http://localhost:8080/v1/bfs/employees/create --data '{
	"first_name"	: "User First Name",
	"last_name"	: "User Last Name",
	"date_of_birth"	: "User DOB",
	"address" : {
		"line1" : "address line1",
		"line2"	: "address line2 is optional",
		"city"	: "user city",
		"state"	: "User state",
		"country" : "User country",
		"zip_code" : "User zip code"
	}
}'


###### Get Employee by Id  - Get employee by employee id

- curl -X GET -i http://localhost:8080/v1/bfs/employees/1