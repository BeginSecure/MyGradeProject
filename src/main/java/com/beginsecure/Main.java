package com.beginsecure;

import org.json.JSONObject;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {

        JSONObject jsonObject = new JSONObject("{\"color\": \"blue\"}");

        System.out.printf("The color is %s%n", jsonObject.getString("color"));
    }
}