package cn.et.aop.springAop.annotation;

import org.springframework.stereotype.Component;

@Component
public class UserManager {
	public void add(){
		System.out.println("����û�");
	}
	public void delete(){
		System.out.println("ɾ���û�");
	}
	public void update(){
		System.out.println("�޸��û�");
	}
	public void query(){
		System.out.println("�����û�");
	}

}
