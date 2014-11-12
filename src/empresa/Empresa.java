/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package empresa;

import java.sql.Connection;
import javax.swing.JOptionPane;

/**
 *
 * @author Totaldo
 */
public class Empresa {
 static Login login;
 static Caja caja;
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
//      caja=new Caja("admin");
//      caja.setVisible(true);
    login=new Login();
    login.setVisible(true);
    }
}
