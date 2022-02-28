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
public class Lion {

    @Id
    @GeneratedValue
    private int id;

    private String name;

    private String gendre;

    private int age;

    @Override
    public String toString() {
        return "Lion: " +
                "id " + id +
                " name " + name +
        " gendre" + gendre +
        " age " + age;
    }
}
