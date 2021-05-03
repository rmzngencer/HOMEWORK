import Abstract.BaseCustomerManager;
import Concrete.NeroCostumerManager;
import Entities.Customer;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.zip.DataFormatException;

//Interface ve Abstract demo.
// Senaryo: kayve dükkanları için müşteri yönetimi.
/*Starbucks ve nero firmaları için
iki firma verileri veri tabanına kaydetmek istiyor
sturbucks müşteri kaydederken, mutlaka mersis doğrulaması istiyor
nero istemiyor
sturbucks müşteriler için her kahve alımınsa yılsız kazandırmak istiyor

 */
public class Main {

    public static void main(String[] args) throws Exception {
        BaseCustomerManager customerManager = new NeroCostumerManager();
        customerManager.save(new Customer(1,"Engin","Emirog",new SimpleDateFormat("1986,1,1"),"1111111"));
    }
}
