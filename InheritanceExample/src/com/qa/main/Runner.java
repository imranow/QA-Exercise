package com.qa.main;

public class Runner {

    public static void main(String[] args){
        Owl owlfriend = new Owl();
        owlfriend.doThing();
        owlfriend.noise(); // will return "tweet", because Owl extends Bird!
        
        Chicken chikin = new Chicken();
        chikin.doThing();
        chikin.cluck();
        chikin.noise();  // will return "tweet", because Chicken also extends Bird!
    }
    }


