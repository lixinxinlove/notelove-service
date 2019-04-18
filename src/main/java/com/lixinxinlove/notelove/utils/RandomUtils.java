package com.lixinxinlove.notelove.utils;

import java.util.UUID;

public class RandomUtils {
    public static String getToken() {
        String token = UUID.randomUUID().toString();
        return token;
    }

}
