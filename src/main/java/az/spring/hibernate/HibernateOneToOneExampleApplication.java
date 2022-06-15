package az.spring.hibernate;

import az.spring.hibernate.model.Gender;
import az.spring.hibernate.model.User;
import az.spring.hibernate.model.UserProfile;
import az.spring.hibernate.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.time.LocalDate;

@SpringBootApplication
public class HibernateOneToOneExampleApplication implements CommandLineRunner {

    public static void main(String[] args) {
        SpringApplication.run(HibernateOneToOneExampleApplication.class, args);
    }

    @Autowired
    private UserRepository userRepository;

    @Override
    public void run(String... args) throws Exception {
        User user=new User();
        user.setName("Elvin");
        user.setEmail("elvinaliyevinfo@gmail.com");
        user.setId(5l);

        UserProfile userProfile=new UserProfile();
        userProfile.setAddress("Baku");
        userProfile.setGender(Gender.MALE);
        userProfile.setPhoneNumber("+9940000000");
        userProfile.setBirthOfDate(LocalDate.of(2000,04,26));

        user.setUserProfile(userProfile);
        userProfile.setUser(user);

        userRepository.save(user);
    }
}
