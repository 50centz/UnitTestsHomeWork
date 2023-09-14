package ShopTest;

import Shop.Product;
import Shop.Shop;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import static org.assertj.core.api.Assertions.assertThat;

public class ShopTest {

    /*
   1. Напишите тесты, чтобы проверить, что магазин хранит верный список продуктов (правильное количество продуктов, верное содержимое корзины).
   2. Напишите тесты для проверки корректности работы метода getMostExpensiveProduct.
   3. Напишите тесты для проверки корректности работы метода sortProductsByPrice (проверьте правильность сортировки).
   */
    public static void main(String[] args) {
        Shop shop = new Shop();

        List<Product> productList = new ArrayList<>();

        Product product = new Product();
        product.setTitle("Tea");
        product.setCost(200);
        productList.add(product);

        Product product1 = new Product();
        product1.setTitle("Coffee");
        product1.setCost(4000);
        productList.add(product1);

        Product product2 = new Product();
        product2.setTitle("Milk");
        product2.setCost(100);
        productList.add(product2);


        Product product3 = new Product();
        product3.setTitle("Sausages");
        product3.setCost(300);

        shop.setProducts(productList);




        assertThat(shop.getProducts()).hasSize(3);
        assertThat(shop.getProducts()).contains(product, product1, product2);
        assertThat(shop.getMostExpensiveProduct()).isEqualTo(product1);
        assertThat(shop.sortProductsByPrice()).containsSequence(product2, product, product1); 
        System.out.println(Collections.max(productList));
    }

}