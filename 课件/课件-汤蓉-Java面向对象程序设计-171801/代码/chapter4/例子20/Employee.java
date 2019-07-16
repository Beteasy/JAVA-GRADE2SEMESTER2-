public class Employee {
   public int number;

   /** Employee是一个构造方法，无类型。
       @param number 是雇员的号码
   */
   public Employee (int number){
    
     this.number=number;
     
   } 
   /** getNumber是一个实例方法。
       @return  该方法返回一个整数，即返回number.  
   */
   public int getNumber(){
     return number;
   }
}
