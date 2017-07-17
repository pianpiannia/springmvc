package jun.ssm.controller;

import java.io.File;
import java.util.List;
import java.util.UUID;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.validation.ObjectError;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.multipart.MultipartFile;
import org.springframework.web.servlet.ModelAndView;

import jun.ssm.po.TLinkmanCustomer;
import jun.ssm.po.TLinkmanQueryVo;
import jun.ssm.service.impl.LinkManService;

@Controller
//为了对url进行分类管理，可以在这里定义根路径，最终访问url根路径+子路径
@RequestMapping("/linkman")
public class LinkManController {
	
	@Autowired
	private LinkManService linkManService;
	//联系人查询
	
	@RequestMapping("/queryUser2")
	public ModelAndView queryUser(HttpServletRequest request,TLinkmanQueryVo tLinkmanQueryVo)throws Exception{
		
		System.out.println(request.getParameter("linkid"));
		
		//调用service查找数据库，查询联系人列表
		List<TLinkmanCustomer> list = linkManService.findLinkManByName(tLinkmanQueryVo);
		//返回ModelAndView
		ModelAndView modeAndView = new ModelAndView();
		//相当与request的setAttribut,在jsp界面中通过listt取数据
		modeAndView.addObject("list", list);
		//指定视图
		modeAndView.setViewName("/jsp/linkman/linkmanlist.jsp");
		return modeAndView;		
	}
	
	//查询联系人信息，输出json格式
	///linkView/{linkid}里面{linkid}表示将这个位置的参数传到@PathVariable指定名称当中
	@RequestMapping("/linkView/{linkid}")
	public @ResponseBody TLinkmanCustomer linkView(@PathVariable("linkid") Integer linkid)throws Exception{
		
		TLinkmanCustomer tLinkmanCustomer = linkManService.findLinkManById(linkid);
		
		return tLinkmanCustomer;
	}
	
	//@RequestMapping("editLinkman")
	//限制HTTP请求方法
//	@RequestMapping(value="editLinkman",method={RequestMethod.POST,RequestMethod.GET})
//	public ModelAndView editLinkman()throws Exception{
//		//调用service根据id查询
//		TLinkmanCustomer tLinkmanCustomer = linkManService.findLinkManById(1);
//		
//		//返回ModelAndView
//		ModelAndView modeAndView = new ModelAndView();
//		//相当与request的setAttribut,在jsp界面中通过listt取数据
//		modeAndView.addObject("tLinkmanCustomer", tLinkmanCustomer);
//		//指定视图
//		modeAndView.setViewName("/jsp/linkman/editLinkman.jsp");
//		return modeAndView;		
//	}
	
	//返回逻辑视图名
	@RequestMapping(value="editLinkman",method={RequestMethod.POST,RequestMethod.GET})
	public String editLinkman(Model model,Integer linkid)throws Exception{
		//调用service根据id查询
		TLinkmanCustomer tLinkmanCustomer = linkManService.findLinkManById(linkid);
		model.addAttribute("tLinkmanCustomer", tLinkmanCustomer);
		return "/jsp/linkman/editLinkman.jsp";		
	}
	@RequestMapping("editLinkmanSubmit")
	public String editLinkmanSubmit(Model model,HttpServletRequest request,Integer linkid,
			@Validated TLinkmanCustomer tLinkmanCustomer,
			BindingResult bindingResult/*,
			MultipartFile items_pic*/)throws Exception{
		
		//文件上传
		//得到文件原始名称
		/*String originalFileName = items_pic.getOriginalFilename();
		if(items_pic!=null&&originalFileName!=null&&originalFileName.length()>0){
			String pic_path = "C:\\Users\\军\\Pictures\\素材图片\\人物图片";
			//新图片名称
			String newFileName = UUID.randomUUID() + originalFileName.substring(originalFileName.lastIndexOf("."));
			File newFile = new File(pic_path+newFileName);//新图片
			items_pic.transferTo(newFile);//将内容数据写入磁盘
			tLinkmanCustomer.setPis(newFileName);//将新图片名称写到tLinkmanCustomer中
		}else {
	        //如果用户没有选择图片就上传了，还用原来的图片
			TLinkmanCustomer temp = linkManService.findLinkManById(tLinkmanCustomer.getLinkid());
			tLinkmanCustomer.setPic(temp.getPic());
	    }*/
		//重定向
		//return "redirect:queryUser2.action";
		//错误校验
		if(bindingResult.hasErrors()){
			List<ObjectError> allErrors = bindingResult.getAllErrors();
			for(ObjectError objectError:allErrors){
				System.out.println(new String(objectError.getDefaultMessage().getBytes("ISO-8859-1"),"UTF-8"));
			}
			
			model.addAttribute("allErrors", allErrors);
			return "/jsp/linkman/editLinkman.jsp";
		}
		//更新信息
		linkManService.updateLinkMan(linkid, tLinkmanCustomer);
		//请求转发
		return "forward:queryUser2.action";	
	}
	
	//批量删除联系人
	@RequestMapping("deletelinkman")
	public String deletelinkman(Integer[] linkid)throws Exception{
		
		
		return "/jsp/success.jsp";
	}
	
	//到批量修改界面
	@RequestMapping("toupdateAlllinkman")
	public ModelAndView toupdateAlllinkman(HttpServletRequest request,TLinkmanQueryVo tLinkmanQueryVo)throws Exception{
		
		List<TLinkmanCustomer> list = linkManService.findLinkManByName(tLinkmanQueryVo);
		//返回ModelAndView
		ModelAndView modeAndView = new ModelAndView();
		//相当与request的setAttribut,在jsp界面中通过listt取数据
		modeAndView.addObject("list", list);
		//指定视图
		modeAndView.setViewName("/jsp/linkman/updateAlllinkman.jsp");
		return modeAndView;		
	}
	@RequestMapping("editAllLinkmanSubmit")
	public String editAllLinkmanSubmit(TLinkmanCustomer tLinkmanCustomer)throws Exception{
		/*if(bindingResult.hasErrors()){
			List<ObjectError> allErrors = bindingResult.getAllErrors();
			for(ObjectError objectError:allErrors){
				System.out.println(objectError.getDefaultMessage());
			}
			
			model.addAttribute("allErrors", allErrors);
			return "/jsp/linkman/updateAlllinkman.jsp";
		}*/
	
		
		return "/jsp/success.jsp";
	}
	
	
}
