package jp.co.edu.logic.product.dao;

import java.util.List;

// TODO　コンパイルを通すため、コメントアウト
//import jp.co.edu.dto.ProductDto;

public class ProductQueryDaoMain {

	public static void main(String[] args)throws Exception{

		// 主キー検索 実行
// TODO　コンパイルを通すため、コメントアウト
//		ProductDto resultProductDto = selectByPKTest();
//		System.out.println("主キー検索 実行");
//		if(resultProductDto != null){
//			System.out.print("id = " + resultProductDto.getId());
//			System.out.println(" , name = " + resultProductDto.getName());
//		}

		// キーワード検索 実行
//		List<ProductDto> resultProductDtoList = selectLikeNameTest();
//		System.out.println("キーワード検索 実行");
//		if(resultProductDtoList != null){
//			for (ProductDto productDto : resultProductDtoList) {
//				System.out.print("id = " + productDto.getId());
//				System.out.println(" , name = " + productDto.getName());
//			}
//		}

	}

//	public static ProductDto selectByPKTest() throws Exception {
//
//		Long testId = 2L;
//
//		ProductQueryDao productQueryDao = new ProductQueryDao();
//		ProductDto productDto = productQueryDao.selectByPK(testId);
//
//		return productDto;
//	}

//	public static List<ProductDto> selectLikeNameTest() throws Exception {
//
//		String testName = "品";
//
//		ProductQueryDao productQueryDao = new ProductQueryDao();
//		List<ProductDto> productList = productQueryDao.selectLikeName(testName);
//
//		return productList;
//	}

}
