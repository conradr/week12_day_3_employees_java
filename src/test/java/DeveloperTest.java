
import org.junit.Before;
import org.junit.Test;
import staff.techStaff.DatabaseAdmin;
import staff.techStaff.Developer;

import static org.junit.Assert.assertEquals;

public class DeveloperTest {
    Developer developer;

    @Before
    public void before(){
        developer = new Developer("John","SC910998", 2000);
    }

    @Test
    public void getName() {
        assertEquals("John", developer.getName());
    }
    @Test
    public void getNiNumber() {
        assertEquals("SC910998", developer.getNiNumber());
    }
    @Test
    public void getSalary() {
        assertEquals(2000, developer.getSalary());
    }

    @Test
    public void raiseSalary() {
        assertEquals(2200, developer.raiseSalary(200), 0.0);
    }

    @Test
    public void payBonus() {
        assertEquals(2020, developer.payBonus(), 0.0);
    }
    @Test
    public void raiseSalaryIsNegative() {
        assertEquals(-20, developer.raiseSalary(-20), 0.0);
    }
    @Test
    public void setName() {
        developer.setName("Mary");
        assertEquals("Mary", developer.getName());
    }
}
