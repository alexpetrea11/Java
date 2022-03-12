package petrea.alexandru.vladut.proiect;

import com.toedter.calendar.JDateChooser;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Objects;

public class Rezervare1 extends JFrame implements ActionListener {
    private JPanel panel11;
    private JButton CAUTAZBORButton;
    private JComboBox comboBox1;
    private JComboBox comboBox2;
    private JSpinner spinner1;
    private JTextField NRPASAGERIZBORtextField1;
    private JTextField CALENDARZBORtextField2;
    private JButton OKButton;
    private JPanel JdataCalendar;
    public static String zbr;
    public JTextField CautaretextField;

    JDateChooser datechos = new JDateChooser();


    public Rezervare1() {
        setContentPane(panel11);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLocationRelativeTo(null);
        setSize(1000, 700);
        setVisible(true);
        CAUTAZBORButton.addActionListener(this);

        JdataCalendar.add(datechos);
        OKButton.addActionListener(this);

    }

    @Override
    public void actionPerformed(ActionEvent e) {
        String value1;
        String value2;
        if (e.getSource() == OKButton) {
            Integer myInt = (Integer) spinner1.getValue();
            if (myInt <= 0) {
                JOptionPane.showMessageDialog(this, "Adaugati pasageri!", "ERROR", JOptionPane.ERROR_MESSAGE);
            } else {
                String spinner = myInt.toString();
                NRPASAGERIZBORtextField1.setText(spinner);
            }
            String selectdate = ((JTextField) datechos.getDateEditor().getUiComponent()).getText();

            CALENDARZBORtextField2.setText(selectdate);

            value1 = (String) comboBox1.getSelectedItem();
            value2 = (String) comboBox2.getSelectedItem();
            String value3 = "Aeroport de plecare: " + value1 + "--->" + " Aeroport sosire: " + value2;
            CautaretextField.setText(value3);
            zbr = CautaretextField.getText();

        }
        String zbor1 = "Aeroportul Internațional „Henri Coandă” Bucuresti";
        String zbor2 = "Aeroportul din Londra Luton";
        String zbor3 = "Aeroportul din Londra Stansted";

        value1 = (String) comboBox1.getSelectedItem();
        value2 = (String) comboBox2.getSelectedItem();

        int getdepature = comboBox1.getSelectedIndex();
        String departure = Objects.requireNonNull(comboBox1.getSelectedItem()).toString();
        int getarrival = comboBox2.getSelectedIndex();
        String arrival = Objects.requireNonNull(comboBox2.getSelectedItem()).toString();
        if (departure.equals(zbor1) && arrival.equals(zbor2)) {
            JOptionPane.showMessageDialog(this, "Ati selectat un zbor de pe " + zbor1 + " pana pe " + zbor2 + " pentru data de " + CALENDARZBORtextField2.getText());


        }

        if (departure.equals(zbor1) && arrival.equals(zbor3)) {
            JOptionPane.showMessageDialog(this, "Ati selectat un zbor de pe " + zbor1 + " pana pe " + zbor3 + " pentru data de " + datechos.getDate().toString());
        }

        if (departure.equals(zbor1) && arrival.equals(zbor1)) {
            JOptionPane.showMessageDialog(this, "Va rugram sa alegeti o destinatie!!!", "ERROR", JOptionPane.ERROR_MESSAGE);
        }
        if (departure.equals(zbor2) && arrival.equals(zbor1)) {
            JOptionPane.showMessageDialog(this, "Ati selectat un zbor de pe " + zbor2 + " pana pe " + zbor1 + "pentru data de " + datechos.getDate().toString());
        }

        if (departure.equals(zbor3) && arrival.equals(zbor1)) {
            JOptionPane.showMessageDialog(this, "Ati selectat un zbor de pe " + zbor3 + " pana pe " + zbor1 + " pentru data de " + datechos.getDate().toString());
        }

        if (departure.equals(zbor2) && arrival.equals(zbor2)) {
            JOptionPane.showMessageDialog(this, "Va rugam sa alegeti o destinatie!");

        }

        if (departure.equals(zbor3) && arrival.equals(zbor3)) {
            JOptionPane.showMessageDialog(this, "Va rugam sa alegeti o destinatie!", "ERROR", JOptionPane.ERROR_MESSAGE);

        }

        if (departure.equals(zbor2) && arrival.equals(zbor3)) {
            JOptionPane.showMessageDialog(this, "Nu avem zboruri disponibile!", "ERROR", JOptionPane.ERROR_MESSAGE);
        }

        if (departure.equals(zbor2) && arrival.equals(zbor2)) {
            JOptionPane.showMessageDialog(this, "Nu avem zboruri disponibile!", "ERROR", JOptionPane.ERROR_MESSAGE);


        }

        if (e.getSource() == CAUTAZBORButton) {

            new AsteptareRezervare().setVisible(true);
            this.dispose();

        }

    }


    public static void main(String[] args) {
        new Rezervare1().setVisible(true);
    }


}

