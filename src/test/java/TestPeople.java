import learnerlab.Person;
import org.junit.Assert;
import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

public class TestPeople {
    @Test
    public void testAdd() {
        List<Person> people = new ArrayList<Person>();
        Person aj = new Person("AJ");
        people.add(aj);

        Assert.assertEquals(1, people.size());
    }

    @Test
    public void testRemove() {
        List<Person> people = new ArrayList<Person>();
        Person aj = new Person("AJ");
        people.add(aj);
        people.remove(aj);

        Assert.assertEquals(0, people.size());
    }

    @Test
    public void testFindById(){
        List<Person> people = new ArrayList<>();
        Person aj = new Person(254616L, "AJ");
        people.add(aj);

        long expectedId = 254616L;
        //test find by id
//        people.findById(254616L);

        Assert.assertEquals(expectedId, aj.getId());
    }
}
