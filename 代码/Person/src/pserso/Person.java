package pserso;

public class Person implements Comparable<Person> {
    String name;
    int age;

    public Person(String name, int age)    {
       this.name = name;
        this.age = age;
    }

    public String getName()    {
        return name;
    }

    public int getAge()    {
        return age;
    }
    @Override
    public int compareTo(Person p)     {
        return this.age-p.getAge();
    }
}
