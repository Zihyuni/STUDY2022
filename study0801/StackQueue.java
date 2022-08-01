import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;

public class StackQueue {

    public static void main(String[] args) {


        Stack<String> st = new Stack<String>();
        Queue<String> q = new LinkedList<String>();

        //stack은 넣은 순서중 마지막으로 넣어진 순서대로 뽑아냄
        st.push("0");
        st.push("1");
        st.push("2");
        /** stack에서는 push가 객체의 저장을 하는거임**/

        q.offer("0");
        q.offer("1");
        q.offer("2");
        /** stack에서는 offer가 객체의 저장을 하는거임**/
        /** add랑 offer랑 똑같음**/

        //큐는 넣은순서를 그대로 뽑아낸다.
        System.out.println("===============Stack===================");
        while(!st.isEmpty()){
            System.out.println(st.pop());
            /**순서대로 맨위에 저장되어있는 객체를 꺼낸다 값이 비어있을땐 emptyStackException발생**/
        }

        System.out.println("======================Queue=================");

        while (!q.isEmpty()){
            System.out.println(q.peek());
            /** 삭제 없이 읽어오는거임 근데 이거 앞에꺼만 계속 무한반복임**/
        }
//        while (!q.isEmpty()){
//            System.out.println(q.poll());
//            //poll은 큐의 front가 가르키는 값을 반환하고 삭제한다.
//        }

        System.out.println(q);
    }
}
