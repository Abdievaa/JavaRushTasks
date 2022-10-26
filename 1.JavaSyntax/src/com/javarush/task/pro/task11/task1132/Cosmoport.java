package com.javarush.task.pro.task11.task1132;

import java.util.Random;

public class Cosmoport {
    private static RoboZombie[] roboZombies = RoboZombieFactory.produce();

    public static class Werehouse {
        private static RoboZombie[] roboZombies = RoboZombieFactory.produce();
    }

    public static class RoboZombieFactory {
        public static RoboZombie[] produce() {
            RoboZombie[] army = new RoboZombie[new Random().nextInt(100)];
            for (int i = 0; i < army.length; i++) {
                army[i] = new RoboZombie();
            }

            return army;
        }
    }
}
