package az.spring.hibernate.repository;

import az.spring.hibernate.model.User;
import org.springframework.data.jpa.repository.JpaRepository;

    public interface UserRepository extends JpaRepository<User, Long> {

    }
