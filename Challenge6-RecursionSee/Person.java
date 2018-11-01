/**
 * @author donghan2
 *
 */
public class Person
{
private final String name;
private final int age;
private final char gender;
private final Person child1; //left child
private final Person child2; //right child
 
public Person(String name, int age, char gender, Person c1, Person c2)
{
    this.name=name;
    this.age=age;
    this.gender=gender;
    this.child1 = c1;
    this.child2 = c2;
}

public String toString()
{
    return name+"*"+age+"*"+gender;
}

public String getName() 
{
	return name;
}

public int getAge() 
{
	return age;
}

public char getGender() 
{
	return gender;
}

public boolean equals(Person p)
{
	return (this.name.equals(p.name)) && (this.age==p.age &&(this.gender==p.gender));
}


public void print() 
{
   TextIO.putln(this);
   if(child1 != null)
       child1.print();
   if(child2 != null)
       child2.print();
   
}

public int count() // total person count including this object
{
	//YOUR CODE HERE
	int count = 1;
	if (child1 ==null&& child2 == null){
		return 1;
	}
	if (child1 != null){
		count += child1.count();
	}
	if(child2 != null){
		count += child2.count();
	}
	return count;
}

public int countGrandChildren(){// but not greatGrandChildren
	//YOUR CODE HERE

	int count = 0;
	if (child1 ==null&& child2 == null){
		return 0;
	}
	if (child1!= null){
		 if(child1.child1 != null){
             count++;
     }
		 if(child1.child2 != null){
             count++;
		 }
	}
	if(child2 != null){
		if(child2.child1!=null){
             count++;
     }
		if(child2.child2 != null){
             count++;
     }
}
	return count;
	
}
public int countMaxGenerations()
{
	//YOUR CODE HERE
	int max = 1;
	if (child1==null&&child2==null){
		return 1;
	}
	if (child1 != null){
		max = Math.max(child1.countMaxGenerations()+1, max);
		
	}
	if (child2 != null){
		max = Math.max(child2.countMaxGenerations()+1,max );
	}
	return max;
}

public int countGender(char gen)
{
	//YOUR CODE HERE
	int count = 0;
	if (child1 == null && child2 == null){
		if(gender == gen){
			return 1;
		}
		return 0;
	}
	if (this.gender == gen){
		count++;
	}
	if (this.child1 != null){
		count += child1.countGender(gen);
	}
	if(this.child2 != null){
		count += child2.countGender(gen);
	}
	return count;
}


public Person search(String name, int maxGeneration)
{
	//YOUR CODE HERE
	Person p = null;
	if (this.name.equals(name)) {
		return this;
	}
	if (maxGeneration ==0){
		return null;
	}
	if (maxGeneration > 0) {
		if (this.child1 != null && p == null ) {
			p = this.child1.search(name, maxGeneration-1);
		}
		if (this.child2 != null && p == null){
			p = this.child2.search(name, maxGeneration-1);
		}
	}
	return p;
}


} // end of class