package org.lecture;

import java.util.HashMap;
import java.util.Map;

public class ConfigurastionManager {
    private static ConfigurastionManager instance;
    private Map<String, String> configuration;

    private ConfigurastionManager() {
        configuration = new HashMap<>();
        configuration.put("username", "admin");
        configuration.put("password", "password123");
        configuration.put("server", "localhost");
    }

    public static synchronized ConfigurastionManager getInstance() {
        if (instance == null)
            instance = new ConfigurastionManager();
        return instance;
    }

    public String getConfiguration(String key) {
        return configuration.get(key);
    }

    public void setConfiguration(String key, String value) {
        configuration.put(key, value);
    }
}
