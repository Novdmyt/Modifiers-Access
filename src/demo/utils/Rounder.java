package demo.utils;

import java.text.DecimalFormat;

// Модифікатор доступу public.
public class Rounder {
    // Модифікатор доступу public.
    public static String roundValue(double value) {
        return new DecimalFormat("#.00").format(value);
    }
}