package ro.itschool.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;

@Data
@Entity
@Table(name = "armadillo")
@NoArgsConstructor
@AllArgsConstructor


    public class Armadillo {

        @Id
        @GeneratedValue(strategy = GenerationType.AUTO)
        private Long id;

        @Column(name = ("name_of_armadillo"))
        public String name;

        @Column(name = ("age_of_armadillo"))
        private short age;


    }
