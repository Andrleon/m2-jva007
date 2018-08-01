package com.luxoft.oop.mytasks.task_2a;

public class Demo_Task2 {

    public static void main(String[] args) {

        linkedObjects[] lo = new linkedObjects[4];
        lo[0] = new linkedObjects("O1");
        lo[1] = new linkedObjects("O2");
        lo[2] = new linkedObjects("O3");
        lo[3] = new linkedObjects("O4");


        lo[0].linkWithObject(lo[1]);
        lo[1].linkWithObject(lo[2]);
        lo[2].linkWithObject(lo[3]);

     //   lo[0].showNext();


        for(linkedObjects obj : lo){
            obj.showNext();

      }

    }

}
