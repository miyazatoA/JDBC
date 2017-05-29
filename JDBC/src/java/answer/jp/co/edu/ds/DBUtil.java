package answer.jp.co.edu.ds;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import javax.naming.InitialContext;
import javax.naming.NamingException;

import javax.sql.DataSource;

public final class DBUtil {

    private static DataSource dataSource = null;

    private DBUtil() {
    }

    public synchronized static Connection getConnection() throws SQLException {

        try {
            InitialContext ctx = new InitialContext();
            dataSource = (DataSource) ctx.lookup("jdbc/sample");

            Connection connection = DBUtil.dataSource.getConnection();
            System.out.println("DataSourceで接続");
            return connection;
        } catch (SQLException | NamingException e) {
            throw new SQLException("DB接続エラーが発生しました。", e);
        }
    }

    public static void close(Connection connection,
            PreparedStatement preparedStatement, ResultSet resultSet)
            throws SQLException {

        try {
            if (resultSet != null) {
                resultSet.close();
            }
            if (preparedStatement != null) {
                preparedStatement.close();
            }
            if (connection != null) {
                connection.close();
            }
        } catch (SQLException e) {
            throw new SQLException("DB接続解放エラーが発生しました。", e);
        }
    }

}
