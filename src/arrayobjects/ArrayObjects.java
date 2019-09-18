/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package arrayobjects;

/**
 *
 * @author fakih
 */
public class ArrayObjects 
{
    public static void main(String[] args) 
    {
        Student [] list = new Student [3];//array of object(student)
        
        Student s1 = new Student();
        Student s2 = new Student(); 
        Student s3 = new Student();
        
        s1.setName("Bilal Fakih");
        s1.setAge(20);
        
        s2.setName("Bob Ross");
        s2.setAge(60);
        
        s3.setName("Skullface-poo-L");
        s3.setAge(30);
        
        list [0] = s1;
        list [1] = s2;
        list [2] = s3;
        
        for(int i = 0; i < list.length; i++)
        {
            System.out.println(list[i].getName() + " " + list[i].getAge());
        }//ends loop
    }//ends main
}//ends class
