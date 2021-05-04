package Abstract;

import Entities.Camping;
import Entities.Product;

public interface ProductService {
    void add(Product product);
    void delete(Product product);
    void update(Product product);
}