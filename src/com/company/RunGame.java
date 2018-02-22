package com.company;

import com.googlecode.lanterna.*;
import com.googlecode.lanterna.input.Key;
import com.googlecode.lanterna.terminal.Terminal;

import java.nio.charset.Charset;
import java.util.Random;

public class RunGame {
    public static final int PLAY_AREA_HEIGHT = 20;
    public static final int PLAY_AREA_WIDTH = 20;

    public void runGame() throws InterruptedException {

        // create terminal
        Terminal terminal = TerminalFacade.createTerminal(System.in, System.out, Charset.forName("UTF8"));
        terminal.enterPrivateMode();
        terminal.setCursorVisible(false);


        // init player objects
        Player ourPlayer = new Player();

        // init monster objects
        Monster[] monsters = new Monster[4];
        for (int i = 0; i < monsters.length; i++) {
            Random rand = new Random();
            int tempx = rand.nextInt(PLAY_AREA_WIDTH);
            int tempy = rand.nextInt(PLAY_AREA_HEIGHT);

            while (tempx == ourPlayer.xPlayer && tempy == ourPlayer.yPlayer) {
                tempx = rand.nextInt(PLAY_AREA_WIDTH);
                tempy = rand.nextInt(PLAY_AREA_HEIGHT);
            }

            for (int j = 0; j < i; j++) {
                if (tempx == monsters[j].xMonster && tempy == monsters[j].yMonster) {
                    tempx = rand.nextInt(PLAY_AREA_WIDTH);
                    tempy = rand.nextInt(PLAY_AREA_HEIGHT);
                    j = 0;
                }
            }

            monsters[i] = new Monster(tempx, tempy);
        }


        // init movements objects
        Movement move = new Movement();

        // init drawplayfield
        DrawPlayfield playfield = new DrawPlayfield();

        // while loop for the game, including playfield method and movement method
        while (ourPlayer.statusPlayer) {
            terminal.clearScreen();
            playfield.drawPlay(terminal, ourPlayer, monsters);
            if (move.charMove(terminal, ourPlayer, monsters)) {
                continue;
            }
        }
        printText(10,10,"Game Over", terminal);
    }

    private static void printText(int x, int y, String message, Terminal terminal) {
        for (int i = 0; i < message.length(); i++) {
            terminal.moveCursor(x, y);
            terminal.putCharacter(message.charAt(i));
            x=x+1;
        }
    }
}
