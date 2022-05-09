package jdbc.Utils;

import javax.sql.DataSource;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.SQLException;
import java.sql.SQLFeatureNotSupportedException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.logging.Logger;

public class MyDataSource implements DataSource {

    private static List<Connection> pool= Collections.synchronizedList(new ArrayList<>());
    static {
        for (int i = 0; i < 10; i++) {
            Connection con= null;
            try {
                con = JDBCUtils.getConnection();
            } catch (SQLException e) {
                e.printStackTrace();
            }
            pool.add(con);
        }
    }
    @Override
    public Connection getConnection() throws SQLException {
        if(pool.size()>0){
            Connection con = pool.remove(0);
            return con;
        }else {
            throw new RuntimeException("数量无");
        }
    }

    public int getSize(){
        return pool.size();
    }

    @Override
    public Connection getConnection(String username, String password) throws SQLException {
        return null;
    }

    @Override
    public <T> T unwrap(Class<T> iface) throws SQLException {
        return null;
    }

    @Override
    public boolean isWrapperFor(Class<?> iface) throws SQLException {
        return false;
    }

    @Override
    public PrintWriter getLogWriter() throws SQLException {
        return null;
    }

    @Override
    public void setLogWriter(PrintWriter out) throws SQLException {

    }

    @Override
    public void setLoginTimeout(int seconds) throws SQLException {

    }

    @Override
    public int getLoginTimeout() throws SQLException {
        return 0;
    }

    @Override
    public Logger getParentLogger() throws SQLFeatureNotSupportedException {
        return null;
    }
}
