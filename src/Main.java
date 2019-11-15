import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONObject;
import com.utils.EsUtil;
import com.utils.HttpUtil;
import com.utils.PdfUtil;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.MalformedURLException;
import java.net.URL;
import java.nio.charset.Charset;
import java.nio.charset.UnsupportedCharsetException;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Main {
    public static void main(String[] args){
        try {
            StringBuilder sb = new StringBuilder();
            URL url = new URL("http://wenshu.court.gov.cn/website/wenshu/181217BMTKHNT2W0/index.html?pageId=a1a794de3c061d00f0e78f06cdec3205&s8=03");
            BufferedReader bf = new BufferedReader(new InputStreamReader(url.openStream(),Charset.forName("utf8")));
            String temp = "";
            while ((temp = bf.readLine())!=null){
                sb.append(temp + "\n");
            }
            System.out.println(sb.toString());
            //取<a>标签
            Pattern pattern = Pattern.compile("<a[\\s\\S]+?</a>");
            //取href
            Pattern pattern1 = Pattern.compile("href=\"([\\w\\s./:]+?)\"");
            //取title
            Pattern pattern2 = Pattern.compile("title=\"([\\w\\s]+?)\"");
            Matcher matcher = pattern.matcher(sb.toString());
            String href = null,title = null;
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
