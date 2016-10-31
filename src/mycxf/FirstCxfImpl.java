package mycxf;

public class FirstCxfImpl implements FirstCxf,Say2 {

	

	@Override
	public String sayYes(String name) {
		return name +"abc";
	}
	@Override
	public String sayYes1(String name) {
		return name +"abc";
	}

	@Override
	public String say2(String name) {
		return name + "2";
	}
}
