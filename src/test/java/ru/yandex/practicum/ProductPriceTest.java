package ru.yandex.practicum;

import org.junit.Assert;
import org.junit.Test;

public class ProductPriceTest {

    @Test
    public void getPrice() {
        Product product = new Product(50, 0);
        Assert.assertEquals(100, product.getPrice());
    }
}