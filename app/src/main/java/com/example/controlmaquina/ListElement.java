package com.example.controlmaquina;

public class ListElement {
    public String medicina;
    public String stock;
    public String key1;
    public String key2;

    public ListElement(String medicina, String stock, String key1, String key2) {
        this.medicina = medicina;
        this.stock = stock;
        this.key1 = key1;
        this.key2 = key2;
    }

    public ListElement(String medicina, String stock) {
        this.medicina = medicina;
        this.stock = stock;
    }

    public String getMedicina() {
        return medicina;
    }

    public void setMedicina(String medicina) {
        this.medicina = medicina;
    }

    public String getStock() {
        return stock;
    }

    public void setStock(String stock) {
        this.stock = stock;
    }

    public String getKey1() {
        return key1;
    }

    public void setKey1(String key1) {
        this.key1 = key1;
    }

    public String getKey2() {
        return key2;
    }

    public void setKey2(String key2) {
        this.key2 = key2;
    }
}
