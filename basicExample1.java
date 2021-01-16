public class Manager{

     public static void main(String []args){
        Calculator c = new Calculator();
        c.dogAndCat(0, 10);
     }
     
}


class Calculator{
    
      public float add(float number1, float number2){return number1 + number2;    }
   
      public float subtract(float number1, float number2){return number1 - number2;    }
    
      public float multiply(float number1, float number2){return number1 * number2;    }
         
      public float divide(float number1, float number2){ return number1 / number2;    }

      public void dogAndCat(int start, int end){
           
     
        for (int i = start; i < end ; i++){
            
             for (int j = start; j < end ; j++){
                 
                 // #to: use if statements to break the out put to 
                 // to make a nicely formatted table
                 System.out.println(i*j);
                 
             }
            
        }       
           

      }    
}
