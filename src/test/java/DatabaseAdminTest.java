
import org.junit.Before;
import org.junit.Test;
import staff.techStaff.DatabaseAdmin;

import static org.junit.Assert.assertEquals;

public class DatabaseAdminTest {
    DatabaseAdmin databaseAdmin;

    @Before
    public void before(){
        databaseAdmin = new DatabaseAdmin("Sarah","SC910998", 2000);
    }

    @Test
    public void getName() {
        assertEquals("Sarah", databaseAdmin.getName());
    }
    @Test
    public void getNiNumber() {
        assertEquals("SC910998", databaseAdmin.getNiNumber());
    }
    @Test
    public void getSalary() {
        assertEquals(2000, databaseAdmin.getSalary());
    }

    @Test
    public void raiseSalary() {
        assertEquals(2200, databaseAdmin.raiseSalary(200), 0.0);
    }

    @Test
    public void payBonus() {
        assertEquals(2020, databaseAdmin.payBonus(), 0.0);
    }
    @Test
    public void raiseSalaryIsNegative() {
        assertEquals(-20, databaseAdmin.raiseSalary(-20), 0.0);
    }
    @Test
    public void setName() {
        databaseAdmin.setName("");
        assertEquals("", databaseAdmin.getName());
    }

}
