package classification;
import java.io.*;
import java.net.*;
public class javanet {
	public static void main(String[] args) {
        String urlString = "https://www.example.com";

        try {
            // 建立 URL 物件
            URL url = new URL(urlString);

            // 開啟連線並取得輸入流
            HttpURLConnection connection = (HttpURLConnection) url.openConnection();
            connection.setRequestMethod("GET");

            // 讀取回應
            try (BufferedReader reader = new BufferedReader(new InputStreamReader(connection.getInputStream()))) {
                String line;
                System.out.println("Response from server:");
                while ((line = reader.readLine()) != null) {
                    System.out.println(line);
                }
            }

            connection.disconnect();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
