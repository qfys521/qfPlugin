package cn.qfys521.qqbot.plugin;

import cn.qfys521.bot.BotApplication;
import cn.qfys521.bot.annotation.Command;
import cn.qfys521.bot.command.CommandRunner;
import cn.qfys521.bot.command.RegisterCommand;
import cn.qfys521.bot.core.Bot;
import cn.qfys521.bot.core.plugin.JavaPlugin;
import cn.qfys521.bot.core.plugin.PluginManager;
import cn.qfys521.qqbot.plugin.interactors.Interactor;
import io.github.kloping.spt.interfaces.Logger;

public class Main extends JavaPlugin {
    Logger getLogger = BotApplication.getLogger();

    @Override
    public void onLoad() {
        getLogger.info("qfPlugin插件正在加载中");
        RegisterCommand.registerCommand(new Class[]{
                Interactor.class
        });
    }

    @Override
    public PluginInfo getPluginInfo() {
        return new PluginInfoBuilder()
                .author("qfys521")
                .name("qfPlugin")
                .version("1.0-SNAPSHOT")
                .versionCode(1)
                .build();
    }


    public JavaPlugin getInstance() {
        return new Main();
    }




}
