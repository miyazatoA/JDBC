package jp.co.edu.login;

import java.sql.Connection;
import java.sql.SQLException;

public class LoginTest {

	public static void main(String[] args) throws SQLException {

		// 手順① DB接続情報






		// 接続リソース宣言
		Connection connection = null;

                // TODO　コンパイルを通すため、Try-catchをコメントアウト
//                try {
			// 手順② JDBCドライバーの登録


			// 手順③ Connection オブジェクトの取得


			System.out.println("DB接続成功");


//		} catch (ClassNotFoundException | SQLException e) {
//			throw new SQLException("DB接続失敗");
//		} finally {
//			// 手順④ DB接続解除
//			if (connection != null) {
//
//
//			}
//		}
	}
}
