package edu.uaslp.objetos.shoppingcart;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.AssertionsForClassTypes.assertThat;

public class Exercise3ShoppingItemCatalog {


    @Test
    public void givenAValidCode_whenGetItem_thenShoppingItemIsReturned(){

        ShoppingItemCatalog shoppingItemCatalog = new ShoppingItemCatalog();


        ShoppingItem item = shoppingItemCatalog.getItem("ABC1000");


        Assertions.assertNotNull(item);
        assertThat(item).isNotNull();

    }

    @Test
    public void givenANotValidCode_whenGetItem_thenNullIsReturned(){

        ShoppingItemCatalog shoppingItemCatalog = new ShoppingItemCatalog();


        ShoppingItem item = shoppingItemCatalog.getItem("Inexistente");


        Assertions.assertNull(item);
        assertThat(item).isNotNull();
    }
}
