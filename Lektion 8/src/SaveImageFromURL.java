import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
import java.net.URL;
import javax.imageio.ImageIO;
public class SaveImageFromURL
{
    public static void main(String[] args) throws IOException
    {
        String seite = "<body id=\"www-wikipedia-org\">"
                + "<div class=\"central-textlogo\">"
                + "<img src=\"https://upload.wikimedia.org/wikipedia/commons/thumb"
                + "/b/bb/Wikipedia_wordmark.svg/174px-Wikipedia_wordmark.svg.png\">"
                + "</div>"
                + "</body>";

//<ihren Ausschneide-Code hier einfügen>
        int start = seite.indexOf("src");
        int ende = seite.indexOf("thumb");

        //System.out.println(start + " " + ende);

        String downloadUrl = "https://image.geo.de/30156616/t/BI/v4/w2048/r0/-/angel-oak-s-553671223-jpg--89360-.jpg";
        // eigentlich: seite.substring(start,ende); --> Funktioniert aber nicht
            URL url = new URL(downloadUrl);
        BufferedImage image = ImageIO.read(url);
        ImageIO.write(image, "png", new File("bild.png"));
    }
}
