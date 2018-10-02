package beans;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class VacationDaoInMemoryImpl implements VacationDao{

	private Map<Long, Vacation> vacationsMap = new HashMap<Long, Vacation>();
	
	{
		Vacation vacation1 = new Vacation(1L, "Miami", 5, 2600.00, false);
		Vacation vacation2 = new Vacation(2L, "Des Moines", 5, 700.00, false);
		
		vacationsMap.put(vacation1.getVacationId(), vacation1);
		vacationsMap.put(vacation2.getVacationId(), vacation2);
	}
	
	public void insert(Vacation vacation) {
		vacationsMap.put(vacation.getVacationId(), vacation);
	}
	
	public void update(Vacation vacation) {
		vacationsMap.put(vacation.getVacationId(), vacation);
	}
	
	public void update(List<Vacation> vacations) {
		for(Vacation vacation : vacations) {
			update(vacation);
		}
	}
	
	public void delete(long vacationId) {
		vacationsMap.remove(vacationId);
	}
	
	public Vacation find(long vacationId) {
		return vacationsMap.get(vacationId);
	}
	
	public List<Vacation> find(List<Long> vacationIds){
		List<Vacation> vacations = new ArrayList<Vacation>();
		for(Long id : vacationIds) {
			vacations.add(vacationsMap.get(id));
		}
		return vacations;
	}
	
	public List<Vacation> find(String destinationCity){
		List<Vacation> vacations = new ArrayList<Vacation>();
		for(Vacation vacation : vacationsMap.values()) {
			if(destinationCity.equals(vacation.getDestinationCity())) {
				vacations.add(vacation);
			}
		}
		return vacations;
	}
	
	public List<Vacation> find(boolean foreignVacation){
		List<Vacation> vacations = new ArrayList<Vacation>();
		for(Vacation vacation : vacationsMap.values()) {
			if(foreignVacation == (vacation.isForeignVacation())) {
				vacations.add(vacation);
			}
		}
		return vacations;
	}

}
