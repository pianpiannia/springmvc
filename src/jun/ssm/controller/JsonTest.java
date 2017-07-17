package jun.ssm.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import jun.ssm.po.TLinkmanCustomer;
@Controller
public class JsonTest {
	@RequestMapping("/requestJson")
	public @ResponseBody TLinkmanCustomer requestJson(@RequestBody TLinkmanCustomer tLinkmanCustomer) {

	    return tLinkmanCustomer; //由于@ResponseBody注解，将itemsCustom转成json格式返回
	}
	
	@RequestMapping("/responseJson")
	public @ResponseBody TLinkmanCustomer responseJson(TLinkmanCustomer tLinkmanCustomer) {

	    return tLinkmanCustomer; //由于@ResponseBody注解，将itemsCustom转成json格式返回
	}
}
