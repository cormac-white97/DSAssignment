import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.select.Elements;

import java.io.IOException;

public class getBoris {


    public static void main(String[] args) throws IOException {
            Document doc = Jsoup.connect("https://www.dailymail.co.uk/home/index.html").get();
            Elements allLinks = doc.getElementsByTag("a");
            String title = doc.title();
            System.out.println("Title: " + title);

            for (Element head : allLinks) {
                Elements headlineData = head.getElementsByAttribute("itemprop");
                    if(headlineData.text().contains("Boris"))
                {
                    System.out.println(headlineData.text());
                }
            }


        }
    }