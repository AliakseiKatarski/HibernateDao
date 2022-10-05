package model.entity;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.sql.Timestamp;


@Data
@Entity
@NoArgsConstructor
public class Route {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
    @Column
    private Timestamp departureTime;
    @Column
    private Timestamp arrivalTime;
    @ManyToOne
    @JoinColumn(name="departureCity_id")
    private City departureCity;
    @ManyToOne
    @JoinColumn(name = "arrivalCity_id")
    private City arrivalCity;
    @ManyToOne
    @JoinColumn(name = "airplane_id")
    private Airplane airplane;
}
