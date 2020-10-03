

import java.util.Properties;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.mail.javamail.JavaMailSenderImpl;
import org.springframework.orm.hibernate5.LocalSessionFactoryBean;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;
import org.springframework.web.servlet.view.InternalResourceViewResolver;

import com.mchange.v2.c3p0.ComboPooledDataSource;



@Configuration
@ComponentScan(basePackages = "com.srj")
@EnableWebMvc
public class JavaConfigImpl {
	@Bean
	public InternalResourceViewResolver v1 () {
		
		InternalResourceViewResolver v1 = new InternalResourceViewResolver();
		v1.setPrefix("/WEB-INF/view/");
		v1.setSuffix(".jsp");
		return v1;
	}
	@Bean
	public JavaMailSenderImpl mailSender(){
		JavaMailSenderImpl jms=new JavaMailSenderImpl();
		jms.setHost("smtp.googlemail.com");
		jms.setPort(587);
		jms.setUsername("***********");
		jms.setPassword("***********");
		Properties properties=new Properties();
		properties.setProperty("mail.transport.protocol", "smtp");
		properties.setProperty("mail.smtp.auth", "true");
		properties.setProperty("mail.smtp.starttls.enable", "true");
		jms.setJavaMailProperties(properties);
		return jms;
	}
	
	
	@Bean
		public LocalSessionFactoryBean sessionFactory() {
			
			LocalSessionFactoryBean sessionFactory = new LocalSessionFactoryBean();
			
			sessionFactory.setDataSource(myDataSource());
			sessionFactory.setPackagesToScan("com.srj");
			Properties props = new Properties();
			props.setProperty("hibernate.hbm2ddl.auto","update");
			props.setProperty("hibernate.dialect","org.hibernate.dialect.MySQL5Dialect");
			props.setProperty("hibernate,show_sql","true");
			sessionFactory.setHibernateProperties(props);
			
			return sessionFactory;
		}
		@Bean
		public ComboPooledDataSource myDataSource(){
			
			ComboPooledDataSource dataSource = new ComboPooledDataSource();
			try {
			dataSource.setDriverClass("com.mysql.jdbc.Driver");
			dataSource.setJdbcUrl("jdbc:mysql://localhost:3306/test");
			dataSource.setUser("root");
			dataSource.setPassword("Suraj@123");
		}catch(Exception e) {
			e.printStackTrace();
		}
		
			return dataSource;
		}
}