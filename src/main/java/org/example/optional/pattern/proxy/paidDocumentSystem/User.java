package org.example.optional.pattern.proxy.paidDocumentSystem;

public class User {
    private String name;
    private boolean isPremium;

    public User(String name, boolean isPremium) {
        this.name = name;
        this.isPremium = isPremium;
    }

    public String getName() {
        return name;
    }

    public boolean isPremium() {
        return isPremium;
    }
}
