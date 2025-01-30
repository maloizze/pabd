/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
//package maloizze;
//
//import com.mysql.cj.xdevapi.Statement;
//import com.sun.jdi.connect.spi.Connection;
//
//public class CustomerDAO {
//       public static void main(String[] args) throws SQLException {

//        Connection con = null;
//
//        //try {
//        System.out.println("Connection OK!");
//        Customer c = new Customer(1, "Dimitri", "Tolstoi", "dimitri.tolstoi@gmail.com", 5, 5);
//        CustomerDAO dao = new CustomerDAO();
//        dao.insertCustomer(c);
//           
//            
//            con = new ConnectionFactory().getConnection();
//            System.out.println("Iniciando Banco de Dados!");
//            String sql = "insert into customer (Store_ID, email, Address_ID, Active, first_name, last_name) values (?, ?, ?, ?, ?, ?)";
//            PreparedStatement st = con.prepareStatement(sql);
//            st.setInt(1, 1);
//            st.setString(2, "alcemy@gmail.com");
//            st.setInt(3, 10);
//            st.setInt(4, 1);
//            st.setString(5, "Alcemy");
//            st.setString(6, "Severino");
//            st.execute();
//            String query = " select * from customer"
//                    + " order by customer_id desc"
//                    + " limit 3";
//            Statement qst = con.createStatement();
//            ResultSet rs = qst.executeQuery(query);
//            ResultSetMetaData md = rs.getMetaData();
//            int col = md.getColumnCount();
//            for (int i = 1; i <= col; i++) {
//                System.out.print(md.getColumnName(i) + "\t");
//            }
//            System.out.println("");
//
//            while (rs.next()) {
//                for (int i = 1; i <= col; i++) {
//                    System.out.print(rs.getString(i) + "\t");
//
//                }
//                System.out.println("");
//            }
//            String upsql = "update customer set Store_ID = ?, Address_ID = ? where first_name = ? and last_name = ?";
//            PreparedStatement pst = con.prepareStatement(upsql);
//            pst.setInt(1, 2);
//            pst.setInt(2, 5);
//            pst.setString(3, "Alcemy");
//            pst.setString(4, "Severino");
//            pst.executeUpdate();
//            rs = st.executeQuery(query);
//            md = rs.getMetaData();
//            col = md.getColumnCount();
//            System.out.println("\nAtualizando o Cliente Alcemy Severino:\n");
//            for (int i = 1; i <= col; i++) {
//                System.out.print(md.getColumnName(i) + "\t");
//            }
//            System.out.println("");
//            while (rs.next()) {
//                for (int i = 1; i <= col; i++) {
//                    System.out.print(rs.getString(i) + "\t");
//                }
//                System.out.println("");
//            }
//            String delsql = "delete from customer where first_name = ? and last_name = ?";
//            PreparedStatement dst = con.prepareStatement(delsql);
//            dst.setString(1, "Alcemy");
//            dst.setString(2, "Severino");
//            dst.executeUpdate();
//            rs = st.executeQuery(query);
//            md = rs.getMetaData();
//            col = md.getColumnCount();
//            System.out.println("\nRemovendo o Cliente Alcemy Severino:\n");
//            for (int i = 1; i <= col; i++) {
//                System.out.print(md.getColumnName(i) + "\t");
//            }
//            System.out.println("");
//            while (rs.next()) {
//                for (int i = 1; i <= col; i++) {
//                    System.out.print(rs.getString(i) + "\t");
//                }
//                System.out.println("");
//            }
//        } catch (SQLException e) {
//            e.printStackTrace();
//            System.out.println("Erro");
//        } finally {
//            con.close();
//            System.out.println("Banco de Dados finalizado!");
//        }
//    }
//}
//
//}
//
// 
//    
//
