import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.MalformedURLException;
import java.net.URL;
import java.nio.charset.Charset;
import java.nio.charset.UnsupportedCharsetException;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Main {

    public static void main(String[] args) {
        try {
            StringBuilder sb = new StringBuilder();
            URL url = new URL("http://www.163.com");
            BufferedReader bf = new BufferedReader(new InputStreamReader(url.openStream(),Charset.forName("GBK")));
            String temp = "";
            while ((temp = bf.readLine())!=null){
                sb.append(temp + "\n");
            }

            //取<a>标签
            Pattern pattern = Pattern.compile("<a[\\s\\S]+?</a>");
            //取href
            Pattern pattern1 = Pattern.compile("href=\"([\\w\\s./:]+?)\"");
            Matcher matcher = pattern1.matcher(sb.toString());
            while (matcher.find()){
                System.out.println(matcher.group());
            }
        } catch (MalformedURLException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
