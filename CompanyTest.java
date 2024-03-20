

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import java.util.ArrayList;

/**
 * The test class CompanyTest.
 *
 * @author  (your name)
 * @version (a version number or a date)
 */
public class CompanyTest
{
    /**
     * Default constructor for test class CompanyTest
     */
    Company testCompany = new Company();
    public CompanyTest()
    {
    
    }

    /**
     * Sets up the test fixture.
     *
     * Called before every test case method.
     */
    @BeforeEach
    public void setUp()
    {
        
        testCompany.registerClient(new User("José Manuel", "911111111", "zemanel@yahoo.com"));
        testCompany.registerClient(new User("António Francisco", "922222222", "tochico@hotmail.com"));
        testCompany.registerSeller(new User("Fernando Fernandes","966777101","fefe@remax.pt"));
        testCompany.registerSeller(new User("Rodrigo Rodrigues","966777152","roro@remax.pt"));

    }


    /**
     * Tears down the test fixture.
     *
     * Called after every test case method.
     */
    @AfterEach
    public void tearDown()
    {
    }
    
    @Test
    public void testConstructor(){
     assertNotNull(testCompany.getClients());
     assertNotNull(testCompany.getSellers());
    }
}
