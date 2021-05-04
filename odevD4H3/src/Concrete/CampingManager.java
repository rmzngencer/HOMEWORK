package Concrete;

import Abstract.CampingService;
import Entities.Camping;
import Entities.Product;

public class CampingManager implements CampingService {
    @Override
    public void add(Product product, Camping camping) {
        System.out.println(product.getProductName()+ " Lezzeti "+ camping.getCampingName() + " kampanya adı ile kampanya ürüne eklendi :D");
    }

    @Override
    public void delete(Product product, Camping camping) {
        System.out.println(camping.getCampingName()+ " kampanya'dan kaldırılarak "+product.getProductName()+ " adında normal ürün oldu :(");
    }

    @Override
    public void update(Product product, Camping camping) {
        System.out.println(camping.getCampingName()+ " kampanya ürünü güncelelndi ");
    }
}
