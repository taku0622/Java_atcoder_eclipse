package bronze;

public class Manager extends Employee{

	public void disp() {
		System.out.println("Manager");
	}

	public static void main(String[] args) {
		Manager manager = new Manager();
		Employee employee = manager;
		employee.disp();
	}

}
