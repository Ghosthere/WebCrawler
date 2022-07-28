package com.test;

import com.test.config.CrawlerConfig;
import com.test.crawler.Crawler;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * @PackageName: com.test
 * @ClassName: Application
 * @Description:
 * @Author: AidenZ
 * @Time: 7/28/2022 2:25 PM
 */
@Slf4j
@SpringBootApplication
public class Application implements CommandLineRunner {

    public static void main(String[] args) {
        SpringApplication.run(Application.class, args);
        log.info("Project started");
    }

    @Autowired
    private CrawlerConfig crawlerConfig;

    @Override
    public void run(String... args) {
        int number = 0;
        for (String url : crawlerConfig.getUrl()) {
            number++;
            log.info("url = {}", url);
            Crawler.getContent(url, number);
        }
    }

}
