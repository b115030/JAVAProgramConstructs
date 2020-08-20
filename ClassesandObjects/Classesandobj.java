import java.lang.reflect.*;
public class Classesandobj implements Cloneable{

	String name;
	int age;
	String type;
	String color;
	Classesandobj(String name, String type,int age,String color){
		this.name=name;
		this.age=age;
		type="chihuahua";
		color="yellow";
		
	}
	public String getEverything() {
		System.out.println("name right now"+name);
		System.out.println("age right now"+age);
		System.out.println("type right now"+type);
		System.out.println("color right now"+color);
		return name;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Classesandobj object=new Classesandobj("Tuff","Labrador",12,"Brown");
	System.out.println(object.name);	
	System.out.println(object.age);
	System.out.println(object.type);
	System.out.println(object.color);
	try{
		//Not creating a new object. Just copying the previous into a new one.
		Classesandobj obj2=(Classesandobj)object.clone();//Cloned object does not invoke constructor
		System.out.println(obj2.type);
		}
	catch(CloneNotSupportedException e)
	{
		e.printStackTrace();
	}
	try{
		//using newInstance() of Constructor Class
		Constructor<Classesandobj> construct= Classesandobj.class.getDeclaredConstructor();
		Classesandobj object2=construct.newInstance();
		System.out.println(object2.getEverything());
	}
	catch (Exception e)
	{
		e.printStackTrace();
	}
	}

}
