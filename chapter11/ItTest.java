import java.util.*;
class Dog {
	public String name;
	Dog(String n) { name = n;}
}
class ItTest {
	public static void main(String[] args) {
		List<Dog> d = new ArrayList<Dog>();
		Dog dog = new Dog("aiko");
		d.add(dog);
		d.add(new Dog("clover"));
		d.add(new Dog("mangolia"));
		Iterator<Dog> i3  = d.iterator();
		while(i3.hasNext()) {
			Dog d2 = i3.next();
			System.out.println(d2.name);
		}
		System.out.println("size " + d.size());
		System.out.println("get1 " + d.get(1).name);
		System.out.println("aiko " + d.indexOf(dog));
		d.remove(2);
		Object[] oa = d.toArray();
		for(Object o : oa) {
			Dog d2 = (Dog)o;
			System.out.println("oa " + d2.name);
		}
	}
}

/*

jaykrishnanc@jaya-Satellite-C655D:~/javapgms/Java/chapter11$ java ItTestPicked up JAVA_TOOL_OPTIONS: -javaagent:/usr/share/java/jayatanaag.jar 
aiko
clover
mangolia
size 3
get1 clover
aiko 0
oa aiko
oa clover

*/
