
public class OverloadedMethods {

  public static void main(String[] args) {
    //create instance here
    OverloadedMethods om = new OverloadedMethods();
    om.print();
  }

  //overload methods here
  public void print(){
    System.out.println("original print method.");
  }
}
