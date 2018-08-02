package com.luxoft.oop.mytasks.task_3;

public class Man {
    private String name;

    public Mail writeLetter(Man addressee, String text){
        Mail letter = new Mail();
        letter.setSender(this);
        letter.setAddressee(addressee);
        letter.setText(text);
        return letter;
    }

    public Man(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return name;
    }
}
