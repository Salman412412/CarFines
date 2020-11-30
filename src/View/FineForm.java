package View;

import javax.swing.*;
import java.awt.*;

public class FineForm extends BasicForm {
    public static JPanel carPanel = new JPanel();
    public static JLabel carLabel = new JLabel("Owner: ");
    public static JComboBox carComboBox = new JComboBox();
    public static JPanel typePanel = new JPanel();
    public static JLabel typeLabel = new JLabel("Type: ");
    public static JTextField typeTextField = new JTextField(10);
    public static JPanel amountPanel = new JPanel();
    public static JLabel amountLabel = new JLabel("Amount: ");
    public static JSpinner amountSpinner = new JSpinner(new SpinnerNumberModel(50000,10000,1000000,10000));
    public static JPanel datePanel = new JPanel();
    public static JLabel dateLabel = new JLabel("Date: ");
    public static JTextField dateTextField = new JTextField(10);
    public static JPanel isPaidPanel = new JPanel();
    public static JCheckBox isPaidCheckBox = new JCheckBox("Paid");

    public FineForm() throws Exception {
        super();
        form.setTitle("Fines");
        FillTable();
        carPanel.add(carLabel);
        carPanel.add(carComboBox);
        typePanel.add(typeLabel);
        typePanel.add(typeTextField);
        amountPanel.add(amountLabel);
        amountPanel.add(amountSpinner);
        datePanel.add(dateLabel);
        datePanel.add(dateTextField);
        isPaidPanel.add(isPaidCheckBox);

        upperPanel.setLayout(new GridLayout(5,1));
        upperPanel.add(carPanel);
        upperPanel.add(typePanel);
        upperPanel.add(amountPanel);
        upperPanel.add(datePanel);
        upperPanel.add(isPaidPanel);

        form.setTitle("Fines");
        form.setBounds(700,400,300,300);
        form.pack();
        form.setVisible(true);
    }

    public void FillTable() throws Exception {
        super.FillTable("fine");
    }

    public static void main(String[] args) throws Exception {
        FineForm register = new FineForm();
        register.form.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
    }
}
