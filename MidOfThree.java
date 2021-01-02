class MiddleOfThreeNumbers
{
public static void main(String a[])
{
int num1=45;
int num2=120;
int num3=100;
findMidValue(num1,num2,num3);
}
static void findMidValue(int num1,int num2, int num3)
{
// if(num2>num1 && num1>num3 || num3>num1 && num1>num2)
 //{
      //  System.out.print(num1+"is a middle number");
  //  }
    if(num2>num1 || num2<num3 )
	{
        System.out.print(num2+"is a middle number");
    }
  /*  if(num1>num3 && num3>num2 || num2>num3 && num3>num1)
	{
        System.out.print(num3+"is a middle number");
} */
}
 }