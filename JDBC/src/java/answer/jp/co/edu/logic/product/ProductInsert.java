package answer.jp.co.edu.logic.product;

import java.math.BigDecimal;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class ProductInsert {

  public int insert(Long id, Long categoryId, String name, BigDecimal weight) throws SQLException {

    // DB接続情報
    String className = "org.apache.derby.jdbc.ClientDriver";
    String url = "jdbc:derby://localhost:1527/SQLTEST";
    String user = "sqltest";
    String password = "sqltest";


    // SQL文字列
    String sql = "INSERT INTO product(id,category_id,name,weight)VALUES(?,?,?,?)";

    // SQL実行リソース変数定義(null初期化)
    Connection connection = null;
    PreparedStatement preparedStatement = null;

    try {
      // ドライバクラス・ロード
      Class.forName(className);

      // DB接続
      connection = DriverManager.getConnection(url, user, password);

      // SQLの準備
      preparedStatement = connection.prepareStatement(sql);

      // SQLの？パラメータを埋める
      preparedStatement.setLong(1, id);
      preparedStatement.setLong(2, categoryId);
      preparedStatement.setString(3, name);
      preparedStatement.setBigDecimal(4, weight);

      // SQL実行
      int insertedRow = preparedStatement.executeUpdate();

      // DBに反映した行数(挿入行数)
      return insertedRow;

    } catch (ClassNotFoundException | SQLException e) {
      // SQL実行エラーメッセージを設定してエラー通知
      throw new SQLException("商品データ挿入エラーが発生しました。", e);
    } finally {
      // SQL実行リソースの解放
      if (preparedStatement != null) {
        preparedStatement.close();
      }
      if (connection != null) {
        connection.close();
      }
    }
  }
}
