package beans;

public interface VacationService {
	
	public void makePayment(long vacationId, double amount);
	public Vacation getVacation(long vacationId);
	public String describeVacation(Vacation vacation);

}
