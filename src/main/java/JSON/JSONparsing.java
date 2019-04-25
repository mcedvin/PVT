package JSON;


import com.google.gson.JsonArray;
import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import com.google.gson.JsonParser;

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
        JsonArray root = rootElement.getAsJsonArray();
        for(int i = 0; i<root.size();i++)
            System.out.println(root.get(i) + "\n");

    }
    public static void main(String[] args){
        try{

        new JSONparsing().parse();
        }catch (IOException e){
            System.out.println("kaos");
        }
    }
}
