package Concrete;

import Abstract.ProductService;
import Entities.Product;

public class ProductManager implements ProductService {
    @Override
    public void add(Product product) {
    System.out.println(product.getProductName()+" listeye eklendi :) ");
    }

    @Override
    public void delete(Product product) {
        System.out.println(product.getProductName()+" ürünü listesinden silindi :( ");
    }

    @Override
    public void update(Product product) {
        System.out.println(product.getProductName()+" yenilendi :) ");
    }
}
