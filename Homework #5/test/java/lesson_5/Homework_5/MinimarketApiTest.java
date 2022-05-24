package lesson_5.Homework_5;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

public class MinimarketApiTest extends AbstractTest {
    private static MinimarketService service;

    @BeforeAll
    static void beforeAll() {
        service = new MinimarketService();
    }

    @Test
    @DisplayName("#1 Test GET to ID from category-controller")
    void testGetCategoryId() throws Exception {
        CategoryResult categoryId = service.getCategory(1);
        assertJson(getResource("category200.json"), categoryId);
    }

    @Test
    @DisplayName("#2 Test GET product-controller undocumented, code 500")
    void testGetProducts() throws Exception {
        ProductResult500 products = service.getProducts();
        assertJson(getResource("productsGet500.json"), products);
    }

    @Test
    @DisplayName("#3 Test POST product in product-controller")
    void testPostProduct() {
        Products product = service.postProduct("Halop", 3, "Food");
        System.out.println(SerializeJson.getJson(product));
    }

    @Test
    @DisplayName("#4 Test PUT product in product-controller")
    void testPutProduct() {
        Products products = service.putProduct(406, "Banana", 1, "Food");
        System.out.println(SerializeJson.getJson(products));
    }

    @Test
    @DisplayName("#5 Test GET product in product-controller")
    void testGetProduct() {
        Products products = service.getProduct(406);
    }

    @Test
    @DisplayName("#6 Test DELETE created product from product-controller")
    void testDeleteProduct() {
        Object productDel = service.deleteProduct(409);
        System.out.println(SerializeJson.getJson(productDel));

    }
}
