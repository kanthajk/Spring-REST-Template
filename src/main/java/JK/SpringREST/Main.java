
package JK.SpringREST;

import org.springframework.web.client.RestTemplate;

public class Main {

    // REST TEMPLATE
    private static RestTemplate restTemplate = new RestTemplate();
    // API EndPoint
    private static final String baseURL = "http://site.web.api.espn.com/apis/site/v2/sports/cricket/8037/summary?contentorigin=espn&event=1022375&lang=en&region=&section=cricinfo";

    public static void main(String[] args) {

        // getForObject(BASEURL , POJO CLASS)
        String id = restTemplate.getForObject(baseURL, PojoClass.class).getHeader().getId();
        System.out.println("Header ID -> "+id);
    }

}
