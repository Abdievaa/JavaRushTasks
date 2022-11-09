package com.javarush.games.game2048;

import com.javarush.engine.cell.*;

public class Game2048 extends Game {
    private static final int SIDE = 4;
    private int[][] gameField = new int[SIDE][SIDE];

    private void createGame() {
        createNewNumber();
        createNewNumber();
    }

    private void drawScene() {
        for (int i = 0; i < SIDE; i++) {
            for (int j = 0; j < SIDE; j++) {
                setCellColoredNumber(j, i,gameField[i][j]);
            }
        }

    }

    private void createNewNumber() {
        int x = getRandomNumber(SIDE);
        int y = getRandomNumber(SIDE);
        int number = getRandomNumber(10);
        if (gameField[x][y] == 0) {
            if (number < 9) {
                gameField[x][y] = 2;
            } else {
                gameField[x][y] = 4;
            }
        } else {
            createNewNumber();
        }


    }

    private Color getColorByValue(int value) {
        if (value == 0) {
            return Color.BLUE;
        } else if (value == 2) {
            return Color.ALICEBLUE;
        } else if (value == 4) {
            return Color.ANTIQUEWHITE;
        } else if (value == 8) {
            return Color.AZURE;
        } else if (value == 16) {
            return Color.BISQUE;
        } else if (value == 32) {
            return Color.BROWN;
        } else if (value == 64) {
            return Color.BLUEVIOLET;
        } else if (value == 128) {
            return Color.DARKBLUE;
        } else if (value == 256) {
            return Color.CHOCOLATE;
        } else if (value == 512) {
            return Color.GREEN;
        } else if (value == 1024) {
            return Color.PINK;
        } else if (value == 2048) {
            return Color.ORANGE;
        } else {
            return Color.NONE;
        }

    }

    private void setCellColoredNumber(int x, int y, int value) {
        Color color = getColorByValue(value);
        String str = value > 0 ? "" + value : "";

//        if (value > 0) {
//            str += value;
//        }
        setCellValueEx(x, y, color, str);


    }


    @Override
    public void initialize() {
        setScreenSize(SIDE, SIDE);
        createGame();
        drawScene();
    }
}
//--module-path "/Users/aliiaabdyeva/Documents/Mega/JavaRushTasks/lib/javafx-sdk-17.0.2/lib" --add-modules javafx.controls,javafx.fxml
