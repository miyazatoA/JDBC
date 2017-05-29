package answer.jp.co.edu.ds;

import java.math.BigDecimal;
import java.sql.Connection;
import java.sql.SQLException;

import answer.jp.co.edu.dto.ProductDto;
import answer.jp.co.edu.logic.product.dao.ProductQueryDao;
import answer.jp.co.edu.logic.product.dao.ProductUpdateDao;
import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class LoadTest_main extends HttpServlet {

    private static ProductUpdateDao productUpdateDao = new ProductUpdateDao();
    private static ProductQueryDao productQueryDao = new ProductQueryDao();
    private static Connection connection = null;

    public void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        try {
            testSetup();
            testLoad();

            response.setContentType("text/plain; charset=Windows-31J");
            PrintWriter out = response.getWriter();
            out.println("testLoad実行完了");
        } catch (SQLException e) {
            System.out.println(e);

        } catch (Exception e) {
            System.out.println(e);
        } finally {
            try {
                testShutdown();
            } catch (SQLException e) {
                System.out.println(e);
            }
        }
    }

    public static void testSetup() throws SQLException {
        connection = DBUtil.getConnection();
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
//            productUpdateDao.delete(productDto);
        }
    }

    public static void testShutdown() throws SQLException {
        connection.close();
    }

}
