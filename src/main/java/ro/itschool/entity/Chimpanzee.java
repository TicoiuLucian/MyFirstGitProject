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

public class Chimpanzee {
    @Id
    @GeneratedValue
    private int id;

    private String name;

    private int age;

    private byte hoursOfSleep;

    public Chimpanzee (String name, int age, byte hoursOfSleep) {
        this.name = name;
        this.age = age;
        this.hoursOfSleep = hoursOfSleep;
    }

    @Override
    public String toString() {
        return "Chimpanzee number " + id +
                " = " + name + ", " + age + " years old, that sleeps " + hoursOfSleep + " hours every night" + "\n";
    }
}
