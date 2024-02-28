package org.example;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        //TIP Press <shortcut actionId="ShowIntentionActions"/> with your caret at the highlighted text
        // to see how IntelliJ IDEA suggests fixing it.
        System.out.printf("Hello and welcome!");
        System.out.println("Nama saya Vera ");
        System.out.print("Ini tanpa Spasi");

        boolean flag;
        for (int i = 1; i <= 5; i++) {
            //TIP Press <shortcut actionId="Debug"/> to start debugging your code. We have set one <icon src="AllIcons.Debugger.Db_set_breakpoint"/> breakpoint
            // for you, but you can always add more by pressing <shortcut actionId="ToggleLineBreakpoint"/>.
            System.out.println("i = " + i);

        }
        // data types and variable
        int a = 10;
        int b = 2;
        float c = 3;
        String name = "vera";
        char q = 'Y';
        boolean flag2 = false; // true

        // Aritmathic
        int result = a / b;
        int result2 = (int) (a/c); // 1 int dibagi 1 float --> Hierarki float lebih tinggi (hasilnya float)
        float result3 = a/c; //10 dibagi 3
        System.out.println(result);
        System.out.println(result2);
        System.out.println(result3);

        // if, else, else - if
        int timeStart = 8;
        int timeFinish = 17;
        int timeMasuk = 10; // waktu karyawan
        int timePulang = 18;

        // Karyawan yang masuk tepat waktu dan pulang tepat waktu atau lebih lama, di selamati
        if (timeMasuk <= timeStart) {
            System.out.println(("Selamat, anda masuk tepat waktu"));
            System.out.println("Anda sampai " + (timeStart - timeMasuk) + " jam lebih cepat");

            // Karyawan yang masuk tepat wkatu, pulang duluan , di cengin
        } else if (timeMasuk <= timeStart && timePulang <= timeFinish) {
            System.out.println(("yeu pulang duluan"));

            // Karyawan yang telat masuk, tapi pulang lebih lama atau tepat waktu , dimaafkan
        } else if (timeMasuk >= timeStart && timePulang >= timeFinish) {
            System.out.println("dimaafin telatnya");
        // Karyawan yang masuk telat waktu, di soraki
        }else {
            System.out.println("YEU TELAT");
            System.out.println("Anda sampai " + (timeMasuk-timeStart) + " jam lebih lama");
        }

        //switch
        int day = 3;
        switch (day) {
            case 1:
                System.out.println("Saya WFO");
                break;
            case 2:
                System.out.println("Saya Cuti");
                break;
            case 3:
                System.out.println("Saya WFH");
                break;
            default:
                System.out.println("Saya ga kerja alias nganggur");
                break;
        }
        // loops

        }
    }