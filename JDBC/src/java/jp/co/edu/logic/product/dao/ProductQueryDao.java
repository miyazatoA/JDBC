package jp.co.edu.logic.product.dao;

import java.math.BigDecimal;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

// TODO　コンパイルを通すため、コメントアウト
//import jp.co.edu.dto.ProductDto;

public class ProductQueryDao {

// TODO　コンパイルを通すため、コメントアウト
//	public ProductDto selectByPK(Long productId) throws SQLException {
//
//		String className = "oracle.jdbc.OracleDriver";
//		String url = "jdbc:oracle:thin:@127.0.0.1:1521:XE";
//		String user = "edu";
//		String password = "edu";
//
//		String sql = "SELECT p.id,p.category_id,p.name,p.weight,c.name AS category_name"
//				+ " FROM product p INNER JOIN category c "
//				+ " ON p.category_id = c.id " + " WHERE p.id = ?";
//
//		Connection connection = null;
//		PreparedStatement preparedStatement = null;
//
//		// 実行結果リソース
//		ResultSet resultSet = null;
//
//		// 返却用DTO宣言
//		ProductDto productDto = null;
//
//		try {
//			Class.forName(className);
//			connection = DriverManager.getConnection(url, user, password);
//
//			preparedStatement = connection.prepareStatement(sql);
//
//			preparedStatement.setLong(1, productId);
//
//			// 問い合わせ実行
//			resultSet = preparedStatement.executeQuery();
//
//			// 単一行分の次行判定
//			if (resultSet.next()) {
//
//				// 実行結果リソースよりデータ取得
//				Long id = resultSet.getLong("id");
//				Long categoryId = resultSet.getLong("category_id");
//				String name = resultSet.getString("name");
//				BigDecimal weight = resultSet.getBigDecimal("weight");
//				String categoryName = resultSet.getString("category_name");
//
//				// DTO生成、初期値設定
//				productDto = new ProductDto(id, categoryId, name, weight, categoryName);
//			}
//
//			// DTO返却
//			return productDto;
//
//		} catch (ClassNotFoundException | SQLException e) {
//			throw new SQLException("商品データ主キー検索エラーが発生しました。", e);
//		} finally {
//			// SQL実行リソースの解放
//			if (resultSet != null) {
//				resultSet.close();
//			}
//			if (preparedStatement != null) {
//				preparedStatement.close();
//			}
//			if (connection != null) {
//				connection.close();
//			}
//		}
//	}

//	public List<ProductDto> selectLikeName(String productName) throws SQLException {
//
//		String className = "oracle.jdbc.OracleDriver";
//		String url = "jdbc:oracle:thin:@127.0.0.1:1521:XE";
//		String user = "edu";
//		String password = "edu";
//
//		String sql = "SELECT p.id,p.category_id,p.name,p.weight,c.name AS category_name"
//				+ " FROM product p INNER JOIN category c " + " ON p.category_id = c.id "
//				+ " WHERE p.name LIKE ?"
//				+ " ORDER BY p.id ASC";
//
//		Connection connection = null;
//		PreparedStatement preparedStatement = null;
//		ResultSet resultSet = null;
//
//		// 返却用のDTOリスト生成
//		List<ProductDto> productDtoList = new ArrayList<>();
//
//		try {
//			Class.forName(className);
//			connection = DriverManager.getConnection(url, user, password);
//
//			preparedStatement = connection.prepareStatement(sql);
//
//			preparedStatement.setString(1, "%" + productName + "%");
//
//			// 問い合わせ実行
//			resultSet = preparedStatement.executeQuery();
//
//			// 複数行分の次行判定
//			while (resultSet.next()) {
//
//				Long id = resultSet.getLong("id");
//				Long categoryId = resultSet.getLong("category_id");
//				String name = resultSet.getString("name");
//				BigDecimal weight = resultSet.getBigDecimal("weight");
//				String categoryName = resultSet.getString("category_name");
//
//				ProductDto productDto = new ProductDto(id, categoryId, name, weight, categoryName);
//
//				// 返却用リストにDTOを追加
//				productDtoList.add(productDto);
//			}
//
//			// リスト返却
//			return productDtoList;
//
//		} catch (ClassNotFoundException | SQLException e) {
//			throw new SQLException("商品データ部分一致検索エラーが発生しました。", e);
//		} finally {
//			if (resultSet != null) {
//				resultSet.close();
//			}
//			if (preparedStatement != null) {
//				preparedStatement.close();
//			}
//			if (connection != null) {
//				connection.close();
//			}
//		}
//	}

}
