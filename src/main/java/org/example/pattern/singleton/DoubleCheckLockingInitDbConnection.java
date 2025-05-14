package org.example.pattern.singleton;

// Synchronised initialization of a database connection
// This approach is thread-safe and efficient
// volatile keyword ensures that the instance variable is read from main memory
// and not from the thread's local cache, preventing stale data issues
// Double-checked locking is used to reduce the overhead of acquiring a lock
// by first checking the instance variable without synchronization
// and only synchronizing if the instance is null
// This approach is thread-safe and efficient
// but can be complex and difficult to understand
// It is important to note that this approach is not recommended in Java versions prior to 1.5
// due to issues with the Java Memory Model
// In Java 1.5 and later, the volatile keyword ensures that the instance variable is read from main memory
// and not from the thread's local cache, preventing stale data issues

public class DoubleCheckLockingInitDbConnection {
    private static volatile DoubleCheckLockingInitDbConnection instance;

    private DoubleCheckLockingInitDbConnection() {

    }

    public static DoubleCheckLockingInitDbConnection getInstance() {
        if (instance == null) {
            synchronized (DoubleCheckLockingInitDbConnection.class) {
                if (instance == null) {
                    instance = new DoubleCheckLockingInitDbConnection();
                }
            }
        }
        return instance;
    }

}
