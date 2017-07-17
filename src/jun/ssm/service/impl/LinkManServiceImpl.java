package jun.ssm.service.impl;

import java.util.List;

import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import jun.ssm.mapper.TLinkmanMapper;
import jun.ssm.mapper.TLinkmanMapperCustomer;
import jun.ssm.po.TLinkman;
import jun.ssm.po.TLinkmanCustomer;
import jun.ssm.po.TLinkmanQueryVo;


public class LinkManServiceImpl implements LinkManService {

	@Autowired
	private TLinkmanMapperCustomer tLinkmanMapperCustomer;
	@Autowired
	private TLinkmanMapper tLinkmanMapper;
	
	@Override
	public List<TLinkmanCustomer> findLinkManByName(TLinkmanQueryVo linkManQueryVo) throws Exception {
		
		return tLinkmanMapperCustomer.findLinkManByName(linkManQueryVo);
		
	}
	@Override
	public TLinkmanCustomer findLinkManById(Integer linkid) throws Exception {
		
		TLinkman tlinkman = tLinkmanMapper.selectByPrimaryKey(linkid);
		
		TLinkmanCustomer tLinkmanCustomer = new TLinkmanCustomer();
		//将items的属性值拷贝到tLinkmanCustomer
		BeanUtils.copyProperties(tlinkman, tLinkmanCustomer);
		
		//return (TLinkmanCustomer) tLinkmanMapper.selectByPrimaryKey(id);
		return tLinkmanCustomer;
	}
	
	//修改
	@Override
	public void updateLinkMan(Integer linkid, TLinkmanCustomer tLinkmanCustomer) throws Exception {
		//添加业务校验，通常在service接口对关键参数进行校验
		//校验id是否为空，如果为空抛出异常
		
		//更新信息
		tLinkmanCustomer.setLinkid(linkid);
		tLinkmanMapper.updateByPrimaryKey(tLinkmanCustomer);
	}
	

}
