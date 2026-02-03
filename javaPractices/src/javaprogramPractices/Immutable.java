package javaprogramPractices;

//1.Java Program to Create an Immutable Class

final class Immutable
{
private String name;
private int age;

Immutable(String name,int age)
{
this.name=name;
this.age=age;
}

public String getName()
{
return this.name;
}

public int getAge()
{

return this.age;
}

public static void main(String args[])
{
Immutable obj=new Immutable("jansi",4);
System.out.println("this was a immutable class program");
System.out.println("Name :"+obj.getName());
System.out.println("Age :"+obj.getAge());

}
}