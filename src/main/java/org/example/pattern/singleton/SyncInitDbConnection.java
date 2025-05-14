package org.example.pattern.singleton;

// Synchronised initialization of a database connection
// This approach is thread-safe but can be less efficient due to synchronization overhead
public class SyncInitDbConnection {
    private static SyncInitDbConnection instance;

    private SyncInitDbConnection() {

    }

    synchronized public static SyncInitDbConnection getInstance() {
        if (instance == null) {;
            instance = new SyncInitDbConnection();
        }
        return instance;
    }

}
