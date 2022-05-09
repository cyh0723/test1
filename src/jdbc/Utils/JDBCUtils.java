package jdbc.Utils;

import java.io.IOException;
import java.io.InputStream;
import java.sql.*;
import java.util.Properties;

public class JDBCUtils {
    private JDBCUtils(){}

    private static String driverClass;
    private static String url;
    private static String username;
    private static String password;
    private static Connection con;

    static {
        try {
            InputStream is = JDBCUtils.class.getClassLoader().getResourceAsStream("config.properties");
            Properties prop=new Properties();
            prop.load(is);

            driverClass= prop.getProperty("driverClass");
            url= prop.getProperty("url");
            username= prop.getProperty("username");
            password=prop.getProperty("password");

            Class.forName(driverClass);
        } catch (IOException e) {
            e.printStackTrace();
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }
    }

    public static Connection getConnection() throws SQLException {
        con= DriverManager.getConnection(url,username,password);
        return con;
    }

    public static void close(Connection con, Statement stat, ResultSet rs) throws SQLException {
        if(con!=null){
            con.close();
        }
        if(stat!=null){
            stat.close();
        }
        if(rs!=null){
            rs.close();
        }
    }

    public static void close(Connection con, Statement stat) throws SQLException {
        if(con!=null){
            con.close();
        }
        if(stat!=null){
            stat.close();
        }

    }
}
