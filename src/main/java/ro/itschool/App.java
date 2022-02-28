package ro.itschool;

import ro.itschool.dao.ElephantDAO;
import ro.itschool.entity.Elephant;

public class App {
    public static void main(String[] args) {
        System.out.println("Hello world !");

        System.out.println("Hello team!");

        System.out.println("guten morgen");

        System.out.println("Hi ");

        System.out.println("hi there!");

        //------------------------------------------------------
        ElephantDAO elephantDAO = new ElephantDAO();

        Elephant elephant1 = new Elephant();
        elephant1.setName("Elephant 1");
        elephant1.setKg(5000);

        Elephant elephant2 = new Elephant();
        elephant2.setName("Elephant 2");
        elephant2.setKg(6500);

        Elephant elephant3 = new Elephant();
        elephant3.setName("Elephant 3");
        elephant3.setKg(2000);

        elephantDAO.saveElephant(elephant1);
        elephantDAO.saveElephant(elephant2);
        elephantDAO.saveElephant(elephant3);

//        elephantDAO.updateElephant(1);
//
//        elephantDAO.deleteElephant(elephant3);

        elephantDAO.getAllElephants();
    }
}