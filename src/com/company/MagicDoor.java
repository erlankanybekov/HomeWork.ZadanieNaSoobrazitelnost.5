package com.company;

public class MagicDoor {
    public Hero [] getHeroes(){
        Hero [] players = new Hero[4];
        Hero Magic = new Hero();
        players[0] = Magic;
        Hero Kinetic = new Hero();
        players[1] = Kinetic;
        Hero Warrior = new Hero();
        players[2] = Warrior;
        Hero Medic = new Hero();
        players[3] = Medic;
        return players;


    }
}
