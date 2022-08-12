package com.company;

public class Main {

    public static void main(String[] args) {
	// write your code here

        Programmer programmer = new Programmer("Артыков Акмат", "Программист", "Peaksoft");
        System.out.println(programmer);

        System.out.println();
        Dancer dancer = new Dancer("Орунбаева Айзирек ", "Бийчи ", "Назик");
        System.out.println(dancer );
        dancer.dancing();

        System.out.println();
        Singer singer = new Singer("Балтабаев Тешебай ","Ырчы " , "Кызгалдак");
        System.out.println(singer);
        singer.singing();
        singer.playGitar();


    }
}
