package petrea.alexandru.vladut.proiect;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class ZboruriInterfata extends Rezervare1 implements ActionListener {

    private JPanel panel7;
    protected JTextField Zbor1textField1;
    protected JTextField Zbor2textField2;
    protected JTextField Zbor3textField3;
    private JButton ADAUGAZBORINCOSButton;
    private JLabel zborslct;
    private JRadioButton bagaj1;
    private JRadioButton bagaj3;
    private JRadioButton zbor3;
    public static Integer zborselectat;


    public ZboruriInterfata() {
        setContentPane(panel7);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setVisible(true);
        setLocationRelativeTo(null);
        setSize(1700, 1000);
        ADAUGAZBORINCOSButton.addActionListener(this);
        zborslct.setText(Rezervare1.zbr);
        Zbor1textField1.setText("Zbor la clasa Economic -> 5:00 - Check in cu 2 zile inainte de decolare sau la aeroport contra-cost");
        Zbor2textField2.setText("Zbor la clasa Economic -> 12:00 -  Check in cu 2 zile inainte de decolare sau la aeroport contra-cost");
        Zbor3textField3.setText("Zbor la clasa Economic -> 19:00 - Check in cu 2 zile inainte de decolare sau la aeroport contra-cost");

    }


    @Override
    public void actionPerformed(ActionEvent e) {

        if (e.getSource() == ADAUGAZBORINCOSButton) {

            if (!(bagaj1.isSelected() || bagaj3.isSelected() || zbor3.isSelected())) {
                //System.out.println("Selecteaza zbor!");
                JOptionPane.showMessageDialog(this, "Va rugam sa alegeti o optiune!", "ERROR", JOptionPane.ERROR_MESSAGE);
            } else if ((bagaj1.isSelected() && (bagaj3.isSelected() || zbor3.isSelected())) || (bagaj3.isSelected() && (bagaj1.isSelected() || zbor3.isSelected())) ||
                    (zbor3.isSelected() && (bagaj1.isSelected() || bagaj3.isSelected())) || (bagaj1.isSelected() && bagaj3.isSelected() && zbor3.isSelected())) {
                JOptionPane.showMessageDialog(this, "Va rugam sa alegeti un singur zbor!", "ERROR", JOptionPane.ERROR_MESSAGE);
                bagaj1.setSelected(false);
                bagaj3.setSelected(false);
                zbor3.setSelected(false);
            } else {
                if (bagaj1.isSelected()) {
                    zborselectat = 1;
                } else if (bagaj3.isSelected()) {
                    zborselectat = 2;
                } else {
                    zborselectat = 3;
                }
                new Informatiicaracterprivat().setVisible(true);
                this.dispose();
            }

        }


    }

    public static void main(String[] args) {
        ZboruriInterfata zboruriInterfata = new ZboruriInterfata();
    }
}
