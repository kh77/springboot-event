## Spring Boot Events


- How to use ApplicationEventPulisher and EventListener.
- Using @Async approach for EventListener to handle. 


- For User endpoint:
     ` curl --location --request POST 'localhost:8080/users' \
      --header 'Content-Type: application/json' \
      --data-raw '{
      "userName" : "hello-world",
      "password" : "hello-world"
      }'`

