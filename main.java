package com.company;

import java.util.Arrays;
import java.util.Scanner;

public class main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Napište libovolnou větu");
        String text = sc.nextLine();
        String[] array = text.split("\\. ");
        System.out.println("V textu se nachází vět: " + array.length);
        System.out.println("Vypsání vět a informací o větě: ");
        for (String txt :
                array) {
            System.out.println(txt);
            String x = txt;
            String[] sec = x.split(" ");
            System.out.println("Počet slov: " + sec.length);
            char[] arr = x.toCharArray();
            System.out.println("Počet znaků: " + arr.length);

            x = x.toLowerCase();
            int pocetsamohlasek = 0;
            int pocetsouhlasek = 0;
            String samohlasky = "aeiouyáéěíóúůý";
            String souhlasky = "bcčdďfghjklmnpqrřsštťvwxzž";

            for (char c : x.toCharArray()) {
                if (samohlasky.contains(String.valueOf(c))) {
                    pocetsamohlasek++;
                }
                else if (souhlasky.contains(String.valueOf(c))) {
                    pocetsouhlasek++;
                }
            }
            System.out.printf("Samohlásek: %d\n", pocetsamohlasek);
            System.out.printf("Souhlásek: %d\n", pocetsouhlasek);
            System.out.printf("Nepísmenných znaků: %d\n", x.length() - (pocetsamohlasek + pocetsouhlasek));
            System.out.println("");
        }



    }
}
