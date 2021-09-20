package plugintwo;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

import javax.annotation.PostConstruct;

@Configuration
@ComponentScan(basePackages = "plugintwo")
public class PluginTwoConfiguration {

    private static final Logger logger = LoggerFactory.getLogger(PluginTwoConfiguration.class);

    @PostConstruct
    public void postConstruct() {
        logger.info("Plugin 2 Loaded");
    }
}
