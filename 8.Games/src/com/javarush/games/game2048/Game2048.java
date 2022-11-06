package com.javarush.games.game2048;

import com.javarush.engine.cell.*;

public class Game2048 extends Game {
    private static final int SIDE = 4;



    @Override
    public void initialize() {
        setScreenSize(SIDE,SIDE);
    }
}
//--module-path "/Users/aliiaabdyeva/Documents/Mega/JavaRushTasks/lib/javafx-sdk-17.0.2/lib" --add-modules javafx.controls,javafx.fxml
