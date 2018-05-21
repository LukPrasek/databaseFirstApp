package pl.lukaszprasek.databaseFirstApp.models;

import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

public class BarcodeForm {
//    @NotEmpty
//    @Size(max = 25)
    private String productName;
//    @NotEmpty
//    @Size(max = 25)
    private String productCompany;
//    @NotEmpty
//    @Size(max = 12)
    private String barcode;
    @NotNull
    private int weight;

    public String getProductName() {
        return productName;
    }

    public String getProductCompany() {
        return productCompany;
    }

    public String getBarcode() {
        return barcode;
    }

    public int getWeight() {
        return weight;
    }
}
