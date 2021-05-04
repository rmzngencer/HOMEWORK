package Entities;

public class Camping extends Product {
    private int campingId;
    private String campingName;

    public Camping(Product product, int campingId,String campingName) {
        super(product.getProductId(), product.getProductName(), product.getProductInfo());
        this.campingId = campingId;
        this.campingName = campingName;

    }


    public int getCampingId() {
        return campingId;
    }

    public void setCampingId(int campingId) {
        this.campingId = campingId;
    }

    public String getCampingName() {
        return campingName;
    }

    public void setCampingName(String campingName) {
        this.campingName = campingName;
    }

    @Override
    public String toString() {
        return
                "   KAMPANYALI ÜRÜN BİLGİLERİ " + '\n' +
                "kampanya kodu= " + campingId +'\n' +
                "kampanya açıklaması= " + campingName + '\n' +
                        "ürün kodu= " + getProductId() +'\n' +
                        "ürün adı= " + getProductName() + '\n' +
                        "ürün açıklaması= " + getProductInfo() + '\n';

    }
}
