package Abstract;

import Entities.Camping;
import Entities.Product;
import Entities.User;

public interface CampingService {
    void add(Product product,Camping camping);
    void delete(Product product,Camping camping);
    void update(Product product,Camping camping);
}
