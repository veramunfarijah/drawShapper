package org.example;

import java.util.Scanner;

public class ShapeDrawer {
    Scanner scanner = new Scanner(System.in); // Masukkin user input

    public void displayMenu (){
        System.out.println("Selamat datang di ASCII draw!" );
        System.out.println("Pilih bentuk yang mau digambar" );
        System.out.println("1. Segitiga Siku-Siku" );
        System.out.println("2. Segitiga Sama Kaki" );
        System.out.println("3. Square" );
        System.out.println("4. Rectangle" );
        System.out.println("5. Exit\n" );
    }
    public void drawTriangleSS(int height){
        //Nested loop
        // outer loop (Rownya)
        for(int i = 1; i <= height; i++){
            // inner loop (coloumnya)
            for (int j = 1; j<=i; j++){
                System.out.print("*");
            }
            System.out.println();
        }
    }
    public void drawTriangleSK(int height2) {
        for (int i = 1; i <= height2; i++) {
            // Print spaces to center the triangle
            for (int j = height2 - i; j > 0; j--) {
                System.out.print(" ");
            }
            // Print stars for the triangle
            for (int k = 1; k <= (2 * i - 1); k++) {
                System.out.print("*");
            }
            // Move to the next line after each row
            System.out.println();
        }
    }

    public void drawSquare(int height3){
       for (int i=0; i < height3; i++){
           for (int j=0; j < height3; j++) {
               System.out.print("*");
           }
           System.out.println("");
       }
    }

    public void drawRectangle(int height4,int width){
        for (int i=0; i < height4; i++){
            for (int j=0; j < width; j++){
                System.out.print("*");
            }
            System.out.println("");
        }
    }


    public void drawShape(int choice){
        switch(choice){
            case 1:
                System.out.println("Masukkan Panjang segitiga siku-siku: " );
                int height = scanner.nextInt();
                drawTriangleSS(height); // fungsi untuk menggambar segitiganya
                break;
            case 2:
                System.out.println("Masukkan Panjang segitiga Sama Kaki: " );
                int height2 = scanner.nextInt();
                drawTriangleSK(height2); //fungsi untuk menggambar segitiganya
                break;
            case 3:
                System.out.println("Masukkan Panjang sisi persegi: " );
                int height3 = scanner.nextInt();
                drawSquare(height3); //fungsi untuk menggambar square
                break;
            case 4:
                System.out.println("Masukkan Panjang persegi panjang: " );
                int height4 = scanner.nextInt();
                System.out.println("Masukkan Lebar persegi panjang: " );
                int width = scanner.nextInt();
                drawRectangle(height4,width); //fungsi untuk menggambar rectangle
                break;
            case 5:
                System.exit(0);
                break;
            default:
                System.out.println("Invalid Input" );
        }
    }
    public void run (){
        //loop untuk menampilkan menu
        while (true){
            displayMenu();
            System.out.println("Masukkan pilihan anda: " );
            int choice = scanner.nextInt(); //input jenis interger
            drawShape(choice);
            System.out.println();
        }
    }

    public static void main(String[] args){
       //program gambar ASCII shape
        //Runnerz
        ShapeDrawer drawer = new ShapeDrawer();
        drawer.run();

    }
}
