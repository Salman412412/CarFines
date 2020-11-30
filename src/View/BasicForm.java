package View;

import Model.DAO.DBConnection;
import javax.swing.*;
import javax.swing.table.DefaultTableModel;
import java.awt.*;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.util.Vector;

public abstract class BasicForm {
    protected JFrame form = new JFrame();
    protected JPanel upperPanel = new JPanel();
    protected JPanel registerPanel = new JPanel();
    protected JButton registerButton = new JButton("Register");
    protected JTable table = new JTable();
    protected JScrollPane carTableScrollPane = new JScrollPane(table);
    protected JPanel lowerPanel = new JPanel();
    protected JButton detailsButton = new JButton("Details...");
    protected JButton backButton = new JButton("Back");

    public BasicForm() {
        backButton.addActionListener(e -> form.dispose());

        registerPanel.add(registerButton);
        lowerPanel.add(detailsButton);
        lowerPanel.add(backButton);


        form.add(upperPanel, BorderLayout.NORTH);
        form.add(carTableScrollPane,"Center");
        form.add(lowerPanel, "South");
    }

    public void FillTable(String table) throws Exception {
        DBConnection dbConnection = new DBConnection(table);
        ResultSet resultSet = dbConnection.Show();
        ResultSetMetaData metaData = resultSet.getMetaData();
        Vector<String> columnNames = new Vector<>();
        for (int column = 1; column<=metaData.getColumnCount(); column++) {
            columnNames.add(metaData.getColumnName(column));
        }
        Vector<Vector<Object>> data = new Vector<>();
        while (resultSet.next()) {
            Vector<Object> vector = new Vector<>();
            for (int i = 1; i <= metaData.getColumnCount(); i++) {
                vector.add(resultSet.getObject(i));
            }
            data.add(vector);
        }
        DefaultTableModel defaultTableModel = new DefaultTableModel(data, columnNames){
            @Override
            public boolean isCellEditable(int row, int column) {
                //all cells false
                return false;
            }
        };
        this.table.setModel(defaultTableModel);
        this.table.setSelectionMode(ListSelectionModel.SINGLE_SELECTION);
        dbConnection.close();
    }

}