package com.company;
import javax.swing.;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.InputEvent;
import java.awt.event.KeyEvent;



public class MainWindow extends JFrame {


    public static void main(String[] args) {
        SwingUtilities.invokeLater(new Runnable() {
            public void run(){
                try {
                    MainWindow window = new MainWindow();
                    window.setVisible(true);

                }
                catch (Exception e) {
                    e.printStackTrace();
                }
            }
        });
        protected void buildFrame(){

        }
    }
}
