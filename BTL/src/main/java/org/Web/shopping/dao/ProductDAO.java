package org.Web.shopping.dao;

import org.Web.shopping.entity.Product;
import org.Web.shopping.model.PaginationResult;
import org.Web.shopping.model.ProductInfo;

public interface ProductDAO {

	
	
	public Product findProduct(String code);
	
	public ProductInfo findProductInfo(String code) ;
 
	
	public PaginationResult<ProductInfo> queryProducts(int page, 
			           int maxResult, int maxNavigationPage  );
	
	public PaginationResult<ProductInfo> queryProducts(int page, int maxResult, 
			           int maxNavigationPage, String likeName);

	public void save(ProductInfo productInfo);
	
}