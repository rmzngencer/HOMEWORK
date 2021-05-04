import Concrete.*;
import Edevlet.EdevletCheck;
import Entities.Camping;
import Entities.Product;
import Entities.User;

import javax.swing.text.html.parser.Entity;

public class Main {

    public static void main(String[] args) {
	// TEST
        User user1 = new User("12345678910","Ramazan","Gencer",1985);
        User user2 = new User("44464546544","Ahmet","yılmaz",1885);
        User user3 = new User("56064684321","mehmet","çakmak",1965);


        Product product1 = new Product(123,"İskender Kebap","ürün açıklaması");
        Product product2 = new Product(123,"İmam Bayıldı","ürün açıklaması");
        Product product3 = new Product(123,"Sac Tava","ürün açıklaması");
        Product product4 = new Product(123," Yahni","ürün açıklaması");
        Camping camping1 = new Camping(product1,12,"Büyük İskender");
        Camping camping2 = new Camping(product2,12,"İmam Öldü");
        Camping camping3 = new Camping(product3,12,"papaz yahnisi");



        UserManager userManager = new UserManager(new EdevletCheck());
        userManager.add(user1);
        userManager.delete(user2);
        userManager.update(user3);
        System.out.println( '\n' +"******************************************************************************"+ '\n' );
        ProductManager productManager = new ProductManager();
        productManager.add(product1);
        productManager.delete(product2);
        productManager.update(product3);
        System.out.println( '\n' +"******************************************************************************"+ '\n' );
        CampingManager campingManager = new CampingManager();
        campingManager.add(product1,camping1);
        campingManager.delete(product2,camping2);
        campingManager.update(product3,camping3);
        System.out.println('\n' +"******************************************************************************"+ '\n' );
        SaleManager saleManager = new SaleManager();
        saleManager.sale(user1, product1);
    }
}
