package com.luxoft.oop.mytasks.task_2a;

public class LinkedObjects {

    LinkedObjects link;
    String name;

    LinkedObjects(String name){
        this.name = name;
    }

    void linkWithObject(LinkedObjects o ){
        link = o;
    }

    boolean hasNext(){
        return (this.link != null);
    }
    void showNext(){
        if (this.hasNext()) {
            System.out.println(this.name + " is linked to " + link.name);
           // link.showNext();
        }
        else System.out.println(this.name  + " is not linked to any object");
    }

}
