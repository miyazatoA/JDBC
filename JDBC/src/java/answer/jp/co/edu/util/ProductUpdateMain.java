package answer.jp.co.edu.util;

import answer.jp.co.edu.dto.ProductDto;
import answer.jp.co.edu.logic.product.withdto.ProductUpdate;
import java.math.BigDecimal;
import java.sql.SQLException;

public class ProductUpdateMain {

    public static void main(String[] args) throws SQLException {

        // テスト更新データ
        Long testId = 10000L;
        Long testCategoryId = 2L;
        String testName = "テスト更新名称";
        BigDecimal testWeight = new BigDecimal("1999");

        // データ更新オブジェクト生成
        // DTOへ更新データを格納
        ProductDto productDto = new ProductDto(testId, testCategoryId, testName, testWeight);

        // データ更新オブジェクト生成
        ProductUpdateDao productUpdate = new ProductUpdateDao();

        // データ更新実行
        int testResult = productUpdate.update(productDto);

        System.out.println(testResult + "件　更新されました");

    }
}
