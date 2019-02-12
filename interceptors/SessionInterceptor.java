package ph.com.alliance.interceptors;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.handler.HandlerInterceptorAdapter;

public class SessionInterceptor extends HandlerInterceptorAdapter {
	  
	
		 @Override
			public boolean preHandle(HttpServletRequest request, HttpServletResponse response, Object handler)
			    throws Exception {

			  System.out.print("timeout");
			 if(null == request.getSession().getAttribute("User")){
			     
				   
			
			//	response.sendRedirect(request.getContextPath()+"/timeout");
				 

		   	//return false;
			   }
				return true;
			}
			
			@Override
			public void postHandle(
					HttpServletRequest request, HttpServletResponse response, Object handler, ModelAndView modelAndView)
					throws Exception {
					
				
			}
	    
}
