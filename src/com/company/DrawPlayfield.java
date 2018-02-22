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
        for(int i=0; i<RunGame.PLAY_AREA_HEIGHT + 1; i++) {
            terminal.applyForegroundColor(255,255,255);
            terminal.moveCursor(RunGame.PLAY_AREA_WIDTH+1, i);
            terminal.putCharacter('|');
        }
        for(int i=0; i<=RunGame.PLAY_AREA_WIDTH+1; i++){
            terminal.moveCursor(i,RunGame.PLAY_AREA_HEIGHT+1);
            terminal.putCharacter('-');
        }

        terminal.moveCursor(player.xPlayer, player.yPlayer);
        terminal.putCharacter('\u263A');

        for (int i = 0; i < monsters.length; i++) {
            terminal.moveCursor(monsters[i].xMonster, monsters[i].yMonster);
            terminal.applyForegroundColor(255,0,0);
            terminal.putCharacter('\u2588');
        }
    }
}
