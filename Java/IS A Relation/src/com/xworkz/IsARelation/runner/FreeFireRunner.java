package com.xworkz.IsARelation.runner;

import com.xworkz.IsARelation.external.FreeFire;
import com.xworkz.IsARelation.internal.OnlineGame;

public class FreeFireRunner {
    public static void main(String[] args) {

        OnlineGame onlineGame = new OnlineGame();
        onlineGame.chatWithPlayers();
        onlineGame.connectToServer();
        onlineGame.endSession();
        onlineGame.startMatch();
        onlineGame.createLobby();
        System.out.println("-----------------");
        OnlineGame onlineGame1 = new FreeFire();
        onlineGame1.chatWithPlayers();
        onlineGame1.connectToServer();
        onlineGame1.endSession();
        onlineGame1.startMatch();
        onlineGame1.createLobby();
        System.out.println("-----------------");
        FreeFire freeFire = new FreeFire();
        freeFire.chatWithPlayers();
        freeFire.connectToServer();
        freeFire.endSession();
        freeFire.startMatch();
        freeFire.createLobby();

    }
}
