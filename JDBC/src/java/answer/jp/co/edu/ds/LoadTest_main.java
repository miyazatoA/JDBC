package answer.jp.co.edu.ds;

import java.math.BigDecimal;
import java.sql.Connection;
import java.sql.SQLException;

import answer.jp.co.edu.dto.ProductDto;
import answer.jp.co.edu.logic.product.dao.ProductQueryDao;
import answer.jp.co.edu.logic.product.dao.ProductUpdateDao;


public class LoadTest_main {

	private static ProductUpdateDao productUpdateDao = new ProductUpdateDao();
	private static ProductQueryDao productQueryDao = new ProductQueryDao();

	public static void main(String[] args) throws Exception{
		testSetup();
		
		testLoad();
	}
	
	
	
	public static void testSetup() throws SQLException {
		Connection connection = DBUtil.getConnection();
		connection.close();
	}

	public static void testLoad() throws Exception {

		Long testCategoryId = 1L;
		String testName = "テスト負荷名称";
		BigDecimal testWeight = new BigDecimal("1999");

		ProductDto productDto = new ProductDto(null, testCategoryId, testName, testWeight);

		for (int i = 0; i < 2; i++) {
			productUpdateDao.insertGenerateKey(productDto);
			productUpdateDao.update(productDto);
			productQueryDao.selectLikeName("負荷");
			productUpdateDao.delete(productDto);
		}
	}
}
