package org.Web.shopping.dao;

import java.util.List;

import org.Web.shopping.model.CartInfo;
import org.Web.shopping.model.OrderDetailInfo;
import org.Web.shopping.model.OrderInfo;
import org.Web.shopping.model.PaginationResult;

public interface OrderDAO {

	public void saveOrder(CartInfo cartInfo);

	public PaginationResult<OrderInfo> listOrderInfo(int page, 
			int maxResult, int maxNavigationPage);
	
	public OrderInfo getOrderInfo(String orderId);
	
	public List<OrderDetailInfo> listOrderDetailInfos(String orderId);

}