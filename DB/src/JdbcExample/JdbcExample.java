package JdbcExample;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.sql.*;

public class JdbcExample {

    static int create_table_if_not_exists(String name, Connection conn) {
        try{
//            System.out.println("create table if not exists ?(name varchar(100), photo blob)");
            String sql = "create table if not exists " + name + "(name varchar(100), photo longblob)";
//            PreparedStatement ps = conn.prepareStatement("create table ? (name varchar(100), photo blob)");
            PreparedStatement ps = conn.prepareStatement(sql);
//            ps.setString(1, name);
            System.out.println("ps: " + ps);
            return ps.executeUpdate();
        } catch(SQLException sqle) {
            System.out.println(sqle.getErrorCode() + ": " + sqle.getMessage());
        }

        return -1;
    }

    static int drop_table(Connection conn, String name) {
        String sql = "drop table if exists " + name;
        try {
            PreparedStatement ps = conn.prepareStatement(sql);
            return ps.executeUpdate();
        } catch(SQLException sqle) {
            System.out.println(sqle.getErrorCode() + ": " + sqle.getMessage());
        }

        return -1;
    }

    static int insert_into_image(Connection conn, String name, String file) {
        try {
            PreparedStatement ps = conn.prepareStatement("insert into image values(?,?)");
            ps.setString(1, name);
            FileInputStream input = new FileInputStream(file);
            ps.setBinaryStream(2, input, input.available());
            return ps.executeUpdate();
        } catch(SQLException sqle) {
            System.out.println(sqle.getErrorCode() + ": " + sqle.getMessage());
        } catch(IOException ioe) {
            System.out.println(ioe.getMessage());
        }

        return -1;
    }

    static void retrieve_image(Connection conn, String new_name) {
        try {
            String get_img = "select * from image";
            PreparedStatement ps = conn.prepareStatement(get_img);
            ResultSet rs = ps.executeQuery();
            if(rs != null) {
                while(rs.next()) {
                    String name = rs.getString(1);
                    Blob b = rs.getBlob(2);
                    byte [] bar = b.getBytes(1, (int)b.length());

                    FileOutputStream output = new FileOutputStream(new_name);
                    output.write(bar);
                    output.close();
//                    conn.close();
                }
            }
        } catch(SQLException sqle) {
            System.out.println(sqle.getErrorCode() + ": " + sqle.getMessage());
        } catch(IOException ioe) {
            System.out.println(ioe.getMessage());
        }
    }

    public static void main(String[] args) throws Exception{

        try {
            Class.forName("com.mysql.jdbc.Driver");
//            Class.forName("org.mariadb.jdbc.Driver");
            Connection connection =
                    DriverManager.getConnection("jdbc:mysql://localhost:3306/telcoma", "root1", "");

            System.out.println("Drop table: " + drop_table(connection, "image"));

            System.out.println("Create Table Image: " + create_table_if_not_exists("image", connection));

            System.out.println("Insert Image: " + insert_into_image(connection, "india", "maxresdefault.jpg"));

            retrieve_image(connection, "telcoma.jpg");

//            PreparedStatement ps = connection.prepareStatement("insert into customers values(?,?,?,?)");
//            ps.setInt(1, 3);
//            ps.setString(2, "AKT");;
//            ps.setInt(3, 30);
//            ps.setInt(4, 1800);
//
//            int success = ps.executeUpdate();
//
//            System.out.println("success: " + success);

            Statement statement = connection.createStatement();

//            statement.execute("create table customers(id int not null auto_increment, name varchar (40), age int(3), salary int(10), primary key (id))");
//            System.out.println("Table created successfully...");
//            statement.executeUpdate("insert into customers values(2, 'ABC', 26, 10000)");
//            System.out.println("Data inserted successfully");
            ResultSet rs = statement.executeQuery("select * from customers where name='AKT'");
            if(rs != null) {
                while(rs.next()) {
                    System.out.println("id: " + rs.getInt(1) + " name: " + rs.getString(2) +
                            " age: " + rs.getInt(3) + " salary: " + rs.getInt(4));
                }
            }
            System.out.println("Query executed successfully");
        } catch(ClassNotFoundException cnfe) {
            System.out.println(cnfe.getMessage());
            throw cnfe;
        } catch(SQLException sqle) {
            System.out.println(sqle.getMessage());
            throw sqle;
        }


    }
}

// 070 242 877