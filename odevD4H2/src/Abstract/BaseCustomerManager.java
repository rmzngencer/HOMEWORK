package Abstract;

import Entities.Customer;

public abstract class BaseCustomerManager implements ICustomerService {
    @Override
    public void save(Customer costumer) {
        System.out.println("Save to db: "+costumer.firstName);
    }
}
