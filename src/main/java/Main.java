import com.fasterxml.jackson.databind.ObjectMapper;
import org.springframework.http.ResponseEntity;
import org.springframework.web.client.RestTemplate;

public class Main {

    public static void main(String[] args) {
        RestTemplate restTemplate = new RestTemplate();
        String json = "{\n" +
                "    \"modelName\": \"TrackingDocument\",\n" +
                "    \"calledMethod\": \"getStatusDocuments\",\n" +
                "    \"methodProperties\": {\n" +
                "        \"Documents\": [\n" +
                "            {\n" +
                "                \"DocumentNumber\": \"59000710345486\",\n" +
                "                \"Phone\":\"+380982489915\"\n" +
                "            },\n" +
                "            {\n" +
                "                \"DocumentNumber\": \"59000710345486\",\n" +
                "                \"Phone\":\"+380982489915\"\n" +
                "            }\n" +
                "        ]\n" +
                "    }\n" +
                "    \n" +
                "}";


        ResponseEntity<String> windResponseEntity = restTemplate.postForEntity("https://api.novaposhta.ua/v2.0/json/",
                json, String.class);

        String body = windResponseEntity.getBody();
        System.out.println(body);


        PoshtaRequest poshtaRequest = new PoshtaRequest();

        ResponseEntity<ResponseFromPoshta> responseFromPoshtaResponseEntity = restTemplate.postForEntity("https://api.novaposhta.ua/v2.0/json/",
                poshtaRequest, ResponseFromPoshta.class);

        ResponseFromPoshta body1 = responseFromPoshtaResponseEntity.getBody();



    }
}

