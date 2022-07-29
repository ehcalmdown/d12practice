package sg.nus.iss.workshop12;

import java.util.Collections;

import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.DefaultApplicationArguments;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class Workshop12Application {

	public static void main(String[] args) {
		//SpringApplication.run(Workshop12Application.class, args);
		SpringApplication app = new SpringApplication(Workshop12Application.class);
		ApplicationArguments cliOpts = new DefaultApplicationArguments(args);
		String port = "8085";
		if (cliOpts.containsOption("port")){
			port=cliOpts.getOptionValues("port").get(0);
		}
		app.setDefaultProperties(Collections.singletonMap("server.port", port));
		app.run(args);

	}

}
