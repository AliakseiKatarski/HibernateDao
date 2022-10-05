package model.entity;


import lombok.Data;

import javax.persistence.*;

@Entity
@Data
public class City {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
    @Column(name="country_id")
    private Integer countryId;
    @Column
    private String cityName;
}
