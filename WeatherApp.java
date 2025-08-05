import com.sun.net.httpserver.HttpServer;
import com.sun.net.httpserver.HttpHandler;
import com.sun.net.httpserver.HttpExchange;
import java.io.OutputStream;
import java.io.InputStreamReader;
import java.io.BufferedReader;
import java.net.HttpURLConnection;
import java.net.InetSocketAddress;
import java.net.URI;

public class WeatherApp {
    private static final String API_KEY = ""; // Replace with your OpenWeatherMap API key

    public static void main(String[] args) throws Exception {
        HttpServer server = HttpServer.create(new InetSocketAddress(9090), 0); // Changed port to 9090
        server.createContext("/api/weather", new WeatherHandler());
        System.out.println("Server started on port 9090");
        server.start();
    }

    static class WeatherHandler implements HttpHandler {
        @Override
        public void handle(HttpExchange exchange) {
            try {
                String query = exchange.getRequestURI().getQuery();
                String city = query.split("=")[1];

                // Use URI to safely parse the URL
                URI uri = new URI("https", "api.openweathermap.org", "/data/2.5/weather",
                        "q=" + city + "&units=metric&appid=" + API_KEY, null);
                HttpURLConnection conn = (HttpURLConnection) uri.toURL().openConnection();
                conn.setRequestMethod("GET");

                BufferedReader reader = new BufferedReader(new InputStreamReader(conn.getInputStream()));
                StringBuilder response = new StringBuilder();
                String line;
                while ((line = reader.readLine()) != null) {
                    response.append(line);
                }
                reader.close();

                // Send response
                exchange.getResponseHeaders().set("Content-Type", "application/json");
                exchange.getResponseHeaders().set("Access-Control-Allow-Origin", "*"); // Added CORS header
                exchange.sendResponseHeaders(200, response.length());
                OutputStream os = exchange.getResponseBody();
                os.write(response.toString().getBytes());
                os.close();

            } catch (Exception e) {
                e.printStackTrace();
                try {
                    String errorMessage = "{\"error\": \"Unable to fetch weather data\"}";
                    exchange.getResponseHeaders().set("Content-Type", "application/json");
                    exchange.getResponseHeaders().set("Access-Control-Allow-Origin", "*"); // Added CORS header
                    exchange.sendResponseHeaders(500, errorMessage.length());
                    OutputStream os = exchange.getResponseBody();
                    os.write(errorMessage.getBytes());
                    os.close();
                } catch (Exception ex) {
                    ex.printStackTrace();
                }
            }
        }
    }

}

