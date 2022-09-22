package com.alex.demo.springtest.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.alex.demo.springtest.bean.BigCar;

/**
 * <p>
 * 广告轮播 前端控制器
 * </p>
 *
 * @author Ht
 * @since 2019-07-16
 */
@RestController
@RequestMapping("/test")
public class TestController {

	@RequestMapping(value = "/add", method = RequestMethod.GET)
	@ResponseBody
	public BigCar add() {
		BigCar bigCar = new BigCar();
		bigCar.setColor("blue");
		bigCar.setTest("test");
		return bigCar;
	}

}
