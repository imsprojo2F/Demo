/**   
* @Title: UserController.java 
* @Package com.demo.controller 
* @Description: TODO(用一句话描述该文件做什么) 
* @author IsProjo
* @date 2017年2月16日 上午11:24:52 
* @version V1.0   
*/
package com.demo.controller;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import com.demo.domain.User;
import com.demo.service.impl.UserService;

/**
 * @ClassName: UserController
 * @Description: TODO(这里用一句话描述这个类的作用)
 * @author IsProjo
 * @date 2017年2月16日 上午11:24:52
 * 
 */
@Controller
@RequestMapping("/user")
public class UserController {

	@Resource
	private UserService userService;

	@RequestMapping("/getById")
	public String toIndex(HttpServletRequest request, Model model) {
		System.out.println("UserController showUser");
		int id = Integer.parseInt(request.getParameter("id"));
		User user = userService.getUserById(id);
		model.addAttribute("user", user);
		return "showUser";
	}

}
