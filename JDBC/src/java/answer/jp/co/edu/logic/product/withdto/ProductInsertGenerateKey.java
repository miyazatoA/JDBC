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

    // 自動採番列指定
    String[] seqColumn = { "id" };

    try {
      Class.forName(className);
      connection = DriverManager.getConnection(url, user, password);

      preparedStatement = connection.prepareStatement(sql, seqColumn);

      preparedStatement.setLong(1, productDto.getCategoryId());
      preparedStatement.setString(2, productDto.getName());
      preparedStatement.setBigDecimal(3, productDto.getWeight());

      int insertedRow = preparedStatement.executeUpdate();

      // 新規ID採番結果取得
      resultSet = preparedStatement.getGeneratedKeys();
      resultSet.next();
      long newId = resultSet.getLong(1);

      // 引数DTOのIDに設定
      productDto.setId(newId);

      return insertedRow;

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
