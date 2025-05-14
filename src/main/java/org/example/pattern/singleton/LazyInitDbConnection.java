package org.example.pattern.singleton;

// Lazy initialization of a database connection
// This approach is not thread-safe and can lead to issues in a multi-threaded environment
public class LazyInitDbConnection {
    private static LazyInitDbConnection instance;

    private LazyInitDbConnection() {

    }

    public static LazyInitDbConnection getInstance() {
        if (instance == null) {;
            instance = new LazyInitDbConnection();
        }
        return instance;
    }

}
