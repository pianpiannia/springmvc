package jun.ssm.controller;

import javax.servlet.http.HttpSession;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class LoginController {

	@RequestMapping("/login")
	public String login(HttpSession session,String username,String password)throws Exception{
		//调用service方法查询
		//此处省略了匹配数控库的逻辑
		session.setAttribute("username", username);
		
		return "redirect:/linkman/queryUser2.action";
	}
	@RequestMapping("/logout")
	public String logout(HttpSession session)throws Exception{
		
		session.invalidate();
		
		return "redirect:/linkman/queryUser2.action";
	}
}
