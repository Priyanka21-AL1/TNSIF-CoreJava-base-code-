package jdkDemo;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;

public class jdbcTable {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        try
        {
        	//step1: load driver
        	Class.forName("com.mysql.jdbc.Driver");
        	System.out.println("driver is load succesfully");
        	
        	
        	//step 2 : creat connection
        	
        	Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3307/data","root","tiger");
        	System.out.println("Connection created successfully");
        	
        	//step 3 :create a statement interface
        	
        	Statement stm= con.createStatement();
        	
        	System.out.println("statement is created successfully");
        	
        	//step 4 : write a qurey
        	
        	String q= "create table Student(stid int ,name varchar(20),sub varchar(20),duration double)";
        	
        	boolean s= stm.execute(q);
        }
        
        catch(Exception e)
        {
        	System.err.print(e);
        }
	}

}
