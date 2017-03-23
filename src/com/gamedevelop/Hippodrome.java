package com.gamedevelop;

import java.util.ArrayList;

/**
 * Created by KenTerror on 08.11.2016.
 */
public class Hippodrome
{
    public static Hippodrome game;
    private ArrayList<Horse> horses = new ArrayList<Horse>();

    public static void main(String[] args) throws InterruptedException
    {
        game = new Hippodrome();
        Horse horse1 = new Horse("Margo", 3, 0);
        Horse horse2 = new Horse("Magic", 3, 0);
        Horse horse3 = new Horse("Molly", 3, 0);
        game.getHorses().add(horse1);
        game.getHorses().add(horse2);
        game.getHorses().add(horse3);
        game.run();
        game.printWinner();
    }

    public ArrayList<Horse> getHorses() {
        return horses;
    }

    public void run() throws InterruptedException {
        for (int i = 0; i < 100; i++) {
            move();
            print();
            Thread.sleep(200);
        }
    }

    public void move(){
        for (Horse horse : horses) {
            horse.move();
        }
    }
    public void print(){
        for (Horse horse : horses) {
            horse.print();
        }
        System.out.println();
        System.out.println();
    }

    public Horse getWinner() {
        Horse winner = null;

        for (int i = 0; i < horses.size()-1; i++) {
            if (horses.get(i).getDistance() > horses.get(i+1).getDistance()) {
                winner = horses.get(i);
            } else {
                winner = horses.get(i+1);
            }
        }

        return winner;
    }

    public void printWinner() {
        System.out.println("Winner is " + getWinner().getName() + "!");
    }
}
