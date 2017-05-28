package answer.jp.co.edu.logic.product.withdto;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import answer.jp.co.edu.dto.ProductDto;

public class ProductInsert {

  public int insert(ProductDto productDto) throws SQLException {

    String className = "org.apache.derby.jdbc.ClientDriver";
    String url = "jdbc:derby://localhost:1527/SQLTEST";
    String user = "sqltest";
    String password = "sqltest";

    String sql = "INSERT INTO product(id,category_id,name,weight)VALUES(?,?,?,?)";

    Connection connection = null;
    PreparedStatement preparedStatement = null;

    try {
      Class.forName(className);

      connection = DriverManager.getConnection(url, user, password);

      preparedStatement = connection.prepareStatement(sql);

      preparedStatement.setLong(1, productDto.getId());
      preparedStatement.setLong(2, productDto.getCategoryId());
      preparedStatement.setString(3, productDto.getName());
      preparedStatement.setBigDecimal(4, productDto.getWeight());

      int insertedRow = preparedStatement.executeUpdate();

      return insertedRow;

    } catch (ClassNotFoundException | SQLException e) {
      throw new SQLException("商品データ挿入エラーが発生しました。", e);
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
