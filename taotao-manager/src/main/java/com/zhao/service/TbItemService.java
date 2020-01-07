package com.zhao.service;

import com.zhao.bean.TbItem;
import com.zhao.common.LayuiTableResult;

public interface TbItemService {
	
	/**
	 * 根据商品id查询商品指定信息
	 * @param tbItem  商品id
	 * @return  指定商品id的商品信息
	 */
	TbItem findTbItemById(Long tbItemId);
	
	/**
	 * 分页显示商品信息
	 * @param page 当前页 需要计算索引的
	 * @param limit 每一页显示的条数
	 * @return layui指定的json格式
	 */
	LayuiTableResult findItemByPage(Integer page,Integer limit);
}
