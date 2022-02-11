
package formulario;
import javax.swing.*;

public class Formulario {

    
    public static void main(String[] args) {
       JFrame principal = new JFrame ("Registro de Productos");
       Registro re=new Registro();
       OyenteRegistro oyente= new OyenteRegistro(re);
       principal.setLocation(100, 100);
       principal.setDefaultCloseOperation(3);
       principal.setSize(600, 600);
       principal.add(re);
       re.addEventos(oyente);
       principal.setVisible(true);
    }
    
}
