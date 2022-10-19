package day3;

import java.util.HashMap;
import java.util.Map;

class Customer{
	private String name;
	private int id;
	public Customer(String name, int id) {
		super();
		this.name = name;
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	
}

class CustomerRecord{
	private Map<String,Customer> record;
	
	public CustomerRecord() {
		this.record = new HashMap<String,Customer>();
		record.g
	}
	
	public void addCustomer(Customer c) {
		this.record.put(c.getName(), c);
	}
	
	public Map<String,Customer> getCustomers(){
		return this.record;
	}
}
public class HashMapEx {

	public static void main(String[] args) {
		
		CustomerRecord obj = new CustomerRecord();
		
		obj.addCustomer(new Customer("John",10));
		obj.addCustomer(new Customer("Ram",20));
		
		for(Customer c: obj.getCustomers().values()) {// keySet()---> map.get(k)
			System.out.println(c);
		}

	}

}
