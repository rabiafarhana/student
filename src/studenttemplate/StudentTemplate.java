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
    private int id;

   //constuctor
    public StudentTemplate(String n,int s)
    {
        this.name=n;
        this.id=s;
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

    /**
     * @return the id
     */
    public int getId() {
        return id;
    }

    /**
     * @param id the id to set
     */
    public void setId(int id) {
        this.id = id;
    }
     
}
