
package folhapagamento;

import java.awt.Container;
import javax.swing.JApplet;
import javax.swing.JTextArea;


public class sobreFolha extends JApplet {
    FolhaPagamento pagamento = new FolhaPagamento("Ana", "Secretária", 1000, "7,5%");
    metodoPrincipal a  = new metodoPrincipal();
    
    public void init(){
        JTextArea saida = new JTextArea();
        Container container = getContentPane();
        container.add(saida);
        saida.setText(pagamento.mostraPagamento());
    }
}
