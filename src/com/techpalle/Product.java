package com.techpalle;

  public class Product 
  {
    private String productName;
    private String productPrice;
    private String productCode;
    private String modelNumber;
    private String productCategory;
    private String productDescription;
    
	public String getProductName() 
	{
		return productName;
	}
	public void setProductName(String productName)
	{
		this.productName = productName;
	}
	public String getProductPrice() 
	{
		return productPrice;
	}
	public void setProductPrice(String productPrice) 
	{
		this.productPrice = productPrice;
	}
	public String getProductCode() 
	{
		return productCode;
	}
	public void setProductCode(String productCode) 
	{
		this.productCode = productCode;
	}
	public String getModelNumber()
	{
		return modelNumber;
	}
	public void setModelNumber(String modelNumber) 
	{
		this.modelNumber = modelNumber;
	}
	public String getProductCategory() 
	{
		return productCategory;
	}
	public void setProductCategory(String productCategory) 
	{
		this.productCategory = productCategory;
	}
	public String getProductDescription() 
	{
		return productDescription;
	}
	public void setProductDescription(String productDescription) 
	{
		this.productDescription = productDescription;
	}
	public Product(String productName, String productPrice, String productCode, String modelNumber,
			String productCategory, String productDescription) 
	{
		super();
		this.productName = productName;
		this.productPrice = productPrice;
		this.productCode = productCode;
		this.modelNumber = modelNumber;
		this.productCategory = productCategory;
		this.productDescription = productDescription;
	}
	public Product() {
		super();
	}
    
    
  }
