package ohtu;

import com.google.gson.Gson;
import java.io.IOException;
import org.apache.http.client.fluent.Request;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        String url = "https://nhlstatisticsforohtu.herokuapp.com/players";
        
        String bodyText = Request.Get(url).execute().returnContent().asString();
                
        //System.out.println("json-muotoinen data:");
        //System.out.println( bodyText );

        Gson mapper = new Gson();
        Player[] players = mapper.fromJson(bodyText, Player[].class);
        java.util.Date date=new java.util.Date();  
        ArrayList<Player> finnishPlayers = new ArrayList<Player>();
        System.out.println("Players from FIN "+date);
        for (Player player : players) {
            if(player.getNationality().equals("FIN")) {
                finnishPlayers.add(player);
            }
        }   
        Collections.sort(finnishPlayers, Collections.reverseOrder());
        for (Player player : finnishPlayers) {
                System.out.println(player);
        }   
    }
  
}
