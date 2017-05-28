package jp.co.edu.logic.product;

import java.math.BigDecimal;
import java.sql.SQLException;

public class ProductInsertMain {

	  public static void main(String[] args) throws SQLException {

		  // テスト挿入データ
		  Long testId = 999L;
		  Long testCategoryId = 1L;
		  String testName = "テスト挿入名称";
		  BigDecimal testWeight = new BigDecimal("1999");

		  // データ挿入オブジェクト生成


		  // データ挿入実行


//		  System.out.println(testResult + "件　挿入されました" );
		  
  }
}
