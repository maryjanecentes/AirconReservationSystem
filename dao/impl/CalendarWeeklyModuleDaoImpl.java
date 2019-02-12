package ph.com.alliance.dao.impl;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.Query;

import org.springframework.stereotype.Repository;

import ph.com.alliance.dao.CalendarWeeklyModuleDao;
import ph.com.alliance.entity.Aircon;
import ph.com.alliance.entity.SpecificSched;
import ph.com.alliance.entity.Users;
//import javax.management.Query;
import ph.com.alliance.entity.WeeklySched;

/**
 * Sample data access object implementation using Java Persistence API.
 * 
 *
 */
@Repository("calendarWeeklyModuleDao")
public class CalendarWeeklyModuleDaoImpl implements CalendarWeeklyModuleDao {

	@Override
	public List<SpecificSched> getObjectList(EntityManager entityManager) {
		Query query =  entityManager.createQuery("FROM SpecificSched");
		List<SpecificSched> reservationsList = query.getResultList();
		
		return reservationsList;
	}
	@Override
	public List<Users> getUserList(EntityManager entityManager) {
		Query query =  entityManager.createQuery("FROM Users");
		List<Users> userList = query.getResultList();
		
		return userList;
	}
	@Override
	public List<Aircon> getAirconList(EntityManager entityManager) {
		Query query =  entityManager.createQuery("FROM Aircon");
		List<Aircon> airconList = query.getResultList();
		
		return airconList;
	}
	@Override
	public List<WeeklySched> getWeeklyList(EntityManager entityManager) {
		Query query =  entityManager.createQuery("FROM WeeklySched");
		List<WeeklySched> weeklyList = query.getResultList();
		return weeklyList;
	}
	
	
	
}
