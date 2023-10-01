package com.mycompany.javaoop3;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;

public class Main{

    public static void main(String[] args) throws IOException {
        
       File f= new File("abc.txt");
        f.createNewFile();
        System.out.println("does file exists? "+f.exists());//file created
        if(f.exists()){
            System.out.println("absolute path= "+f.getAbsolutePath());
            System.out.println("could file be excuted? "+f.canExecute());}
        
        write(); //method1 C FOR CREATE
        read(); //method2 R FOR READ
        Scanner in= new Scanner(System.in);
        Scanner put= new Scanner(System.in);
        String inp, ut;
        System.out.println("to change your password/username enter your old one:");
        inp= in.nextLine();
        System.out.println("enter the new password/username:");
        ut= in.nextLine();
        modifyFile("abc.txt", inp, ut); //method3 U FOR UPDATE
        clearfile(); //method4 D FOR DELETE
        // to test the UPDATE method, you can comment the DELETE method and check the file after the doing the process of replacement
    }
    
         public static void write(){
        Scanner in= new Scanner(System.in);
        Scanner put= new Scanner(System.in);
        String name, pass;
        System.out.println("set your username: ");
        name= in.nextLine();
        System.out.println("set your password: ");
        pass= put.nextLine();
        try (FileWriter fr = new FileWriter("abc.txt")) {
            fr.write(name);
            fr.write("\n");
            fr.write(pass);
            
        fr.close();
        } catch (IOException ex) {
            Logger.getLogger(Main.class.getName()).log(Level.SEVERE, null, ex);
        }
         }
         
         public static void read() throws FileNotFoundException, IOException {
        System.out.println("your username & password have been set successfully");
        
        String line1, line2;
        BufferedReader reader = new BufferedReader(new FileReader("abc.txt"));
        line1= reader.readLine();
        line2= reader.readLine();

        System.out.println("username= "+line1);
        System.out.println("password= "+line2); //I've printed them to copy/paste name&password
        
        logging(line1, line2);
    }
         
         public static void logging(String name, String pswrd){
        Scanner in = new Scanner(System.in);
        Scanner put = new Scanner(System.in);
        String a, b;
             System.out.println("now sign in:");
        System.out.println("enter name");
            a= in.next();
        System.out.println("enter password");
            b= put.next();
        if(name.equals(a) && pswrd.equals(b) ) 
            System.out.println("signed in successfully");
        else
            System.out.println("failed");
    }

         static void modifyFile(String filepath, String oldstring, String newstring){
             File filetobeupdated= new File(filepath);
             String oldcontent= "";
             BufferedReader reader= null;
             FileWriter writer= null;
             try{
             reader= new BufferedReader(new FileReader(filetobeupdated));
             String line= reader.readLine();
             while(line != null){
             oldcontent= oldcontent + line + System.lineSeparator();
             line= reader.readLine();
             }
             String newcontent= oldcontent.replaceAll(oldstring, newstring);
             
             writer = new FileWriter(filetobeupdated);
             writer.write(newcontent);
             }catch(IOException e){
                 System.out.println(e);}
             finally{
             try{
             reader.close();
             writer.close();
             }catch(IOException e){
                 System.out.println(e);}
             }
         }
         
        public static void clearfile(){
        try{
        FileWriter fw= new FileWriter("abc.txt", false);
        PrintWriter pw= new PrintWriter(fw, false);
        pw.flush();
        pw.close();
        fw.close();
          }catch(IOException e){
            System.out.println(e);
        }
        }
    }
