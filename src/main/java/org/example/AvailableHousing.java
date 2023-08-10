package org.example;

public class AvailableHousing {
    private boolean isTenant;
    private boolean appOpened;
    private boolean mapDisplayed;
    private boolean pinsProvideInformation;

    public boolean isTenant() {
        return isTenant;
    }

    public void setTenant(boolean tenant) {
        isTenant = tenant;
    }

    public boolean isAppOpened() {
        return appOpened;
    }

    public void setAppOpened(boolean appOpened) {
        this.appOpened = appOpened;
    }

    public boolean isMapDisplayed() {
        return mapDisplayed;
    }

    public void setMapDisplayed(boolean mapDisplayed) {
        this.mapDisplayed = mapDisplayed;
    }

    public boolean isPinsProvideInformation() {
        return pinsProvideInformation;
    }

    public void setPinsProvideInformation(boolean pinsProvideInformation) {
        this.pinsProvideInformation = pinsProvideInformation;
    }

    public static class HousingDetailsContext {
    }
}
