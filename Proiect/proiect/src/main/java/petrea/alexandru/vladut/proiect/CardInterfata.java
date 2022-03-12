package petrea.alexandru.vladut.proiect;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.FileWriter;


public class CardInterfata extends CosInterfata implements ActionListener {
    private JPanel panel4;
    private JButton PLATESTEButton;
    private JPasswordField passwordField1;
    private JComboBox comboBoxZi;
    private JComboBox comboBoxLuna;
    private JTextField numarcad;
    private JTextField numeprenumetitularcard;
    private JButton FACTURAButton;
    private JLabel total1;
    private JLabel nrcardrlabel;
    private JLabel nume;
    FileWriter fileWriter;

    public CardInterfata() {
        setContentPane(panel4);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLocationRelativeTo(null);
        setSize(1000, 700);
        PLATESTEButton.addActionListener(this);
        FACTURAButton.addActionListener(this);
        total1.setText(String.valueOf(CosInterfata.suma + CosInterfata.pretbagaj + "Lei"));

    }

    @Override
    public void actionPerformed(ActionEvent e) {

        if (e.getSource() == PLATESTEButton) {

            JOptionPane.showMessageDialog(this, "VA multumim!");
            this.dispose();
        }
        if (e.getSource() == FACTURAButton) {
            try {
                fileWriter = new FileWriter("C:/ISP/group30123_petrea_alexandru/30123_2_petrea_alexandru_isp_labs/Proiect/proiect/src/main/resources/Factura.txt");
                fileWriter.write("Factura: " + "\n");
                fileWriter.write(nume.getText() + " " + numeprenumetitularcard.getText() + "\n");
                fileWriter.write("Zborul: " + zborr.getText() + "\n");
                fileWriter.write("Firma:" + "Compania Aeriana ---->  ROMANIA AIRWAYS" + "\n");
                fileWriter.write("Pret zbor: " + total1.getText() + "\n");
                fileWriter.write("Va multumim ca ati ales Compania noastra!");
                fileWriter.close();
            } catch (Exception ev) {
                JOptionPane.showMessageDialog(null, e + "");
            }
        }
    }


    public static void main(String[] args) {
        CardInterfata cardInterfata = new CardInterfata();
    }
}
