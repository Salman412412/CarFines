package Model.DAO;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

public class DBConnection {
    private final Connection con;
    private PreparedStatement ps;
    public String table;

    public DBConnection(String table) throws Exception {
        Class.forName("com.mysql.cj.jdbc.Driver");
        con = DriverManager.getConnection("jdbc:mysql://localhost:3306/javaclass?allowPublicKeyRetrieval=true&useSSL=false", "root","java123");
        con.setAutoCommit(false);
        this.table = table;
    }

    public void close() throws Exception {
        if (ps != null) ps.close();
        if (con != null) con.close();
    }

    public ResultSet Show() throws Exception {
        ps = con.prepareStatement("select * from " + table);
        return ps.executeQuery();
    }
}