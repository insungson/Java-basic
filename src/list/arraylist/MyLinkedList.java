package list.arraylist;

public class MyLinkedList {			//linked list�� �ε����� ���� ����. �׷��Ƿ� ������ ���Խ�  ��ó�� �ǳ� �߰��� �����Ϸ��� �ż��带 ���� ������ �Ѵ�.

    private Node head;	//
    private int size;	//myarraylist�� length�� ����. 

    public MyLinkedList(){
        head = null;	//�⺻������ null���̴�.
        size = 0;
    }

    /**
     * Ư�� �ε����� ���ο� ��带 �߰��Ѵ�.
     * @param index
     * @param newNode
     */
    public void add(int index, Node newNode){
        //ù��° ����� ���
        Node nextNode = null;
        if(index == 0 ){
            if(this.head == null){			//head���� �ִ��� ������ Ȯ��..
                this.head = new Node();		//������ head �����ϰ� 
                this.head.setNext(newNode);	//�� ������ node�� �ִ´�.
            } else{
                nextNode = this.head.getNext();	//head�� ������ ��� �߰��ϱ������� Ȯ���غ���.
                newNode.setNext(nextNode);		//�� ���� node�� �Ѿ��.
                this.head.setNext(newNode);		//�״��� node�� �ִ´�.
            }

        } else {
            //ù��° ��尡 �ƴѰ��
            if( index < 0 || index > this.size-1 ) {throw new IndexOutOfBoundsException();}	// �ε����� �Է°��̱� ������ 

            Node p = this.head;

            for(int i = 0; i < index-1; i++){		//�ε���-1�� �ϴ� ������ �� �տ� �����͸� �ֱ� ���ؼ��̴�...
            												//�ε����� ���� ������ ���� ������ for���� ������ ���� �ε����� ����� �־���.

                p = p.getNext();								//���� ��尪�� �����ְ� ���? ������ �Ѵ�.

                if(index < this.size) nextNode = p.getNext();	//20���� ���� null���� ���� ��ΰ��� �ش�.

            }
                if(nextNode != null) newNode.setNext(nextNode);	//������ null�� -> ������ΰ��� ���� ���ο� ��尡 ��������� ������ΰ� ������ �ȴ�.

                p.setNext(newNode);		//	      ��ȭ��ǥ�� ��θ� ����
        }								// ���/������  ---x--> ���/������-------->���/������
        								//		-->���/������---->
        this.size++;					//	  �������� ���� ��ΰ� �缳���Ǿ� ����ȴ�.
    }

    /**
     * ���������� ���ο� ��带 �߰��Ѵ�.
     * @param index
     * @param newNode
     */
    public void add(Node newNode){
        //ù��° ����� ���
        if(this.head == null){
            this.head = new Node();
            this.head.setNext(newNode);

        } else {
            Node p = this.head;
            for(int i = 0; i < this.size; i++){
                p = p.getNext();
            }
                p.setNext(newNode);
        }

        this.size++;
    }

    /**
     * �ش� index�� ��带 �����Ѵ�.
     * @param index
     * @param node
     */
    public void remove(int index){
        //
        Node headNode = this.head;		
        if(headNode == null){System.out.println("������ �����Ͱ� �����ϴ�.");}
        Node p = headNode;

        for(int i = 0; i < index-1; i++){
            p = p.getNext();
        }
        p.setNext(p.getNext().getNext());
        this.size--;
        //
    }

    /**
     * ������ ��带 �����Ѵ�.
     * @return
     */
    public Node get(){

        if(this.head == null) throw new IndexOutOfBoundsException();
        Node p = head;

        for(int i = 0; i < this.size; i++){
            p = p.getNext();
        }

        return p;
    }

    public void printList(){
        System.out.println("<<LinkedList Data���>>");
        if(this.head != null){
            Node p = this.head;
            for(int i = 0; i < size; i++){
                p = p.getNext();
                if(p != null) System.out.print(p.getData()+", ");
            }
        }
    }

    /**
     * @return the size
     */
    public int getSize() {
        return size;
    }

    /**
     * @param size the size to set
     */
    public void setSize(int size) {
        this.size = size;
    }

}
