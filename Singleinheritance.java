public class Singleinheritance{
    public static void main(String[]args){
        Swift swift = new Swift();
        swift.show();
        swift.display();
    }
}
class car{
    String color;
    public car(){
        color= "blue";
    }
    public void display()
    {
        System.out.println(color);
    }
}
    class Swift extends car{
        public void show(){
            //color="red";
            System.out.println(color);
        }
    }

