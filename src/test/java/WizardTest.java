import static org.junit.Assert.*;
import org.junit.*;
import wizard_management.beasts.Dragon;
import wizard_management.cleaning.Broomstick;
import wizard_management.people.Wizard;


public class WizardTest {

    Wizard wizard;
    Broomstick broomstick;

    @Before
    public void before(){
        broomstick = new Broomstick("Nimbus", 10);
        wizard = new Wizard("Toby", broomstick);
    }

    @Test
    public void hasName(){
        assertEquals("Toby", wizard.getName());
    }

    @Test
    public void hasBroomstick(){
        Broomstick ride = (Broomstick) wizard.getRide();
        assertEquals("Nimbus", ride.getBrand());
    }

    @Test
    public void canFly(){
        assertEquals(wizard.fly(),"mounting broom, running, skipping, flying!");
    }

    @Test
    public void canFlyDragon() {
        Dragon dragon = new Dragon("Tilly");
        wizard = new Wizard("Toby", dragon);
        assertEquals("Standing up tall, beating wings!", wizard.fly());
    }

    @Test
    public void canSetRide() {
        Dragon dragon = new Dragon("Erik");
        wizard.setRide(dragon);
        assertEquals("Standing up tall, beating wings!", wizard.fly());
    }
}
