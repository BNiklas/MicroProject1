package com.company;

import com.googlecode.lanterna.*;
import com.googlecode.lanterna.input.Key;
import com.googlecode.lanterna.terminal.Terminal;
import java.nio.charset.Charset;

public class Main {
    public static void main(String[] args) throws InterruptedException {
	// here we start our game by calling RunGame

        RunGame run = new RunGame();
        run.runGame();

    }
}
