package org.tusjava.utilities;

public enum BookStatus {
    AVAILABLE("Available"),
    CHECKED_OUT("Checked Out"),
    UNDER_REPAIR("Under Repair"),
    RESERVED("Reserved");

    private final String displayStatus;

    // Constructor for the enum
    BookStatus(String displayStatus) {
        this.displayStatus = displayStatus;
    }

    // Getter for the display status
    public String getDisplayStatus() {
        return this.displayStatus;
    }

    @Override
    public String toString() {
        return this.displayStatus;
    }
}
