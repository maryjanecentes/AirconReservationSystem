package ph.com.alliance.controller.view;

import java.text.SimpleDateFormat;
import java.util.Arrays;
import java.util.Calendar;
import java.util.GregorianCalendar;
import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;









import ph.com.alliance.entity.Aircon;
import ph.com.alliance.entity.SpecificSched;
import ph.com.alliance.entity.Users;
import ph.com.alliance.entity.WeeklySched;
import ph.com.alliance.service.CalendarWeeklyModuleService;


@Controller
@RequestMapping("/")
public class CalendarWeeklyController {
	
	@Autowired
	private CalendarWeeklyModuleService calendarWeeklyModuleService;
	
	@RequestMapping("/CalendarWeeklyView")
	public String list(HttpServletRequest request, HttpServletResponse response,ModelMap map )
	{
		
		List<SpecificSched> showSchedule = calendarWeeklyModuleService.getObjectList();

		List<Aircon> showAircon = calendarWeeklyModuleService.getAirconList();
		
		List<WeeklySched> showWeekly = calendarWeeklyModuleService.getWeeklyList();
		
		String value = "";
		String currentDate="";
		Calendar now = Calendar.getInstance();

	    SimpleDateFormat format = new SimpleDateFormat("yyyy-MM-dd");

	    String[] days = new String[7];
	    String monday="";
	    String tuesday="";
	    String wednesday="";
	    String thursday="";
	    String friday="";
	    String saturday="";
	    String sunday="";
	    
	    		
	    int delta = -now.get(GregorianCalendar.DAY_OF_WEEK) +1; 
	    now.add(Calendar.DAY_OF_MONTH, delta );
	    for (int i = 0; i < 7; i++)
	    {
	        days[i] = format.format(now.getTime());
	        now.add(Calendar.DAY_OF_MONTH, 1);
	    }
	  
	    monday=days[1];
	    tuesday=days[2];
	    wednesday=days[3];
	    thursday=days[4];
	    friday=days[5];
	    saturday=days[6];
	    sunday=days[0];
		
	    
	    
         //This code below shows the Specific Schedule  
		for(int indexSSched = 0; indexSSched < showSchedule.size(); indexSSched++)
		{
			
			for(int indexAircon = 0; indexAircon < showAircon.size(); indexAircon++)
			{
				if(showAircon.get(indexAircon).getId()==showSchedule.get(indexSSched).getAirconId())
				{   
					currentDate=now.getFirstDayOfWeek()+"";
					value += "{id : '" + showSchedule.get(indexSSched).getId() + "', title: '" + showAircon.get(indexAircon).getName() + "', start: '" + showSchedule.get(indexSSched).getDate()+" "+showSchedule.get(indexSSched).getTimeStart() + "', end: '" +  showSchedule.get(indexSSched).getDate()+" "+showSchedule.get(indexSSched).getTimeEnd() + "'},";
					
					
					
				}
			}
		}
		
	    //This code below shows the default weekly Schedule 
		//Still need to add the validation (Specific Schedule must go on top/priority)
		//This will only apply to the current week for now. Still need to learn how to get the values from the jsp to the controller.
		
	    for(int indexWeekly = 0; indexWeekly < showWeekly.size(); indexWeekly++)
		{
			for(int indexAircon2 = 0; indexAircon2 < showAircon.size(); indexAircon2++)
			{
				if(showAircon.get(indexAircon2).getId()==showWeekly.get(indexWeekly).getAirconId())
				{   
					if(showWeekly.get(indexWeekly).getDay()==1)
					{
						value += "{id : '" + showSchedule.get(indexWeekly).getId() + "', title: 'Def-" + showAircon.get(indexAircon2).getName() + "', "
								+ "start: '" + monday+" "+showSchedule.get(indexWeekly).getTimeStart() + "',"
								+ " end: '" +  monday+" "+showSchedule.get(indexWeekly).getTimeEnd() + "'},";
				
					}
					else if(showWeekly.get(indexWeekly).getDay()==2)
					{
						value += "{id : '" + showSchedule.get(indexWeekly).getId() + "', title: 'Def-" + showAircon.get(indexAircon2).getName() + "', "
								+ "start: '" + tuesday+" "+showWeekly.get(indexWeekly).getTimeStart() + "',"
								+ " end: '" +  tuesday+" "+showSchedule.get(indexWeekly).getTimeEnd() + "'},";
					}
					else if(showWeekly.get(indexWeekly).getDay()==3)
					{
						value += "{id : '" + showSchedule.get(indexWeekly).getId() + "', title: 'Def-" + showAircon.get(indexAircon2).getName() + "', "
								+ "start: '" + wednesday+" "+showWeekly.get(indexWeekly).getTimeStart() + "',"
								+ " end: '" +  wednesday+" "+showWeekly.get(indexWeekly).getTimeEnd() + "'},";
					}
					else if(showWeekly.get(indexWeekly).getDay()==4)
					{
						value += "{id : '" + showSchedule.get(indexWeekly).getId() + "', title: 'Def-" + showAircon.get(indexAircon2).getName() + "', "
								+ "start: '" + thursday+" "+showWeekly.get(indexWeekly).getTimeStart() + "',"
								+ " end: '" +  thursday+" "+showWeekly.get(indexWeekly).getTimeEnd() + "'},";
					}
					else if(showWeekly.get(indexWeekly).getDay()==5)
					{
						value += "{id : '" + showSchedule.get(indexWeekly).getId() + "', title: 'Def-" + showAircon.get(indexAircon2).getName() + "', "
								+ "start: '" + friday+" "+showWeekly.get(indexWeekly).getTimeStart() + "',"
								+ " end: '" +  friday+" "+showWeekly.get(indexWeekly).getTimeEnd() + "'},";
					}
					else if(showWeekly.get(indexWeekly).getDay()==6)
					{
						value += "{id : '" + showSchedule.get(indexWeekly).getId() + "', title: 'Def-" + showAircon.get(indexAircon2).getName() + "', "
								+ "start: '" + saturday+" "+showWeekly.get(indexWeekly).getTimeStart() + "',"
								+ " end: '" +  saturday+" "+showWeekly.get(indexWeekly).getTimeEnd() + "'},";
					}
					else if(showWeekly.get(indexWeekly).getDay()==7)
					{
						value += "{id : '" + showSchedule.get(indexWeekly).getId() + "', title: 'Def" + showAircon.get(indexAircon2).getName() + "', "
								+ "start: '" + sunday+" "+showWeekly.get(indexWeekly).getTimeStart() + "',"
								+ " end: '" +  sunday+" "+showWeekly.get(indexWeekly).getTimeEnd() + "'},";
					}
			 
		
				}
			}
		}
	    
		map.addAttribute("showValue", value);
		return "CalendarWeeklyView/calendarweeklyview";
	}
	
	
}
