package com.swaglabs.enums;

public enum Messages {
    PRODUCT_PAGE_TITLE("Products");

    private final String path;

    Messages(String path) {
        this.path = path;
    }

    public String getPath() {
        return path;
    }
}
