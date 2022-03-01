package ro.itschool;

import com.github.javafaker.Faker;
import org.w3c.dom.ls.LSOutput;
import ro.itschool.dao.GiraffeDAO;
import ro.itschool.entity.Giraffe;

public class App {

   // static Faker faker = new Faker();

    public static void main(String[] args) {

        GiraffeDAO giraffeDAO = new GiraffeDAO();

        Giraffe giraffe = new Giraffe();
        giraffe.setName("Melman");
        giraffe.setId(45);
        giraffe.setHeight(5);

        giraffeDAO.saveGiraffe(giraffe);
        giraffeDAO.getClass();
    }


}
