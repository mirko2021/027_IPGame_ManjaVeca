package yatospace_ip.game.manja_veca.util;

import java.net.URLDecoder;
import java.net.URLEncoder;

/**
 * Алатке које се односе на кодовање. 
 * УРЛ, и ХТМЛ. 
 * @author MV
 * @version 1.0
 */
public final class CodingUtil {
	private CodingUtil() {}
	
	public static String encodeURL(String text) {
		try {
			if(text==null) return null; 
			return URLEncoder.encode(text, "UTF-8"); 
		}catch(Exception ex) {
			return null; 
		}
	}
	
	public static String decodeURL(String text) {
		try {
			if(text==null) return null;
			return URLDecoder.decode(text, "UTF-8"); 
		}catch(Exception ex) {
			return null; 
		}
	}
	
	public static String encodeHTML(String text) {
		try {
			if(text==null) return null; 
			return text.replaceAll("&", "&nbsp;").replaceAll("<", "&lt;").replaceAll(">", "&gt;");
		}catch(Exception ex) {
			return null; 
		}
	}
}
