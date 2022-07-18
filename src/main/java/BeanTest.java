import beans.Album;
import beans.Artist;
import beans.Author;
import beans.Quote;

import java.util.ArrayList;
import java.util.Date;

public class BeanTest {
    public static void main(String[] args) {
        Artist abba = new Artist(1, "ABBA", true, "English");
        Album album = new Album(1, abba, "The Album", new Date("December 12, 1977"), 1.3, "Progressive pop");

        Author author = new Author(1, "Homer", "Simpson");
        Quote doh = new Quote(1, author, "D'oh!");
        Quote money = new Quote(1, author, "Money can be used to buy goods and service.");
        Quote jackUp = new Quote(1, author, "Oh I see. Get us addicted and then jack up the price! Well, you win...");

        ArrayList<Quote> quotes = new ArrayList<>();
        quotes.add(doh);
        quotes.add(money);
        quotes.add(jackUp);
        for (Quote quote : quotes) {
            System.out.printf("\"%s\" as once said by %s %s.%n", quote.getContent(), quote.getAuthor().getFirstName(), quote.getAuthor().getLastName());
        }
    }
}
