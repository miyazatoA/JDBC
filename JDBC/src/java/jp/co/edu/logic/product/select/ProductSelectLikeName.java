package jp.co.edu.logic.product.select;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class ProductSelectLikeName {

// TODO　コンパイルを通すため、コメントアウト
//	public List<ProductDto> selectLikeName(String productName) throws SQLException {
//
//		String className = "oracle.jdbc.OracleDriver";
//		String url = "jdbc:oracle:thin:@127.0.0.1:1521:XE";
//		String user = "edu";
//		String password = "edu";
//
//		// 手順① 検索 SQL の準備
//
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
//			// 手順② PreparedStatement オブジェクトの生成
//
//
//			// 手順③ 「?」パラメータの設定
//
//
//			// 手順④ SQL の実行
//
//
//			// 複数行分の次行判定
//
//
//
//
//
//
//
//
//
//
//
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
