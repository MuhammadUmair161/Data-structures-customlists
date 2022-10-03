
package customlist;

/**
 *
 * @author Muhammad Umair
 */
public class MyQueue {
        int[] Array = new int[0];
    
    public void inQueue(int value){
        int[] temp = new int[Array.length+1];
        
        for(int i=0; i<Array.length; i++){
            temp[i]=Array[i];
        }
        temp[temp.length-1]= value;
        
        Array = temp;
    }
    
    public void deQueue(){
        int [] temp = new int [Array.length-1];
        
            for(int i=0; i<temp.length; i++){
                temp[i]=Array[i+1];
            }
        Array = temp;
       
    }
    public void fetch(){
        for(int i:Array){
            System.out.println(i);
        }
    }
}
