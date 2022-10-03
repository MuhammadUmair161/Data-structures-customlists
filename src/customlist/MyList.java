
package customlist;

public class MyList {
    int [] Array = new int[0];
    
    public void add(int value){
        int [] temp = new int [Array.length+1];
        
        for(int i=0; i<Array.length; i++){
            temp[i] = Array[i];
        }      
        
        temp[temp.length-1] = value;
        
        Array = temp;
    }
    
    public void remove(int object , boolean def){
        int [] temp = new int [Array.length-1];
        boolean flag = false; 
        for(int i=0; i<temp.length; i++){
            if(Array[i]==object){
                flag = true;
            }
            if(flag){
                temp[i] = Array[i+1];
            }else{
                temp[i] = Array[i];
            }
        }
        Array = temp;
    }
 
    public void remove(int index){
        int [] temp = new int [Array.length-1];
        
        for(int i=0; i<temp.length; i++){
            if(i>=index){
                temp[i] = Array[i+1];
            }else{
                temp[i] = Array[i];
            }
        }
        Array = temp;
    }
    
    public void removeAll(){
        Array = new int[0];
    }
    
    public void fetch(){
        for(int i:Array){
            System.out.println(i);
        }
    }
}
