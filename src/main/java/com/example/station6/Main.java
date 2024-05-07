package com.example.station6;

public class Main {
    public static void main(String[] args) {
        // ここから
        int [] users = new int[5];
        users[0] = 30;
        users[1] = 36;
        users[2] = 31;
        users[3] = 48;
        users[4] = 51;

        int all = 0;
        for (int i = 0; i < users.length; i++) {
            all += users[i];
        }
        System.out.println(all / 5.0);
        // ここまで
    }
}
