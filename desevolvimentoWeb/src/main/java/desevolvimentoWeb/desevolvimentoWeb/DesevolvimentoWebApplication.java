package desevolvimentoWeb.desevolvimentoWeb;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@SpringBootApplication
@EnableJpaRepositories
public class DesevolvimentoWebApplication {

	public static void main(String[] args) {
		SpringApplication.run(DesevolvimentoWebApplication.class, args);
	}

}
