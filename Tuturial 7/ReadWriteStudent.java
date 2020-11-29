/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tutor;

/**
 *
 * @author Febrilia Eka Putri
 */

import java.io.*;
import java.util.*;

public class ReadWriteStudent {
    static ArrayList<Student> studentlist;
    static Scanner sc = new Scanner(System.in);
	
    public static void main(String[] args)
    {
        studentlist = new ArrayList<Student>();
        int choice;
        do
        {
            System.out.println("1. Add Student To List");
            System.out.println("2. View all Students");
            System.out.println("3. Read Student List From File");
            System.out.println("4. Write List to File");
            System.out.println("5. Quit");
            System.out.print("Your choice :");
            choice = sc.nextInt();
            sc.nextLine();
            switch(choice)
            {
            case 1: addStudentToList();break;
            case 2: viewStudents();break;
            case 3: readStudentsFromFile(); break;
            case 4: copyListToFile();break;
            case 5: System.out.println("bye");
            }
        } while (choice!=5);
    }

    public static void viewStudents()
    {
            for(Student s:studentlist)
                    System.out.println(s.toString());
    } 
    public static void addStudentToList()
    {
        System.out.print("Enter student name :");
        String name = sc.nextLine();
        System.out.print("Enter marks for " + name + " : ");
        double marks = sc.nextDouble();
        sc.nextLine();
        Student s = new Student(name, marks);
        studentlist.add(s);
    }

    public static void readStudentsFromFile()
    {
        System.out.print("Enter file name :");
        String fileN = sc.nextLine();
        FileInputStream fr=null;
        ObjectInputStream br=null;
        
        try
        {
            fr=new FileInputStream(fileN);
            br=new ObjectInputStream(fr);
            
            try
            {
                studentlist=((ArrayList<Student>)br.readObject());
            }
            catch(ClassNotFoundException cnfe)
            {
                System.out.println("Invalid object in file");
            }
        }
        catch(FileNotFoundException fnfe)
        {
            System.out.println("File '"+fileN+"' does not exist");
            //return;
        }
        catch(IOException ioe)
        {
            System.out.println("Error in reading");
        }
            
        finally
        {
            try
            {
                if(fr!=null)
                    fr.close();
                if(br!=null)
                    br.close();
            }
            catch(IOException ioe)
            {
                System.out.println(ioe.getMessage());
            }
        }
    }
    
    public static void copyListToFile()
    {
        System.out.print("Enter file name: ");
        String fileN=sc.nextLine();
        
        File file=new File(fileN);
        FileOutputStream fos=null;
        ObjectOutputStream oos=null;
        
        try
        {
            boolean confirmOverwrite=false;
            if(file.exists())
            {
                System.out.println("File '"+fileN+"' already exist.");
                System.out.print("Confirm to overwrite y/n? ");
                char response=sc.nextLine().charAt(0);
                
                if(response=='y'||response=='Y')
                {
                    confirmOverwrite=true;
                }
            }
            if(!file.exists()||confirmOverwrite)
            {
                fos=new FileOutputStream(fileN);
                oos=new ObjectOutputStream(fos);
                oos.writeObject(studentlist);
            }
            /*
            else
            {
                fos=new FileOutputStream(fileN);
            }
            oos= new ObjectOutputStream(fos);
            
            for (Student s:studentlist)
            {
                oos.writeObject(s);
            }*/
        }
        catch(IOException ioe)
        {
            System.out.println(ioe.getMessage());
        }
        finally
        {
            try
            {
                if(fos!=null)
                {
                    fos.close();
                }
                if(oos!=null)
                {
                    oos.close();
                }
            }
            catch(IOException ioe)
            {
                System.out.println(ioe.getMessage());
            }
        }
    }
}
