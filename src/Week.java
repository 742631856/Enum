import java.io.Serializable;


public enum Week implements Serializable {//ö�ٿ���ʵ�ֽ�ڣ������ܼ̳�������
	//����7������, ��7��������Կ�����Week������ʵ��
	MON(1),	//����൱�� �����˹��췽�� Week(1),���û�ж��幹�췽������ô����ͻ�������
	TUE(2),
	WED(3),
	THU(4),
	FRI(5),
	SAT(6) {
        public boolean isRest() {	//����Week��isRest��Week�б�����isRest��������Ȼ�������û����
            return true;
        }
    },
	SUN(0, "������") {
    	@Override
    	public boolean isRest() {
    		return true;
    	}
    };
	
	//����� ���󣬶���������� "����"��"����"
	private int index;	//������������������ֵ
	private String desc = "";
	
	private Week(int index) {	//���췽��������˽�е�
		this.index = index;
	}
	

	Week(int index, String desc) {//���Ĭ����˽�е�
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
	//�ǲ�����ĩ
	public boolean isRest() {
		return false;
	}
}
