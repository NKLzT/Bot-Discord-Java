package nikas.bot.Helpers;

import net.dv8tion.jda.api.EmbedBuilder;

import java.awt.*;

public class EmbedBuilderHelper extends EmbedBuilder {
    public  EmbedBuilderHelper(final Color color, final String title, final String description){
        setColor(color);
        setTitle(title);
        setDescription(description);
    }

    public void newField(final String name, final String value, final boolean inline) {
        addField(name, value, inline);
    }

    public void newBlankField(boolean inline){
        addBlankField(inline);
    }
}
