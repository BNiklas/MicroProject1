package com.company;

import com.googlecode.lanterna.*;
import com.googlecode.lanterna.input.Key;
import com.googlecode.lanterna.terminal.Terminal;

import java.nio.charset.Charset;
import java.util.Random;

public class RunGame {
    private final int PLAY_AREA_HEIGHT = 20;
    private final int PLAY_AREA_WIDTH = 20;

    public void runGame() throws InterruptedException {

        // create terminal
        Terminal terminal = TerminalFacade.createTerminal(System.in, System.out, Charset.forName("UTF8"));
        terminal.enterPrivateMode();
        terminal.setCursorVisible(false);


        // init player objects
        Player ourPlayer = new Player();

        // init monster objects
        Monster[] monsters = new Monster[4];
        for (int i = 0; i < monsters.length; i++) {//(Monster item : monsters) {
            Random rand = new Random();
            monsters[i] = new Monster(rand.nextInt(PLAY_AREA_HEIGHT), rand.nextInt(PLAY_AREA_WIDTH));
        }
        System.out.println(monsters[0].xMonster + "\n" + monsters[0].yMonster);

        // init movements objects
        Movement move = new Movement();

        // init drawplayfield
        DrawPlayfield playfield = new DrawPlayfield();

        // while loop for the game, including
        //      movement method
        //      player method
        //      monster method
        while (ourPlayer.statusPlayer) {
            terminal.clearScreen();
            playfield.drawPlay(terminal, ourPlayer, monsters);
            if (move.charMove(terminal, ourPlayer, monsters)){
                continue;
            }

        }


        // game over

    }
}
