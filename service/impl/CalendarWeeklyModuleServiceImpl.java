package ph.com.alliance.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.orm.jpa.JpaTransactionManager;
import org.springframework.stereotype.Service;

import ph.com.alliance.dao.CalendarWeeklyModuleDao;
import ph.com.alliance.entity.Aircon;
import ph.com.alliance.entity.SpecificSched;
import ph.com.alliance.entity.Users;
import ph.com.alliance.entity.WeeklySched;
import ph.com.alliance.service.CalendarWeeklyModuleService;


/**
 * Example service implementation that handles database transaction.
 * Database transaction starts in this layer of the application, and it also ends here. 
 *
 */
@Service("calendarWeeklyModuleService")
public class CalendarWeeklyModuleServiceImpl implements CalendarWeeklyModuleService {
	

	@Autowired
	private JpaTransactionManager transactionManager;

	@Autowired
	private CalendarWeeklyModuleDao calendarWeeklyModuleDao;
	
	@Override
	public List<SpecificSched> getObjectList() {
		//get the data from the DB
		List<SpecificSched> list = calendarWeeklyModuleDao.getObjectList(transactionManager.getEntityManagerFactory().createEntityManager());
		
		return list;
	}

	@Override
	public List<Users> getUserList() {
		//get the data from the DB
		List<Users> list = calendarWeeklyModuleDao.getUserList(transactionManager.getEntityManagerFactory().createEntityManager());
		
		return list;
	}
	
	@Override
	public List<Aircon> getAirconList() {
		//get the data from the DB
		List<Aircon> list = calendarWeeklyModuleDao.getAirconList(transactionManager.getEntityManagerFactory().createEntityManager());
		
		return list;
	}

	@Override
	public List<WeeklySched> getWeeklyList() {
		List<WeeklySched> list = calendarWeeklyModuleDao.getWeeklyList(transactionManager.getEntityManagerFactory().createEntityManager());
		return list;
	}
	
	
}
