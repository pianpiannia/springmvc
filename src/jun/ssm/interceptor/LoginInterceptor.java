package jun.ssm.interceptor;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import org.springframework.web.servlet.HandlerInterceptor;
import org.springframework.web.servlet.ModelAndView;
/**
 * ��¼��֤��������
 * @author jun
 *
 */
public class LoginInterceptor implements HandlerInterceptor{

	//����Handler����֮ǰִ��
	//���������֤�������Ȩ
	//���������֤�������֤��ͨ����ʾ��ǰ�û�û�е�¼����Ҫ�˷������ز�������ִ��
	@Override
	public boolean preHandle(HttpServletRequest request, 
			HttpServletResponse response, Object handler)
			throws Exception {
		
		//��ȡ�����url
		String url = request.getRequestURI();
		//�ж�url�Ƿ��ǹ�����ַ��ʵ��ʹ��ʱ��������ַ�����������ļ��У�
		//���﹫����ַ�ǵ�¼�ύ�ĵ�ַ
		if(url.indexOf("login.action")>=0){
			//������е�¼�ύ������
			return true;
		}
		//�ж�session
		HttpSession session = request.getSession();
		String username = (String) session.getAttribute("username");
		if(username !=null){
			//�����Ϣ���ڣ�����
			return true;
		}
		
		//����ִ�е������ʾ�û������Ҫ��֤����ת����¼ҳ��
		request.getRequestDispatcher("/jsp/login.jsp").forward(request, response);
		
		
		// return false��ʾ���أ�������ִ��
		//return true��ʾִ��
		return false;
	}

	//����Handler����֮�󣬷���modelAndView֮ǰִ��
	//Ӧ�ó�����modelAndView�����������õ�ģ�����������ﴫ����ͼ��Ҳ����������ͳһָ����ͼ
	@Override
	public void postHandle(HttpServletRequest request, HttpServletResponse response, Object handler,
			ModelAndView modelAndView) throws Exception {
		
		System.out.println("HandlerInterceptor2..postHandle");
		
	}

	//ִ��Handler���ִ�д˷���
	//ͳһ���쳣����;ͳһ����־����
	@Override
	public void afterCompletion(HttpServletRequest request, HttpServletResponse response, Object handler, Exception ex)
			throws Exception {
		
		System.out.println("HandlerInterceptor2..afterCompletion");
		
	}


}
