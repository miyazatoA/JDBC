package answer.jp.co.edu.logic.product.withdto;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import answer.jp.co.edu.dto.ProductDto;

public class ProductDelete {

  public int delete(ProductDto productDto) throws SQLException {

    String className = "org.apache.derby.jdbc.ClientDriver";
    String url = "jdbc:derby://localhost:1527/SQLTEST";
    String user = "sqltest";
    String password = "sqltest";


    String sql = "DELETE FROM product WHERE id=?";

    Connection connection = null;
    PreparedStatement preparedStatement = null;

    try {
      Class.forName(className);

      connection = DriverManager.getConnection(url, user, password);

      preparedStatement = connection.prepareStatement(sql);

      preparedStatement.setLong(1, productDto.getId());

      int updatedRow = preparedStatement.executeUpdate();

      return updatedRow;

    } catch (ClassNotFoundException | SQLException e) {
      throw new SQLException("商品データ削除エラーが発生しました。", e);
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
