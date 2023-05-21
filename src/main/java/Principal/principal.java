package Principal;

import Model.DAO.DBConnector;
import Vista.MenuJBEM;
import javax.swing.JComboBox;

public class principal {

    public static void main(String[] args) {
        boolean isConnected = DBConnector.isConnected();
       
        MenuJBEM m1 = new MenuJBEM();
        m1.setVisible(true);

    }

}
