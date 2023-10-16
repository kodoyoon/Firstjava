package collection;

import java.util.LinkedList;
import java.util.Queue;

public class Col4 {
  public static void main(String[] args) {
    //Queue : FIFO
    //add , peek, poll
    //QuEUE: 생성자가 없는 인터페이스

    Queue<Integer> intQueue = new LinkedList<>(); //queue 를 선언,생성
    intQueue.add(1);
    intQueue.add(5);
    intQueue.add(9);

    while(!intQueue.isEmpty()) {
      System.out.println(intQueue.poll());
    }
      //추가
      intQueue.add(1);
      intQueue.add(5);
      intQueue.add(9);
      intQueue.add(10);
      //peek
      System.out.println(intQueue.peek()); //맨 먼저 넣은게 맨 먼저 조회가 됐다.
      System.out.println(intQueue.size());

  }
}
