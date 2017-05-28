package answer.jp.co.edu.ds;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import javax.naming.InitialContext;
import javax.naming.NamingException;

import javax.sql.DataSource;

// TODO BasicDataSourceがDerbyで適用できるか確認
//import org.apache.commons.dbcp.BasicDataSource;

public final class DBUtil {

	private static DataSource dataSource = null;

	private DBUtil() {
	}

	public synchronized static Connection getConnection() throws SQLException {

		if (DBUtil.dataSource == null) {

			// DB接続情報
//                        String className = "org.apache.derby.jdbc.ClientDriver";
//                        String url = "jdbc:derby://localhost:1527/SQLTEST";
//                        String user = "sqltest";
//                        String password = "sqltest";
			int initialSize = 10;
			int maxActive = 20;

//			BasicDataSource basicDataSource = new BasicDataSource();
//			basicDataSource.setDriverClassName(className);
//			basicDataSource.setUrl(url);
//			basicDataSource.setUsername(user);
//			basicDataSource.setPassword(password);
//			basicDataSource.setInitialSize(initialSize);
//			basicDataSource.setMaxActive(maxActive);
//
//			DBUtil.dataSource = basicDataSource;


                }

		try {
                        InitialContext ctx = new InitialContext();
                        DataSource ds = (DataSource)ctx.lookup("java:app/jdbc/SamplePool");

                        Connection connection = DBUtil.dataSource.getConnection();
                        System.out.println("DataSourceで接続");
			return connection;
		} catch (SQLException | NamingException e) {
			throw new SQLException("DB接続エラーが発生しました。", e);
		}
	}

	public static void close
			(Connection connection, PreparedStatement preparedStatement, ResultSet resultSet)
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