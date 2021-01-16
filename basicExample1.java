public class Manager{

     public static void main(String []args){
        Calculator c1 = new Calculator();
        float result = c1.divide(4,5);
        
        System.out.println( result );
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
         
         

}
