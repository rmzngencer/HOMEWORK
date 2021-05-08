package eCommerce.dataAccess.concretes;

import eCommerce.core.LogEmail;
import eCommerce.dataAccess.abstracts.ProductDao;
import eCommerce.entities.concretes.Customer;

import java.util.ArrayList;
import java.util.List;

public class DataProductDao implements ProductDao {

    LogEmail logEmail;

    List<Customer> customers = new ArrayList<>();

    public DataProductDao(LogEmail logEmail) {
        this.logEmail = logEmail;

    }

    public boolean emailCheck(Customer customer) {

        for (Customer c : customers
        )
            if (c.geteMail() == customer.geteMail()) {
                return false;
            }
        return true;
    }

    @Override
    public void add(Customer customer) {
        while (!emailCheck(customer)) {
            System.out.println("E mail mevcut!!!");
        }
        while (!logEmail.isClickMail(customer)) {
            System.out.println("E mail onaylanmadý");
        }

        System.out.println("sisteme eklendi " + customer.getName());

    }

    @Override
    public void update(Customer customer) {
        // TODO Auto-generated method stub

    }

    @Override
    public void delete(Customer customer) {
        // TODO Auto-generated method stub

    }

    @Override
    public Customer get(int eMail) {
        // TODO Auto-generated method stub
        return null;
    }

    @Override
    public List<Customer> getAll() {
        // TODO Auto-generated method stub
        return null;
    }


    public boolean loginByCheck(String email, String password) {
        for (Customer customer : customers) {
            if (customer.geteMail().equals(email) && customer.getKey().equals(password))
                return true;
        }
        return false;
    }

    @Override
    public void logIn(String email, String password) {
        if (loginByCheck(email, password) == true) {
            System.out.println("kullanýcý bilgileri doðru!!! sisteme giriþ yapýldý");

        } else {

            System.out.println("kullanýcý bilgileri hatalý!! sisteme giriþ yapýlmadý");
        }

    }

}
