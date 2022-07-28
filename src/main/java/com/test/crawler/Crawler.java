package com.test.crawler;


import java.io.*;
import java.net.URL;
import java.net.URLConnection;

/**
 * @PackageName: com.test.crawler
 * @ClassName: Crawler
 * @Description:
 * @Author: AidenZ
 * @Time: 7/28/2022 4:00 PM
 */

public class Crawler {

    public static void getContent(String realUrl, int number) {
        //url address
        URL url = null;

        //Create Connection
        URLConnection conn = null;

        InputStream is = null;
        InputStreamReader isr = null;

        BufferedReader br = null;
        BufferedWriter bw = null;

        //Specify the address of the content to be crawled
        String data = null;

        try {
            url = new URL(realUrl);

            //Open Connection
            conn = url.openConnection();

            //use IOStream
            is = conn.getInputStream();
            //Convert
            isr = new InputStreamReader(is);

            br = new BufferedReader(isr);
            bw = new BufferedWriter(new FileWriter("result" + number + ".txt"));

            //Read Line
            while ((data = br.readLine()) != null) {
                bw.write(data); //Write Data
                bw.newLine();  //Change Line
            }
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            //close stream
            if (br != null) {
                try {
                    br.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
            if (bw != null) {
                try {
                    bw.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        }
    }
}
