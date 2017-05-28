package jp.co.edu.logic.product.withdto;

// TODO　コンパイルを通すため、コメントアウト
//import jp.co.edu.dto.ProductDto;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class ProductInsertGenerateKey {

// TODO　コンパイルを通すため、コメントアウト
//	public int insertGenerateKey(ProductDto productDto) throws SQLException {
//
//		String className = "oracle.jdbc.OracleDriver";
//		String url = "jdbc:oracle:thin:@127.0.0.1:1521:XE";
//		String user = "edu";
//		String password = "edu";
//
//		// 自動採番SQL
//
//
//		Connection connection = null;
//		PreparedStatement preparedStatement = null;
//		ResultSet resultSet = null;
//
//		// 自動採番列指定
//
//
//		try {
//			Class.forName(className);
//			connection = DriverManager.getConnection(url, user, password);
//
//
//
//			preparedStatement.setLong(1, productDto.getCategoryId());
//			preparedStatement.setString(2, productDto.getName());
//			preparedStatement.setBigDecimal(3, productDto.getWeight());
//
//			int insertedRow = preparedStatement.executeUpdate();
//
//			// 新規ID採番結果取得
//
//
//
//
//			// 引数DTOのIDに設定
//
//
//			return insertedRow;
//
//		} catch (ClassNotFoundException | SQLException e) {
//			throw new SQLException("商品データ挿入エラーが発生しました。", e);
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
