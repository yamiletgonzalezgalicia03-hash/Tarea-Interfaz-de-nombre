package holamundo;
    
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;

 public class Cuerpo extends JFrame {
    private JLabel lbl;
    private JButton btn;
    private final JTextField txt;
    
   public Cuerpo(){
       this.setTitle("SALUDO");
       this.setBounds (20, 50, 300, 420);
       this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
       this.getContentPane().setLayout(null);
       //label

       
       lbl = new JLabel ("¿Como te llamas?");
       lbl.setBounds(20,60,200, 40);
       this.getContentPane().add(lbl);
       
       // Jtextfield
       txt = new JTextField();
       txt.setBounds(20,90,200,30);
       this.getContentPane().add(txt);
       
       
       
       //button 
       btn = new JButton("Saludar");
       btn.setBounds(50,130,100,30);
       this.getContentPane().add(btn);
       
       btn.addActionListener (
               
       
             new ActionListener(){
          
          @Override
          public void actionPerformed(ActionEvent ae) {
              
                String nombre = txt.getText();
                lbl.setText("Hola " + nombre+"!!" );
                
           }
             }
        );
   }
 }