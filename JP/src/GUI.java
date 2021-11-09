import javax.swing.*;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
/* dane jakie są poprawne do logowania to:
login: Adam
hasło: 259218
 */

public class GUI implements ActionListener {

    private static JLabel label;
    private static JTextField userName;
    private static JLabel passwordLabel;
    private static JPasswordField passwordText;
    private static JButton button;
    private static JLabel success;

    public static void main(String[] args){

        JPanel panel = new JPanel();
        JFrame frame = new JFrame();

        frame.setSize(500, 500);
        frame.add(panel);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        panel.setLayout(null);


        label = new JLabel("użytkownik");
        label.setBounds(30,20,100, 30);
        panel.add(label);

        userName = new JTextField();
        userName.setBounds(120,20,150,30);
        panel.add(userName);

        passwordLabel = new JLabel("hasło");
        passwordLabel.setBounds(30,60,100,30);
        panel.add(passwordLabel);

        passwordText = new JPasswordField();
        passwordText.setBounds(120,60,150,30);
        panel.add(passwordText);
        frame.setVisible(true);

        button = new JButton("zaloguj");
        button.setBounds(150, 120, 80 ,25);
        button.addActionListener(new GUI());
        panel.add(button);

        success = new JLabel("");
        success.setBounds(10,120,300, 25);
        panel.add(success);
        success.setText("");




    }

    @Override
    public void actionPerformed(ActionEvent e) {
        String user = userName.getText();
        String password = String.valueOf(passwordText.getPassword());
        if (user.equals("Adam") && password.equals("259218")) {
            success.setText("zalogowano!");
            //frame.setBackground(Color.GREEN); - nie mam pomysłu dlaczego to nie działa
        } else {
            success.setText("dane nieprawidłowe");
            //frame.setBackground(Color.RED); -  nie mam pomyslu dlaczego to nie działa
        }
    }
}
