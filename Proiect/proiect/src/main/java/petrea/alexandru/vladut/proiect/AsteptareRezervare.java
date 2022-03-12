package petrea.alexandru.vladut.proiect;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class AsteptareRezervare extends Rezervare1 implements ActionListener {
    private JPanel panel6;
    private JProgressBar asteptareprogres;
    private JTextArea CAUTAMCELEMAIBUNETextArea;


    public JLabel getZborselectat() {
        return zborselectat;
    }

    public void setZborselectat(JLabel zborselectat) {
        this.zborselectat = zborselectat;
    }

    private JButton INainteButton;
    private JButton button1;
    public JLabel zborselectat;
    private JLabel zbor;


    public AsteptareRezervare() {
        setContentPane(panel6);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setVisible(true);
        setLocationRelativeTo(null);
        setSize(1700, 1000);
        INainteButton.addActionListener(this);
        button1.addActionListener(this);
        zbor.setText(Rezervare1.zbr);
    }

    public static void main(String[] args) {
        AsteptareRezervare asteptareRezervare = new AsteptareRezervare();
        /*asteptareRezervare.setVisible(true);
        try
        {

            for(int i=0;i<=100;i++)
            {
                Thread.sleep(70);
                asteptareRezervare.asteptareprogres.setValue(i);

            }
        } catch(Exception e )
        { e.printStackTrace();

        }
        new ZboruriInterfata().setVisible(true);
        asteptareRezervare.dispose();
*/
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == INainteButton) {
            new ZboruriInterfata().setVisible(true);
            this.dispose();
        }
        if (e.getSource() == button1) {
            this.toBack();
            new Rezervare1().setVisible(true);
            this.dispose();
        }


    }
}






