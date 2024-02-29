package sn.isi.jenkispipeline;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

import java.util.Map;

@SpringBootApplication
@ComponentScan("sn.isi.jenkispipeline")
public class DemoApplication {

	public static void main(String[] args) {
		SpringApplication app = new SpringApplication(DemoApplication.class);
		app.setDefaultProperties(Map.of(
			));
		app.run(args);
	}
}
