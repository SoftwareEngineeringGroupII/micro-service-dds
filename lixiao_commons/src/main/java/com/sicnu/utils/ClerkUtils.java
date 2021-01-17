package com.sicnu.utils;

import com.sicnu.pojo.Clerk;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;

//创建会话，获取当前登录对象
@Component
public class ClerkUtils {
//	@Autowired
//	private ISectorService sectorService;

	/**
	 * 获取当前登录者的信息
	 * @return 当前者信息
	 */
	public Clerk getClerk() {
		//获取当前用户的用户名
		//TODO：恢复
//		String clerkAccount = SecurityContextHolder.getContext().getAuthentication().getName();
//		return sectorService.findClerkByAccount(clerkAccount);
		return null;
	}

	/**
	 * 判断此用户中是否包含roleName菜单权限
	 * @param roleName
	 * @return
	 */
	public Boolean hasRole(String roleName) {
		//获取UserDetails类，
		UserDetails userDetails = (UserDetails) SecurityContextHolder.getContext().getAuthentication().getPrincipal();
		List<String> roleCodes=new ArrayList<>();
		for (GrantedAuthority authority : userDetails.getAuthorities()) {
			//getAuthority()返回用户对应的菜单权限
			roleCodes.add(authority.getAuthority());
		}
		return roleCodes.contains(roleName);
	}
}
