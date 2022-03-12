package petrea.alexandru.vladut.proiect;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class SplashInterfata extends LoginInterfata implements ActionListener {

    private JPanel panel2;
    private JProgressBar progressBar1;
    private JButton INAINTEButton;
    private JLabel numeUtilizator;



    public SplashInterfata() {
        setContentPane(panel2);
        setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        setLocationRelativeTo(null);
        setSize(1000, 700);
        setVisible(true);
        numeUtilizator.setText("Utilizator: " + LoginInterfata.utilizator);
        INAINTEButton.addActionListener(this);


    }

    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == INAINTEButton) {
            Rezervare1 rezervareInterfata = new Rezervare1();
            this.dispose();
        }
    }

    /*public void run() {
        progressBar1.setVisible(true);
        try {

            for (int i = 0; i <= 100; i++) {
                Thread.sleep(70);
                progressBar1.setValue(i);

            }
        } catch (InterruptedException e) {

            e.printStackTrace();
        }
    }
    */
    @SuppressWarnings("unchecked")
    public static void main(String[] args) {
        /*SplashInterfata splash = new SplashInterfata();
        java.awt.EventQueue.invokeLater(new Runnable() {
            @Override
            public void run() {
                splash.setVisible(true);
            }
        });
try {
    for (int i = 0; i < 100; i++) {
        Thread.sleep(100);
        splash.progressBar1.setValue(i);
        if (i == 100) {
            splash.setVisible(true);
            splash.dispose();
        }
    }
}  catch(InterruptedException ex)
    {
       // Logger.getLogger().log(Level.SEVERE,null,ex);

           // splash.Exptin
        }
        //splash.setVisible(true);
        //splash.iterate();
        /*try
        {

            for(int i=0;i<=100;i++)
            {
                Thread.sleep(70);
                splash.progressBar1.setValue(i);

            }
        } catch(Exception e )
        {

        }

         */
        // final JProgressBar progressBar = new JProgressBar(0, 100);

       /* Thread t = new Thread(){
            public void run(){
                for(int i = 0 ; i < 100 ; i++){
                    final int percent = i;
                    SwingUtilities.invokeLater(new Runnable() {
                        public void run() {
                            splash.progressBar1.setValue(percent);
                        }
                    });

                    try {
                        Thread.sleep(70);
                    } catch (InterruptedException e) {}
                }
            }
        };
t.start();*/
        //new LoginInterfata(logininfo).setVisible(true);
        SplashInterfata splash = new SplashInterfata();


        //splash.dispose();


    }
}
