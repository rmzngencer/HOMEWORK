package eCommerce;

import eCommerce.business.concretes.CustomerManager;
import eCommerce.business.concretes.LogInkManager;
import eCommerce.core.LogEmail;
import eCommerce.dataAccess.concretes.DataProductDao;
import eCommerce.entities.concretes.Customer;
import eCommerce.singUp.concretes.GmailSingIn;

public class Main {

    public static void main(String[] args) {
        Customer customer1 = new Customer(1, "sasdaet", "Ayd", "gncrgs@mail.com", "355527");
        Customer customer2 = new Customer(1, "sasdaet", "Ayd", "gncrgs@mail.com", "355527");

        CustomerManager customerManager = new CustomerManager(new DataProductDao(new LogEmail()), new GmailSingIn());
        customerManager.add(customer1);
        customerManager.add(customer2);

        LogInkManager inkManager = new LogInkManager(new DataProductDao(null));
        inkManager.login("gncrgs@gmail.com", "355527");
    }

}
