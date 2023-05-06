import java.util.Scanner;
public class Main {
  //prime//
    static Boolean CheckForPrime(int inputNumber)
{
boolean isItPrime = true;
 
if(inputNumber<= 1)
{
isItPrime = false;
return isItPrime;
}
else
{
for (int i =2;i<=inputNumber/2; i++){
if ((inputNumber % i) == 0){
isItPrime = false;
break;
}
}
return isItPrime;
}
}
//multipleof7//
static Boolean CheckForMultipleOf7(int inputNumber)
{
boolean isItMultipleOf7 = true;
for (int i =0;i<=inputNumber; i++){
if ((inputNumber % 7) == 0){
isItMultipleOf7= true;
}
else
{
isItMultipleOf7=false;
}
}
return isItMultipleOf7;
}
//palindrome//
static boolean CheckForPalindrome(int inputNumber)
{
    //this one was hard//
    boolean isItPalindrome = true;
    int reverse=0, element, remainder; 
    element = inputNumber;
 
    for( ;inputNumber!=0;inputNumber/=10){
      remainder= inputNumber % 10;
      reverse = (reverse * 10) + remainder;
    if (element == reverse && reverse>10){
      isItPalindrome=true;
    }
    else{
      isItPalindrome=false;
    }
    }
    return isItPalindrome;
  }
//square//
  static Boolean CheckForSquare(int inputNumber)
{
boolean isItSquare = true;
double Square = Math.sqrt(inputNumber);
for (int i =0;i<=inputNumber; i++){
if (((Square - Math.floor(Square))==0)){
isItSquare= true;
}
else
{
isItSquare=false;
}
}
return isItSquare;
}
//MAIN//
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
System.out.println("Enter the First Number :");
int FirstNum = sc.nextInt();
System.out.println("Enter the Second Number :");
int SecondNum = sc.nextInt();
System.out.println("Prime numbers between "+FirstNum+" and "+SecondNum+" : ");
for (int i = FirstNum; i <= SecondNum; i++)
{
if(CheckForPrime(i))
{
System.out.println(i);
}
}
System.out.println("MultipleOf7 numbers between "+FirstNum+" and "+SecondNum+" : ");
for (int i = FirstNum; i <= SecondNum; i++)
{
if(CheckForMultipleOf7(i))
{
System.out.println(i);
}
}
System.out.println("Palindrome numbers between "+FirstNum+" and "+SecondNum+" : ");
for (int i = FirstNum; i <= SecondNum; i++)
{
if(CheckForPalindrome(i))
{
System.out.println(i);
}
}
System.out.println("Square numbers between "+FirstNum+" and "+SecondNum+" : ");
for (int i = FirstNum; i <= SecondNum; i++)
{
if(CheckForSquare(i))
{
System.out.println(i);
}
}
sc.close();
}
}
    
