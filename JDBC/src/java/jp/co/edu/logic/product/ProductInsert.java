package jp.co.edu.logic.product;

import java.math.BigDecimal;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class ProductInsert {

  public int insert(Long id, Long categoryId, String name, BigDecimal weight) throws SQLException {

    // DB接続情報
    String className = "oracle.jdbc.OracleDriver";
    String url = "jdbc:oracle:thin:@127.0.0.1:1521:XE";
    String user = "edu";
    String password = "edu";

    // 手順②-1 SQL文字列


    // SQL実行リソース変数定義(null初期化)
    Connection connection = null;
    PreparedStatement preparedStatement = null;

// TODO　コンパイルを通すため、コメントアウト
//    try {
//      // ドライバクラス・ロード
//      Class.forName(className);
//
//      // 手順① DB接続
//
//
//      // 手順②-2 SQLの準備
//
//
//      // 手順②-3 SQLの？パラメータを埋める
//
//
//
//
//
//      // 手順②-4 SQL実行
//
//
//      // DBに反映した行数(挿入行数)
//
//
//    } catch (ClassNotFoundException | SQLException e) {
//      // SQL実行エラーメッセージを設定してエラー通知
//      throw new SQLException("商品データ挿入エラーが発生しました。", e);
//    } finally {
//      // 手順③ SQL実行リソースの解放
//      if (preparedStatement != null) {
//
//      }
//      if (connection != null) {
//
//      }
//    }
// TODO　コンパイルを通すため、仮の値を設定
    return 0;
  }
}
