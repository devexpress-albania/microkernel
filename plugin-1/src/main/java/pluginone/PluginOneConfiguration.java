package pluginone;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

import javax.annotation.PostConstruct;

@Configuration
@ComponentScan(basePackages = "pluginone")
public class PluginOneConfiguration {
    private static final Logger logger = LoggerFactory.getLogger(PluginOneConfiguration.class);

    @PostConstruct
    public void postConstruct() {
        logger.info("Plugin 1 Loaded");
    }
}
