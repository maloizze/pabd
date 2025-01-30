/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package maloizze;

import java.sql.*;

public class Maloizze {

    
    public static void main(String[] args) throws SQLException {

        Connection con = null;

        Customer c = new Customer(2, "Tim", "Cook", "tim.cook@apple.com", 3, 1);
        
        try {

            con = new ConnectionFactory().getConnection();

            System.out.println("Conexão OK!");

            // *************** CRED *************** //
            //CREATE - Inserir
            String sql = "Insert into customer"
                    + "(store_id, first_name, last_name, email, address_id, active)"
                    + "values"
                    + "(?, ?, ?, ?, ?, ?)";
           PreparedStatement pst = con.prepareStatement(sql);
            pst.setInt(1, c.getStore_id());
            pst.setString(2, c.getFirst_name());
            pst.setString(3, c.getLast_name());
            pst.setString(4, c.getEmail());
            pst.setInt(5, c.getAddress_id());
            pst.setInt(6, c.getActive());

            pst.execute();
            pst.close();
            System.out.println("Customer added!");

            Statement st = con.createStatement();

            String query = "select * from customer"
                    + " order by customer_id desc"
                    + " limit 5";

            // st.executeQuery(query);
            ResultSet rs = st.executeQuery(query);

            ResultSetMetaData md = rs.getMetaData();
            int col = md.getColumnCount();

            System.out.println("Tabela: " + md.getTableName(1));
            for (int i = 1; i <= col; i++) {
                System.out.print(md.getColumnName(i)+"\t");
            }

            System.out.println("");

            while (rs.next()) {
                for (int i = 1; i < col; i++) {
                    System.out.print(rs.getString(i)+"\t");
                }
                System.out.println("");
            }

            con.close();
        } catch (SQLException ex) {
            System.out.println(ex);
        } finally {
            con.close();
        }
    }

}
