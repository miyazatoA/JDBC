package jp.co.edu.logic.product.withdto;

import java.math.BigDecimal;
import java.sql.SQLException;

public class ProductInsertGenerateKeyMain {

	public static void main(String[] args) throws SQLException{

		// テスト挿入データ
		Long testId = null;
		Long testCategoryId = 1L;
		String testName = "テスト挿入名称";
		BigDecimal testWeight = new BigDecimal("1999");

                // TODO　コンパイルを通すため、コメントアウト
//		ProductDto productDto = new ProductDto(testId, testCategoryId, testName, testWeight);

		// データ挿入実行





		// テスト実行結果検証
                // TODO　コンパイルを通すため、コメントアウト
//		System.out.println(testResult + "件挿入しました");
//		System.out.println("新規自動採番ID：" + productDto.getId());
	}

}
