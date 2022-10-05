package model.entity;


import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;
import java.sql.Timestamp;

@Entity
@Getter
@Setter
public class Passport {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
    @Column
    private String passNumber;
    @Column
    private Timestamp validity;
    @ManyToOne
    @JoinColumn(name="user_id")
    private User user;

}
