package eCommerce;

import eCommerce.business.concretes.CustomerManager;
import eCommerce.business.concretes.LogInkManager;
import eCommerce.core.LogEmail;
import eCommerce.dataAccess.concretes.DataProductDao;
import eCommerce.entities.concretes.Customer;
import eCommerce.singUp.concretes.Bilgi;
import eCommerce.singUp.concretes.GmailSingIn;

public class Main {

    public static void main(String[] args) {
        Customer customer1 = new Customer(1, "Ramazan", "gencer", "gncrgs@mail.com", "355527");
        Customer customer2 = new Customer(1, "Buse", "kimola", "buse@mail.com", "355527");

        System.out.println("****************bilgilr ile kayıt************************");
        CustomerManager customerManager = new CustomerManager(new DataProductDao(new LogEmail()), new Bilgi());
        customerManager.add(customer1);

        System.out.println("**************gmail ile kayıt**************************");
        CustomerManager customerManager2 = new CustomerManager(new DataProductDao(new LogEmail()), new GmailSingIn());
        customerManager2.add(customer2);

        System.out.println("**************sisteme giriş**************************");
        LogInkManager inkManager = new LogInkManager(new DataProductDao(null));
        inkManager.login("gncrgs@gmail.com", "355527");
    }

}
