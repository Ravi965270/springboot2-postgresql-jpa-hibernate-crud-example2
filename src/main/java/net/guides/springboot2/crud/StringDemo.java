package net.guides.springboot2.crud;

public class StringDemo {

    public static void main(String[] args) {
        reverseString("jhgjg");
    }

    public static String reverseString(String str) {
        char ch[] = str.toCharArray();
        String rev = "";
        for (int i = ch.length - 1; i >= 0; i--) {
            rev += ch[i];
        }
        return rev;
    }
}