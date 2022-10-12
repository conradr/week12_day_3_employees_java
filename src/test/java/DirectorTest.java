
import org.junit.Before;
import org.junit.Test;
import staff.management.Director;
import staff.management.Manager;

import static org.junit.Assert.assertEquals;

public class DirectorTest {
    Director director;

    @Before
    public void before(){
        director = new Director("Peter","SC910998", 2000, "Tech", 90000);
    }

    @Test
    public void getName() {
        assertEquals("Peter", director.getName());
    }
    @Test
    public void getNiNumber() {
        assertEquals("SC910998", director.getNiNumber());
    }
    @Test
    public void getSalary() {
        assertEquals(2000, director.getSalary());
    }

    @Test
    public void raiseSalary() {
        assertEquals(2200, director.raiseSalary(200), 0.0);
    }

    @Test
    public void payBonus() {
        assertEquals(2040, director.payBonus(), 0.0);
    }

    @Test
    public void raiseSalaryIsNegative() {
        assertEquals(-20, director.raiseSalary(-20), 0.0);
    }
    @Test
    public void setName() {
        director.setName("Mary");
        assertEquals("Mary", director.getName());
    }
}
