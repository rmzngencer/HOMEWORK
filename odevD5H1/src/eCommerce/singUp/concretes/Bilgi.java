package eCommerce.singUp.concretes;

import eCommerce.entities.concretes.Customer;
import eCommerce.singUp.abstracts.SingInService;

public class Bilgi implements SingInService {
    public void add(Customer customer) {
        System.out.println("bilgiler ile ile kayıt yapıldı");

    }
}
