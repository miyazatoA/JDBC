package jp.co.edu.logic.product;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class ProductDelete {

	public int delete(Long id) throws SQLException {

		String className = "oracle.jdbc.OracleDriver";
		String url = "jdbc:oracle:thin:@127.0.0.1:1521:XE";
		String user = "edu";
		String password = "edu";



		Connection connection = null;
		PreparedStatement preparedStatement = null;

                // TODO 以下のtry-catch文を完成させてください。
		// try {















//		} catch (ClassNotFoundException | SQLException e) {
//			throw new SQLException("商品データ削除エラーが発生しました。", e);
//		} finally {
//			if (preparedStatement != null) {
//
//			}
//			if (connection != null) {
//
//			}
//		}
            // TODO 以下のretrun値も仮（コンパイルエラーをなくすため）
            return 0;
	}
}
