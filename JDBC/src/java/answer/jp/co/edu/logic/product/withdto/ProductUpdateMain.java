package answer.jp.co.edu.logic.product.withdto;

import java.math.BigDecimal;
import java.sql.SQLException;

import answer.jp.co.edu.dto.ProductDto;

public class ProductUpdateMain {

	  public static void main(String[] args) throws SQLException {

		  // テスト更新データ
		  Long testId = 999L;
		  Long testCategoryId = 2L;
		  String testName = "テスト更新名称";
		  BigDecimal testWeight = new BigDecimal("1999");

		  // DTOへ更新データを格納
		  ProductDto productDto = new ProductDto(testId, testCategoryId, testName, testWeight);

		  // データ更新オブジェクト生成
		  ProductUpdate productUpdate= new ProductUpdate();

		  // データ更新実行
		  int testResult = productUpdate.update(productDto);

		  System.out.println(testResult + "件　更新されました" );
		  
  }
}
