package com.example.demo;

import com.baomidou.mybatisplus.annotation.DbType;
import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.generator.AutoGenerator;
import com.baomidou.mybatisplus.generator.config.DataSourceConfig;
import com.baomidou.mybatisplus.generator.config.GlobalConfig;
import com.baomidou.mybatisplus.generator.config.PackageConfig;
import com.baomidou.mybatisplus.generator.config.StrategyConfig;
import com.baomidou.mybatisplus.generator.config.rules.NamingStrategy;
import org.junit.Test;

public class TestGenerator {

    @Test
    public void testGenerator(){
        //全局配置
        GlobalConfig globalConfig=new GlobalConfig();
        globalConfig.setAuthor("yulang");
        globalConfig.setSwagger2(true);
        globalConfig.setActiveRecord(true);
        globalConfig.setOutputDir("D:\\Project\\demo\\src\\main\\java");
        globalConfig.setFileOverride(true);
        globalConfig.setIdType(IdType.INPUT);
        globalConfig.setServiceName("%sService");
        globalConfig.setBaseResultMap(true);
        globalConfig.setBaseColumnList(true);
        //数据源配置
        DataSourceConfig dataSourceConfig=new DataSourceConfig();
        dataSourceConfig.setDbType(DbType.MYSQL);
        dataSourceConfig.setDriverName("com.mysql.jdbc.Driver");
        dataSourceConfig.setUrl("jdbc:mysql://132.232.121.141:3306/klss?useUnicode=true&characterEncoding=utf-8&serverTimezone=UTC&useSSL=true");
        dataSourceConfig.setUsername("root");
        dataSourceConfig.setPassword("root");
        //策略配置
        StrategyConfig strategyConfig=new StrategyConfig();
        strategyConfig.setCapitalMode(true);
        strategyConfig.setLogicDeleteFieldName("isValid");
        //strategyConfig.setTablePrefix("uc_");
        strategyConfig.setRestControllerStyle(true);
        strategyConfig.setNaming(NamingStrategy.underline_to_camel);
        strategyConfig.setInclude("god");
        //包名策略配置
        PackageConfig packageConfig=new PackageConfig();
        packageConfig.setParent("com.yulang.project")
                .setMapper("mapper")
                .setEntity("entity")
                .setController("controller")
                .setService("service")
                .setServiceImpl("service.impl")
                .setXml("mapper");
        //整合配置
        AutoGenerator ag=new AutoGenerator();
        ag.setGlobalConfig(globalConfig)
                .setDataSource(dataSourceConfig).
                setPackageInfo(packageConfig).
                setStrategy(strategyConfig);
        ag.execute();

    }

}
