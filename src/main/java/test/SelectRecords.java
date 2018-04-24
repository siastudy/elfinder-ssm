package test;

import java.sql.*;

public class SelectRecords {

    private Connection connect() {
        // SQLite connection string
        String url = "jdbc:sqlite:G:/apps/sqlite-all/test.db";
        Connection conn = null;
        try {
            conn = DriverManager.getConnection(url);
        } catch (SQLException e) {
            System.out.println(e.getMessage());
        }
        return conn;
    }

    public void selectAll() {
        String sql = "SELECT * FROM table_test";

        try {
            Connection conn = this.connect();
            Statement stmt = conn.createStatement();
            ResultSet rs = stmt.executeQuery(sql);

            // loop through the result set
            while (rs.next()) {
                System.out.println(rs.getInt("id") + "\t" + rs.getString("value") + "\t");
            }
        } catch (SQLException e) {
            System.out.println(e.getMessage());
        }
    }

    /**
     * @param args
     *            the command line arguments
     */
    public static void main(String[] args) {
        SelectRecords app = new SelectRecords();
        app.selectAll();
    }

}