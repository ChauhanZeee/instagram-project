# Instagram api Project 
## Frameworks and language used:
-  Spring Boot
-  Java
- SQL database
## Data Flow


* **Model** :
  There are Four Model class in this application.
    1. User Model Class.
    2. Post Model Class.

* **Controller** :

  There are Four Controller class in this application.

    1. User Controller Class.
    2. Post Controller Class.

**Functions/Endpoints used in User Controller Class.**
- To add User data :
- http://localhost:8080/saveUser


- To get all User's information:
- http://localhost:8080/user


- To update User's details:
- http://localhost:8080/user/{userId}

- To get User by id:
- http://localhost:8080/user

**Functions/Endpoints used in Post Controller Class.**

- To add Post:
- http://localhost:8080/post

- To get all Post:
- http://localhost:8080/post

- To get Post by Post:
- http://localhost:8080/post


* **Service** :

    * In this application there are Four service class .
        * User Service Class
        * Post Service Class


* **Util/Validation** :
    * In this application there are Two Validation class .
      * User Validation Class
      * Post Validation Class

* **Repository**

    * In this application there Four Repository class.
        * IUserRepository
        * IPostRepository

* **Database**

    * I have used SQL Database to store the data.

## Project Summary

In this application by using various RestApi we can add User, we can associate multiple
Post to a perticular User.
We can validate all details of User like email, phone_number etc.
we fetch various data using different endpoints.
We can visualize data on SQL workbench.

