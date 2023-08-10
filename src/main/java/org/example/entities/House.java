package org.example.entities;

import java.util.List;

public class House {

    private Integer houseID;

    public Integer getHouseID() {
        return houseID;
    }

    public void setHouseID(Integer houseID) {
        this.houseID = houseID;
    }

    private Integer price;
    private List<String> services;
    private List<String> photos;


    public House(Integer houseID, Integer price, List<String> services, List<String> photos) {
        this.price = price;
        this.houseID = houseID;
        this.services = services;
        this.photos = photos;
    }

    public Integer getPrice() {
        return price;
    }

    public void setPrice(Integer price) {
        this.price = price;
    }

    public List<String> getServices() {
        return services;
    }

    public void setServices(List<String> services) {
        this.services = services;
    }

    public List<String> getPhotos() {
        return photos;
    }

    public void setPhotos(List<String> photos) {
        this.photos = photos;
    }
}
