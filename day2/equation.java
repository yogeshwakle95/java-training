/*Exercise 5
Say that you are interested in the value of the quadradic 
3X2 -8X + 4
for several values of X. Write a program that has a double precision variable X. Assign a value to 
it. Write statement that computes a value for the quadradic and stores the result in another double 
precision variable. Finally write out the result, something like: 
At X = 4.0 the value is 20.0
Run the program with several values for X (edit the program for each value of X) and examine 
the result. Use values with decimal points, large values, small values, negative values, and zero. 
Solve the equation with paper and pencil (use the quadradic formula.) The quadradic should
evaluate to zero at X = 2.0 and at X = 2/3. Try these values for X. Are the results exactly correct?*/ 




class equation
{
public static void main(String args[])
{
double x=4.0,value;
value =3*x*x-8*x+4;

System.out.println("the value is  "+value );



}
}