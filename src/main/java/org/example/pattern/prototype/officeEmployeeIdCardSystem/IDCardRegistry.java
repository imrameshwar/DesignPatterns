package org.example.pattern.prototype.officeEmployeeIdCardSystem;

import java.util.HashMap;
import java.util.Map;

public class IDCardRegistry {
    private Map<String, EmployeeIDCard> prototypes = new HashMap<>();

    public void registerPrototype(String key, EmployeeIDCard prototype) {
        prototypes.put(key, prototype);
    }

    public EmployeeIDCard getCloneCard(String key) {
        return prototypes.get(key).clone();
    }
}

