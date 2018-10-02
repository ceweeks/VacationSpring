package beans;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class StartProgram {

	public static void main(String[] args) {

		AnnotationConfigApplicationContext applicationContext = new AnnotationConfigApplicationContext(BeanConfiguration.class);

		VacationService vacationService = applicationContext.getBean("vacationService", VacationService.class);
		Vacation vacation = vacationService.getVacation(1);
		
		System.out.println(vacationService.describeVacation(vacation));
		System.out.println("You owe $" + vacation.getBalanceOwed());
		System.out.println("You pay $500");
		vacationService.makePayment(vacation.getVacationId(), 500);
		System.out.println("You now owe $" + vacation.getBalanceOwed());
	}

}
