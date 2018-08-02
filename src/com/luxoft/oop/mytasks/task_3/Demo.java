package com.luxoft.oop.mytasks.task_3;

public class Demo {
    public static void main(String[] args) {
        Man kolya = new Man("Nikolay");
        Man valya = new Man("Valentina");
        Post_Office po = new Post_Office();

        Mail firstLetterToKolya = valya.writeLetter(kolya, "Hi honey! how are you?");
        Mail firstLetterToValya = kolya.writeLetter(valya, "Hello dear Valentina!!");

        po.sendLetter(firstLetterToKolya);
        po.sendLetter(firstLetterToValya);

        po.showStorage();

        System.out.println(po.receiveLetter(kolya).getText());
        System.out.println(po.receiveLetter(valya).getText());

        po.showHistory();

        po.showStorage();

    }

}
