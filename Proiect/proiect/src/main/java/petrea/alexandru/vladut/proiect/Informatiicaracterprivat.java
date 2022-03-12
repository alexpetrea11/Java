package petrea.alexandru.vladut.proiect;

import com.toedter.calendar.JDateChooser;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;


public class Informatiicaracterprivat extends LoginInterfata implements ActionListener {
    private JPanel panel5;
    private JTabbedPane tabbedPane1;
    private JPanel tabpane1;
    private JComboBox actidentitate;
    private JTextField numeinf;
    private JTextField prenumeinf;
    private JComboBox nationalitate;
    private JTextField seriebuletin;
    private JTextField nrbuletin;
    private JTextField adresadomiciliu;
    private JPanel JPcalendar;
    private JPasswordField passwordField1;
    private JButton ADAUGAPASAGERButton;
    private JRadioButton masculinRadioButton;
    private JRadioButton femininRadioButton;
    private JLabel numeutilizator;
    JDateChooser datechos = new JDateChooser();

    public Informatiicaracterprivat() {
        setContentPane(panel5);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLocationRelativeTo(null);
        setSize(1000, 700);
        numeutilizator.setText(LoginInterfata.utilizator);
        JPcalendar.add(datechos);
        ADAUGAPASAGERButton.addActionListener(this);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == ADAUGAPASAGERButton) {
            if (!(masculinRadioButton.isSelected() || femininRadioButton.isSelected())) {
                JOptionPane.showMessageDialog(this, "Va rugam sa alegeti o optiune!", "ERROR", JOptionPane.ERROR_MESSAGE);
            } else if (masculinRadioButton.isSelected() && femininRadioButton.isSelected()) {
                JOptionPane.showMessageDialog(this, "Va rugam sa alegeti o singura optiune!", "ERROR", JOptionPane.ERROR_MESSAGE);
                masculinRadioButton.setSelected(false);
                femininRadioButton.setSelected(false);


            } else {
                new CosInterfata().setVisible(true);
                this.dispose();
            }
        }
    }

    public static void main(String[] args) {

        new Informatiicaracterprivat().setVisible(true);
    }


}