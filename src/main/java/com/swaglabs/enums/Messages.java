package com.swaglabs.enums;

public enum Messages {
    PRODUCT_PAGE_TITLE("Products"),
    LOGIN_ERROR_MESSAGE("Epic sadface: Sorry, this user has been locked out.");

    private final String path;

    Messages(String path) {
        this.path = path;
    }

    public String getPath() {
        return path;
    }
}
