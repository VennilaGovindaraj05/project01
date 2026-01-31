package collector;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.TreeMap;
import java.util.concurrent.ConcurrentMap;
import java.util.stream.Collectors;
import java.util.stream.Stream;

//predefine methods in collect

 class Products
{
	private String name;
	private Integer id;
	private String productName;
	private String categoryname;
	private Integer price;
	
	public Products() 
	{	
	}

	public Products(String name, Integer id, String productName, String categoryname,Integer price) 
	{
		
		this.name = name;
		this.id = id;
		this.productName = productName;
		this.categoryname = categoryname;
		this.price=price;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getProductName() {
		return productName;
	}

	public void setProductName(String productName) {
		this.productName = productName;
	}

	public String getCategoryname() {
		return categoryname;
	}

	public void setCategoryname(String categoryname) {
		this.categoryname = categoryname;
	}

	public Integer getPrice() {
		return price;
	}

	public void setPrice(Integer price) {
		this.price = price;
	}

	@Override
	public String toString() {
		return "[name=" + name + ", id=" + id + ", productName=" + productName + ", categoryname="
				+ categoryname + ", price=" + price + "]";
	}


	}



public class groupingBy 
{
	
	public static void main(String[] args)
	{
         
		
		ArrayList<Products>product=new ArrayList<>();
			product.add(new Products("A",101,"chocolate","sweetsitems",50));
			product.add(new Products("B",102,"carrot","vegies",30));
			product.add(new Products("A",103,"cakes","sweetsitems",200));
			product.add(new Products("C",104,"apple","fruits",150));
			product.add(new Products("D",105,"lotus","flowes",70));
			product.add(new Products("B",106,"potatoes","vegies",60));
			product.add(new Products("D",107,"tupil","flowers",500)); 
		
			
			//grouping(functioon,downstream)
			
		Map<String,List<String>> map=product.stream()
		.collect(Collectors.groupingBy((x)->x.getCategoryname(),
				Collectors.mapping((x)->x.getProductName(), 
				Collectors.toList())));
		System.out.println(map);		
		
		//grouping(function,mapsupplier,downstream)
		
		Map<String,List<String>> res =product.stream()
		.collect(Collectors.groupingBy((x)->x.getCategoryname(),
				
				()->new TreeMap<>(), 
				
				Collectors.mapping((x)->( x).getProductName(), Collectors.toList())));
		
		System.out.println(res);
		
		
		
	
		
//		System.out.println("1.find length of the string name and grouping the values :");
//		Map<Integer, List<String>> arr =Stream.of("core","java","python","c","sql")
//		.collect(Collectors.groupingBy((x)->x.length()));
//		System.out.println(arr);
		
		
		
		//partioningBy->satisy condition all one groupnot satastisy one group
		
		Map<Boolean, List<Object>> part =product.stream()
		.collect(Collectors.partitioningBy((x)->x.getPrice()>=200,
		Collectors.mapping((x)->x.getProductName(), 
		Collectors.toList())));
		
		System.out.println(part);
		
		
		//Map convertions
		//  String length count and store map  op->AA-2 
		//B-1 GG-2 YT-2
		
		Map<String,Integer> mapp =Stream.of("AA","B","GG","YT","IOP")
		.collect(Collectors.toMap((x)->x, (y)->y.length()));
		System.out.println(mapp);
		
		//user define
		//product name -product price
		
		Map<String,Integer> mappp=product.stream()
		.collect(Collectors.toMap((x)->x.getProductName(),(y)->y.getPrice()));
		System.out.println(mappp);
		
		//find duplicate in map
		
		Map<String,Integer> map2=product.stream()
		.collect(Collectors.toMap((x)->x.getName(), (y)->y.getPrice(), (o,n)->o));//o -old value n-new value
		System.out.println(map2);
		
		
		//toconcurrentmap
		
		ConcurrentMap<Integer, Integer> num=Stream.of(1,3,4,5,6,7,8,2)
		.collect(Collectors.toConcurrentMap((x)->x, (v)->v.reverse(v)));
		
		System.out.println(num);
		
		
		
		//filtering
		
	//	lemgth 3 words find
		List<String> val =Stream.of("one","two","three","four","five","six","seven","eigth","nine","ten")
		.collect(Collectors.filtering((x)->x.length()==3,Collectors.toList()));
		System.out.println(val);
		
		//user defines get product name  and convvert string formates
		//condition price ==200 and get productname
		List<Object> p =product.stream()
		.collect(Collectors.filtering((x)->x.getPrice()==200,
		        Collectors.mapping((x)->x.getProductName(), 
				Collectors.toList())));
		System.out.println(p);
		
		
		//flatMapping()
		//"one,two","three,four" ->split the word and change tolist		
		List<String> str=Stream.of("one,two","three,four","five,six","seven,eigth","nine,ten")
		.collect(Collectors.flatMapping((x)->Arrays.stream(x.split(",")), Collectors.toList()));
		System.out.println(str);
		
		
		
		
		
	}
	

}
