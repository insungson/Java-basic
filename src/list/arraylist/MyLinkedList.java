package list.arraylist;

public class MyLinkedList {			//linked list는 인덱스가 따로 없다. 그러므로 삭제나 삽입시  맨처음 맨끝 중간에 삽입하려면 매서드를 따로 만들어야 한다.

    private Node head;	//
    private int size;	//myarraylist의 length와 같다. 

    public MyLinkedList(){
        head = null;	//기본적으로 null값이다.
        size = 0;
    }

    /**
     * 특정 인덱스에 새로운 노드를 추가한다.
     * @param index
     * @param newNode
     */
    public void add(int index, Node newNode){
        //첫번째 노드인 경우
        Node nextNode = null;
        if(index == 0 ){
            if(this.head == null){			//head값이 있는지 없는지 확인..
                this.head = new Node();		//없으면 head 생성하고 
                this.head.setNext(newNode);	//그 다음에 node를 넣는다.
            } else{
                nextNode = this.head.getNext();	//head가 없으면 계속 추가하기전까지 확인해본다.
                newNode.setNext(nextNode);		//그 다음 node로 넘어간다.
                this.head.setNext(newNode);		//그다음 node에 넣는다.
            }

        } else {
            //첫번째 노드가 아닌경우
            if( index < 0 || index > this.size-1 ) {throw new IndexOutOfBoundsException();}	// 인덱스는 입력값이기 때문에 

            Node p = this.head;

            for(int i = 0; i < index-1; i++){		//인덱스-1을 하는 이유는 그 앞에 데이터를 넣기 위해서이다...
            												//인덱스에 대한 정보가 없기 때문에 for문을 돌려서 따로 인덱스를 만들어 주었다.

                p = p.getNext();								//다음 노드값을 갈수있게 경로? 지정을 한다.

                if(index < this.size) nextNode = p.getNext();	//20번쨰 줄의 null값에 다음 경로값을 준다.

            }
                if(nextNode != null) newNode.setNext(nextNode);	//위에서 null값 -> 다음경로값이 들어갔고 새로운 노드가 만들어지고 다음경로가 설정이 된다.

                p.setNext(newNode);		//	      이화살표의 경로를 없앰
        }								// 노드/데이터  ---x--> 노드/데이터-------->노드/데이터
        								//		-->노드/데이터---->
        this.size++;					//	  이쪽으로 새로 경로가 재설정되어 연결된다.
    }

    /**
     * 마지막노드로 새로운 노드를 추가한다.
     * @param index
     * @param newNode
     */
    public void add(Node newNode){
        //첫번째 노드인 경우
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
     * 해당 index의 노드를 삭제한다.
     * @param index
     * @param node
     */
    public void remove(int index){
        //
        Node headNode = this.head;		
        if(headNode == null){System.out.println("삭제할 데이터가 없습니다.");}
        Node p = headNode;

        for(int i = 0; i < index-1; i++){
            p = p.getNext();
        }
        p.setNext(p.getNext().getNext());
        this.size--;
        //
    }

    /**
     * 마지막 노드를 리턴한다.
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
        System.out.println("<<LinkedList Data출력>>");
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
