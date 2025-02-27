package com.ecommerce.amazon.model;


import com.ecommerce.amazon.model.embeddable.Brand;
import com.ecommerce.amazon.model.embeddable.Feature;
import com.ecommerce.amazon.model.embeddable.Offer;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import java.util.Date;
import java.util.List;

@Document
public class Product{
     @Id
    private String productId;
    private String productName;
    private double productPrice;
    private int productQuantity;
    private String productType;

    private List<String>size;// S M XL XXL

    private List<Feature>featureList;
    private List<Offer>offerList;
    private List<Brand>brands;

    //auditor ,created by ,updated by
    private Date createdDate;
    private Date updatedDate;

    public Product() {
    }

    public Product(String productId, String productName, double productPrice, int productQuantity) {
        this.productId = productId;
        this.productName = productName;
        this.productPrice = productPrice;
        this.productQuantity = productQuantity;
    }

    public String getProductId() {
        return productId;
    }

    public void setProductId(String productId) {
        this.productId = productId;
    }

    public String getProductName() {
        return productName;
    }

    public void setProductName(String productName) {
        this.productName = productName;
    }

    public double getProductPrice() {
        return productPrice;
    }

    public void setProductPrice(double productPrice) {
        this.productPrice = productPrice;
    }

    public int getProductQuantity() {
        return productQuantity;
    }

    public void setProductQuantity(int productQuantity) {
        this.productQuantity = productQuantity;
    }
}
