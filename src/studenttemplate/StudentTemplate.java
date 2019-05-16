/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package studenttemplate;

/**
 *
 * @author user
 */
public class StudentTemplate {

    private String name;//Encapsulation

   //constuctor
    public StudentTemplate(String n)
    {
        this.name=n;
    }
    public StudentTemplate()
    {
       
    }
    public String getName() {
        return name;
    }

    /**
     * @param name the name to set
     */
    public void setName(String name) {
        this.name = name;
    }
     
}
