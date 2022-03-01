package ro.itschool;

import ro.itschool.dao.LionDAO;
import ro.itschool.entity.Lion;

public class App {
    public static void main(String[] args) {
        System.out.println("Hello world !");

        System.out.println("Hello team!");

        System.out.println("guten morgen");

        System.out.println("Hi ");

        System.out.println("hi there!");

        LionDAO lionDAO = new LionDAO();

        Lion lion = new Lion();
        lion.setName("Lion1");
        lion.setGendre("M");
        lion.setAge(10);

        Lion lion2 = new Lion();
        lion2.setName("Lion2");
        lion2.setGendre("F");
        lion2.setAge(8);

        lionDAO.saveLion(lion);
        lionDAO.saveLion(lion2);

//        lionDAO.deleteLion(lion2);
//
//        lionDAO.updateLion(1);

        lionDAO.getLion();
    }
}
