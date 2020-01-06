package com.pro.dao;

import java.util.List;

import com.pro.entity.Dingdan;
import com.pro.entity.Shop;
import com.pro.entity.Users;

public interface DingdanDao {
	// 订单添加
	public int addDingdan(Dingdan dingdan) throws Exception;

	// 商家查询自己的货物订单
	public List<Dingdan> findDingdan(Users users) throws Exception;
        
        /*//查找第一页的数据
        public List<Dingdan> findAllDingdan(int page, int number) throws Exception;
        
        //查询所有用户的页数
        public int DingdanPages(int number) throws Exception;*/
}
