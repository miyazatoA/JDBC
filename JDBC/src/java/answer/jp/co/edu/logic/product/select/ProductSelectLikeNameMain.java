package answer.jp.co.edu.logic.product.select;

import java.sql.SQLException;
import java.util.List;

import answer.jp.co.edu.dto.ProductDto;

public class ProductSelectLikeNameMain {

	public static void main(String[] args) throws SQLException{

		String testName = "品";

		ProductSelectLikeName productSelectLikeName = new ProductSelectLikeName();
		List<ProductDto> productList = productSelectLikeName.selectLikeName(testName);

		for (ProductDto productDto : productList) {
			System.out.print(productDto.getId() + " , ");
			System.out.println(productDto.getName());
		}
	}
}
