package KlajdiNdoci;

import KlajdiNdoci.entities.Menú;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

@SpringBootApplication
public class U5W1D2Application {

	public static void main(String[] args) {
		SpringApplication.run(U5W1D2Application.class, args);

		configurationClass();
	}

	public static void configurationClass() {
		AnnotationConfigApplicationContext ctx = new AnnotationConfigApplicationContext(U5W1D2Application.class);
		System.out.println(ctx.getBean("getMenu"));
		System.out.println(ctx.getBean("getOrdine"));
		ctx.close();
	}
}
