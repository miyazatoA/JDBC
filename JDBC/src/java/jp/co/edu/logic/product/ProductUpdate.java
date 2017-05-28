package jp.co.edu.logic.product;

import java.math.BigDecimal;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class ProductUpdate {

	public int update(Long id, Long categoryId, String name, BigDecimal weight) throws SQLException {

		String className = "oracle.jdbc.OracleDriver";
		String url = "jdbc:oracle:thin:@127.0.0.1:1521:XE";
		String user = "edu";
		String password = "edu";






		Connection connection = null;
		PreparedStatement preparedStatement = null;

// TODO　コンパイルを通すため、コメントアウト
//		try {
//			Class.forName(className);
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
//
//		} catch (ClassNotFoundException | SQLException e) {
//			throw new SQLException("商品データ更新エラーが発生しました。", e);
//		} finally {
//			if (preparedStatement != null) {
//
//			}
//			if (connection != null) {
//
//			}
//		}
// TODO　コンパイルを通すため、仮の値を戻り値に設定
            return 0;
	}
}
