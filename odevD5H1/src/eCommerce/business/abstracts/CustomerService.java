package eCommerce.business.abstracts;

import eCommerce.entities.concretes.Customer;

public interface CustomerService {

    void add(Customer customer);

    void delete(Customer customer);

    void update(Customer customer);

    void singIn(Customer customer);


}
