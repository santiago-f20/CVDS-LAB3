/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package edu.eci.cvds.tdd.registry;

import java.util.ArrayList;

/**
 *
 * @author santiago.fetecua
 */
public class Registry {
    
    private Person person;
    private ArrayList<Integer> registros = new ArrayList<>();
    
    public RegisterResult registerVoter(Person p) {
        this.person = p;
        
        RegisterResult result = null;
        if (person.getAge() < 18){
            result = RegisterResult.UNDERAGE;
        } else if(person.isAlive() == false){
            result = RegisterResult.DEAD;
        } else if(registros.contains(p.getId())){
            result = RegisterResult.DUPLICATED;
        }
        else{
            result = RegisterResult.VALID;
            registros.add(p.getId());
        }
        return result;
    }
    
    
}
