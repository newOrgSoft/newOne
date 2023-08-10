package org.example;

public class TenantControlPanelContext {
    private boolean isTenant;
    private boolean loggedIn;
    private boolean bookedAccommodation;
    private boolean accessedControlPanel;
    private boolean personalDataVisible;

    public boolean isTenant() {
        return isTenant;
    }

    public void setTenant(boolean tenant) {
        isTenant = tenant;
    }

    public boolean isLoggedIn() {
        return loggedIn;
    }

    public void setLoggedIn(boolean loggedIn) {
        this.loggedIn = loggedIn;
    }

    public boolean isBookedAccommodation() {
        return bookedAccommodation;
    }

    public void setBookedAccommodation(boolean bookedAccommodation) {
        this.bookedAccommodation = bookedAccommodation;
    }

    public boolean isAccessedControlPanel() {
        return accessedControlPanel;
    }

    public void setAccessedControlPanel(boolean accessedControlPanel) {
        this.accessedControlPanel = accessedControlPanel;
    }

    public boolean isPersonalDataVisible() {
        return personalDataVisible;
    }

    public void setPersonalDataVisible(boolean personalDataVisible) {
        this.personalDataVisible = personalDataVisible;
    }
}
