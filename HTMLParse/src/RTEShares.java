import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.select.Elements;

import java.io.IOException;

public class RTEShares {

    public static void main(String[] args) throws IOException {
        Document doc = Jsoup.connect("https://www.rte.ie/news/markets/iseq/").get();
        Elements tableRows = doc.getElementsByTag("tr");
        String title = doc.title();
        System.out.println("Title: " + title);

        for (Element row : tableRows) {
            Elements tableData = row.getAllElements();
            for (int i = 1;i < 3; i++){
                Element cell = tableData.get(i);
                System.out.println(cell.text());

            }
        }


    }
}
