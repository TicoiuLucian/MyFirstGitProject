package ro.itschool;


import ro.itschool.dao.CatDAO;
import ro.itschool.entity.Cat;

public class App {
    public static void main(String[] args) {
        System.out.println("Hello world !");

        System.out.println("Hello team!");

        System.out.println("guten morgen");

        System.out.println("Hi ");

        System.out.println("hi there!");


//
        CatDAO catDAO = new CatDAO();

        Cat cat1 = new Cat();
        cat1.setId(1);
        cat1.setName("Cat 1");
        cat1.setColour("Black");

        Cat cat2 = new Cat();
        cat2.setId(2);
        cat2.setName("Cat 2");
        cat2.setColour("White");

        Cat cat3 = new Cat();
        cat1.setId(2);
        cat3.setName("Cat 2");
        cat3.setColour("White");

        catDAO.saveCat(cat1);
        catDAO.saveCat(cat2);
        catDAO.saveCat(cat3);
        catDAO.deleteCat(cat2);
        catDAO.getAllCats();

    }


}
