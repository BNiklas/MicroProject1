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
        terminal.moveCursor(player.xPlayer, player.yPlayer);
        terminal.putCharacter('O');

        for (int i = 0; i < monsters.length; i++) {
            terminal.moveCursor(monsters[i].xMonster, monsters[i].yMonster);
            terminal.putCharacter('X');
        }
    }
}
