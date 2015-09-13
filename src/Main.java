import java.util.EnumMap;
import java.util.EnumSet;

public class Main {

	public static void main(String[] args) {
		Week mon = Week.MON;
		Week sun = Week.SUN;
		
		//调用头toString
		System.out.println("--"+mon);
		System.out.println("--"+sun);
		
		System.out.println(mon.name());//名称
		System.out.println(sun.name());
		
		//自定义的方法
		System.out.println(mon.getIndex());
		System.out.println(sun.getIndex());
		System.out.println(mon.isRest());
		System.out.println(sun.isRest());
		
		//枚举对象定义时的位置
		System.out.println(mon.ordinal());
		System.out.println(sun.ordinal());
		
		//比较
		System.out.println(mon.compareTo(sun) + "<--");
		
		//获得类的对象
		System.out.println(mon.getDeclaringClass());
		//也是获得 week类的对象
		System.out.println(mon.getClass());
		
		//所有的枚举
		for (Week e : Week.values()) {
			System.out.println(e.toString());
		}
		
		//key是枚举类型的map, 这样初始化
		EnumMap<Week, String> map = new EnumMap<Week, String>(Week.class);
		map.put(mon, "星期一");
		map.put(Week.TUE, "星期二");
		
		//枚举集合类，这样初始化, 它不能被new出来
		EnumSet<Week> set = EnumSet.allOf(Week.class);
		set = EnumSet.noneOf(Week.class);//或者这样
		set.add(mon);
	}
}