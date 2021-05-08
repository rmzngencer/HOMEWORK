package eCommerce.core;

import eCommerce.entities.concretes.Customer;

public class LogEmail {

    public void sendMail(Customer customer) {
        System.out.println("Doğrulama maili yollandı:	" + customer.getName());

    }

    public boolean isClickMail(Customer customer) {
        System.out.println("Doğrulama maili onaylandı.");
        return true;

    }
}
