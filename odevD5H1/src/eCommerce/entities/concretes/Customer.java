package eCommerce.entities.concretes;


import eCommerce.entities.abstracts.Entity;

import java.util.Scanner;
import java.util.regex.Pattern;

public class Customer implements Entity {

    Scanner input = new Scanner(System.in);
    private int id;
    private String name;
    private String lastName;
    private String eMail;
    private String key;


    public Customer() {
    }


    public Customer(int id, String name, String lastName, String eMail, String key) {
        super();
        this.setId(id);
        this.setName(name);
        this.setLastName(lastName);
        this.seteMail(lastName);
        this.setKey(key);
    }


    public int getId() {
        return id;
    }


    public void setId(int id) {
        this.id = id;
    }


    public String getName() {
        return name;
    }

    public void setName(String name) {
        while ((name == null || name.length() < 3)) {
            System.out.println("Eksik veya hatalı giriş!!!");
            System.out.print("adınızı giriniz: ");
            name = input.nextLine();
        }

        this.name = name;
    }


    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        while ((lastName == null || lastName.length() < 3)) {
            System.out.println("Eksik veya hatalı giriş!!!");
            System.out.print("soyadınızı giriniz: ");
            lastName = input.nextLine();
        }
        this.lastName = lastName;
    }


    public String geteMail() {
        return eMail;
    }

    public void seteMail(String eMail) {
        String emailRegex = "^[a-zA-Z0-9_+&*-]+(?:\\." +
                "[a-zA-Z0-9_+&*-]+)*@" +
                "(?:[a-zA-Z0-9-]+\\.)+[a-z" +
                "A-Z]{2,7}$";

        Pattern pat = Pattern.compile(emailRegex);

        while (pat.matcher(eMail).matches()) {

            System.out.println("Eksik veya hatalı giriş!!!");
            System.out.print("e mail giriniz: ");
            eMail = input.nextLine();
        }
        this.eMail = eMail;
    }


    public String getKey() {
        return key;
    }

    public void setKey(String key) {
        while (key == null || key.length() < 6) {
            System.out.println("Eksik veya hatalı giriş!!!");
            System.out.print("şifreniz en az 6 karakterli olmalı: ");
            key = input.nextLine();
        }
        this.key = key;
    }


}
