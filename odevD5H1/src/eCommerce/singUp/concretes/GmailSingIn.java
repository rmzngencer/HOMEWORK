package eCommerce.singUp.concretes;

import eCommerce.entities.concretes.Customer;
import eCommerce.singUp.abstracts.SingInService;

public class GmailSingIn implements SingInService {

    @Override
    public void add(Customer customer) {
        System.out.println("gmail ile kaydoldu yaptý");

    }


}
