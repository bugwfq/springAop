package cn.et.aop.springAop.annotation;

import org.springframework.stereotype.Component;

@Component
public class UserManager {
	public void add(){
		System.out.println("添加用户");
	}
	public void delete(){
		System.out.println("删除用户");
	}
	public void update(){
		System.out.println("修改用户");
	}
	public void query(){
		System.out.println("查找用户");
	}

}
