package com.xworkz.IsARelation.external;

import com.xworkz.IsARelation.internal.Game;
import com.xworkz.IsARelation.internal.OnlineGame;

public class FreeFire extends OnlineGame{
    public FreeFire(){
        System.out.println("zero parameter of Free Fire class");
    }


@Override
    public void connectToServer() {
        System.out.println("@Override :Connecting to the game server...");
    }
    @Override
    public void createLobby() {
        System.out.println("@Override :Creating a game lobby...");
    }
    @Override
    public void startMatch() {
        System.out.println("@Override :Starting an online match...");
    }
    @Override
    public void chatWithPlayers() {
        System.out.println("@Override :Chatting with other players...");
    }
    @Override
    public void endSession() {
        System.out.println("@Override :Ending the online game session...");
    }
    public void useCharacterSkill() {
        System.out.println("Using special character skill in Free Fire...");
    }

}
