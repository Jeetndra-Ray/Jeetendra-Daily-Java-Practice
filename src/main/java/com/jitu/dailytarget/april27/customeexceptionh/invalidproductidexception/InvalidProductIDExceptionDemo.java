package com.jitu.dailytarget.april27.customeexceptionh.invalidproductidexception;

public class InvalidProductIDExceptionDemo {
    public static void validateProductID(String productID) throws InvalidProductIDException {
        if (productID == null || !productID.matches("^[A-Z]{3}-\\d{4}$")) {
            throw new InvalidProductIDException("Invalid Product ID format: " + productID);
        }
    }

    public static void main(String[] args) {
        try {
            validateProductID("xyz-123"); // This will throw an exception
        } catch (InvalidProductIDException e) {
            System.out.println("Caught exception: " + e.getMessage());
        }
     //   validateProductID("JITU0909");
        try {
            validateProductID("ABC-1234");
            System.out.println("***********************************");
        }
        catch (InvalidProductIDException e){
            System.out.println(e.getMessage());
        }
    }
}
