package org.example.attestation.utils;

public class StringUtils {
    private StringUtils() {
        // Закрытый конструктор для предотвращения создания экземпляра
    }

    public static boolean isNullOrEmpty(String str) {
        return str == null || str.trim().isEmpty();
    }
}
