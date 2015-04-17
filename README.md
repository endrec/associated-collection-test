Demonstration project for a Spring issue
========================================

According to the [Spring Data REST documentation][1], POST method is supported for collections, so 

  curl -i -X POST -H 'Content-type: text/uri-list' -d 'http://localhost:8080/artifacts/1' http://localhost:8080/collectors/1/artifacts

should add an artifact to the (yet empty) collection. Unfortunately, it does not:

```
HTTP/1.1 405 Method Not Allowed
Server: Apache-Coyote/1.1
Allow: GET, DELETE, PATCH, PUT
Content-Type: application/json;charset=UTF-8
Transfer-Encoding: chunked
Date: Fri, 17 Apr 2015 22:54:59 GMT

{"timestamp":1429311299117,"status":405,"error":"Method Not Allowed","exception":"org.springframework.web.HttpRequestMethodNotSupportedException","message":"Request method 'POST' not supported","path":"/collectors/1/artifacts"}
```

[1]: http://docs.spring.io/spring-data/rest/docs/current/reference/html/#repository-resources.association-resource
