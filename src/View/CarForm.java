package View;

import javax.swing.*;
import java.awt.*;

public class CarForm extends BasicForm {
    public static JPanel ownerPanel = new JPanel();
    public static JLabel ownerLabel = new JLabel("Owner: ");
    public static JComboBox ownerComboBox = new JComboBox();
    public static JPanel namePanel = new JPanel();
    public static JLabel nameLabel = new JLabel("Name: ");
    public static JComboBox nameComboBox = new JComboBox();
    public static JPanel typePanel = new JPanel();
    public static JLabel typeLabel = new JLabel("Type: ");
    public static JTextField typeTextField = new JTextField(10);
    public static JPanel colourPanel = new JPanel();
    public static JLabel colourLabel = new JLabel("Colour: ");
    public static JTextField colourTextField = new JTextField(10);

    public CarForm() throws Exception {
        form.setTitle("Cars");
        FillTable();
        ownerPanel.add(ownerLabel);
        ownerPanel.add(ownerComboBox);
        namePanel.add(nameLabel);
        namePanel.add(nameComboBox);
        typePanel.add(typeLabel);
        typePanel.add(typeTextField);
        colourPanel.add(colourLabel);
        colourPanel.add(colourTextField);

        upperPanel.setLayout(new GridLayout(5,1));
        upperPanel.add(ownerPanel);
        upperPanel.add(namePanel);
        upperPanel.add(typePanel);
        upperPanel.add(colourPanel);
        upperPanel.add(registerPanel);

        form.setTitle("Cars");
        form.setBounds(700,200,300,300);
        form.pack();
        form.setVisible(true);
    }

    public void FillTable() throws Exception {
        super.FillTable("car");
    }

    public static void main(String[] args) throws Exception {
        CarForm register = new CarForm();
        register.form.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
    }
}