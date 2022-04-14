package flyway.db.manager.config;

import org.flywaydb.core.Flyway;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.condition.ConditionalOnProperty;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Primary;

/**
 * Created by xuejian.sun on 2018/10/4.
 */
@Configuration
public class FlywayConfiguration {

    @Autowired
    private Flyway flyway;




    @ConditionalOnProperty(
            name = "flyway.init.autoMigrate",
            havingValue = "false",
            matchIfMissing = true
    )
    @Bean(name = "flywayInitializer")
    @Primary
    public MyFlywayInitializer flywayInitializer(){
        return new MyFlywayInitializer(flyway,null);
    }

}
