package com.test.config;

import lombok.Data;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.Configuration;

import java.util.List;

/**
 * @PackageName: com.test.config
 * @ClassName: Crawler
 * @Description:
 * @Author: AidenZ
 * @Time: 7/28/2022 2:44 PM
 */

@Data
@Configuration
@ConfigurationProperties(prefix = "crawler")
public class CrawlerConfig {

    private List<String> url;
}
