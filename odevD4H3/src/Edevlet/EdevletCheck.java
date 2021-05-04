package Edevlet;
import Abstract.UserCheckService;

import Entities.User;

public class EdevletCheck implements UserCheckService {
    @Override
    public boolean checkUser(User user) {
        System.out.println("Edevlet sisteminden onaylandı");
        return true;
    }

}
