package com.luxoft.oop.mytasks.task_1;

public class Alcoholic {
    Alcoholic(int abilityToDrink){
        this.abilityToDrink = abilityToDrink;
    }

    int drunkennessLevel = 0;
    int countOfBeers = 0;
    int abilityToDrink = 5;

    String mood = "Sad";
    Beer[] beers = new Beer[abilityToDrink];

    void drink (Beer b){
        if (countOfBeers < abilityToDrink) {
            beers[countOfBeers] = b;
            countOfBeers++;
            drunkennessLevel += b.alcohol * b.size;
            changeMood();
        }
        else System.out.println("I cannot drink anymore. My tummy is full!");
    }
    void changeMood(){
        if ((drunkennessLevel > 3) && (drunkennessLevel <9))
            mood = "encouraged";
        else if ((drunkennessLevel >= 9)){
            mood = "happy";
        }
    }

    void howAreYou(){
        System.out.println("I've drunk " + countOfBeers + " beers");
        System.out.println("My level of drunkenness is " + drunkennessLevel );
        System.out.println("I'm " + mood);
    }

}
