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
    
    @Test
    public void testRegisterClient(){
        assertTrue(testCompany.registerClient(new User("José Manuel", "911111111", "zemanel@yahoo.com")));
        assertTrue(testCompany.registerClient(new User("António Francisco", "922222222", "tochico@hotmail.com")));
    }
    
    @Test
    public void testRegisterClientDuplicate(){
        testCompany.registerClient(new User("José Manuel", "911111111", "zemanel@yahoo.com"));
        assertFalse(testCompany.registerClient(testCompany.getClients().get(0)));
        testCompany.registerClient(new User("António Francisco", "922222222", "tochico@hotmail.com"));
        assertFalse(testCompany.registerClient(testCompany.getClients().get(1)));
    }
    
    @Test
    public void testRegisterClientNull(){
        assertFalse(testCompany.registerClient(null));
    }
    
    @Test
    public void testRegisterSeller(){
        assertTrue(testCompany.registerSeller(new User("Fernando Fernandes","966777101","fefe@remax.pt")));
        assertTrue(testCompany.registerSeller(new User("Rodrigo Rodrigues","966777152","roro@remax.pt")));
    }
    
    @Test
    public void testRegisterSellerDuplicate(){
        
        testCompany.registerSeller(new User("Fernando Fernandes","966777101","fefe@remax.pt"));
        testCompany.registerSeller(new User("Rodrigo Rodrigues","966777152","roro@remax.pt"));
        assertFalse(testCompany.registerSeller(testCompany.getSellers().get(0)));
        assertFalse(testCompany.registerSeller(testCompany.getSellers().get(1)));
        
    }
    
    @Test
    public void testRegisterSellerNull(){
        assertFalse(testCompany.registerSeller(null));
    }
    
    
    @Test
    public void testRegisterProperty(){
        assertTrue(testCompany.registerProperty(new Property ("Casa de Luxo", 999999999999.9)));
        assertTrue(testCompany.registerProperty(new Property ("Casa Triste", 1.0)));
    }
    
     public void testRegisterPropertyDuplicate(){
        testCompany.registerProperty(new Property ("Casa de Luxo", 999999999999.9));
        assertFalse(testCompany.registerProperty(testCompany.getProperties().get(0)));
        testCompany.registerProperty(new Property ("Casa Triste", 1.0));
        assertFalse(testCompany.registerProperty(testCompany.getProperties().get(1)));
    }
    
    public void testRegisterPropertyNull(){
        assertFalse(testCompany.registerProperty(null));
    }
        
}