
package formulario;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;



public class OyenteRegistro implements ActionListener{
      Registro panel =new Registro();
      
      public OyenteRegistro(Registro panel) {
        this.panel = panel;
    }
    @Override
    public void actionPerformed(ActionEvent e) {
         JButton origen = (JButton) e.getSource();
        switch (origen.getName()) {
            case "re":{
                panel.guardar();
                
                break;
            }
            case "ca":{
                System.out.println("Registro Cancelado");
                break;
            }
            
        }
    }
    
}
