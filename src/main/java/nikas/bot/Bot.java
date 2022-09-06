package nikas.bot;

import net.dv8tion.jda.api.JDA;
import net.dv8tion.jda.api.JDABuilder;
import nikas.bot.Listeners.MessageListener;

import javax.security.auth.login.LoginException;

public class Bot {
    private static final String TOKEN = "MTAwNzA0OTIzMzI5NzMzMDI0Nw.Gs2QdJ.jXnjan7NtxrdiOrgqsZoU1uMOQpmZv5DFWFspI";
    public  static final String CMD_PREFIX = "rb!";

    public static void main(String[] args) {
        Bot bot = new Bot();
        bot.prepareJDA();
    }


    private JDA prepareJDA(){
        try{
            JDA api = JDABuilder.createDefault(Bot.TOKEN)
                .addEventListeners(
                        new MessageListener()
                )
                .build()
                .awaitReady();
            return api;
        } catch (LoginException | InterruptedException e){
        System.out.println("Login falhou filhão");
        System.exit(-1);
        }
        return null;
    }
}
