package com.cop.mobi.account.service;

import com.cop.mobi.account.entity.User;
import com.cop.mobi.account.entity.UserPo;
import com.cop.mobi.common.Result;
import com.cop.mobi.mycar.entity.CarBrand;
import com.cop.mobi.mycar.entity.MyCar;
import com.cop.mobi.mycar.entity.MyCarPo;

/**
 * 
 * @author chris.liu
 * 
 */
public interface AccountService {

	/**
	 * 根据用户和车辆注册
	 * 
	 * @param user
	 * @param myCar
	 * @return
	 */
	Result register(UserPo userPo, MyCarPo myCarPo);

	/**
	 * 登陆
	 * 
	 * @param user
	 * @return
	 */
	Result login(UserPo userPo);

	/**
	 * 更新用户、车辆信息
	 * 
	 * @param userPo
	 * @param myCarPo
	 * @param carBrand
	 * @return
	 */
	Result update(UserPo userPo, MyCarPo myCarPo, CarBrand carBrand);

	/**
	 * 上传用户头像
	 * 
	 * @param content
	 * @param filename
	 * @return
	 */
	Result uploadProfile(Integer uid, String filename, byte[] content);

}
