package edu.uaslp.objetos.shoppingcart.excepctions;

public class ItemNotFoundException extends Exception {
    public ItemNotFoundException(String message) {
        super(message);
    }
}