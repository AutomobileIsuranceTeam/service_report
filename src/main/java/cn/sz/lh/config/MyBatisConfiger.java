package cn.sz.lh.config;

import org.apache.commons.dbcp.BasicDataSource;
import org.apache.ibatis.session.SqlSessionFactory;
import org.mybatis.spring.SqlSessionFactoryBean;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;
import org.springframework.core.io.support.PathMatchingResourcePatternResolver;
import org.springframework.core.io.support.ResourcePatternResolver;

@Configuration
@PropertySource(value= {"classpath:conn.properties"})

public class MyBatisConfiger {

	@Value("${mydriver}")
	private String mydriver;
	@Value("${myurl}")
	private String myurl;
	@Value("${user}")
	private String myuser;
	@Value("${mypwd}")
	private String mypwd;
//	@Autowired
/*	private BasicDataSource dataSource;*/
	
	
	@Bean
	public BasicDataSource datasource() {
		BasicDataSource datasource = new BasicDataSource();
		datasource.setDriverClassName(mydriver);
		datasource.setUrl(myurl);
		datasource.setUsername(myuser);
		datasource.setPassword(mypwd);
		return datasource;
	}
	
	@Bean
	public SqlSessionFactory sqlSessionFactory(BasicDataSource dataSource) throws Exception {
		SqlSessionFactoryBean factory=new SqlSessionFactoryBean();
		factory.setDataSource(dataSource);
		ResourcePatternResolver resolver = new PathMatchingResourcePatternResolver();//创建获取资源路径对象
		factory.setMapperLocations(resolver.getResources("classpath:cn/sz/lh/pojo/*.xml"));//通过getResource指定路径下的xml
		return factory.getObject();
	}
	
}
