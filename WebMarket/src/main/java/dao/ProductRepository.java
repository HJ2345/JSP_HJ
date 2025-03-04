package dao;

import java.util.ArrayList;

import dto.Product;

public class ProductRepository {
	
	private ArrayList<Product> listOfProducts = new ArrayList<Product>();
	
	private static ProductRepository instance = new ProductRepository();
	
	public static ProductRepository getInstance() {
		return instance;
	}
	
	public ProductRepository() {
		Product phone = new Product("P1234", "Galaxy S20", 1200000);
		phone.setDescription("5.25-inch, 1334*750 HD display, 16-megapixel Camera");
		phone.setCategory("Smart Phone");
		phone.setManufacturer("SAMSUNG");
		phone.setUnitsInStock(1000);
		phone.setCondition(null);
		
		Product notebook = new Product("P1235", "LG GRAM", 20000000);
		notebook.setDescription("13-3-inch, IPS FULL HD display, Intel Core Processor");
		notebook.setCategory("Notebook");
		notebook.setManufacturer("LG");
		notebook.setUnitsInStock(1000);
		notebook.setCondition("Refurblished");
		
		Product tablet = new Product("P1236", "Galaxy Tab", 9000000);
		tablet.setDescription("121.8*125.6.6.6mm, Super AMOLED display, Octa-Core Core Processor");
		tablet.setCategory("tablet");
		tablet.setManufacturer("SAMSUMG");
		tablet.setUnitsInStock(1000);
		tablet.setCondition("Old");
		
		listOfProducts.add(phone);
		listOfProducts.add(notebook);
		listOfProducts.add(tablet);
	}
	
	public ArrayList<Product> getAllProducts(){
		
		return listOfProducts;
	}
	
	//listOfProducts에 저장된 모든 상품 목록을 조회해서 상품아이디와 일치하는 상품을 리턴함
	public Product getProductById(String ProductId) {
		Product ProductById = null;
		for(int i=0; i<listOfProducts.size(); i++) {
			Product product = listOfProducts.get(i);
			if(product != null && product.getProductId() != null &&
					product.getProductId().equals(ProductId)) {
				ProductById = product;
				break;
			}
			
		}
		return ProductById;
		
	}
	
	//상품추가 메서드
	public void addProduct(Product product) {
		listOfProducts.add(product);
	}
	
}
