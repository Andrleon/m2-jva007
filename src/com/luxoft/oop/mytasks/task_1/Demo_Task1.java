package com.luxoft.oop.mytasks.task_1;

public class Demo_Task1 {
    public static void main(String[] args) {
        Alcoholic kolya = new Alcoholic(4);
        Beer obolon = new Beer(4,1);
        Beer chernihivske = new Beer(0,1);
        Beer other1 = new Beer(1,3);
        Beer other2 = new Beer(5,1);
        Beer other3 = new Beer(5,1);

        kolya.howAreYou();
        System.out.println("-----------------------");
        kolya.drink(obolon);
        kolya.howAreYou();
        System.out.println("-----------------------");
        kolya.drink(chernihivske);
        kolya.howAreYou();
        System.out.println("-----------------------");
        kolya.drink(other1);
        kolya.howAreYou();
        System.out.println("-----------------------");
        kolya.drink(other2);
        kolya.howAreYou();
        System.out.println("-----------------------");
        kolya.drink(other3);
        System.out.println("-----------------------");
    }
}
