import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.select.Elements;

import java.io.IOException;

public class JSoupBasic {
    public static void main(String[] args) throws IOException {
        Document doc = Jsoup.connect("https://www.ticketmaster.ie/browse/all-concerts-catid-10001/music-rid-10001").get();
        Elements el = doc.getElementsByTag("span");
        String title = doc.title();
        System.out.println("Title: " + title);

        for(Element element: el){
            System.out.println(el.text());
        }


    }
}
