
public class nestedifelse{

	public static void main(String[] args) {
int test1=5, test2=3;

if(test1==5 & test2==3)
{
	System.out.println("Hi, test 1 is equal to 5 and test 2 is equal to 3 ");
}
	
else if(test1==5 & test2!=3)
{
	System.out.println("Hi, test 1 is equal to 5 and test 2 is some value other than 3 ");
}
	
else if(test1==4)
{
	System.out.println("Hi, test 1 is 4");
}	

else if(test1==3 & test2==3)
{
	System.out.println("Hi, test 1 is equal to 3 and test 2 is equal to 3 ");
}

else if(test1==3 & test2==2)
{
	System.out.println("Hi, test 1 is equal to 3 and test 2 is equal to 2 ");
}
	
else if(test1!=5 & test1!=4 & test1!=3) {
	
System.out.println("Hi, test1 is some value other than 5,4 & 3 ");
}
}
}
