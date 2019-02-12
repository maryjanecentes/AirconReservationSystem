package ph.com.alliance.service;

import java.util.List;

import ph.com.alliance.entity.Aircon;
import ph.com.alliance.entity.SpecificSched;
import ph.com.alliance.entity.Users;
import ph.com.alliance.entity.WeeklySched;

/**
 * 
 * 
 */
public interface CalendarWeeklyModuleService {
	
	public List<SpecificSched> getObjectList();
	
	public List<Users> getUserList();

	public List<Aircon> getAirconList();
	
	public List<WeeklySched> getWeeklyList();

}


