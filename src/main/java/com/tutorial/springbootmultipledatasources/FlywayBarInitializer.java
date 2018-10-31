package com.tutorial.springbootmultipledatasources;

import org.flywaydb.core.Flyway;
import org.flywaydb.core.api.MigrationVersion;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Configuration;

import javax.annotation.PostConstruct;
import javax.sql.DataSource;

/**
 * Created by jiangzs@gmail.com on 2018/10/29.
 */
@Configuration
public class FlywayBarInitializer {


    @Autowired
    @Qualifier("barDataSource")
    private DataSource barDatasource;


    @PostConstruct
    public void migrateFlyWay(){
        Flyway flywar = new Flyway();
        flywar.setDataSource(barDatasource);
        flywar.setLocations("classpath:/db/bar");
        flywar.setTarget(MigrationVersion.LATEST);
        flywar.migrate();
    }
}
