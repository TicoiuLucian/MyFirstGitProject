package ro.itschool.entity;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@Entity
public class Eagle {

    @Id
    @GeneratedValue
    private long id;
    private String breed;
    private String name;
    private int age;


    public Eagle(String breed, String name, int age){
        this.breed = breed;
        this.name = name;
        this.age = age;
    }

    @Override
    public String toString() {
        return "Eagle id is" +
                "id=" + id +
                ", has breed='" + breed + '\'' +
                ", his name='" + name + '\'' +
                ", age=" + age +
                '}';
    }
}
