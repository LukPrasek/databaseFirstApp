package pl.lukaszprasek.databaseFirstApp.models;

import javax.persistence.*;

@Entity
@Table(name="barcode")//to jest nasza tabela, ktora bedzie reprezentowana za pomoca tego obiektu, encji
public class BarcodeEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)//samo sie uzupełnia
    private int id;
    @Column(name="product_name")
    private String productName;
    @Column(name="company_name")
    private String productCompany;
    private String barcode;
    private int weight;


    public String getBarcode() {
        return barcode;
    }

    public void setBarcode(String barcode) {
        this.barcode = barcode;
    }



    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getProductName() {
        return productName;
    }

    public void setProductName(String productName) {
        this.productName = productName;
    }

    public String getProductCompany() {
        return productCompany;
    }

    public void setProductCompany(String productCompany) {
        this.productCompany = productCompany;
    }

    public int getWeight() {
        return weight;
    }

    public void setWeight(int weight) {
        this.weight = weight;
    }
}
