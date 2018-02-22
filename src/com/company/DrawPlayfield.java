package com.company;

import com.googlecode.lanterna.*;
import com.googlecode.lanterna.input.Key;
import com.googlecode.lanterna.terminal.Terminal;
import java.nio.charset.Charset;

public class DrawPlayfield {
    //Draw Playfield
    //   -Draw M & P

    // write controls

    public void drawPlay(Terminal terminal, Player player, Monster[] monsters) {
        for(int i=0; i<RunGame.PLAY_AREA_HEIGHT) {
            terminal.moveCursor(RunGame.PLAY_AREA_WIDTH, i);
            terminal.putCharacter('|');
        }
        for(int i=0; i<=RunGame.PLAY_AREA_WIDTH; i++){
            terminal.moveCursor(i,RunGame.PLAY_AREA_HEIGHT);
            terminal.putCharacter('-');
        }

        String controls = "Controls:\n\tArrow Up = move up\n\tArrow Down = move down" +
                "\n\tArrow left = move left\n\tArrow Right = move right";
        char[] c = controls.toCharArray();
        terminal.moveCursor(30,5);
        for(char i:c) {
            terminal.putCharacter(i);
        }

        terminal.moveCursor(player.xPlayer, player.yPlayer);
        terminal.putCharacter('O');

        for (int i = 0; i < monsters.length; i++) {
            terminal.moveCursor(monsters[i].xMonster, monsters[i].yMonster);
            terminal.putCharacter('X');
        }
    }
}
