package View;

import javax.swing.*;
import java.awt.*;

final class MainForm {
    final static JFrame mainForm = new JFrame("Car's fines");
    final static JPanel userPanel = new JPanel();
    final static JButton userButton = new JButton("Users...");
    final static JPanel carPanel = new JPanel();
    final static JButton carButton = new JButton("Cars...");
    final static JPanel finePanel = new JPanel();
    final static JButton fineButton = new JButton("Fines...");

    public static void main(String[] args) {
        userButton.addActionListener(e -> {
            try {
                new UserForm();
            } catch (Exception exception) {
                exception.printStackTrace();
            }
        });

        carButton.addActionListener(e -> {
            try {
                new CarForm();
            } catch (Exception exception) {
                exception.printStackTrace();
            }
        });

        fineButton.addActionListener(e -> {
            try {
                new FineForm();
            } catch (Exception exception) {
                exception.printStackTrace();
            }
        });

        userPanel.add(userButton);
        carPanel.add(carButton);
        finePanel.add(fineButton);

        mainForm.add(new JPanel());
        mainForm.add(userPanel);
        mainForm.add(carPanel);
        mainForm.add(finePanel);

        mainForm.setLayout(new GridLayout(5,1));
        mainForm.setBounds(500,100,300,300);
        mainForm.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        mainForm.setVisible(true);
    }
}