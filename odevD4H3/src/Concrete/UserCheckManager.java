package Concrete;

import Abstract.UserCheckService;
import Entities.User;

public class UserCheckManager implements UserCheckService {

    @Override
    public boolean checkUser(User user) {
        return true;
    }
}
