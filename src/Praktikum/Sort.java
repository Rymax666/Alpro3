package Praktikum;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;

/*
 * Rymax666
 * Fuck Everyone Else !
 */

public class Sort {
    public void Bubble() {
        Scanner scan = new Scanner(System.in);
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        int data;
        System.out.println("\n\n---------BUBBLE---------");
        System.out.print("Masukkan Jumlah Datanya Beb : ");
        data = scan.nextInt();
        String[] nama = new String[data];
        String temp;

        for (int i = 0; i < nama.length; i++) {
            System.out.print("Masukin Sayang Datanya Ke -" + (i + 1) + " : ");
            try {
                nama[i] = bf.readLine().toLowerCase();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }

        System.out.println("\nIni Data Awalnya Sayang : ");
        for (int i = 0; i < nama.length; i++) {
            System.out.println((i + 1) + ". " + nama[i]);
        }

        for (int i = 0; i < nama.length - 1; i++) {
            for (int j = i; j < nama.length; j++) {
                if (nama[i].compareTo(nama[j]) > 0) {
                    temp = nama[i];
                    nama[i] = nama[j];
                    nama[j] = temp;
                }
            }
        }

        System.out.println("\nIni Data Setelah Diurutkan Sayang : ");
        for (int i = 0; i < nama.length; i++) {
            System.out.println((i + 1) + ". " + nama[i]);
        }
    }

    public void Selection() {
        Scanner scan = new Scanner(System.in);
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        int data;
        System.out.println("\n\n--------Selection---------");
        System.out.print("Masukkin Jumlah Datanya Sayang : ");
        data = scan.nextInt();
        String[] nama = new String[data];
        String temp;

        for (int i = 0; i < nama.length; i++) {
            System.out.print("Masukin Sayang Datanya Ke -" + (i + 1) + " : ");
            try {
                nama[i] = bf.readLine().toLowerCase();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }

        System.out.println("\nIni Data Awalnya Sayang : ");
        for (int i = 0; i < nama.length; i++) {
            System.out.println((i + 1) + ". " + nama[i]);
        }

        for (int j = 0; j < nama.length - 1; j++) {
            int min = j;
            for (int k = j + 1; k < nama.length; k++) {
                if (nama[k].compareTo(nama[min]) < 0) {
                    min = k;
                    temp = nama[j];
                    nama[j] = nama[min];
                    nama[min] = temp;
                }
            }
        }

        System.out.println("\nIni Data Setelah Diurutkan Sayang : ");
        for (int i = 0; i < nama.length; i++) {
            System.out.println((i + 1) + ". " + nama[i]);
        }
    }
}
