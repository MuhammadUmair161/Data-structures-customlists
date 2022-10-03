
package customlist;

import java.util.ArrayList;
import java.util.List;


/**

 * @author Muhammad Umair
 */
public class CustomList {
    public static void main(String[] args) {
        List<Integer> newlist = new ArrayList<Integer>();
        MyList list = new MyList();
        MyStack stack = new MyStack();
        MyQueue queue = new MyQueue();
        stack.push(1);
        stack.pop();
        stack.push(2);
        stack.push(3);
        stack.pop();
        stack.fetch();
        System.out.println("---------------------------------------");
        queue.inQueue(11);
        queue.inQueue(12);
        queue.inQueue(13);
        queue.inQueue(14);
        queue.deQueue();
        queue.deQueue();
        queue.fetch();
     
        
   
     
        
        
    }
  
}
