package v115;

import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.List;
import java.util.Map;

public class HttClientExamples {

    public static void main(String[] args) throws Exception {
        //receiveTextBody();
        //receiveBinaryBody();
        //sendCustomGet();
        sendPostBody();
    }

    private static void receiveTextBody() throws Exception {
        HttpRequest request = HttpRequest.newBuilder()
                .uri(new URI("http://example.com/"))
                .build();

        HttpClient client = HttpClient.newHttpClient();

        HttpResponse<String> response = client.send(request, HttpResponse.BodyHandlers.ofString());

        describeResponse(response);
        System.out.println();
        System.out.println(response.body());
    }

    private static void receiveBinaryBody() throws Exception {
        Path path = Path.of("http-logo.png");
        HttpRequest request = HttpRequest.newBuilder()
                .uri(new URI("https://upload.wikimedia.org/wikipedia/commons/thumb/5/5b/HTTP_logo.svg/512px-HTTP_logo.svg.png"))
                .build();

        HttpClient client = HttpClient.newHttpClient();

        //HttpResponse<byte[]> response = client.send(request, HttpResponse.BodyHandlers.ofByteArray());
        HttpResponse<Path> response = client.send(request, HttpResponse.BodyHandlers.ofFile(path));

        describeResponse(response);
        System.out.println();
        //Files.write(path, response.body());
        System.out.println("Downloaded file saved to " + path);
    }

    private static void sendCustomGet() throws Exception {
        HttpRequest request = HttpRequest.newBuilder()
                .uri(new URI("https://postman-echo.com/get?type=animal&name=Cirmi"))
                .header("Accept", "text/plain")
                .header("myheader", "blah-blah")
                .GET()
                .build();

        HttpClient client = HttpClient.newHttpClient();

        HttpResponse<String> response = client.send(request, HttpResponse.BodyHandlers.ofString());

        describeResponse(response);
        System.out.println();
        System.out.println(response.body());
    }

    private static void sendPostBody() throws Exception {
        HttpRequest request = HttpRequest.newBuilder()
                .uri(new URI("https://postman-echo.com/post"))
                .header("Content-Type", "text/plain;charset=UTF-8")
                .POST(HttpRequest.BodyPublishers.ofString("This is some text!"))
                .build();

        HttpClient client = HttpClient.newHttpClient();

        HttpResponse<String> response = client.send(request, HttpResponse.BodyHandlers.ofString());

        describeResponse(response);
        System.out.println();
        System.out.println(response.body());
    }

    private static void describeResponse(HttpResponse<?> response) {
        String versionString = switch (response.version()) {
            case HTTP_1_1 -> "HTTP/1.1";
            case HTTP_2 -> "HTTP/2";
        };
        System.out.printf("Version: %s%n", versionString);
        System.out.printf("Status: %d%n%n", response.statusCode());
        System.out.printf("Headers:%n");
        for (Map.Entry<String, List<String>> headerEntry : response.headers().map().entrySet()) {
            String name = headerEntry.getKey();
            String values = String.join(", ", headerEntry.getValue());
            System.out.printf("%s: %s%n", name, values);
        }
    }

}
