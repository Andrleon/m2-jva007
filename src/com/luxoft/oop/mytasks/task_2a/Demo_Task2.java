package com.luxoft.oop.mytasks.task_2a;

public class Demo_Task2 {

    public static void main(String[] args) {

        LinkedObjects[] lo = new LinkedObjects[4];
        lo[0] = new LinkedObjects("O1");
        lo[1] = new LinkedObjects("O2");
        lo[2] = new LinkedObjects("O3");
        lo[3] = new LinkedObjects("O4");


        lo[0].linkWithObject(lo[1]);
        lo[1].linkWithObject(lo[2]);
        lo[2].linkWithObject(lo[3]);

     //   lo[0].showNext();


        for(LinkedObjects obj : lo){
            obj.showNext();

      }

    }

}
