package ro.itschool.entity;

import lombok.*;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@ToString
public class Elephant {

    @Id
    @GeneratedValue
    private int id;

    private String name;

    private int kg;
}