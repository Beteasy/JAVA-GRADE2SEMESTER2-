public class UniverStudent extends Student {
   boolean isMarriage; //���������Ľ������

   UniverStudent(int number,String name,boolean b) {
      super(number,name);
      isMarriage = b;

   }

   public boolean getIsMarriage(){
      return isMarriage;
   }
}

