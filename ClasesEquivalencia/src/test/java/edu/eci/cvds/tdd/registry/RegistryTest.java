/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package edu.eci.cvds.tdd.registry;
import static edu.eci.cvds.tdd.registry.Gender.*;
import org.junit.Assert;
import org.junit.Test;
/**
 *
 * @author santiago.fetecua
 */
public class RegistryTest {
    private Registry registry = new Registry();

    @Test
    public void validateRegistryResult() {

        Person person = new Person("Carlitos", 123, 19, MALE, true);

        RegisterResult result = registry.registerVoter(person);

        Assert.assertEquals(RegisterResult.VALID, result);
    }
    
    @Test
    public void validateAge() {
        Person person = new Person("Carlitos", 123, 16, MALE, true);
        
        RegisterResult result = registry.registerVoter(person);
        
        Assert.assertEquals(RegisterResult.UNDERAGE, result);
    }
    
    @Test
    public void validateAlive() {
        Person person = new Person("Carlitos", 123, 20, MALE, false);
        
        RegisterResult result = registry.registerVoter(person);
        
        Assert.assertEquals(RegisterResult.DEAD, result);
    }
    
    @Test
    public void validateDuplicated() {
        Person person = new Person("Carlitos", 123, 20, MALE, true);
        Person person1 = new Person("Pepito", 123, 20, MALE, true);
        
        RegisterResult result = registry.registerVoter(person);
        RegisterResult result2 = registry.registerVoter(person1);
        
        Assert.assertEquals(RegisterResult.DUPLICATED, result2);
    }
    
    @Test
    public void validateValidAge() {
        Person person = new Person("Carlitos", 123, -5, MALE, true);
        RegisterResult result = registry.registerVoter(person);

        Assert.assertEquals(RegisterResult.INVALID_AGE, result);
    }
}
