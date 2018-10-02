package beans;

public class Vacation {
	
	private long vacationId;
	private String destinationCity;
	private int daysStayed;
	private double cost;
	private double balanceOwed;
	private boolean foreignVacation;
	
	public Vacation() {
		super();
	}

	public Vacation(long vacationId, String destinationCity, int daysStayed, double cost, boolean foreignVacation) {
		super();
		this.vacationId = vacationId;
		this.destinationCity = destinationCity;
		this.daysStayed = daysStayed;
		this.cost = cost;
		this.foreignVacation = foreignVacation;
		this.balanceOwed = cost;
	}

	public long getVacationId() {
		return vacationId;
	}

	public void setVacationId(long vacationId) {
		this.vacationId = vacationId;
	}

	public String getDestinationCity() {
		return destinationCity;
	}

	public void setDestinationCity(String destinationCity) {
		this.destinationCity = destinationCity;
	}

	public int getDaysStayed() {
		return daysStayed;
	}

	public void setDaysStayed(int daysStayed) {
		this.daysStayed = daysStayed;
	}

	public double getCost() {
		return cost;
	}

	public void setCost(double cost) {
		this.cost = cost;
	}

	public boolean isForeignVacation() {
		return foreignVacation;
	}

	public void setForeignVacation(boolean foreignVacation) {
		this.foreignVacation = foreignVacation;
	}

	public double getBalanceOwed() {
		return balanceOwed;
	}

	public void setBalanceOwed(double balanceOwed) {
		this.balanceOwed = balanceOwed;
	}
	

}
