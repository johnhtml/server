# server

This server is a RESTful API capable of managing GET, PUT, POST and DELETE requests. The Spring Boot framework is used to leverage the APP

This project ensures Inversion of Control (IoC) by using some Dependency Injection
procedures provided by Spring Boot

The arquitecture eases the change between different database services because of the
contract interfaces, a general view of the model used can be check in the next image:

<p align="center">
  <img src="https://user-images.githubusercontent.com/50509447/172481220-92dd3f61-6ae4-424d-a835-c5e43abc1a05.png" alt="Sublime's custom image"/>
</p>

In the other hand, the GET, PUT, POST and DELETE requests are connected to the following frontEnd
Angular user interface. (This Angular code can be found at https://github.com/johnhtml/serverapp)

<p align="center">
  <img src="https://user-images.githubusercontent.com/50509447/173255748-db238718-d911-47af-9fbf-db5598954f1e.png" alt="Sublime's custom image"/>
</p>
