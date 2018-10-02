package beans;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class BeanConfiguration {
	
	@Bean
	public VacationDao vacationDao() {
		VacationDaoInMemoryImpl bean = new VacationDaoInMemoryImpl();
		return bean;
	}
	
	@Bean
	public VacationService vacationService() {
		VacationServiceImpl bean = new VacationServiceImpl();
		bean.setVacationDao(vacationDao());
		return bean;
	}

}
