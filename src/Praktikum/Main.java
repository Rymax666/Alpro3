package Praktikum;

import java.util.Scanner;
/*
 * Rymax666
 * Fuck Everyone Else !
 */

public class Main {
    public static void asede() {
        //JEMBOT
        Sort sayang = new Sort();
        Scanner scan = new Scanner(System.in);
        System.out.print("Kamu Pilih Yang Mana Beb ? " +
                "\n1. BubbleShort" +
                "\n2. SelectionShort" +
                "\n>>>>> ");

        int pilih = scan.nextInt();
        switch (pilih) {
            case 1:
                sayang.Bubble();
                break;
            case 2:
                sayang.Selection();
                break;
            default:
                System.out.println("Nggak Ada Sayang!!!");
        }
        System.out.print("\nMau Lagi Gak Beb ? Y/N" +
                "\n>>>>> ");
        String jwb = scan.next();
        if (jwb.equals("Y") || jwb.equals("y")) {
            asede();
        } else {
            System.exit(0);
        }
    }

    public static void main(String[] args) {
        asede();
    }
}
