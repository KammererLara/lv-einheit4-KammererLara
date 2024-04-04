package org.lecture;

import java.util.HashMap;
import java.util.Map;

public class ConfigurationManager {
    private static ConfigurationManager instance;
    private Map<String, String> configuration;

    private ConfigurationManager() {
        configuration = new HashMap<>();
        configuration.put("username", "admin");
        configuration.put("password", "password123");
        configuration.put("server", "localhost");
    }

    public static synchronized ConfigurationManager getInstance() {
        if (instance == null)
            instance = new ConfigurationManager();
        return instance;
    }

    public String getConfiguration(String key) {
        return configuration.get(key);
    }

    public void setConfiguration(String key, String value) {
        configuration.put(key, value);
    }
}
