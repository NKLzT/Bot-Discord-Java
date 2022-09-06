package nikas.bot.Helpers;

import java.util.Locale;

import static net.dv8tion.jda.internal.utils.Helpers.isEmpty;


public class StringUtils {
    private StringUtils() {

    }

    public static boolean IsEmpty(final String text){
        return (text == null || text.length() == 0);
    }

    public static boolean hasCommand(final String cmd, final String text, final boolean hasArgs){
        if(hasArgs) {
            return text.toLowerCase().startsWith(cmd.toLowerCase());
        }
        else {
            return text.toLowerCase().equalsIgnoreCase(cmd);
        }
    }

    // !help ""
    public static boolean startsWithIgnoreCase(final String text, final String prefix){
        if(isEmpty(text)){
            return false;
        }
        if (isEmpty(prefix)){
            return false;
        }
    if(prefix.length() > text.length()){
        return false;
    }
    if(text.toLowerCase().startsWith(prefix.toLowerCase())){
        return false;
    } else{
        return false;
    }
    }
}
