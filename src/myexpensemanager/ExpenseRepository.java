/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package myexpensemanager;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Emanuel
 */
public class ExpenseRepository {
    
    private static ExpenseRepository uniqueInstance = new ExpenseRepository();
    
    private List<Expense> repository;
    
    private ExpenseRepository(){
        
        repository=new ArrayList<>();
    }
    
    public static ExpenseRepository getInstance(){
        return uniqueInstance;
        
    }
    
    public void save(Expense exp){
        repository.add(exp);
    }
}
