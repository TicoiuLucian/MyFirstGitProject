package ro.itschool.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;

@Entity
@AllArgsConstructor
@NoArgsConstructor
@Data
public class Kangaroo {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "ID_cangur")
    private int id;

    @Column(name = "Numele_cangurului")
    private String name;

    @Column(name = "Varsta_cangurului")
    private int age;

    @Column(name = "Viteza_cangurului")
    private int maxSpeed;

}
