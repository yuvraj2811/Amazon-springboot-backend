package com.ecommerce.amazon.model.embeddable;

public class Feature {

    private String material;
    private String color;

    public Feature() {
    }

    public Feature(String material, String color) {
        this.material = material;
        this.color = color;
    }

    public String getMaterial() {
        return material;
    }

    public void setMaterial(String material) {
        this.material = material;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }
}
