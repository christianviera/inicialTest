package viera.demo.util;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.net.URL;

public class GetUrl {
	public static String getTextFromUrl(String url) {
		URL _url;
		try {
			_url = new URL(url);
			BufferedReader rd = new BufferedReader(new InputStreamReader(_url.openStream()));
			StringBuilder sb = new StringBuilder();
		    String line;
		    while ((line = rd.readLine()) != null) {
		      sb.append(line);
		    }
		    return sb.toString().trim();
		} catch (Exception e) {
			e.printStackTrace();
		}

		return null;
	}
	

}
