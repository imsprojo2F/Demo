/**   
* @Title: IUserService.java 
* @Package com.demo.service 
* @Description: TODO(用一句话描述该文件做什么) 
* @author IsProjo
* @date 2017年2月16日 上午11:21:45 
* @version V1.0   
*/
package com.demo.service;

import com.demo.domain.User;

/**
 * @ClassName: IUserService
 * @Description: TODO(这里用一句话描述这个类的作用)
 * @author IsProjo
 * @date 2017年2月16日 上午11:21:45
 * 
 */
public interface IUserService {

	public User getUserById(int id);

}
