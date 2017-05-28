package answer.jp.co.edu.logic.product;

import java.math.BigDecimal;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class ProductUpdate {

  public int update(Long id, Long categoryId, String name, BigDecimal weight) throws SQLException {

    String className = "org.apache.derby.jdbc.ClientDriver";
    String url = "jdbc:derby://localhost:1527/SQLTEST";
    String user = "sqltest";
    String password = "sqltest";

    String sql = "UPDATE product SET"
    		+ " category_id=?,name=?,weight=?,update_timestamp=CURRENT DATE,version=version+1"
    		+ " WHERE id=?";

    Connection connection = null;
    PreparedStatement preparedStatement = null;

    try {
      Class.forName(className);

      connection = DriverManager.getConnection(url, user, password);

      preparedStatement = connection.prepareStatement(sql);

      preparedStatement.setLong(1, categoryId);
      preparedStatement.setString(2, name);
      preparedStatement.setBigDecimal(3, weight);
      preparedStatement.setLong(4, id);

      int updatedRow = preparedStatement.executeUpdate();

      return updatedRow;

    } catch (ClassNotFoundException | SQLException e) {
      throw new SQLException("商品データ更新エラーが発生しました。", e);
    } finally {
      if (preparedStatement != null) {
        preparedStatement.close();
      }
      if (connection != null) {
        connection.close();
      }
    }
  }
}
