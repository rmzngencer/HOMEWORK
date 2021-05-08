package eCommerce.business.concretes;


import eCommerce.business.abstracts.CustomerService;
import eCommerce.dataAccess.abstracts.ProductDao;
import eCommerce.entities.concretes.Customer;
import eCommerce.singUp.abstracts.SingInService;

public class CustomerManager implements CustomerService {
    private SingInService singInService;
    private ProductDao productDao;

    public CustomerManager(ProductDao productDao, SingInService singInService) {
        this.productDao = productDao;
        this.singInService = singInService;
    }


    @Override
    public void delete(Customer customer) {

        productDao.add(customer);
    }

    @Override
    public void update(Customer customer) {


    }

    @Override
    public void singIn(Customer customer) {


    }

    @Override
    public void add(Customer customer) {
        productDao.add(customer);
        singInService.add(customer);

    }


}
