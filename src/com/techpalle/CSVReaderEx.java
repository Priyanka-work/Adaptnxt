package com.techpalle;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.util.ArrayList;
import java.util.List;

public class CSVReaderEx 
  {
    public static void main(String[]args)
   {
    	/*String filePath="";//C:\\PRIYANKAM\\priya\\Java-workspace\\ReadCSVFile
    	
    	System.out.println("starting write product.csv file:"+filePath);
   // 	writeCsv(filePath);
    	
    	System.out.println("starting read product.csv file");
    //	readCsv(filePath);
*/    	
   /* 	}
    public static void writeCsv(String filePath) 
    {*/
		List<Product> products = new ArrayList<Product>();
		Product product1 = new Product("Dell G3 Gaming laptop","$1774.20","G3579-5965BLK-PUS","Intel Core i5-8300H","DELL","NIVDIA GeFORCE GTX 1050 4GB,256GB SSD Storage ,8GB RAM");
		Product product2 = new Product("Alienware-m15 R4","$2015.98","AWM15R4-7726BLK-PUS","Intel Core i7","DELL","NIVDIA RTX3070-512GB SOLID STATE DRIVE-DARKSIDE OF THE MOON NOTE BOOK");
		Product product3 = new Product("Dell G15 ","$859.99"," Windows 11 Home","AMD Ryzen 7-5800H 3.2GHz","DELL"," FHD 120Hz Gaming Notebook, AMD Ryzen 7 5800H, NVIDIA GeForce RTX 3050 Ti, 8GB RAM, 512GB PCIe SSD, Phantom Grey");
		Product product4 = new Product("Recertified Dell Alienware 17","$849.90","Grade A","Alienware17R1","DELL","Intel Core i7-4700MQ 2.40Ghz, 8GB Ram, 500GB Hard Drive, Nvidia GeForce GTX 765M 2GB Ram, Windows 10 Home ");
		Product product5 = new Product("Dell Gaming G15 5510","$1,974.85"," Windows 10 ","K535V","DELL"," 15.6 Inch RTX 3060 Gaming Laptop Full HD - Intel Core i7-10870H, 16GB DDR4 RAM, 512GB SSD, NVIDIA GeForce RTX 3060 6GB GDDR6,");
		Product product6 = new Product("Used Dell Inspiron 15 7000 Gaming Laptop ","$1,699.81","NVMe SSD GeForce GTX 1050 Win 10 Pro","7000","DELL","FHD Display 7th Gen Intel Kaby Lake i7-7700HQ 16GB Ram 512GB");
		Product product7 = new Product("Used Dell M6800 Gaming Laptop","$799.00","Windows 10 Pro","M6800","DELL"," 2.7GHz Quad Core 16GB Memory 512GB Solid State + 500GB Hard Drive Nvidia Graphics ");
		Product product8 = new Product("Dell Latitude E7240 12.5-inch Laptop","$343.00","Windows 10 Pro 64bit","Core i5-4310U 2.0GHz","DELL","Core i5-4310U 2.0GHz, 4GB Ram, 240GB SSD");
		Product product9 = new Product("Dell Latitude 7480 Laptop","$210.00","Windows 10 - 14","Intel Core i5","DELL","6300U 8GB 128GB SSD");
		Product product10 = new Product("Dell Latitude 7390 13.3","$337.07","7390","7390","DELL","Microsoft-Authorized Used Grade A. Intel Core i7-6850U 1.90 GHz, 16GB DDR4 RAM, 256GB SSD, FHD Resolution, Genuine Windows 10 Professional (64-bit).");
		products.add(product1);
		products.add(product2);
		products.add(product3);
		products.add(product4);
		products.add(product5);
		products.add(product6);
		products.add(product7);
		products.add(product8);
		products.add(product9);
		products.add(product10);

        File f=null;
		FileWriter fw=null;
		BufferedWriter bw=null;
		try
		{
			f=new File("C:\\PRIYANKAM\\priya\\Java-workspace\\ReadCSVFile.csv");
			fw= new FileWriter(f);
			bw=new BufferedWriter(fw);
			
			bw.append("pName,pprice,pcode,pmnum,pcat,pdes");
			
			for(Product p:products)
    		{
				bw.append(p.getProductName()); 
				bw.append(",");
				bw.append(p.getProductPrice()); 
				bw.append(",");
				bw.append(p.getModelNumber()); 
				bw.append(",");
				bw.append(p.getProductCategory()); 
				bw.append(",");
				bw.append(p.getProductDescription());
				bw.append("\n");
				bw.flush();

             }
		}
			catch(Exception ex)
	    	 {
	    		ex.printStackTrace();
	    	 }
		finally
		{
			try
			{
				if(bw!=null)
					bw.close();
				if(fw!=null)
				fw.close();
				

			}
			catch(Exception ex)
	    	 {
	    		ex.printStackTrace();
	    	 }
		}
		
		System.out.println(f);
			
 }
    
	public static void readCsv(String filePath)
    {
    	BufferedReader br=null;
    	try 
    	{
    		List<Product> products = new ArrayList<Product>();
    		String line="";
    		br=new BufferedReader(new FileReader(filePath));
    		br.readLine();
    		
    		while((line=br.readLine())!=null)
    		{
    			String[] fields=line.split(",");
    			
    			if(fields.length > 0)
    			{
    			    Product product = new Product(); 
    				product.setProductName(fields[0]);
    				product.setProductPrice((fields[1]));
    				product.setProductCode(fields[2]);
    				product.setModelNumber(fields[3]);
    				product.setProductCategory(fields[4]);
    				product.setProductDescription(fields[5]);
    				
    				products.add(product);
    				
    			}
    		}
    		for(Product p:products)
    		{
    			System.out.printf("[productName=%s,productPrice=%s,productCode=%s,modelNumber=%s,productCategory=%s,productDescription=%s]\n",
    		    p.getProductName(),p.getProductPrice(),p.getProductCode(),p.getModelNumber(),p.getProductCategory(),p.getProductDescription());
    		}
    	}
    	 catch(Exception ex)
    	 {
    		ex.printStackTrace();
    	 }
    	 finally
    	 {
    		 try
    		 {
    			br.close();
    		 }
    		 catch(Exception ex)
        	 {
        		ex.printStackTrace();
        	 }
    	 }
    }
  }
