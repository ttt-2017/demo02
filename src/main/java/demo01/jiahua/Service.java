package demo01.jiahua;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

/**
 * Created by Er on 2017/11/21.
 */
public class Service {
    private static final String TABLENAME = "user";
    private static final String NAME_COL  = "name";
    private static final String AGE_COL   = "age";
    private static final String ID_COL    = "id" +
            "";
    public static void insert(User user){
        Connection connection = Utils.getConn();
        String insertSql = "insert into "+TABLENAME+" ("+NAME_COL+","+AGE_COL+","+ID_COL+") values(?,?,?)";

        PreparedStatement pstmt;
        try {
            pstmt = (PreparedStatement) connection.prepareStatement(insertSql);
            pstmt.setString(1, user.getName());
            pstmt.setInt(2, user.getAge());
            pstmt.setInt(3, user.getAge());
            pstmt.close();
            connection.close();
        } catch (SQLException e) {
            e.printStackTrace();
        }finally {
            try {
                connection.close();
            } catch (SQLException e) {
                e.printStackTrace();
            }
        }
    }
    public static void update(User user){
        Connection connection = Utils.getConn();
    }

    /***
     * 通过用户ID进行删除
     * @param user
     */
    public static void delete(User user){
        Connection conn = Utils.getConn();
        String sql = "delete from "+TABLENAME+" where "+ID_COL+" = " + user.getId()+" ;";
        PreparedStatement pstmt;
        try {
            pstmt = (PreparedStatement) conn.prepareStatement(sql);
            pstmt.close();
            conn.close();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
}
