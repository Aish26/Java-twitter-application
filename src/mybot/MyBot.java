/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mybot;
import java.util.List;
import twitter4j.Status;
import twitter4j.TwitterException;
import twitter4j.TwitterFactory;
import twitter4j.conf.ConfigurationBuilder;
/**
 *
 * @author Aditya
 */
public class MyBot {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws TwitterException {
     
        ConfigurationBuilder cb = new ConfigurationBuilder();
        cb.setDebugEnabled(true)
        .setOAuthConsumerKey("7uvf5YrimXAHl6tKnjwnPlHnY")
        .setOAuthConsumerSecret("TdF91t78phueIBYcvHDp9xwMvb8PLS8YMPMXzLzECnj0OuU6je")
        .setOAuthAccessToken("900012620337393665-oP6i22WvQrFJLO9DhEVc5MO6GNK0jEz")
        .setOAuthAccessTokenSecret("iON7Li4DYYmilwEmdaDo4dR9qxo2IkYX7DJSswe2Pa7WU");
        
        TwitterFactory tf = new TwitterFactory(cb.build());
        twitter4j.Twitter twitter = tf.getInstance();
        
        List<Status> status=twitter.getHomeTimeline();
        for(Status st:status)
        {
            System.out.println(st.getUser().getURL()+"----"+st.getUser().getName()+"----"+st.getText()+"----"st.getCreatedAt());
            System.out.println("");
        }
        
        
            
            
        
     
    }
    
}
