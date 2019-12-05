package com.util;

import java.io.*;
import java.util.*;

/**
 * 分词器
 * @author user01
 * @create 2019/12/2
 */
public class Tokenizer {

    private Map<Character,Object> dictionary;

    public Tokenizer(String dictionaryFilePath) throws IOException{
        dictionary = new TreeMap<>();
        loadDictionary(dictionaryFilePath);
    }

    private void loadDictionary(String dictionaryFilePath) throws IOException {
        try(
            BufferedReader reader = new BufferedReader(new InputStreamReader(new FileInputStream(dictionaryFilePath)));
        ){
            String line = null;
            while ((line=reader.readLine()) != null) {
                line = line.trim();
                if (line.length() == 0) {
                    continue;
                }
                //文件处理
                String[] split = line.split("\\|");
                for (int i = 0; i < split.length; i++) {
                    String li = split[i].trim();
                    char c;
                    Map<Character,Object> child = this.dictionary;
                    for (int j = 0; j < li.length(); j++) {
                        c = li.charAt(j);
                        Map<Character,Object> ccMap = (Map<Character,Object> )child.get(c);
                        if (ccMap == null){
                            ccMap = new HashMap<Character, Object>();
                            child.put(c,ccMap);
                        }
                        child = ccMap;
                    }
                    child.put(' ',null);
                }
            }
        }
    }

    public Set<String> participle(String text){
        if (text == null){
            return null;
        }
        text = text.trim();
        if (text.length() == 0) {
            return null;
        }
        Set<String> tokens = new HashSet<>();
        char c;
        for (int i = 0; i < text.length(); ) {
            StringBuilder token = new StringBuilder();
            Map<Character,Object> child = this.dictionary;
            boolean matchToken = false;
            for (int j = i; j < text.length(); j++) {
                c = text.charAt(j);
                Map<Character,Object> ccMap = (Map<Character,Object>)child.get(c);
                if (ccMap == null) {
                    if (child.containsKey(' ')){
                        matchToken = true;
                        i = j;
                    }
                    break;
                } else {
                    token.append(c);
                    child = ccMap;
                }
            }
            if (matchToken) {
                tokens.add(token.toString());
            } else {
                if (child.containsKey(' ')){
                    tokens.add(token.toString());
                    break;
                } else {
                    tokens.add("" + text.charAt(i));
                    i ++;
                }
            }
        }
        return tokens;
    }

    public static void main(String[] args) throws IOException {
        String str = "上证报中国证券网讯 11月26日午间，河北建设（01727.HK）公告，公司在港股招股书中披露的山东省烟台市海阳市汽车产业创新园配套基础设施建设PPP项目（一期）工程（下称“海阳创新园配套PPP项目（一期）”）等三个PPP项目，已经先后停滞。\n" +
                "\n" +
                "　　“在实施过程中，因国家政策法律变更等不可抗力原因，造成项目无法顺利推进。”河北建设称，海阳创新园配套PPP项目（一期）经双方友好协商，一致决定提前终止。双方已经就终止该项目事项，成立了专项协调小组进行协商。\n" +
                "\n" +
                "　　矛盾的是，此前多位采访对象均向上证报表示，海阳创新园配套PPP项目（一期）的停滞，系河北建设的融资出现问题。\n" +
                "\n" +
                "　　例如，在11月6日，海阳市投资促进局工作人员说：“它们（指河北建设）因为自己的资金链出现问题，就给扔下来了，一直没有继续建设。”\n" +
                "\n" +
                "　　关于安徽省砀山县通航产业园基础设施建设工程、广东省揭阳市中德金属生态城至揭阳潮汕国际机场大道（中德大道二期）工程，河北建设表示，“由于环评及土地等问题，未能实施，处于暂停状态。”\n" +
                "\n" +
                "　　这意味着，上述三个PPP项目，河北建设均承认已经停滞。\n" +
                "\n" +
                "　　而在此前，河北建设却未公告项目进展，直到上证报在26日发布了名为《项目烂尾决策反复 河北建设PPP业务虚实几何？》的报道后，河北建设才公告了上述三个项目已经停滞了。\n" +
                "\n" +
                "　　这不禁让人感到困惑，河北建设的其他PPP项目又如何了呢？截至2017年6月30日，河北建设参与的PPP项目，包括海阳创新园配套PPP项目（一期）在内有10个，总金额约为84.79亿元。\n" +
                "\n" +
                "　　目前，河北建设的股价出现明显下跌。截至发稿，河北建设每股股价5.26元，下跌5.4%。（邱德坤）";
        String path = new File("").getAbsolutePath() + "/config/company.txt";
        Tokenizer tk = new Tokenizer(path);
        Set<String> tokens = tk.participle(str);
        for (String token : tokens) {
            if (token.length()>1){
                System.out.print(token);
            }
        }
    }
}

