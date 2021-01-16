public class Manager{

     public static void main(String []args){
        Calculator c = new Calculator();
        // c.multiplicationTable(0, 10);
        c.dogAndCat(0, 10);
     }
     
}


class PlayGround{
    public void ForLoops(){
        
        
        
    }
}

class Calculator{
    
      public float add(float number1, float number2){
         return number1 + number2;    }
   
      public float subtract(float number1, float number2){
         return number1 - number2;    }
    
      public float multiply(float number1, float number2){
         return number1 * number2;    }
         
      public float divide(float number1, float number2){
         return number1 / number2;    }

      public void dogAndCat(int start, int end){
          // practice using a for loop
          for (int i = 0; i<10 ; i++){
              System.out.println(i);
          }
          
    
      }    
}
