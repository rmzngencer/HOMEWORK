package eCommerce.business.concretes;

import eCommerce.business.abstracts.logInService;
import eCommerce.dataAccess.abstracts.ProductDao;

public class LogInkManager implements logInService {
    private String email;
    private String password;
    private ProductDao productDao;

    public LogInkManager(ProductDao productDao) {
        this.productDao = productDao;

    }


    public void login(String email, String password) {
        productDao.logIn(email, password);


    }


}
