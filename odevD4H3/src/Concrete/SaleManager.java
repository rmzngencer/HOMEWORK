package Concrete;

import Abstract.CampingService;
import Entities.Product;
import Entities.User;

public class SaleManager {
    public void sale(User user, Product product){
    System.out.println(user.getUserName()+" adlı kullanıcı "+product.getProductName()+ " ismindeki urünü satın aldı :D ");
    }

}

