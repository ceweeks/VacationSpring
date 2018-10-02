package beans;

public class VacationServiceImpl implements VacationService{

	private VacationDao vacationDao;
	
	public VacationDao getVacationDao() {
		return vacationDao;
	}

	public void setVacationDao(VacationDao vacationDao) {
		this.vacationDao = vacationDao;
	}

	public void makePayment(long vacationId, double amount) {
		
		Vacation vacation = vacationDao.find(vacationId);
		vacation.setBalanceOwed(vacation.getBalanceOwed() - amount);
		
		vacationDao.update(vacation);
	}

	public Vacation getVacation(long vacationId) {
		return vacationDao.find(vacationId);
	}

	public String describeVacation(Vacation vacation) {
		String out = "Vacation " + vacation.getVacationId() + " goes to " + vacation.getDestinationCity() + " for " + vacation.getDaysStayed() + " days and costs $" + vacation.getCost() + ".";
		return out;
	}
	
	

}
