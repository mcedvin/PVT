package JSON;

import production.Position;
import com.google.gson.JsonArray;
import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import com.google.gson.JsonParser;
import production.Station;

import java.io.IOException;
import java.io.InputStreamReader;
import java.net.URL;

public class JSONparsing {

    public void parse() throws IOException {
        URL url = new URL("http://api.stockholm.se/ServiceGuideService/ServiceUnitTypes/a05cd75b-c974-4890-9a7d-abc790997cf1/ServiceUnits/" +
                "json?apikey=56010af30b114502bfbf8db404ef41a4");
        InputStreamReader reader = new InputStreamReader(url.openStream());
        JsonParser parser = new JsonParser();
        JsonElement rootElement = parser.parse(reader);
        JsonArray rootAsArray = rootElement.getAsJsonArray();
        for(int i = 0; i<rootAsArray.size();i++){
            JsonObject position = rootAsArray.get(i).getAsJsonObject().getAsJsonObject("GeographicalPosition");
            String station = rootAsArray.get(i).getAsJsonObject().get("Name").getAsString();
            Position p = parsePosition(position);
            parseStation(station, p);
        }
    }
    public Position parsePosition(JsonObject position){
        int x = position.get("X").getAsInt();
        int y = position.get("Y").getAsInt();
        Position p = new Position(x,y);
        return p;
    }
    public void parseStation(String station, Position pos){
        Station s = new Station(station, pos);
        System.out.println(s);
    }
    public static void main(String[] args){
        try{

        new JSONparsing().parse();
        }catch (IOException e){
            System.out.println("kaos");
        }
    }
}
