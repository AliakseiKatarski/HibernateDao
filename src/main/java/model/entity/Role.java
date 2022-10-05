package model.entity;

import lombok.Data;
import lombok.Getter;
import lombok.Setter;
import model.enums.Roles;
import javax.persistence.*;
import java.util.List;

@Getter
@Setter
@Entity
public class Role {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
    @Column(name="role_name")
    @Enumerated(EnumType.STRING)
    private Roles role;
    @OneToMany(mappedBy="role")
    private List<User> userRoleList;

}
