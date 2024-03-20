package com.swaglabs.enums;

public enum PageConfiguration {
    LOGIN_PAGE("https://www.saucedemo.com/v1/index.html");

    private final String path;

    PageConfiguration(String path) {
        this.path = path;
    }

    public String getPath() {
        return path;
    }
}
