package KlajdiNdoci;

import KlajdiNdoci.entities.Ordine;
import lombok.extern.slf4j.Slf4j;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.stereotype.Component;

@Component
@Slf4j
public class Runner implements CommandLineRunner {

    @Override
    public void run(String... args) throws Exception {
        AnnotationConfigApplicationContext ctx = new AnnotationConfigApplicationContext(U5W1D2Application.class);
        Ordine o1 = (Ordine) ctx.getBean("getOrdine");
        log.info(String.valueOf(o1));
        ctx.close();
    }
}
