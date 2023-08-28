//to print hello & name

class HelloName {
public static void main (String[]args){
System.out.println("Hello");
System.out.println("Kowsika");
} 
}

//add,sub,mul,div,rem

class Arithmetic {
public static void main (String[]args) {
int a=18;
int b=4;
int add = a+b;
int sub = a-b;
int mul = a*b;
double div = a/b;
int rem = a%b;
System.out.println("Addition of two numbers is "+add);
System.out.println("Subtraction of two numbers is "+sub);
System.out.println("Multiplication of two numbers is "+mul);
System.out.println("Division of two numbers is "+div);
System.out.println("Reminder is "+rem);
}
}

//swap using third var

class Swap {
public static void main (String[]args) {
int a = 15;
int b = 31;
System.out.println("Before swap");
System.out.println(a);
System.out.println(b);
int c = a;
a = b;
b = c;
System.out.println("After swap");
System.out.println(a);
System.out.println(b);
}
}

//swap without third var

class Swapp {
public static void main (String[]args) {
int a = 27;
int b = 36;
System.out.println("Before swap");
System.out.println(a);
System.out.println(b);
a = a+b;
b = a-b;
a = a-b;
System.out.println("After swap");
System.out.println(a);
System.out.println(b);
}
}

//area of circle

class AreaOfCircle {
public static void main (String[]args) {
int rad = 5;
double pi = 3.14;
double area = pi * rad * rad;
System.out.println("Area of a circle "+area);
}
}

//ASCII of given char

class Ascii {
public static void main (String[]args) {
char a = 'X';
int asciiVal = a;
System.out.println("ASCII value of given char "+asciiVal);
}
}


