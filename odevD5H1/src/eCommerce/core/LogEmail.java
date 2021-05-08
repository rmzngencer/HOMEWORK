package eCommerce.core;

import eCommerce.entities.concretes.Customer;

public class LogEmail {

    void sendMail(Customer customer) {
        System.out.println("Doðrulama için mail yollandý:	" + customer.getName());

    }

    public boolean isClickMail(Customer customer) {
        System.out.println("Doðrulama maili onaylandý.");
        return true;

    }
}
