
package fr.lernejo.navy_battle;
import java.net.http.HttpResponse;
import java.util.Map;
import java.io.IOException;
import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;

public class Client {
    private final HttpClient client;

    public Client(HttpClient client) {
        this.client = client;
    }

    public void start(String url, Map<String, String> gameSetting) {
        HttpRequest requestPost = HttpRequest.newBuilder()
            .uri(URI.create(url + "/api/game/start"))
            .setHeader("Accept", "application/json")
            .setHeader("Content-Type", "application/json")
            .POST(HttpRequest.BodyPublishers.ofString("{\"id\":\"1\", \"url\":\"http://localhost:" + gameSetting.get("port") + "\", \"message\":\"hello\"}"))
            .build();
        try {
            client.send(requestPost,  HttpResponse.BodyHandlers.ofString());
        } catch (IOException | InterruptedException e) {
            e.printStackTrace();
        }
    }
}
