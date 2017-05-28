package answer.jp.co.edu.login;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class LoginTest {

  public static void main(String[] args) throws SQLException {

    // 手順①　DB接続情報
    String className = "org.apache.derby.jdbc.ClientDriver";
    String url = "jdbc:derby://localhost:1527/SQLTEST";
    String user = "sqltest";
    String password = "sqltest";

    // 接続リソース宣言
    Connection connection = null;

    try {
      // 手順②　JDBCドライバーの登録
      Class.forName(className);

      // 手順③　Connectionオブジェクトの取得
      connection = DriverManager.getConnection(url, user, password);

      System.out.println("DB接続成功");

    } catch (ClassNotFoundException | SQLException e) {
      throw new SQLException("DB接続失敗");
    } finally {
      // 手順④　DB接続解除
      if (connection != null) {
        connection.close();
      }
    }
  }
}
