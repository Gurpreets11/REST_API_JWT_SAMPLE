# JWT API

A new java project which is used to implement the JWT in api...

## Getting Started

 
 
## API


API : http://localhost:8002/jwtapi/auth/signup

Request : 
{
    "email":"Anil@gmail.com",
    "password":"123456",
    "fullName":"Anil Kumar"
}



API : http://localhost:8002/jwtapi/auth/login

Request :

{
    "email":"Anil@gmail.com",
    "password":"123456"  
}



API : http://localhost:8002/jwtapi/users

Header : Bearer Token : token_generated_in_login_api_response


API : http://localhost:8002/jwtapi/users/me

Header : Bearer Token : token_generated_in_login_api_response




