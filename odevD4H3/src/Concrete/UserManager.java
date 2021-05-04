package Concrete;

import Abstract.UserCheckService;
import Abstract.UserService;
import Entities.User;

import java.util.Scanner;

public class UserManager implements UserService {

    private UserCheckService userCheckService;

    public UserManager(UserCheckService userCheckService) {
        this.userCheckService = userCheckService;
    }

    @Override
    public void add(User user) {
        if (userCheckService.checkUser(user)) {
            System.out.println(user.toString() + " yukarıda bilgileri olan kişi sisteme eklendi!!" + '\n');
        } else {
            System.out.println(user.getUserId() + " TC numaralı kullanıcı eklenemedi." + '\n');
        }

    }

    @Override
    public void delete(User user) {
        System.out.println(user.getUserId()+ " TC numaralı kullanıcı silindi." );
    }

    @Override
    public void update(User user) {
        System.out.println(user.getUserId()+ " TC numaralı kullanıcı güncellendi." );
    }
}
