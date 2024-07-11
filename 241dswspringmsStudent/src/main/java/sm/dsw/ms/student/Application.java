package sm.dsw.ms.student;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.context.annotation.ComponentScan;

@EnableDiscoveryClient
@SpringBootApplication
@ComponentScan("sm.dsw.ms.student")
public class Application {

	public static void main(String[] args) {
		SpringApplication.run(Application.class, args);
	}

}
