import java.util.EnumMap;
import java.util.EnumSet;

public class Main {

	public static void main(String[] args) {
		Week mon = Week.MON;
		Week sun = Week.SUN;
		
		//����ͷtoString
		System.out.println("--"+mon);
		System.out.println("--"+sun);
		
		System.out.println(mon.name());//����
		System.out.println(sun.name());
		
		//�Զ���ķ���
		System.out.println(mon.getIndex());
		System.out.println(sun.getIndex());
		System.out.println(mon.isRest());
		System.out.println(sun.isRest());
		
		//ö�ٶ�����ʱ��λ��
		System.out.println(mon.ordinal());
		System.out.println(sun.ordinal());
		
		//�Ƚ�
		System.out.println(mon.compareTo(sun) + "<--");
		
		//�����Ķ���
		System.out.println(mon.getDeclaringClass());
		//Ҳ�ǻ�� week��Ķ���
		System.out.println(mon.getClass());
		
		//���е�ö��
		for (Week e : Week.values()) {
			System.out.println(e.toString());
		}
		
		//key��ö�����͵�map, ������ʼ��
		EnumMap<Week, String> map = new EnumMap<Week, String>(Week.class);
		map.put(mon, "����һ");
		map.put(Week.TUE, "���ڶ�");
		
		//ö�ټ����࣬������ʼ��, �����ܱ�new����
		EnumSet<Week> set = EnumSet.allOf(Week.class);
		set = EnumSet.noneOf(Week.class);//��������
		set.add(mon);
	}
}