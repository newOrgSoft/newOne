package org.example;

public class StudentHousingInsightsContext {
    private boolean isTenant;
    private boolean housingUnitViewed;
    private boolean studentCommunityInsightsDisplayed;

    public boolean isTenant() {
        return isTenant;
    }

    public void setTenant(boolean tenant) {
        isTenant = tenant;
    }

    public boolean isHousingUnitViewed() {
        return housingUnitViewed;
    }

    public void setHousingUnitViewed(boolean housingUnitViewed) {
        this.housingUnitViewed = housingUnitViewed;
    }

    public boolean isStudentCommunityInsightsDisplayed() {
        return studentCommunityInsightsDisplayed;
    }

    public void setStudentCommunityInsightsDisplayed(boolean studentCommunityInsightsDisplayed) {
        this.studentCommunityInsightsDisplayed = studentCommunityInsightsDisplayed;
    }
}
