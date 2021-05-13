package SpringDemo.SpringDemo.model;

public class Sample {
	
	 String name;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
	
	public void display() {
		System.out.println("Welcome  To " +name);
	}
	
	public void init() {
		System.out.println("This bean is going through init");
	}
	
	public void destroy() {
		System.out.println("Bean will destroy now");
	}

}
