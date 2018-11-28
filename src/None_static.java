public class None_static {
//calling non-static into static area, you can use object.method;

    int ans;
    public void addition (int a ,int b ){
       ans=a+b;
      System.out.println("Total "+ ans);

    }

   public static void main(String[] args) {
        None_static x=new None_static();

        x.addition(10,20);
        x.addition(20,30);



    }
}
