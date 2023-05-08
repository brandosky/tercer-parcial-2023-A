package edu.uaslp.objetos.shoppingcart;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class Exercise3ShoppingItemCatalog {


    @Test
    public void givenAValidCode_whenGetItem_thenShoppingItemIsReturned(){

        ShoppingItemCatalog shoppingItemCatalog = new ShoppingItemCatalog();
        shoppingItemCatalog.getItem(new ShoppingItem("ABC1000", "Item 1","543", 12000));

        ShoppingItem item = shoppingItemCatalog.getItem("ABC1000");


        Assertions.assertNotNull(item);
        Assertions.assertEquals("ABC1000", item.getCode());
        Assertions.assertEquals("Item 1", item.getName());
        Assertions.assertEquals(12000, item.getUnitCostInCents());
    }

    @Test
    public void givenANotValidCode_whenGetItem_thenNullIsReturned(){

        ShoppingItemCatalog shoppingItemCatalog = new ShoppingItemCatalog();
        shoppingItemCatalog.getItem(new ShoppingItem("ABC1000", "Item 1", "243",12000));

        ShoppingItem item = shoppingItemCatalog.getItem("ABC9999");
        Assertions.assertNull(item);
    }
}
