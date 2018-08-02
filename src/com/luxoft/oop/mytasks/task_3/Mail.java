package com.luxoft.oop.mytasks.task_3;

public class Mail {
    private Man sender;
    private Man addressee;
    private String text;

    public Man getAddressee() {
        return addressee;
    }

    public void setAddressee(Man addressee) {
        this.addressee = addressee;
    }

    public String getText() {
        return text;
    }

    public void setText(String text) {
        this.text = text;
    }

    public Man getSender() {
        return sender;
    }

    public void setSender(Man sender) {
        this.sender = sender;
    }

    @Override
    public String toString() {
        return "Mail from " + sender.toString() + " to " + addressee.toString();
    }
}
