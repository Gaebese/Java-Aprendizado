package calq.pakage.ca;
import javax.swing.JFrame;
import javax.swing.JButton;
import java.awt.FlowLayout;

public class botao extends JFrame{
 private JButton ok,
         cancelar;
 
 public botao(){
  super("Criando botões");
  setLayout( new FlowLayout() );

  ok = new JButton("OK");
  cancelar = new JButton("Cancelar");
  add(ok);
  add(cancelar);
 }

}
