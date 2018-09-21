package list.arraylist;

public class Node {
	private Node next;		//이값이 다음 링크를 가르킨다. 

    private int data;		//이게 이 노드의 데이터값이다.

    /**
     * @return the next
     */
    public Node getNext() {		//다음 노드를 가져오는 것이다.
        return next;
    }

    /**
     * @param next the next to set
     */
    public void setNext(Node next) {		//다음 노드를 세팅하는것이다.
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
