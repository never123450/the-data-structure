package java8.shengsiyuan;

import java.util.Arrays;
import java.util.List;
import java.util.function.BiFunction;
import java.util.stream.Collectors;

public class PersonTest {
    public static void main(String[] args) {
        Person person1 = new Person("zhangsan",20);
        Person person2 = new Person("lisi",30);
        Person person3 = new Person("wangwu",40);

        List<Person> personList = Arrays.asList(person1,person2,person3);

        PersonTest test = new PersonTest();

//        List<Person> personListTest = test.getPersonByUsername("zhangsan",personList);
//        personListTest.forEach(person -> System.out.println(person.getUserName()));

//        List<Person> personList1Result = test.getPersonByAge(20,personList);
//        personList1Result.forEach(person -> System.out.println(person.getUserName()));

        List<Person> personList1 = test.getPersonByAge2(20,personList,(age,persons)->{
            return personList.stream().filter(person -> person.getAge()>age).collect(Collectors.toList());
        });
        personList1.forEach(person -> System.out.println(person.getUserName()));

    }

    public List<Person> getPersonByUsername(String username,List<Person> personList){
        return personList.stream().filter(person -> person.getUserName().equals(username)).collect(Collectors.toList());
    }

    public List<Person> getPersonByAge(int age,List<Person> personList){
        BiFunction<Integer,List<Person>,List<Person>> biFunction = (ageOfPerson,persons) ->{
            return persons.stream().filter(person -> person.getAge()>ageOfPerson).collect(Collectors.toList());
        };
        return biFunction.apply(age,personList);
    }

    public List<Person> getPersonByAge2(int age,List<Person> personList,BiFunction<Integer,List<Person>,List<Person>> biFunction){
        return biFunction.apply(age,personList);
    }


}