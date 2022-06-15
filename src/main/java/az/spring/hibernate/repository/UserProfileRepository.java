package az.spring.hibernate.repository;

import az.spring.hibernate.model.UserProfile;
import org.springframework.data.jpa.repository.JpaRepository;

    public interface UserProfileRepository extends JpaRepository<UserProfile, Long> {

    }
