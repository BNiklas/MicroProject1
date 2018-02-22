package com.company;

import com.googlecode.lanterna.*;
import com.googlecode.lanterna.input.Key;
import com.googlecode.lanterna.terminal.Terminal;
import java.nio.charset.Charset;

public class Monster {
    public int xMonster;
    public int yMonster;

    public Monster(int x, int y) {
        this.xMonster = x;
        this.yMonster = y;
    }

    public int getxMonster() {
        return xMonster;
    }

    public void setxMonster(int xMonster) {
        this.xMonster = xMonster;
    }

    public int getyMonster() {
        return yMonster;
    }

    public void setyMonster(int yMonster) {
        this.yMonster = yMonster;
    }

    //Monster class
    //   -monster position
}
