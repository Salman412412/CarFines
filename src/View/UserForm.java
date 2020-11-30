package View;

import javax.swing.*;
import java.awt.*;

public class UserForm extends BasicForm {
    public static JPanel namePanel = new JPanel();
    public static JLabel nameLabel = new JLabel("Name: ");
    public static JTextField nameTextField = new JTextField(10);
    public static JPanel familyPanel = new JPanel();
    public static JLabel familyLabel = new JLabel("Family: ");
    public static JTextField familyTextField = new JTextField(10);
    public static JPanel agePanel = new JPanel();
    public static JLabel ageLabel = new JLabel("Age: ");
    public static SpinnerNumberModel spinnerModel = new SpinnerNumberModel(20,1,150,1);
    public static JSpinner ageSpinner = new JSpinner(spinnerModel);
    public static JPanel ncPanel = new JPanel();
    public static JLabel ncLabel = new JLabel("National Code: ");
    public static JTextField ncTextField = new JTextField(10);

    public UserForm() throws Exception {
        form.setTitle("Users");
        FillTable();
        namePanel.add(nameLabel);
        namePanel.add(nameTextField);
        familyPanel.add(familyLabel);
        familyPanel.add(familyTextField);
        agePanel.add(ageLabel);
        ageSpinner.setPreferredSize(new Dimension(110,20));
        agePanel.add(ageSpinner);
        ageSpinner.setValue(20);
        ncPanel.add(ncLabel);
        ncPanel.add(ncTextField);

        upperPanel.setLayout(new GridLayout(5,1));
        upperPanel.add(namePanel);
        upperPanel.add(familyPanel);
        upperPanel.add(agePanel);
        upperPanel.add(ncPanel);
        upperPanel.add(registerPanel);

        form.setBounds(700,0,300,300);
        form.pack();
        form.setVisible(true);
    }

    public void FillTable() throws Exception {
        super.FillTable("user");
    }

    public static void main(String[] args) throws Exception {
        UserForm register = new UserForm();
        register.form.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
    }
}
