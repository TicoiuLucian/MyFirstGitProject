package ro.itschool;

import org.w3c.dom.ls.LSOutput;
import ro.itschool.dao.EagleDAO;
import ro.itschool.entity.Eagle;

public class App {
    public static void main(String[] args) {

        EagleDAO eagleDAO = new EagleDAO();

        Eagle loki = new Eagle("American","Loki",13);
        Eagle thor = new Eagle("American","Thor",13);
        Eagle Zeus = new Eagle("American","Zeus",13);

        eagleDAO.saveEagle(thor);
        eagleDAO.saveEagle(loki);
        eagleDAO.saveEagle(Zeus);

        eagleDAO.getAllEagles();

        eagleDAO.deleteEagle(loki);
        eagleDAO.updateEagle("Thor");
        eagleDAO.deleteEagle(Zeus);




    }


}
