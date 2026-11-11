
package app;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JLabel;


public class Kontroller {
    private Nezet nezet;

    public Kontroller(Nezet nezet) {
        this.nezet = nezet;
        
        JButton btn = nezet.getjButton1();
        JLabel lbl = nezet.getjLabel1();
        
        btn.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String szoveg="rokarudi";
                nezet.megjelenit(szoveg);
                for (int i = 0; i < 100; i++) {
                 nezet.megjelenitarea(szoveg);   
                }
                
            }
        });
                
        
    }
    
    
    
    
}
