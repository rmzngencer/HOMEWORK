package eCommerce.dataAccess.abstracts;

import eCommerce.entities.concretes.Customer;

import java.util.List;

public interface ProductDao {
    void add(Customer customer);

    void update(Customer customer);

    void delete(Customer customer);

    void logIn(String email, String password);

    Customer get(int eMail);

    List<Customer> getAll();

}
