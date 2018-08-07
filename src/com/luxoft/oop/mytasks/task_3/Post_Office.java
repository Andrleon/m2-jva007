package com.luxoft.oop.mytasks.task_3;

import java.util.Arrays;

public class Post_Office {
    private final int STORAGE = 100;
    private final int HISTORY_SIZE = 100;

    private Mail[] letters = new Mail[STORAGE];
    private String[] history = new String[HISTORY_SIZE];
    private int historyPointer = 0;

    private void addHistoryRecord(Mail letter, String action){
        if (historyPointer == HISTORY_SIZE)
            historyPointer = 0;
        history[historyPointer] = letter.toString() + " was " + action;
        historyPointer++;
    }

    void showHistory(){
        System.out.println(Arrays.toString(history));
    }

    void sendLetter(Mail letter){
        for (int i = 0; i < STORAGE; i++ ){
            if (letters[i] == null){
                letters[i] = letter;
                addHistoryRecord(letter, "sent");
                break;
            }
            else if (i == STORAGE - 1 && letters[i] != null){
                System.out.println("Storage is full");
            }
        }

    }
    Mail receiveLetter(Man addressee){
      Mail letterToReturn = new Mail();
        for (int i = 0; i < STORAGE; i++){
            if (letters[i] != null && letters[i].getAddressee() == addressee){
                letterToReturn = letters[i];
                addHistoryRecord(letters[i], "received");
                letters[i] = null;
            }
        }
       return letterToReturn;
    }

    void showStorage(){
        System.out.println(Arrays.toString(letters));
    }

}
