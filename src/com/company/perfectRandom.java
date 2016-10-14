package com.company;
import java.util.*;
/**
 * Created by dpennebacker on 10/14/16.
 */
public class perfectRandom {

    public String perfectName;
    public int perfectSqRandom;

    public perfectRandom(String name) {
        perfectName = name;
        ranNum();
    }

    public void ranNum() {
        Random rand = new Random();
        int max = (int) Math.sqrt(Integer.MAX_VALUE);
        int min = 0;
        int randomNum = rand.nextInt((max - min));
        perfectSqRandom = Math.abs(randomNum * randomNum);
    }
}