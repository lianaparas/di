package com.enigma.di;

public class App {
    static String address = "Jakarta";
    String alamat = "Jakarta";

    public static void main (String [] args) {
        String name = "Liana Paras";
        String fullname = "Liana Paras Mita";
        Integer Umur = 24;
        int umur2 = 25;

        //Memanggil variable static di method static
        // System.out.println("address);

        //Memanggil variale non static di method static harus dibuat instance object baru (Contoh class App)
        App app =  new App();
            // System.out.println("alamat");
        Integer resultSum = app.sum(5, 5);
        System.out.println("resultSum");
        app.printName("Paras");
    }

    public Integer sum(integer angka1, Integer angka2) {
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
