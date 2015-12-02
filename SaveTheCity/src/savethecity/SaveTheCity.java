/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package savethecity;

import savethecity.model.Character;
import savethecity.model.Players;
import savethecity.model.Tiles;
import savethecity.model.Map;
import savethecity.model.Villain;
import savethecity.model.Hero;
import savethecity.model.Captive;
import savethecity.model.Game;
import savetheciy.view.StartProgramView;



/**
 *
 * @author CHRIS
 */
public class SaveTheCity {
    
    private static Game currentGame = null;

    public static Game getCurrentGame() {
        return currentGame;
    }

    public static void setCurrentGame(Game currentGame) {
        SaveTheCity.currentGame = currentGame;
    }

    public static Players getPlayer() {
        return player;
    }

    public static void setPlayer(Players player) {
        SaveTheCity.player = player;
    }
    private static Players player = null;

    public static void main(String[] args) {
        
        //create StartProgramView and start the program
        StartProgramView startProgramView = new StartProgramView();
        try{
        startProgramView.startProgram();
        }catch (Throwable te){
            System.out.println(te.getMessage());
            te.printStackTrace();
            startProgramView.startProgram();
        }
        
        /*Character characterOne = new Character();
        Item itemOne = new Item();
        Players playerOne = new Players();
        Tiles tileOne = new Tiles();
        Map mapOne = new Map();
        Hero heroOne = new Hero();
        Captive captiveOne = new Captive();
        Villain villainOne = new Villain();
        
        characterOne.setName("Fred Flinstone");
        characterOne.setAttackPower(10);
        characterOne.setHitPoints(100);
        String characterInfo = characterOne.toString();
        System.out.println(characterInfo);
        
        itemOne.setItemPoints(5);
        String itemInfo = itemOne.toString();
        System.out.println(itemInfo);
        
        playerOne.setRank(1);
        playerOne.setHighScore(5000);
        String playersInfo = playerOne.toString();
        System.out.println(playersInfo);
        
        tileOne.setItemTile("No");
        tileOne.setEmptyTile("Yes");
        tileOne.setRescueTile("No");
        tileOne.setHeroName("Bob");
        tileOne.setVillainName("Anti-Bob");
        String tilesInfo = tileOne.toString();
        System.out.println(tilesInfo);
        
        mapOne.setRowTile(10);
        mapOne.setColumnTile(10);
        mapOne.setHeroName("Bob");
        String mapInfo = mapOne.toString();
        System.out.println(mapInfo);
        
        Character characterHero = new Character();
        characterHero.setName("Captian America");
        characterHero.setAttackPower(10);
        characterHero.setHitPoints(100);
        
        Tiles tileHero = new Tiles();
        tileHero.setItemTile("No");
        tileHero.setEmptyTile("Yes");
        tileHero.setRescueTile("Grocer");
        tileHero.setHeroName("Captain America");
        tileHero.setVillainName("Lighting Lord");
 
        heroOne.setCharacter(characterHero);
        heroOne.setTile(tileHero);
        String heroInfo = heroOne.toString();
        System.out.println(heroInfo);
        
        Character characterVillain = new Character();
        characterVillain.setName("Clock King");
        characterVillain.setAttackPower(20);
        characterVillain.setHitPoints(100);
        
        Tiles tileVillain = new Tiles();
        tileVillain.setItemTile("No");
        tileVillain.setEmptyTile("Yes");
        tileVillain.setRescueTile("Baker");
        tileVillain.setHeroName("Black Widow");
        tileVillain.setVillainName("Clock King");
 
        villainOne.setCharacter(characterVillain);
        villainOne.setTile(tileVillain);
        String villainInfo = villainOne.toString();
        System.out.println(villainInfo);
        
        Character characterCaptive = new Character();
        characterCaptive.setName("Clock King");
        characterCaptive.setAttackPower(25);
        characterCaptive.setHitPoints(100);
        
        Tiles tileCaptive = new Tiles();
        tileCaptive.setItemTile("No");
        tileCaptive.setEmptyTile("Yes");
        tileCaptive.setRescueTile("Banker");
        tileCaptive.setHeroName("Superman");
        tileCaptive.setVillainName("Onslaught");
 
        captiveOne.setCharacter(characterCaptive);
        captiveOne.setTile(tileCaptive);
        String captiveInfo = captiveOne.toString();
        System.out.println(captiveInfo);
                */
    }
    
}
