package com.javarush.games.game2048;

import com.javarush.engine.cell.*;

public class Game2048 extends Game {
    private static final int SIDE = 4;
    private int [][] gameField = new int[SIDE][SIDE];

    private void createGame(){}

    private void drawScene(){
        for (int i = 0; i < SIDE; i++) {
            for (int j = 0; j < SIDE; j++) {
                setCellColor(j,i, Color.BLUE);

            }


        }
    }
    private void createNewNumber(){
        getRandomNumber(SIDE);
        getRandomNumber(SIDE);

    }



    @Override
    public void initialize() {
        setScreenSize(SIDE,SIDE);
        createGame();
        drawScene();
    }
}
//--module-path "/Users/aliiaabdyeva/Documents/Mega/JavaRushTasks/lib/javafx-sdk-17.0.2/lib" --add-modules javafx.controls,javafx.fxml
