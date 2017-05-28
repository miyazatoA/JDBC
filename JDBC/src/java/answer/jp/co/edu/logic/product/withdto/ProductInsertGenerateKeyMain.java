package answer.jp.co.edu.logic.product.withdto;

import java.math.BigDecimal;
import java.sql.SQLException;

import answer.jp.co.edu.dto.ProductDto;

public class ProductInsertGenerateKeyMain {

	public static void main(String[] args) throws SQLException{

    // テスト挿入データ
    Long testId = null;
    Long testCategoryId = 1L;
    String testName = "テスト挿入名称";
    BigDecimal testWeight = new BigDecimal("1999");

    ProductDto productDto = new ProductDto(testId, testCategoryId, testName, testWeight);

    // データ挿入実行
    ProductInsertGenerateKey productInsertGenerateKey =
    		new ProductInsertGenerateKey();

    int testResult = productInsertGenerateKey.insertGenerateKey(productDto);

    // テスト実行結果検証
    System.out.println(testResult + "件挿入しました");
    System.out.println("新規自動採番ID：" + productDto.getId());
  }

}
