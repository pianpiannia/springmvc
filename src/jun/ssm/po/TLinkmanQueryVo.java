package jun.ssm.po;

import java.util.List;

//��ϵ�˰�װ����
public class TLinkmanQueryVo {
	
	private TLinkman linkman;
	
	private TLinkmanCustomer linkmanCustomer;
	
	private List<TLinkmanCustomer> listTLinkmanCustomer;

	public TLinkman getLinkman() {
		return linkman;
	}

	public void setLinkman(TLinkman linkman) {
		this.linkman = linkman;
	}

	public TLinkmanCustomer getLinkmanCustomer() {
		return linkmanCustomer;
	}

	public void setLinkmanCustomer(TLinkmanCustomer linkmanCustomer) {
		this.linkmanCustomer = linkmanCustomer;
	}

	public List<TLinkmanCustomer> getListTLinkmanCustomer() {
		return listTLinkmanCustomer;
	}

	public void setListTLinkmanCustomer(List<TLinkmanCustomer> listTLinkmanCustomer) {
		this.listTLinkmanCustomer = listTLinkmanCustomer;
	}
	
	
}
