package com.luxoft.oop.mytasks.task_2a;

public class Demo_Task2 {

    public static void main(String[] args) {

        LinkedObjects o1 = new LinkedObjects("O1");
        LinkedObjects o2 = new LinkedObjects("O2");
        LinkedObjects o3 = new LinkedObjects("O3");
        LinkedObjects o4 = new LinkedObjects("O4");

        o1.link = o2;
        o2.link = o3;
        o3.link = o4;
        o4.link = o1;

        LinkedObjects currentObject = o1;
        int i = 1;
        while (currentObject != null){
            System.out.println("Iteration" + i);
            currentObject.showNext();
            currentObject = currentObject.link;
            i++;
            if (i == 101)
                break;
        }


/*

        LinkedObjects[] lo = new LinkedObjects[4];
        lo[0] = new LinkedObjects("O1");
        lo[1] = new LinkedObjects("O2");
        lo[2] = new LinkedObjects("O3");
        lo[3] = new LinkedObjects("O4");

        lo[0].linkWithObject(lo[1]);
        lo[1].linkWithObject(lo[2]);
        lo[2].linkWithObject(lo[0]);

     //   lo[0].showNext();

        for(LinkedObjects obj : lo){
            obj.showNext();
*/


    }

}
