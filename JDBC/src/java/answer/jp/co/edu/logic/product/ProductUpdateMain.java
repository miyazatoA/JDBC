package answer.jp.co.edu.logic.product;

import java.math.BigDecimal;
import java.sql.SQLException;

public class ProductUpdateMain {

	public static void main(String[] args) throws SQLException {

		// テスト更新データ
		Long testId = 999L;
		Long testCategoryId = 2L;
		String testName = "テスト更新名称";
		BigDecimal testWeight = new BigDecimal("1999");

		// データ更新オブジェクト生成
		ProductUpdate productUpdate = new ProductUpdate();

		// データ更新実行
		int testResult = productUpdate.update(testId, testCategoryId, testName, testWeight);
		System.out.println(testResult + "件　更新されました" );
	}
}
