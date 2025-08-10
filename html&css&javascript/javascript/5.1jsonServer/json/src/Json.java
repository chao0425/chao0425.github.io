import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;

import java.util.Objects;

public class Json{
    public static void main (String[] args) throws JsonProcessingException {
        Person person = new Person("Bob",23);

        // 这样的话就是对象转化为了字符串
        ObjectMapper objectMapper = new ObjectMapper();
        String personStr = objectMapper.writeValueAsString(person);

        System.out.println(personStr);

        String str = "{\"name\":\"Bob\",\"age\":23}";

        // 可以发现由json字符串转化为了对象
        Person per = objectMapper.readValue(str,Person.class);
        System.out.println("per's name is : " + per.getName() + " age is : " + per.getAge());
    }

}
// https://repo1.maven.org/maven2/com/fasterxml/jackson/core/jackson-annotations/2.13.2/
// https://repo1.maven.org/maven2/com/fasterxml/jackson/core/jackson-databind/2.13.2/
// https://repo1.maven.org/maven2/com/fasterxml/jackson/core/jackson-core/2.13.2/

class Person {
    private String name;
    private int age;

    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public Person() {
        this.name = null;
        this.age = -1;
    }

    public String getName() {
        return this.name;
    }

    public int getAge() {
        return this.age;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setAge(int age) throws Exception {
        if (age < 0) {
            throw new Exception("fuck");
        } else {
            this.age = age;
        }
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Person person = (Person) o;
        return age == person.age && Objects.equals(name, person.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, age);
    }
}