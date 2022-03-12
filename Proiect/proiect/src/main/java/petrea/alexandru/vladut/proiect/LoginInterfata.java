package petrea.alexandru.vladut.proiect;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.HashMap;
import java.util.Objects;
import javax.swing.JOptionPane;

public class LoginInterfata extends JFrame implements ActionListener {
    //private Numeutilizatorsiparola numeutilizatorsiparola;
    private JPanel panel;
    private JPanel panel1;
    private JPasswordField passwordField1;
    private JTextArea parolaTextArea;
    private JTextArea IDUTILIZATORTextArea;
    private JButton loginButton;
    public JTextField numeutilizatorlogin;
    private JButton button1;
    private JLabel Mesage;
    public static String utilizator;
    //  private JLabel mesaj=new JLabel();

    HashMap<String, String> logininfo = new HashMap<>();

    public LoginInterfata(HashMap<String, String> logininfoOriginal) {
        logininfo = logininfoOriginal;
        this.setContentPane(panel);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLocationRelativeTo(null);
        setSize(1700, 1000);
        setVisible(true);
    /*    add(mesaj);
        mesaj.setBounds(125,250,250,35);
        mesaj.setFont(new Font(null, Font.BOLD,15));
*/

        loginButton.addActionListener(this);
        button1.addActionListener(this);

    }

    public LoginInterfata() {

    }


    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == button1) {
            numeutilizatorlogin.setText("");
            passwordField1.setText("");
        }
        if (e.getSource() == loginButton) {
            String nume = numeutilizatorlogin.getText();
            String parola = String.valueOf(passwordField1.getPassword());
            utilizator=numeutilizatorlogin.getText();

            if (logininfo.containsKey(nume)) {
                if (logininfo.get(nume).equals(parola)) {
                    Mesage.setForeground(Color.green);
                    Mesage.setText("Login succesful");
                    //LoginInterfata loginInterfata = new LoginInterfata();
                    //loginInterfata.setVisible(true);
                     this.dispose();
SplashInterfata splash =new SplashInterfata();
splash.setVisible(true);

                    //new SplashInterfata().setVisible(true);
                    //this.dispose();
                    //rezervareInterfata.setVisible(true);

                    //LoginInterfata.dispose();


                } else {
                    Mesage.setForeground(Color.green);
                    Mesage.setText("Wrong password");

                    //JOptionPane.showMessageDialog(this, "Parola gresita",
                    //      "ERROR", JOptionPane.ERROR_MESSAGE);
                }
            } else {
                Mesage.setForeground(Color.green);
                Mesage.setText("Wrong username");
                //JOptionPane.showMessageDialog(this, "Utilizatorul negasit",
                //   "ERROR", JOptionPane.ERROR_MESSAGE);
            }
        }

    }


    public static void main(String[] args) {

        Numeutilizatorsiparola numeutilizatorsiparola = new Numeutilizatorsiparola();
        LoginInterfata loginInterfata = new LoginInterfata(numeutilizatorsiparola.getLogininfo());
        //loginInterfata.dispose();
        // RezervareInterfata rezervareInterfata=new RezervareInterfata();

               /* try{Thread.sleep(34);

                }catch(Exception e)
                {
                    e.printStackTrace();
                }
*/


    }


}


    