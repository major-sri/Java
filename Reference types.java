//all the types other than variable types are reference type data eg. date point(x,y) etc.


public class main{
  public static void main(String[] args){
    point point1 = new point(x:1,y:1);
    system.out.println(point1);            //output [1,1]
    point.x=2;                             //point becomes [2,1]
    
  }
}


//here point1 stores the memory address of the value of point[1,1]
