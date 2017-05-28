package jp.co.edu.logic.product.dao;

import java.math.BigDecimal;
// TODO　コンパイルを通すため、コメントアウト
//import jp.co.edu.dto.ProductDto;

public class ProductUpdateDaoMain {


	public static void main(String[] args) throws Exception{

		// 挿入処理 実行
		insertTest();
		System.out.println("挿入処理実行");

		// 更新処理 実行
		updateTest();
		System.out.println("更新処理実行");

		// 削除処理 実行
		deleteTest();
		System.out.println("削除処理実行");

	}

	public static int insertTest() throws Exception{

		// テスト挿入データ
		Long testId = 999L;
		Long testCategoryId = 1L;
		String testName = "テスト挿入名称";
		BigDecimal testWeight = new BigDecimal("1999");

                int testResult = 0;
// TODO　コンパイルを通すため、コメントアウト
//		ProductDto productDto = new ProductDto(testId, testCategoryId, testName, testWeight);
//
//		// データ挿入実行
//		ProductUpdateDao productUpdateDao = new ProductUpdateDao();
//		int testResult = productUpdateDao.insert(productDto);
//
		return testResult;
	}

	public static int updateTest() throws Exception{

		// テスト更新データ
		Long testId = 999L;
		Long testCategoryId = 2L;
		String testName = "テスト更新名称";
		BigDecimal testWeight = new BigDecimal("1999");

                int testResult = 0;
// TODO　コンパイルを通すため、コメントアウト
////		ProductDto productDto = new ProductDto(testId, testCategoryId, testName, testWeight);
//
//		// データ更新実行
//		ProductUpdateDao productUpdateDao = new ProductUpdateDao();
//		int testResult = productUpdateDao.update(productDto);

		return testResult;
	}

	public static int deleteTest() throws Exception{

		// テスト削除データ
		Long testId = 999L;

                int testResult = 0;
// TODO　コンパイルを通すため、コメントアウト
//		ProductDto productDto = new ProductDto(testId, null, null, null);
//
//		// データ削除実行
//		ProductUpdateDao productUpdateDao = new ProductUpdateDao();
//		int testResult = productUpdateDao.delete(productDto);

		return testResult;
	}

}
