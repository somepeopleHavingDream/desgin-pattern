package org.yangxin.desginpattern.pattern.creational.singleton;

import org.springframework.util.StringUtils;

import java.util.HashMap;
import java.util.Map;

/**
 * @author yangxin
 * 2020/03/16 20:14
 */
public class ContainerSingleton {

    private static final Map<String, Object> SINGLETON_MAP = new HashMap<>();

    public static void putInstance(String key, Object instance) {
        if (!StringUtils.isEmpty(key) && instance != null) {
            if (!SINGLETON_MAP.containsKey(key)) {
                SINGLETON_MAP.put(key, instance);
            }
        }
    }

    public static Object getInstance(String key) {
        return SINGLETON_MAP.get(key);
    }
}
