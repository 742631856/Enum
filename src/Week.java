import java.io.Serializable;


public enum Week implements Serializable {//枚举可以实现借口，但不能继承其他类
	//定义7个对象, 这7个对象可以看成是Week的子类实例
	MON(1),	//这个相当于 调用了构造方法 Week(1),如果没有定义构造方法，这么定义就会编译出错
	TUE(2),
	WED(3),
	THU(4),
	FRI(5),
	SAT(6) {
        public boolean isRest() {	//覆盖Week的isRest，Week中必须有isRest方法，不然这个方法没有用
            return true;
        }
    },
	SUN(0, "星期日") {
    	@Override
    	public boolean isRest() {
    		return true;
    	}
    };
	
	//上面的 对象，都会有下面的 "属性"和"方法"
	private int index;	//用来存放上面对象后面的值
	private String desc = "";
	
	private Week(int index) {	//构造方法必须是私有的
		this.index = index;
	}
	

	Week(int index, String desc) {//这个默认是私有的
		this.index = index;
		this.desc = desc;
	}
	
	public int getIndex() {
		return index;
	}
	
	@Override
	public String toString() {
		return desc;
	}
	//是不是周末
	public boolean isRest() {
		return false;
	}
}
