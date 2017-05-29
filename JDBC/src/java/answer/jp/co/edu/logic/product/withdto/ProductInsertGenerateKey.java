package answer.jp.co.edu.logic.product.withdto;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import answer.jp.co.edu.dto.ProductDto;

public class ProductInsertGenerateKey {

  public int insertGenerateKey(ProductDto productDto) throws SQLException {

    String className = "org.apache.derby.jdbc.ClientDriver";
    String url = "jdbc:derby://localhost:1527/SQLTEST";
    String user = "sqltest";
    String password = "sqltest";

    String sql = "INSERT INTO product(id,category_id,name,weight)"
                            + "VALUES(NEXT VALUE for SEQ_PRODUCT_ID,?,?,?)";

    Connection connection = null;
    PreparedStatement preparedStatement = null;
    ResultSet resultSet = null;

    try {
      Class.forName(className);
      connection = DriverManager.getConnection(url, user, password);

      // 第2引数に自動採番値を返す定数を指定
      preparedStatement = connection.prepareStatement(sql,
                                    PreparedStatement.RETURN_GENERATED_KEYS);

      preparedStatement.setLong(1, productDto.getCategoryId());
      preparedStatement.setString(2, productDto.getName());
      preparedStatement.setBigDecimal(3, productDto.getWeight());

      int result = preparedStatement.executeUpdate();

      // 新規ID採番結果取得
      resultSet = preparedStatement.getGeneratedKeys();
      resultSet.next();
      int newId = resultSet.getInt(1);
    System.out.println("新規自動採番ID：" + newId);

      return result;

    } catch (ClassNotFoundException | SQLException e) {
      throw new SQLException("商品データ挿入エラーが発生しました。", e);
    } finally {
      if (resultSet != null) {
        resultSet.close();
      }
      if (preparedStatement != null) {
        preparedStatement.close();
      }
      if (connection != null) {
        connection.close();
      }
    }
  }
}
