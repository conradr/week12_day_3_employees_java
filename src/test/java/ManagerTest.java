
import org.junit.Before;
import org.junit.Test;
import staff.management.Manager;

import static org.junit.Assert.assertEquals;

public class ManagerTest {
    Manager manager;

    @Before
    public void before(){
        manager = new Manager("Jackie","SC910998", 2000, "Tech");
    }

    @Test
    public void getName() {
        assertEquals("Jackie", manager.getName());
    }
    @Test
    public void getNiNumber() {
        assertEquals("SC910998", manager.getNiNumber());
    }
    @Test
    public void getSalary() {
        assertEquals(2000, manager.getSalary());
    }

    @Test
    public void raiseSalary() {
        assertEquals(2200, manager.raiseSalary(200), 0.0);
    }

    @Test
    public void payBonus() {
        assertEquals(2020, manager.payBonus(), 0.0);
    }
    @Test
    public void raiseSalaryIsNegative() {
        assertEquals(-20, manager.raiseSalary(-20), 0.0);
    }
    @Test
    public void setName() {
        manager.setName("Mary");
        assertEquals("Mary", manager.getName());
    }
}
