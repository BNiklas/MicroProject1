package com.company;

import com.googlecode.lanterna.*;
import com.googlecode.lanterna.input.Key;
import com.googlecode.lanterna.terminal.Terminal;
import java.nio.charset.Charset;

public class Player {
    public int xPlayer;
    public int yPlayer;
    public boolean statusPlayer = true;

    public Player() {
        this.xPlayer = 0;
        this.yPlayer = 0;
    }

    public int getxPlayer() {
        return xPlayer;
    }

    public int getyPlayer() {
        return yPlayer;
    }

    public void setxPlayer(int xPlayer) {
        this.xPlayer = xPlayer;
    }

    public void setyPlayer(int yPlayer) {
        this.yPlayer = yPlayer;
    }

    public void setStatusPlayer(boolean statusPlayer) {
        this.statusPlayer = statusPlayer;
    }

    public boolean isStatusPlayer() {
        return statusPlayer;
    }

    //Player class
    //   -player status
    //   -player position
}
