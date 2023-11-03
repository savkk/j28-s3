package ru.yandex.practicum;

import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;

@RunWith(Parameterized.class)
public class ProductFinalPriceTest {
    @Parameterized.Parameter(0)
    public int price;
    @Parameterized.Parameter(1)
    public int discount;
    @Parameterized.Parameter(2)
    public int expectedResult;

//
//    public ProductTest(int price, int discount, int expectedResult) {
//        this.price = price;
//        this.discount = discount;
//        this.expectedResult = expectedResult;
//    }

    @Parameterized.Parameters(name = "{index} - price {0}, discount {1}, expectedResult {2}")
    public static Object[][] data() {
        return new Object[][]{
                {200, 51, 200},
                {200, 50, 100},
                {200, 0, 200},
                {200, -1, 200}
        };
    }

    @Test
    public void getFinalPrice() {
        Product product = new Product(price, discount);
        int finalPrice = product.getFinalPrice();
        Assert.assertEquals(expectedResult, finalPrice);
    }
}