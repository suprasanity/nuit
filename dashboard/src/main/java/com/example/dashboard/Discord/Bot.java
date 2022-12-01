package com.example.dashboard.Discord;


import net.dv8tion.jda.api.JDA;
import net.dv8tion.jda.api.JDABuilder;
import net.dv8tion.jda.api.entities.channel.concrete.TextChannel;
import net.dv8tion.jda.api.requests.GatewayIntent;
import org.springframework.stereotype.Component;
@Component
public  class Bot {
private JDA jda;

public Bot() {
try{
    this.jda= JDABuilder.createDefault("NTgzOTk2MjU0ODYyNzA0NjUw.GWv9cH.Dju0qjIIJqQ38dlSYk9FS5Cr33mmAC_gdCYJQo").addEventListeners(new EventDisc()).enableIntents(GatewayIntent.MESSAGE_CONTENT).build();
    this.jda.awaitReady();
}catch (Exception ex){}
}

    public void sendMsg(String test ,String guildId,String channelId) {
        TextChannel textChannel = this.jda.getGuildById(guildId).getTextChannelById(channelId);
        if(textChannel.canTalk()) {
            textChannel.sendMessage(test).queue();
        }
    }


}