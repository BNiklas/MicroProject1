package com.company;

import com.googlecode.lanterna.*;
import com.googlecode.lanterna.input.Key;
import com.googlecode.lanterna.terminal.Terminal;

import java.nio.charset.Charset;

public class RunGame {
    public void runGame() {
        // create terminal
        Terminal terminal = TerminalFacade.createTerminal(System.in, System.out, Charset.forName("UTF8"));
        terminal.enterPrivateMode();

        // write controls

        // init player objects
        Player ourPlayer = new Player();

        // init monster objects
        Monster monster1 = new Monster();
        Monster monster2 = new Monster();
        Monster monster3 = new Monster();
        Monster monster4 = new Monster();

        // init movements objects

        // do-while loop for the game, including
        //      movement method
        //      player method
        //      monster method
        //      clear terminal
        //      draw playfield method


        // game over

    }
}
