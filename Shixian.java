interface jiekou {
	void show();
}

//  µœ÷¿‡
public class Shixian implements jiekou {
	public void show() {
		System.out.println("Shixian");
	}

	public static void main(String[] args) {
		jiekou jk = new Shixian();
		jk.show();
	}
}