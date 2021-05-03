package Entities;


import Abstract.ICustomerService;

import java.text.SimpleDateFormat;
import java.time.format.DateTimeFormatter;
import java.util.Date;

public class Customer implements ICustomerService {

    public int ıd;
    public String firstName;
    public String lastName;
    public SimpleDateFormat dateOfBirth;
    public String nationlaityId;

    public Customer(int ıd, String firstName, String lastName, SimpleDateFormat dateOfBirth, String nationlaityId) {
        this.ıd = ıd;
        this.firstName = firstName;
        this.lastName = lastName;
        this.dateOfBirth = dateOfBirth;
        this.nationlaityId = nationlaityId;
    }

    @Override
    public void save(Customer costumer) {

    }
}
