package az.spring.hibernate.model;

import lombok.Data;

import javax.persistence.*;
import java.time.LocalDate;

@Entity
@Table(name = "user_profile")
@Data
public class UserProfile {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String phoneNumber;

    @Enumerated(EnumType.STRING)
    private Gender gender;

    private String address;

    @OneToOne(fetch = FetchType.LAZY, cascade = CascadeType.ALL, mappedBy = "userProfile")
    private User user;

    @Column(name = "birth_of_date")
    private LocalDate birthOfDate;

    public UserProfile(String phoneNumber, Gender gender, String address, LocalDate birthOfDate) {
        this.phoneNumber = phoneNumber;
        this.gender = gender;
        this.address = address;
        this.birthOfDate = birthOfDate;
    }

    public UserProfile() {

    }
}
