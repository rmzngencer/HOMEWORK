package Concrete;

import Abstract.BaseCustomerManager;
import Abstract.ICustomerCheckService;
import Entities.Customer;

public class StarbucksCustomerManager extends BaseCustomerManager {

    private ICustomerCheckService customerCheckService;

    public StarbucksCustomerManager(ICustomerCheckService customerCheckService){

    }
    @Override
    public void save(Customer costumer) {
       if(customerCheckService.checkIfRealPerson(costumer)){
           super.save(costumer);
       }else{
           System.out.println("Not a valid person");
       }

    }


}
