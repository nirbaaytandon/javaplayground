package redis.app;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cache.annotation.EnableCaching;
import redis.repository.UserRepository;
import redis.user.User;

@SpringBootApplication
@EnableCaching
public class Application implements CommandLineRunner {
    private final Logger LOGGER = LoggerFactory.getLogger(Application.class);
    private final UserRepository userRepository;

    @Autowired
    public Application(UserRepository userRepository) {
        this.userRepository = userRepository;
    }

    public static void main(String[] args) {
        SpringApplication.run(Application.class, args);
    }

    @Override
    public void run(String... strings) {
        // Populating embedded database here
        LOGGER.info("Saving users. Current user count is {}.", userRepository.count());
        User user1 = new User("user1", 2000);
        User user2 = new User("user2", 29000);
        User user3 = new User("user3", 550);

        userRepository.save(user1);
        userRepository.save(user2);
        userRepository.save(user3);
        LOGGER.info("Done saving users. Data: {}.", userRepository.findAll());
    }
}
