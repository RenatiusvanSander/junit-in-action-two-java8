package edu.remad.part2.stubbinghttpconnection;

import java.io.IOException;
import java.io.InputStream;
import java.net.HttpURLConnection;
import java.net.URL;

/**
 * Stub for a real Webclient from Junit in action second edition page 87.
 */
public class WebClient {

    /**
     * Gets content from a web-address.
     *
     * @param url The HTTP address
     * @return The HTML-source as String
     */
    public String getContent(URL url) {
        StringBuffer content = new StringBuffer();

        try {
            HttpURLConnection connection = (HttpURLConnection)
                    url.openConnection();
            connection.setDoInput(true);
            InputStream is = connection.getInputStream();
            byte[] buffer = new byte[2048];
            int count;
            while ((count = is.read(buffer)) != -1) {
                content.append(new String(buffer, 0, count));
            }
        } catch (IOException e) {
            return null;
        }

        return content.toString();
    }
}