package fab.cloud.admincloud;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Configuration;

import de.codecentric.boot.admin.config.EnableAdminServer;

@Configuration
@EnableAutoConfiguration
@SpringBootApplication
@EnableAdminServer
public class AdmincloudApplication {

	public static void main(String[] args) {
		SpringApplication.run(AdmincloudApplication.class, args);
	}
}
