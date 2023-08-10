package org.example;

public class BookAccommodationContext {
    private boolean isTenant;
    private boolean housingUnitSelected;
    private boolean choseToBook;
    private boolean receivedConfirmation;
    private boolean bookingReflectedInProfile;

    public boolean isTenant() {
        return isTenant;
    }

    public void setTenant(boolean tenant) {
        isTenant = tenant;
    }

    public boolean isHousingUnitSelected() {
        return housingUnitSelected;
    }

    public void setHousingUnitSelected(boolean housingUnitSelected) {
        this.housingUnitSelected = housingUnitSelected;
    }

    public boolean choseToBook() {
        return choseToBook;
    }

    public void setChoseToBook(boolean choseToBook) {
        this.choseToBook = choseToBook;
    }

    public boolean receivedConfirmation() {
        return receivedConfirmation;
    }

    public void setReceivedConfirmation(boolean receivedConfirmation) {
        this.receivedConfirmation = receivedConfirmation;
    }

    public boolean isBookingReflectedInProfile() {
        return bookingReflectedInProfile;
    }

    public void setBookingReflectedInProfile(boolean bookingReflectedInProfile) {
        this.bookingReflectedInProfile = bookingReflectedInProfile;
    }
}
