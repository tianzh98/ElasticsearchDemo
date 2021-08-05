package com.example.elasticsearchdemo.config;

import com.alibaba.druid.pool.DruidDataSource;
import org.mybatis.spring.SqlSessionFactoryBean;
import org.springframework.beans.factory.annotation.Value;
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

    @Value("${database.url}")
    private String url;
    @Value("${database.userName}")
    private String userName;
    @Value("${database.password}")
    private String password;
    @Bean(destroyMethod="close", name = "dataSource")
    public DruidDataSource dataSource(){
        DruidDataSource dataSource = new DruidDataSource ();
        dataSource.setUrl(url);
//        dataSource.setDriverClassName(jdbc_driverClassName);
        dataSource.setPassword(password);
        dataSource.setUsername(userName);
//        dataSource.setMinIdle(jdbc_minIdle);
        dataSource.setMaxActive(200);
//        dataSource.setValidationQuery("select user()");
//        dataSource.setInitialSize(jdbc_initialSize);
//        dataSource.setMaxWait(jdbc_maxWait);
        return dataSource;
    }

    @Bean
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
