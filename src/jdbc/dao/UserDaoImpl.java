package jdbc.dao;

import jdbc.entity.User;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;

public class UserDaoImpl implements UserDao{
    public List<User> users = new ArrayList<>();
    @Override
    public List<User> findAll() throws SQLException {
        Connection conn = DriverManager.getConnection("jdbc:mysql://sh-cynosdbmysql-grp-10kn1b4i.sql.tencentcdb.com:27594/test", "cyh", "Cyh_990723");
        Statement stat = conn.createStatement();
        String sql="SELECT * from `user`";
        ResultSet rs = stat.executeQuery(sql);
        while (rs.next()){
            User user=new User(rs.getInt("id"),rs.getString("name"),rs.getInt("age"));
            users.add(user);
        }
        conn.close();
        stat.close();
        rs.close();
        return users;
    }

    @Override
    public User findById(Integer id) throws SQLException {
        User user=new User();
        Connection conn = DriverManager.getConnection("jdbc:mysql://sh-cynosdbmysql-grp-10kn1b4i.sql.tencentcdb.com:27594/test", "cyh", "Cyh_990723");
        Statement stat = conn.createStatement();
        String sql="SELECT * from `user` where id ='"+id+"'";
        ResultSet rs = stat.executeQuery(sql);
        while (rs.next()){
            user.setId(rs.getInt("id"));
            user.setName(rs.getString("name"));
            user.setAge(rs.getInt("age"));

        }
        conn.close();
        stat.close();
        rs.close();
        return user;
    }

    @Override
    public int insert(User user) throws SQLException {
        int result=0;
        Connection conn = DriverManager.getConnection("jdbc:mysql://sh-cynosdbmysql-grp-10kn1b4i.sql.tencentcdb.com:27594/test", "cyh", "Cyh_990723");
        Statement stat = conn.createStatement();
        String sql="insert into user values ('"+user.getId()+"','"+user.getName()+"','"+user.getAge()+"')";
        result= stat.executeUpdate(sql);

        conn.close();
        stat.close();
        return result;
    }

    @Override
    public int update(User user) {
        return 0;
    }

    @Override
    public int delete(Integer id) {
        return 0;
    }
}
