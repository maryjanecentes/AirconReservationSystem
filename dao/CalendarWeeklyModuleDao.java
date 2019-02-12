package ph.com.alliance.dao;

import java.util.List;

import javax.persistence.EntityManager;

import ph.com.alliance.entity.Aircon;
import ph.com.alliance.entity.SpecificSched;
import ph.com.alliance.entity.Users;
import ph.com.alliance.entity.WeeklySched;

/**
 * 
 * 
 */
public interface CalendarWeeklyModuleDao {
	public List<SpecificSched>getObjectList(EntityManager entityManager);
	public List<Users>getUserList(EntityManager entityManager);
	public List<Aircon>getAirconList(EntityManager entityManager);
	public List<WeeklySched> getWeeklyList(EntityManager entityManager);
	
}
