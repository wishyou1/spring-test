package com.alex.demo.springtest.controller;

import com.alex.demo.springtest.bean.MyRunnable;
import com.alex.demo.springtest.bean.MyThead;
import com.alex.demo.springtest.bean.Student;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.alex.demo.springtest.bean.BigCar;

import java.util.Objects;
import java.util.Scanner;

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
		Scanner sc = new Scanner(System.in);
		System.out.println("请先输入颜色");
		String color = sc.next();
		while (!color.equals("黑色")){
			System.out.println("输入的颜色不合理,请重新输入");
			color = sc.next();
		}
		bigCar.setColor(color);
		return bigCar;
	}

	@RequestMapping(value = "/showAll", method = RequestMethod.GET)
	@ResponseBody
	public Student showAll(){
		Student s = new Student();
		s.setName("liu");
		return s;
	}

	/*@RequestMapping(value = "/runa", method = RequestMethod.GET)
	@ResponseBody
	public MyThead runa(){
		System.out.println("JVM启动main线程,main线程执行main方法");
		MyThead mt = new MyThead();
		mt.start();
		System.out.println("main线程后面其他 的代码...");
		return mt;
	}*/

	/*@RequestMapping(value = "/runing", method = RequestMethod.GET)
	@ResponseBody
	public MyRunnable mrun(){
		MyRunnable  runnable = new MyRunnable();
		Thread thread = new Thread(runnable);
		thread.start();
		for(int i = 1;  i<=1000; i++){
			System.out.println(  "main==> " + i);
		}
		return runnable;
	}*/
}
