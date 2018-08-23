# spring boot admin project for your applcaiton running on spring 2.X  and 1.X 


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
spring.boot.admin.url: http://localhost:7777  
spring.boot.admin.api-path: instances
```


REf:

https://github.com/codecentric/spring-boot-admin/issues/802
http://codecentric.github.io/spring-boot-admin/current/#monitoring-spring-boot-1.5.x
https://github.com/codecentric/spring-boot-admin/blob/master/README.md

