package org.example.pattern.singleton;

// Bill Pugh initialization of a database connection
// This approach uses a static inner class to hold the singleton instance
// and is thread-safe without requiring synchronization
// The instance is created only when the getInstance() method is called
// This approach is efficient and easy to understand
// It is a good choice for most use cases
// It is important to note that this approach is not recommended in Java versions prior to 1.5
// due to issues with the Java Memory Model
// In Java 1.5 and later, the static inner class is loaded only when it is referenced
// and not when the outer class is loaded, preventing unnecessary memory usage


public class BillPughInitDbConnection {

    private BillPughInitDbConnection() {

    }
    private static class SingletonHelper {
        private static final BillPughInitDbConnection INSTANCE = new BillPughInitDbConnection();
    }

    public static BillPughInitDbConnection getInstance() {
        return SingletonHelper.INSTANCE;
    }

}
