package answer.jp.co.edu.util;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public final class DBUtil {

	private DBUtil() {
	}

	public synchronized static Connection getConnection() throws SQLException {

		// DB接続情報
		String className = "org.apache.derby.jdbc.ClientDriver";
		String url = "jdbc:derby://localhost:1527/SQLTEST";
		String user = "sqltest";
		String password = "sqltest";

		try {
			Class.forName(className);
			Connection connection = DriverManager.getConnection(url, user, password);

			return connection;
		} catch (ClassNotFoundException | SQLException e) {
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