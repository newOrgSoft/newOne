package org.example;
import org.example.AvailableHousing;
//import org.example.accepttese.ViewHousingDetailsContext;
public class HousingDetailsContext {
    private boolean isTenant;
    private boolean housingUnitSelected;
    private boolean imageGalleryDisplayed;
    private boolean detailedDescriptionsVisible;

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

    public boolean isImageGalleryDisplayed() {
        return imageGalleryDisplayed;
    }

    public void setImageGalleryDisplayed(boolean imageGalleryDisplayed) {
        this.imageGalleryDisplayed = imageGalleryDisplayed;
    }

    public boolean isDetailedDescriptionsVisible() {
        return detailedDescriptionsVisible;
    }

    public void setDetailedDescriptionsVisible(boolean detailedDescriptionsVisible) {
        this.detailedDescriptionsVisible = detailedDescriptionsVisible;
    }
}
