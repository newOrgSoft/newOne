package org.example;

public class SellUsedFurnitureContext {
    private boolean isTenant;
    private boolean navigatedToFurnitureMarketplace;
    private boolean listedFurnitureForSale;
    private boolean furnitureVisibleToBuyers;

    public boolean isTenant() {
        return isTenant;
    }

    public void setTenant(boolean tenant) {
        isTenant = tenant;
    }

    public boolean hasNavigatedToFurnitureMarketplace() {
        return navigatedToFurnitureMarketplace;
    }

    public void setNavigatedToFurnitureMarketplace(boolean navigatedToFurnitureMarketplace) {
        this.navigatedToFurnitureMarketplace = navigatedToFurnitureMarketplace;
    }

    public boolean hasListedFurnitureForSale() {
        return listedFurnitureForSale;
    }

    public void setListedFurnitureForSale(boolean listedFurnitureForSale) {
        this.listedFurnitureForSale = listedFurnitureForSale;
    }

    public boolean isFurnitureVisibleToBuyers() {
        return furnitureVisibleToBuyers;
    }

    public void setFurnitureVisibleToBuyers(boolean furnitureVisibleToBuyers) {
        this.furnitureVisibleToBuyers = furnitureVisibleToBuyers;
    }
}
