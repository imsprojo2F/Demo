/**   
* @Title: UserService.java 
* @Package com.demo.service.impl 
* @Description: TODO(用一句话描述该文件做什么) 
* @author IsProjo
* @date 2017年2月16日 上午11:22:41 
* @version V1.0   
*/
package com.demo.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.demo.dao.UserMapper;
import com.demo.domain.User;
import com.demo.service.IUserService;

/**
 * @ClassName: UserService
 * @Description: TODO(这里用一句话描述这个类的作用)
 * @author IsProjo
 * @date 2017年2月16日 上午11:22:41
 * 
 */
@Service
public class UserService implements IUserService {

	@Autowired
	private UserMapper userMapper;

	/*
	 * Title: getUserById Description:
	 * 
	 * @param id
	 * 
	 * @return
	 * 
	 * @see com.demo.service.IUserService#getUserById(int)
	 */

	public User getUserById(int id) {
		// TODO Auto-generated method stub
		return userMapper.selectByPrimaryKey(id);
	}

}
