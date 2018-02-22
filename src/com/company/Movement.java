package com.company;

import com.googlecode.lanterna.*;
import com.googlecode.lanterna.input.Key;
import com.googlecode.lanterna.terminal.Terminal;
import java.nio.charset.Charset;

public class Movement {
    public boolean charMove(Terminal terminal, Player player, Monster[] monsters) throws InterruptedException {
        //Wait for a key to be pressed
        Key key;
        do {
            Thread.sleep(5);
            key = terminal.readInput();
            if (key != null) {

                switch (key.getKind()) {
                    case ArrowDown:
                        player.yPlayer += player.yPlayer > RunGame.PLAY_AREA_HEIGHT-1 ? 0 : 1;
                        break;
                    case ArrowUp:
                        player.yPlayer -= 1;
                        break;
                    case ArrowLeft:
                        player.xPlayer -= 1;
                        break;
                    case ArrowRight:
                        player.xPlayer += player.xPlayer > RunGame.PLAY_AREA_WIDTH-1 ? 0 : 1;
                        break;
                }

                for (int i = 0; i < monsters.length; i++) {

                    monsters[i].moveMonster(player);

                    for (int j = 0; j <= i; j++) {
                        if (monsters[i].xMonster == monsters[j].xMonster &&
                                monsters[i].yMonster == monsters[j].yMonster) {
                            monsters[j].yMonster += 0;
                            monsters[j].xMonster += 0;
                        }
                    }

                    if (monsters[i].yMonster == player.yPlayer &&
                            monsters[i].xMonster == player.xPlayer)
                        player.statusPlayer = false;
                }
            }
        }
        while(key == null);
        return true;
    }



    //Movement
    //   -button press
    //   -player move
    //   -monster move
}
