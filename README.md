# spring boot admin project for your applcaiton running on spring 1.5.X 


#### To intergrate spring boot admin project with you project


### add this deps

```
		<dependency>
			<groupId>de.codecentric</groupId>
			<artifactId>spring-boot-admin-starter-client</artifactId>
			<version>1.5.7</version>
		</dependency>
```

### add spring boot admin URL in application properties


```
spring.boot.admin.url: http://localhost:8080  
spring.boot.admin.api-path: instances
```