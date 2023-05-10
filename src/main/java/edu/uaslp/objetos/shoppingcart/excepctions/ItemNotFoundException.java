package edu.uaslp.objetos.shoppingcart.excepctions;

public class ItemNotFoundException extends ShoppingCartException {
    public ItemNotFoundException(String message) {
        super(message);
    }
}