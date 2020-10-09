package tn.spb.cnspbschedulerexample;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.scheduling.annotation.EnableScheduling;

@SpringBootApplication
@EnableScheduling
public class CnSpbSchedulerexampleApplication {

    public static void main(String[] args) {
        SpringApplication.run(CnSpbSchedulerexampleApplication.class, args);
    }

}
