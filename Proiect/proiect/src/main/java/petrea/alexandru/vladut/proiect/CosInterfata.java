package petrea.alexandru.vladut.proiect;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class CosInterfata extends ZboruriInterfata implements ActionListener {

    private JPanel panel8;
    private JRadioButton bagaj1;
    private JRadioButton bagaj2;
    private JRadioButton bagaj3;
    private JLabel PRETTOTAL;
    private JButton PLATESTEButton;
    private JLabel total;
    public JLabel zborr;
    public static Integer suma;
    public static Integer pretbagaj;

    public CosInterfata() {
        setContentPane(panel8);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLocationRelativeTo(null);
        setSize(1000, 700);
        PLATESTEButton.addActionListener(this);
        if (zborselectat == 1)
            suma = 150;
        else if (zborselectat == 2) {
            suma = 300;
        } else {
            suma = 450;
        }
        total.setText(String.valueOf(suma));
        zborr.setText(ZboruriInterfata.zbr);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == PLATESTEButton) {
            if (!(bagaj1.isSelected() || bagaj2.isSelected() || bagaj3.isSelected())) {
                //System.out.println("Selecteaza zbor!");
                JOptionPane.showMessageDialog(this, "Va rugam sa alegeti o optiune pentru bagaj!", "ERROR", JOptionPane.ERROR_MESSAGE);
            } else if ((bagaj1.isSelected() && (bagaj2.isSelected() || bagaj3.isSelected())) || (bagaj2.isSelected() && (bagaj1.isSelected() || bagaj3.isSelected())) ||
                    (bagaj3.isSelected() && (bagaj1.isSelected() || bagaj2.isSelected())) || (bagaj1.isSelected() && bagaj2.isSelected() && bagaj3.isSelected())) {
                JOptionPane.showMessageDialog(this, "Va rugam sa alegeti un singur bagaj!", "ERROR", JOptionPane.ERROR_MESSAGE);
                bagaj1.setSelected(false);
                bagaj2.setSelected(false);
                bagaj3.setSelected(false);
            } else {
                if (bagaj1.isSelected()) {
                    pretbagaj = 50;
                } else if (bagaj2.isSelected()) {
                    pretbagaj = 100;
                } else {
                    pretbagaj = 150;
                }
                new CardInterfata().setVisible(true);
                this.dispose();
            }
        }
    }

    public static void main(String[] args) {
        CosInterfata cosInterfata = new CosInterfata();
    }
}
