package nikas.bot.Listeners;

import net.dv8tion.jda.api.entities.MessageReaction;
import net.dv8tion.jda.api.events.message.MessageReceivedEvent;
import net.dv8tion.jda.api.events.message.react.MessageReactionAddEvent;
import net.dv8tion.jda.api.hooks.ListenerAdapter;

import javax.annotation.Nonnull;

public class MessageListener extends ListenerAdapter {

    public void onMessageReceived(@Nonnull MessageReceivedEvent event) {
        if(event.getAuthor().isBot()) return;
        System.out.println(event.getMessage().getContentRaw());
    }

    public void onMessageReactionAdd(@Nonnull MessageReactionAddEvent event) {
        if(event.getUser().isBot()) return;

    }
}
