package answer.jp.co.edu.logic.product;

import java.sql.SQLException;

public class ProductDeleteMain {

	  public static void main(String[] args) throws SQLException {

		  // テスト削除データ
		  Long testId = 999L;

		  // データ削除オブジェクト生成
		  ProductDelete productDelete = new ProductDelete();

		  // データ削除実行
		  int testResult = productDelete.delete(testId);

		  System.out.println(testResult + "件　削除されました" );
  }
}
