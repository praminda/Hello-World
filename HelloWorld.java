public class HelloWorld {
	private String hw;
	
	public HelloWorld() {
		hw = "Hello World! \n pull request success";
	}
	
	public HelloWorld(String hw) {
		this.hw = hw;
	}
	
	public void print() {
		System.out.println(hw);
	}
	
	public void setHW(String hw) {
		this.hw = hw;
	}
	
	public static void main(String[] args) {
		HelloWorld hw = new HelloWorld();
		hw.print();
	}
}
