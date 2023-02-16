package net.javaguides.springboot.springworldhelloworldtotourial;


import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

 
@SpringBootApplication
public class Application implements CommandLineRunner {

    private Logger logger = LoggerFactory.getLogger(this.getClass());

    @Autowired
    private  AccountRepo accountRepo;
    @Autowired
    private NotificationRepo notificationRepo;
    @Autowired
    private StatisticRepo statisticRepo;

    @Override
    public void run(String...args) throws Exception {





        logger.info("All users -> {}", accountRepo.findAll());
     
        logger.info("Notifications -> {}", notificationRepo.findAll());
        logger.info("Statistics -> {}", statisticRepo.findAllStat());
    }
     
     
    public static void main(String[] args) {

        SpringApplication.run(Application.class, args);

        
         
    }
}

