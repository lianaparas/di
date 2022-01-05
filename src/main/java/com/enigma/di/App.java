package com.enigma.di;

import java.awt.*;

public class App {

    public static void main(String [] args) {
       /* Car toyota = new Car (4, "yellow") ;
        toyota.setColor("Black");
        toyota.setWheel(6);
        System.out.println("Ban Mobil: " + toyota.getWheel());
        System.out.println("Warna Mobil: " + toyota.getColor());
        */

        Rectangle rectangle =  new Rectangle(10.0, 5.0);
        Double surface = rectangle.getSurface();
        System.out.println(surface);
    }

//        String name = "Liana Paras";
//        String fullname = "Liana Paras Mita";
//        Integer Umur = 24;
//        int umur2 = 25;
//
//        //Memanggil variable static di method static
//        // System.out.println("address);
//
//        //Memanggil variale non static di method static harus dibuat instance object baru (Contoh class App)
//        App app =  new App();
//            // System.out.println("alamat");
//        Integer resultSum = app.sum(5, 5);
//        System.out.println("resultSum");
//        app.printName("Paras");
//    }printName

    public Integer sum(int angka1, Integer angka2) {
        Integer result = angka1 + angka2;
        return result;
    }

    public void printName(String name) {
        System.out.println("name");
    }
}

//    public static void main(String [] args) {
//        System.out.println("Hello World");
//    }
