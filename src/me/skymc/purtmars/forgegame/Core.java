package me.skymc.purtmars.forgegame;

import me.skymc.purtmars.forgegame.game.GameManager;
import me.skymc.purtmars.forgegame.menu.MenuManager;
import org.bukkit.plugin.java.JavaPlugin;

/**
 * @Author 坏黑
 * @Since 2019-03-02 13:30
 */
public class Core extends JavaPlugin {

    private static Core inst;
    private static GameManager gameManager = new GameManager();
    private static MenuManager menuManager = new MenuManager();

    @Override
    public void onLoad() {
        inst = this;
    }

    // *********************************
    //
    //        Getter and Setter
    //
    // *********************************

    public static Core getInst() {
        return inst;
    }

    public static GameManager getGameManager() {
        return gameManager;
    }

    public static MenuManager getMenuManager() {
        return menuManager;
    }
}
