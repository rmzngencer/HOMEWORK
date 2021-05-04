package Entities;

public class Product {
    private int productId;
    private String productName;
    private String productInfo;

    public Product(int productId, String productName, String productInfo) {
        this.productId = productId;
        this.productName = productName;
        this.productInfo = productInfo;
    }




    public int getProductId() {
        return productId;
    }

    public void setProductId(int productId) {
        this.productId = productId;
    }

    public String getProductName() {
        return productName;
    }

    public void setProductName(String productName) {
        this.productName = productName;
    }

    public String getProductInfo() {
        return productInfo;
    }

    public void setProductInfo(String productInfo) {
        this.productInfo = productInfo;
    }

    @Override
    public String toString() {
        return
                "   ÜRÜN BİLGİLERİ  " +'\n' +
                "ürün kodu= " + productId +'\n' +
                "ürün adı= " + productName + '\n' +
                "ürün açıklaması= " + productInfo + '\n';
    }
}
