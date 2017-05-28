package answer.jp.co.edu.logic.product.withdto;

import java.math.BigDecimal;
import java.sql.SQLException;

import answer.jp.co.edu.dto.ProductDto;

public class ProductInsertMain {

	  public static void main(String[] args) throws SQLException {

		  // テスト挿入データ
		  Long testId = 999L;
		  Long testCategoryId = 1L;
		  String testName = "テスト挿入名称";
		  BigDecimal testWeight = new BigDecimal("1999");

		  // DTOへ挿入データを格納
		  ProductDto productDto = new ProductDto(testId, testCategoryId, testName, testWeight);

		  // データ挿入オブジェクト生成
		  ProductInsert productInsert = new ProductInsert();

		  // データ挿入実行
		  int testResult = productInsert.insert(productDto);

		  System.out.println(testResult + "件　挿入されました" );
		  
  }
}
