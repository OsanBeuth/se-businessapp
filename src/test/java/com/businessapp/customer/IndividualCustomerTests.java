package com.businessapp.customer;
import org.junit.Test;
import com.businessapp.model.IndividualCustomer;
import java.util.Date;
import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.*;

public class IndividualCustomerTests
{
    IndividualCustomer person = new IndividualCustomer();
   
    @Test
    public void testFirstName()
    {
        person.setFirstName("Osan");
        assertEquals("Osan", person.getFirstName());
        
        person.setId("");
        assertEquals("", person.getId());
        
        person.setId(null);
        assertEquals(null, person.getId());
    }
    
    @Test
    public void testName()
    {
        person.setName("Flüssigseife");
        assertEquals("Flüssigseife", person.getName());
        
        person.setId("");
        assertEquals("", person.getId());
        
        person.setId(null);
        assertEquals(null, person.getId());
    }
    
    
    @Test
    public void testid()
    {
        person.setId("2729930");
        assertEquals("2729930", person.getId());
        
        person.setId("");
        assertEquals("", person.getId());
        
        person.setId(null);
        assertEquals(null, person.getId());

        
    }
    
    
    @Test
    public void testcreated()
    {
        person.setCreated(new Date(2017,12,12));
        assertEquals(new Date(2017, 12, 12), person.getCreated());
        
        person.setId(null);
        assertEquals(null, person.getId());
    }
    
}
