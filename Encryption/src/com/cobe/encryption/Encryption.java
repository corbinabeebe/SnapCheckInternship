package com.cobe.encryption;

public class Encryption {
    //method to convert array to string
    private static String arrayToString(char[][] word) {
        StringBuilder result = new StringBuilder();//used to store result to be returned

        //loop through array and add build new string
        for(int i = 0; i < word[0].length; i++) {
            StringBuilder res = new StringBuilder();
            for(int j = 0; j < word.length; j++) {
                res.append(word[j][i]);
            }
            //checks if loop is on last iteration. if it is, don't add a space to end of result
            if(i == word[0].length - 1) {
                result.append(res);
            } else {
                result.append(res).append(" ");
            }
        }

        return result.toString();
    }

    //method to convert string to array
    private static char[][] stringToArray(String s, int rows, int cols) {
        char[][] word = new char[rows][cols];
        //used to keep track of place in string
        int k = 0;
        //enter string into 2d array
        for(int i = 0; i < rows; i++) {
            for(int j = 0; j < cols; j++) {
                if(k < s.length()) {
                    word[i][j] = s.charAt(k);
                }
                k++;
            }
        }

        return word;
    }

    /**
     *  Method takes a string, encrypts string with specified encryption instructions
     *  returns encrypted string
     * */
    public String encrypt(String s) {

        //removes whitespace from string
        s = s.replaceAll("\\s", "");

        int length = s.length();

        //gets number of rows and columns
        int rows = (int) Math.floor(Math.sqrt(length));
        int cols = (int) Math.ceil(Math.sqrt(length));

        //ensures enough space in 2d array
        if(rows * cols < length) {
            rows += 1;
        }

        //calls stringToArray and sets to char
        char[][] word = stringToArray(s, rows, cols);


        return arrayToString(word);
    }
}

