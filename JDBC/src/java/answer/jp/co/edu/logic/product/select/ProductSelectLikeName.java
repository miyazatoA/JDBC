package answer.jp.co.edu.logic.product.select;

import java.math.BigDecimal;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import answer.jp.co.edu.dto.ProductDto;

public class ProductSelectLikeName {

  public List<ProductDto> selectLikeName(String productName) throws SQLException {

    String className = "org.apache.derby.jdbc.ClientDriver";
    String url = "jdbc:derby://localhost:1527/SQLTEST";
    String user = "sqltest";
    String password = "sqltest";

    String sql = "SELECT id,category_id,name,weight FROM product WHERE name LIKE ?";

    Connection connection = null;
    PreparedStatement preparedStatement = null;
    ResultSet resultSet = null;

    // 返却用のDTOリスト生成
    List<ProductDto> productDtoList = new ArrayList<>();

    try {
      Class.forName(className);
      connection = DriverManager.getConnection(url, user, password);

      preparedStatement = connection.prepareStatement(sql);

      preparedStatement.setString(1, "%" + productName + "%");

      // 問い合わせ実行
      resultSet = preparedStatement.executeQuery();

      // 複数行分の次行判定
      while (resultSet.next()) {

        Long id = resultSet.getLong("id");
        Long categoryId = resultSet.getLong("category_id");
        String name = resultSet.getString("name");
        BigDecimal weight = resultSet.getBigDecimal("weight");

        ProductDto productDto = new ProductDto(id, categoryId, name, weight);

        // 返却用リストにDTOを追加
        productDtoList.add(productDto);
      }

      // リスト返却
      return productDtoList;

    } catch (ClassNotFoundException | SQLException e) {
      throw new SQLException("商品データ部分一致検索エラーが発生しました。", e);
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
