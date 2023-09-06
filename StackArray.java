import java.util.Scanner;
    
class StackOperations {
        int top;
        int val;
        int array[]= new int[5];
        
        public void push(Scanner sc){
            if(top==5){
                System.out.println("Stack is full");
            } else{ 
                System.out.println("Enter value to push");
                int val = sc.nextInt();
                top = top +1;  
                array[top] = val;   
                System.out.println("Item "+val+" puhsed");
            }
        }
        public void pop(){
            if(top==-1){
                System.out.println("Sack is empty");
            } else {
                top--;
                System.out.println("Last item is poped");
            }
            
        } 
        public void peek(){
            if(top!=-1 && top!=5){
                System.out.println("The last element is "+array[top]);
            }
        }
        public void exit(){
            System.out.println("exited");
            System.exit(0);
        }
    }
    public class StackArray{
    public static void main(String args[]){
        int choice;
        Scanner sc = new Scanner(System.in);  
        StackOperations stackchoice =new StackOperations();
        do{
            System.out.println("------------------------Stack operations:\n1.push\n2.pop\n3.peek\n4.exit\nEnter your choice:");
            choice = sc.nextInt();
                switch(choice) {
                case 1:
                stackchoice.push(sc);
                break;
                case 2:
                stackchoice.pop();
                break;
                case 3:
                stackchoice.peek();
                break;
                case 4:
                System.out.println("exited");
                System.exit(0);
                break;
                default:
                System.out.println("No such choice");
            }
        } while(choice!=5);
    }
}