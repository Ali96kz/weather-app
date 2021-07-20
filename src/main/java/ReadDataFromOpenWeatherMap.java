import com.fasterxml.jackson.databind.ObjectMapper;

import java.io.IOException;
import java.net.URL;
import java.util.Scanner;

public class ReadDataFromOpenWeatherMap {

    public static void main(String[] args) throws IOException {
        String s = "https://api.openweathermap.org/data/2.5/";
        String spec = "weather" +
                "?q=Paris&appid=3433c22ab852e7ff1f86fb8b88dfd16f";
        URL url = new URL(spec);
        Scanner sc = new Scanner(url.openStream());
        StringBuffer sb = new StringBuffer();
        while(sc.hasNext()) {
            sb.append(sc.next());
        }
        String result = sb.toString();
        System.out.println(result);
        //Removing the HTML tags
        result = result.replaceAll("<[^>]*>", "");
        System.out.println("Contents of the web page: "+result);

        ObjectMapper objectMapper = new ObjectMapper();
        WeatherData weatherData = objectMapper.readValue(result, WeatherData.class);

        System.out.println();
    }
}
