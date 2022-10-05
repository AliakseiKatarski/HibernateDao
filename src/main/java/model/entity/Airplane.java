package model.entity;


import lombok.*;

import javax.persistence.*;

@Getter
@Setter
@Entity
@NoArgsConstructor
public class Airplane {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    @Column
    private String airplaneName;
    @Column
    private String airplaneModel;
    @Column
    private String boardNumber;
    @ManyToOne
    @JoinColumn(name="aircompany_id")
    private Aircompany aircompany;

}
