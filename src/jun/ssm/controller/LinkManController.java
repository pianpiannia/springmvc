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
//Ϊ�˶�url���з���������������ﶨ���·�������շ���url��·��+��·��
@RequestMapping("/linkman")
public class LinkManController {
	
	@Autowired
	private LinkManService linkManService;
	//��ϵ�˲�ѯ
	
	@RequestMapping("/queryUser2")
	public ModelAndView queryUser(HttpServletRequest request,TLinkmanQueryVo tLinkmanQueryVo)throws Exception{
		
		System.out.println(request.getParameter("linkid"));
		
		//����service�������ݿ⣬��ѯ��ϵ���б�
		List<TLinkmanCustomer> list = linkManService.findLinkManByName(tLinkmanQueryVo);
		//����ModelAndView
		ModelAndView modeAndView = new ModelAndView();
		//�൱��request��setAttribut,��jsp������ͨ��listtȡ����
		modeAndView.addObject("list", list);
		//ָ����ͼ
		modeAndView.setViewName("/jsp/linkman/linkmanlist.jsp");
		return modeAndView;		
	}
	
	//��ѯ��ϵ����Ϣ�����json��ʽ
	///linkView/{linkid}����{linkid}��ʾ�����λ�õĲ�������@PathVariableָ�����Ƶ���
	@RequestMapping("/linkView/{linkid}")
	public @ResponseBody TLinkmanCustomer linkView(@PathVariable("linkid") Integer linkid)throws Exception{
		
		TLinkmanCustomer tLinkmanCustomer = linkManService.findLinkManById(linkid);
		
		return tLinkmanCustomer;
	}
	
	//@RequestMapping("editLinkman")
	//����HTTP���󷽷�
//	@RequestMapping(value="editLinkman",method={RequestMethod.POST,RequestMethod.GET})
//	public ModelAndView editLinkman()throws Exception{
//		//����service����id��ѯ
//		TLinkmanCustomer tLinkmanCustomer = linkManService.findLinkManById(1);
//		
//		//����ModelAndView
//		ModelAndView modeAndView = new ModelAndView();
//		//�൱��request��setAttribut,��jsp������ͨ��listtȡ����
//		modeAndView.addObject("tLinkmanCustomer", tLinkmanCustomer);
//		//ָ����ͼ
//		modeAndView.setViewName("/jsp/linkman/editLinkman.jsp");
//		return modeAndView;		
//	}
	
	//�����߼���ͼ��
	@RequestMapping(value="editLinkman",method={RequestMethod.POST,RequestMethod.GET})
	public String editLinkman(Model model,Integer linkid)throws Exception{
		//����service����id��ѯ
		TLinkmanCustomer tLinkmanCustomer = linkManService.findLinkManById(linkid);
		model.addAttribute("tLinkmanCustomer", tLinkmanCustomer);
		return "/jsp/linkman/editLinkman.jsp";		
	}
	@RequestMapping("editLinkmanSubmit")
	public String editLinkmanSubmit(Model model,HttpServletRequest request,Integer linkid,
			@Validated TLinkmanCustomer tLinkmanCustomer,
			BindingResult bindingResult/*,
			MultipartFile items_pic*/)throws Exception{
		
		//�ļ��ϴ�
		//�õ��ļ�ԭʼ����
		/*String originalFileName = items_pic.getOriginalFilename();
		if(items_pic!=null&&originalFileName!=null&&originalFileName.length()>0){
			String pic_path = "C:\\Users\\��\\Pictures\\�ز�ͼƬ\\����ͼƬ";
			//��ͼƬ����
			String newFileName = UUID.randomUUID() + originalFileName.substring(originalFileName.lastIndexOf("."));
			File newFile = new File(pic_path+newFileName);//��ͼƬ
			items_pic.transferTo(newFile);//����������д�����
			tLinkmanCustomer.setPis(newFileName);//����ͼƬ����д��tLinkmanCustomer��
		}else {
	        //����û�û��ѡ��ͼƬ���ϴ��ˣ�����ԭ����ͼƬ
			TLinkmanCustomer temp = linkManService.findLinkManById(tLinkmanCustomer.getLinkid());
			tLinkmanCustomer.setPic(temp.getPic());
	    }*/
		//�ض���
		//return "redirect:queryUser2.action";
		//����У��
		if(bindingResult.hasErrors()){
			List<ObjectError> allErrors = bindingResult.getAllErrors();
			for(ObjectError objectError:allErrors){
				System.out.println(new String(objectError.getDefaultMessage().getBytes("ISO-8859-1"),"UTF-8"));
			}
			
			model.addAttribute("allErrors", allErrors);
			return "/jsp/linkman/editLinkman.jsp";
		}
		//������Ϣ
		linkManService.updateLinkMan(linkid, tLinkmanCustomer);
		//����ת��
		return "forward:queryUser2.action";	
	}
	
	//����ɾ����ϵ��
	@RequestMapping("deletelinkman")
	public String deletelinkman(Integer[] linkid)throws Exception{
		
		
		return "/jsp/success.jsp";
	}
	
	//�������޸Ľ���
	@RequestMapping("toupdateAlllinkman")
	public ModelAndView toupdateAlllinkman(HttpServletRequest request,TLinkmanQueryVo tLinkmanQueryVo)throws Exception{
		
		List<TLinkmanCustomer> list = linkManService.findLinkManByName(tLinkmanQueryVo);
		//����ModelAndView
		ModelAndView modeAndView = new ModelAndView();
		//�൱��request��setAttribut,��jsp������ͨ��listtȡ����
		modeAndView.addObject("list", list);
		//ָ����ͼ
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
