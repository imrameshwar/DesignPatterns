package org.example.pattern.singleton;

// Eager initialization of a database connection
public class EagerInitDbConnection {
    private static final EagerInitDbConnection instance = new EagerInitDbConnection();

    private EagerInitDbConnection() {

    }

    public static EagerInitDbConnection getInstance() {
        return instance;
    }

}
