package answer.jp.co.edu.logic.product.withdto;

import java.sql.SQLException;

import answer.jp.co.edu.dto.ProductDto;

public class ProductDeleteMain {

	  public static void main(String[] args) throws SQLException {

		  // テスト削除データ
		  Long testId = 999L;

		  // データ削除オブジェクト生成
		  ProductDelete productDelete = new ProductDelete();

		  // DTOへ更新データを格納
		  ProductDto productDto = new ProductDto(testId, null, null, null);

		  // データ削除実行
		  int testResult = productDelete.delete(productDto);

		  System.out.println(testResult + "件　削除されました" );
  }
}
