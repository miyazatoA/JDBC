package jp.co.edu.logic.product.dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

// TODO　コンパイルを通すため、コメントアウト
//import jp.co.edu.dto.ProductDto;

public class ProductUpdateDao {

// TODO　コンパイルを通すため、コメントアウト
////  public int insert(ProductDto productDto) throws SQLException {
//
//    String className = "oracle.jdbc.OracleDriver";
//    String url = "jdbc:oracle:thin:@127.0.0.1:1521:XE";
//    String user = "edu";
//    String password = "edu";
//
//    String sql = "INSERT INTO product(id,category_id,name,weight)VALUES(?,?,?,?)";
//
//    Connection connection = null;
//    PreparedStatement preparedStatement = null;
//
//    try {
//      Class.forName(className);
//
//      connection = DriverManager.getConnection(url, user, password);
//
//      preparedStatement = connection.prepareStatement(sql);
//
//      preparedStatement.setLong(1, productDto.getId());
//      preparedStatement.setLong(2, productDto.getCategoryId());
//      preparedStatement.setString(3, productDto.getName());
//      preparedStatement.setBigDecimal(4, productDto.getWeight());
//
//      int insertedRow = preparedStatement.executeUpdate();
//
//      return insertedRow;
//
//    } catch (ClassNotFoundException | SQLException e) {
//      throw new SQLException("商品データ挿入エラーが発生しました。", e);
//    } finally {
//      if (preparedStatement != null) {
//        preparedStatement.close();
//      }
//      if (connection != null) {
//        connection.close();
//      }
//    }
//  }

//  public int insertGenerateKey(ProductDto productDto) throws SQLException {
//
//    String className = "oracle.jdbc.OracleDriver";
//    String url = "jdbc:oracle:thin:@127.0.0.1:1521:XE";
//    String user = "edu";
//    String password = "edu";
//
//    String sql = "INSERT INTO product(id,category_id,name,weight)VALUES(seq_product_id.NEXTVAL,?,?,?)";
//
//    Connection connection = null;
//    PreparedStatement preparedStatement = null;
//    ResultSet resultSet = null;
//
//    // 自動採番列指定
//    String[] seqColumn = { "id" };
//
//    try {
//      Class.forName(className);
//      connection = DriverManager.getConnection(url, user, password);
//
//      preparedStatement = connection.prepareStatement(sql, seqColumn);
//
//      preparedStatement.setLong(1, productDto.getCategoryId());
//      preparedStatement.setString(2, productDto.getName());
//      preparedStatement.setBigDecimal(3, productDto.getWeight());
//
//      int insertedRow = preparedStatement.executeUpdate();
//
//      // 新規ID採番結果取得
//      resultSet = preparedStatement.getGeneratedKeys();
//      resultSet.next();
//      long newId = resultSet.getLong(1);
//
//      // 引数DTOのIDに設定
//      productDto.setId(newId);
//
//      return insertedRow;
//
//    } catch (ClassNotFoundException | SQLException e) {
//      throw new SQLException("商品データ挿入エラーが発生しました。", e);
//    } finally {
//      if (resultSet != null) {
//        resultSet.close();
//      }
//      if (preparedStatement != null) {
//        preparedStatement.close();
//      }
//      if (connection != null) {
//        connection.close();
//      }
//    }
//  }

//  public int update(ProductDto productDto) throws SQLException {
//
//    String className = "oracle.jdbc.OracleDriver";
//    String url = "jdbc:oracle:thin:@127.0.0.1:1521:XE";
//    String user = "edu";
//    String password = "edu";
//
//    String sql = "UPDATE product SET"
//    		+ " category_id=?,name=?,weight=?,update_timestamp=SYSDATE,version=version+1"
//    		+ " WHERE id=?";
//
//    Connection connection = null;
//    PreparedStatement preparedStatement = null;
//
//    try {
//      Class.forName(className);
//
//      connection = DriverManager.getConnection(url, user, password);
//
//      preparedStatement = connection.prepareStatement(sql);
//
//      preparedStatement.setLong(1, productDto.getCategoryId());
//      preparedStatement.setString(2, productDto.getName());
//      preparedStatement.setBigDecimal(3, productDto.getWeight());
//      preparedStatement.setLong(4, productDto.getId());
//
//      int updatedRow = preparedStatement.executeUpdate();
//
//      return updatedRow;
//
//    } catch (ClassNotFoundException | SQLException e) {
//      throw new SQLException("商品データ更新エラーが発生しました。", e);
//    } finally {
//      if (preparedStatement != null) {
//        preparedStatement.close();
//      }
//      if (connection != null) {
//        connection.close();
//      }
//    }
//  }

//  public int delete(ProductDto productDto) throws SQLException {
//
//    String className = "oracle.jdbc.OracleDriver";
//    String url = "jdbc:oracle:thin:@127.0.0.1:1521:XE";
//    String user = "edu";
//    String password = "edu";
//
//    String sql = "DELETE FROM product WHERE id=?";
//
//    Connection connection = null;
//    PreparedStatement preparedStatement = null;
//
//    try {
//      Class.forName(className);
//
//      connection = DriverManager.getConnection(url, user, password);
//
//      preparedStatement = connection.prepareStatement(sql);
//
//      preparedStatement.setLong(1, productDto.getId());
//
//      int updatedRow = preparedStatement.executeUpdate();
//
//      return updatedRow;
//
//    } catch (ClassNotFoundException | SQLException e) {
//      throw new SQLException("商品データ削除エラーが発生しました。", e);
//    } finally {
//      if (preparedStatement != null) {
//        preparedStatement.close();
//      }
//      if (connection != null) {
//        connection.close();
//      }
//    }
//  }
}
