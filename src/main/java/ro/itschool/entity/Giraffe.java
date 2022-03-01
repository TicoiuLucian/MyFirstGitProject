package ro.itschool.entity;

import lombok.*;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
@Getter
@Setter
@ToString
@AllArgsConstructor
@NoArgsConstructor

public class Giraffe {

    @Id
    @GeneratedValue

    private int id;
    private String name;
    private int height;

}
