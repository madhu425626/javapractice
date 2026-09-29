//exception problems of class notes
package com.madhu.Clone;

public class cloneMain {

	public static void main(String []args) throws CloneNotSupportedException
	{
		
		Student s1 = new Student(1,"Krishna");
		Student s2 = (Student)s1.clone(); //clone object is created
		
		IO.println(s1+" "+s2);
		
		s1.setId(2);
		s1.setName("balram");
		
		IO.println(s1+" "+s2);//clone object data s2 remains unchanged
	}
	
}

class Student implements Cloneable
{
	int id;
	String name;
	
	
	public int getId() {
		return id;
	}


	public void setId(int id) {
		this.id = id;
	}


	public String getName() {
		return name;
	}


	@Override
	public String toString() {
		return "cloneMain [id=" + id + ", name=" + name + "]";
	}


	public void setName(String name) {
		this.name = name;
	}


	
	
	
	public Student(int id, String name) {
		super();
		this.id = id;
		this.name = name;
	}
	
	public Object clone() throws CloneNotSupportedException
	{
		return super.clone();
	}
}


