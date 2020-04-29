package com.cobe.encryption;

/**
 * Using class to instantiate an Encryption object and test that encrypt method is working
 * */

public class Main {

    public static void main(String[] args) {
        String s = "haveaniceday";

        String s1 = "if man was meant to stay on the ground god would have given us roots";

        String s2 = "feed the dog";

        String s3 = "chillout";

        Encryption encryption = new Encryption();

        System.out.println("Test 0: " + encryption.encrypt(s));

        System.out.println("Test 1: " + encryption.encrypt(s1));

        System.out.println("Test 2: " + encryption.encrypt(s3));

        System.out.println("Test 3: " + encryption.encrypt(s3));

    }
}
