package ro.itschool;

import ro.itschool.dao.ChimpanzeeDAO;
import ro.itschool.entity.Chimpanzee;

public class App {
    public static void main(String[] args) {

        ChimpanzeeDAO chimpanzeeDAO = new ChimpanzeeDAO();

        Chimpanzee chimpanzee = new Chimpanzee("Chimpi", 13, (byte) 7);
        Chimpanzee chimpanzee2 = new Chimpanzee("ChimpanZeus", 15, (byte) 5);

        chimpanzeeDAO.saveChimpanzee(chimpanzee);
        chimpanzeeDAO.saveChimpanzee(chimpanzee2);

        chimpanzeeDAO.getAllChimpanzees();
        chimpanzeeDAO.deleteChimpanzee(chimpanzee2);

        chimpanzeeDAO.getAllChimpanzees();

        chimpanzeeDAO.updateChimpanzee(1);
    }


}
