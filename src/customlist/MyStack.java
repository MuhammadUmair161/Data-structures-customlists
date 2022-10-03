
package customlist;

/**
 *
 * @author Muhammad Umair
 */
public class MyStack {
    int[] Array = new int[0];
    
    public void push(int value){
        int[] temp = new int[Array.length+1];
        
        for(int i=0; i<Array.length; i++){
            temp[i]=Array[i];
        }
        temp[temp.length-1]= value;
        
        Array = temp;
    }
    
    public void pop(){
//        switch(Array == new int[0]){
//            case 0:
//                
//        }
//    if(Array.length==0)
//    {
//        throw ;
//    }
            if(Array != new int[0]){
                int [] temp = new int [Array.length-1];

                for(int i=0; i<temp.length; i++){
                    temp[i]=Array[i];
                }
                Array = temp;
            }
        }
    public void fetch(){
        for(int i:Array){
            System.out.println(i);
        }
    }
}
