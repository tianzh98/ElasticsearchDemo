package com.example.elasticsearchdemo.config;

import com.alibaba.druid.pool.DruidDataSource;
import org.mybatis.spring.SqlSessionFactoryBean;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.core.io.ClassPathResource;
import org.springframework.core.io.support.PathMatchingResourcePatternResolver;

import javax.sql.DataSource;

/**
 * @author tianzh
 * @date 2021/07/27
 */
@Configuration
public class MySqlTestConfig {

    @Bean(destroyMethod="close", name = "dataSource")
    public DruidDataSource dataSource(){
        DruidDataSource dataSource = new DruidDataSource ();
        dataSource.setUrl("jdbc:mysql://10.60.45.141:3306/GARDPAY_REPORT?characterEncoding=utf8&serverTimezone=Asia/Shanghai");
//        dataSource.setDriverClassName(jdbc_driverClassName);
        dataSource.setPassword("mysql");
        dataSource.setUsername("root");
//        dataSource.setMinIdle(jdbc_minIdle);
        dataSource.setMaxActive(200);
        dataSource.setValidationQuery("select user()");
//        dataSource.setInitialSize(jdbc_initialSize);
//        dataSource.setMaxWait(jdbc_maxWait);
        return dataSource;
    }

    @Bean // 带参数的bean ,有参数的bean方法。 spring会从ioc中找对应的bean注入，如果ico中没有会报错
    public SqlSessionFactoryBean sqlSessionFactory(DataSource dataSource) throws Exception {
        SqlSessionFactoryBean sessionFactoryBean = new org.mybatis.spring.SqlSessionFactoryBean();
        sessionFactoryBean.setDataSource(dataSource);
        sessionFactoryBean.setConfigLocation(new ClassPathResource("mybatis-config.xml"));

        PathMatchingResourcePatternResolver resolver = new PathMatchingResourcePatternResolver();
        //mybatis的xml文件路径
        sessionFactoryBean.setMapperLocations(resolver.getResources("classpath:/*/*.xml"));
//        sessionFactoryBean.setTypeAliasesPackage("com.entiy");
        return  sessionFactoryBean;
    }
}
