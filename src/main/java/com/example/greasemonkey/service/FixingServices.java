package com.example.greasemonkey.service;

public class FixingServices {

    private static final int SECOND_OFFSET = 1000;

    public void oilChange() {
        try {
            Thread.sleep(20 * SECOND_OFFSET);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

    public String tyrechange(boolean isSummer) {
        try {
            Thread.sleep(60 * SECOND_OFFSET);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        if (isSummer) {
            return "4 winter tyres";
        }
        return "4 summer tyres";
    }

    public void general() {
        try {
            Thread.sleep(200 * SECOND_OFFSET);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

    public String totalDamage() {
        int count = 0;
        while (count < 1) {}
        return "couldn't fix it Jim :(";
    }
}
