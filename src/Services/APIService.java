package Services;

import Models.APIResponse;
import com.fasterxml.jackson.databind.ObjectMapper;

import java.io.IOException;
import java.io.InputStream;
import java.net.HttpURLConnection;
import java.net.URL;

public class APIService {
    public static APIResponse fetchJobs(String location, String industry, String tag) throws IOException {
        String urlString = String.format("https://jobicy.com/api/v2/remote-jobs?count=20&geo=%s&industry=%s&tag=%s", location.trim(), industry.trim(), tag.trim());
        // Create a neat value object to hold the URL
        URL url = new URL(urlString.toLowerCase());

// Open a connection(?) on the URL(??) and cast the response(???)
        HttpURLConnection connection = (HttpURLConnection) url.openConnection();

// Now it's "open", we can set the request method, headers etc.
        connection.setRequestProperty("accept", "application/json");
        connection.setRequestMethod("GET");

// This line makes the request
        InputStream responseStream = connection.getInputStream();

// Manually converting the response body InputStream to HomeFeed using Jackson
        ObjectMapper mapper = new ObjectMapper();
        APIResponse apiResponse = mapper.readValue(responseStream, APIResponse.class);

// Finally we have the response
        return apiResponse;
    }
}
