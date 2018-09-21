package list.arraylist;

public class LinkedListTest {

    public static void main(String[] args) {
        int[] array =  {66, 33, 99, 55, 88, 22, 24, 77};

        //MyArrayList테스트
        System.out.println("<<<<<<<<<<<< MyArrayList테스트 >>>>>>>>>>>>>");

        MyArrayList myArrayList = new MyArrayList(array.length);	//생성자는 default와 length 두개이따.

        for(int i = 0; i < array.length; i++){
            myArrayList.add(array[i]);
        }

        myArrayList.add(18);
        System.out.println("마지막 인덱스에 '18'추가");

        for(int i = 0; i < myArrayList.length; i++){
            System.out.print(myArrayList.get(i) + ", "); 
        }

        System.out.println("");
        System.out.println("MyArrayList의 사이즈:"+ myArrayList.length);
        System.out.println("");
        System.out.println("");

        myArrayList.add(3, 20);
        System.out.println("3번째 인덱스에 '20'추가");
        for(int i = 0; i < myArrayList.length; i++){
            System.out.print(myArrayList.get(i) + ", ");
        }

        System.out.println("");
        System.out.println("MyArrayList의 사이즈:"+ myArrayList.length);
        System.out.println("");
        System.out.println("");

        myArrayList.remove();

        System.out.println("마지막 인덱스 삭제");
        for(int i = 0; i < myArrayList.length; i++){
            System.out.print(myArrayList.get(i) + ", ");
        }

        System.out.println("");
        System.out.println("MyArrayList의 사이즈:"+ myArrayList.length);
        System.out.println("");
        System.out.println("");

        myArrayList.remove(3);
        System.out.println("3번째 인덱스 삭제");
        for(int i = 0; i < myArrayList.length; i++){
            System.out.print(myArrayList.get(i) + ", ");
        }

        System.out.println("");
        System.out.println("MyArrayList의 사이즈:"+ myArrayList.length);
        System.out.println("");
        System.out.println("");

        System.out.println("<<<<<<<<<<<< MyLinkedList테스트 >>>>>>>>>>>>>");

        MyLinkedList myLinkedList = new MyLinkedList();
        Node node = null;

        printData(array);
        System.out.println("");
        for(int i = 0; i < array.length; i++){
            node = new Node();
            node.setData(array[i]);
            myLinkedList.add(node);
        }

        System.out.println("LinkedList size : " + myLinkedList.getSize());
        System.out.println("");

        Node lastNode =  myLinkedList.get();

        System.out.println("Last Node data : "+ lastNode.getData());
        System.out.println("");

        Node addNode = new Node();
        addNode.setData(100);

        myLinkedList.add(3, addNode);
        System.out.println("3번째 인덱스에 새로운 노드를 추가한다.");
        myLinkedList.printList();
        System.out.println("");
        System.out.println("");

        System.out.println("3번째 인덱스의 노드를 삭제한다.");
        myLinkedList.remove(3);
        myLinkedList.printList();

    }

    public static void printData(int[] data){
        System.out.println("<<원 데이터 출력>>");
        for(int i = 0; i < data.length; i++){
            System.out.print(data[i] +", ");
        }
        System.out.println("");
    }

}
