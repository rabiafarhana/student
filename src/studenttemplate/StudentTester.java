/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
May 23rd,2019 */
package studenttemplate;

/**
 *
 * @author user
 */
public class StudentTester {
     public static void main(String[] args) {
        StudentTemplate s1=new StudentTemplate();//object created
        //s1.setName("rabia");
        //System.out.println(s1.getName());
         
        StudentTemplate s2=new StudentTemplate("rabia",227);//object created
        //s2.setName("shikha");
        //System.out.println(s2.getName());
        StudentTemplate s3=new StudentTemplate("shikha",2245);
        StudentTemplate[] list=new StudentTemplate[3];//Array of object for student template class
        list[0]=s1;
        list[1]=s2;
        list[2]=s3;
        for(int i=0;i<list.length;i++)
        {
    System.out.println(list[i].getName()+" " +list[i].getId());
        }
          System.out.println("Fetch Example");
     }
    
    
}
