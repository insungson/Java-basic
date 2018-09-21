package list.arraylist;

public class Node {
	private Node next;		//�̰��� ���� ��ũ�� ����Ų��. 

    private int data;		//�̰� �� ����� �����Ͱ��̴�.

    /**
     * @return the next
     */
    public Node getNext() {		//���� ��带 �������� ���̴�.
        return next;
    }

    /**
     * @param next the next to set
     */
    public void setNext(Node next) {		//���� ��带 �����ϴ°��̴�.
        this.next = next;
    }

    /**
     * @return the data
     */
    public int getData() {
        return data;
    }

    /**
     * @param data the data to set
     */
    public void setData(int data) {
        this.data = data;
    }

}
