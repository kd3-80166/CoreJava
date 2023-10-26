package com.sunbeam.tester;

import java.util.Date;
import java.util.List;
import java.util.Scanner;

import com.sunbeam.dao.UsersDao;
import com.sunbeam.pojo.Users;

public class Tester {
	
	static int emenu () {
		int choice;
		System.out.println("*********************************************************");
		System.out.println("0. To exit.");
		System.out.println("1. To add user.");
		System.out.println("2. To delete user (by Id).");
		System.out.println("3. To update status and password (by first name and last name).");
		System.out.println("4. To display all the ids and their status.");
		System.out.println("5. To find the number of voters.");
		System.out.println("6. To display everything.");
		System.out.println("*********************************************************");
		System.out.println("Enter your choice");
		choice = new Scanner(System.in).nextInt();
		
		return choice;
	}

	public static void main(String[] args) {
		int choice;
		Scanner sc = new Scanner(System.in);
		
		while ((choice = emenu())!=0) {
			switch (choice) {
				case 1: try(UsersDao ud = new UsersDao()){
							System.out.print("Enter the first name : ");
							String fname = sc.nextLine();
							System.out.print("Enter the last name : ");
							String lname = sc.nextLine();
							System.out.print("Enter the email : ");
							String email = sc.nextLine();
							System.out.print("Enter the password : ");
							String pass = sc.nextLine();
							System.out.print("Enter the dob (dd-mm-yyyy): ");
							String dob = sc.next();
							System.out.print("Enter the status : ");
							Boolean status = sc.nextBoolean();
							System.out.print("Enter the role : ");
							String role = sc.next();
							Date utilDate = UsersDao.parseDate(dob);
							java.sql.Date sqlDate = new java.sql.Date(utilDate.getTime());
							Users u = new Users();
							u.setFname(fname);
							u.setLname(lname);
							u.setEmail(email);
							u.setPassword(pass);
							u.setDob(sqlDate);
							u.setStatus(status);
							u.setRole(role);
							int cnt = ud.addUser(u);
							System.out.println("Rows Added : " + cnt);	
						}
						catch (Exception e) {
							e.printStackTrace();
						}
						break;
						
						
				case 2: try (UsersDao ud = new UsersDao()){
							System.out.println("Enter the id to be deleted : ");
							int id = sc.nextInt();
							int cnt = ud.deleteUser(id);
							System.out.println("Rows deleted : "+cnt);
						}
						catch (Exception e) {
							e.printStackTrace();
						}
						break;
					
				case 3: try (UsersDao ud = new UsersDao()){
							System.out.println("Enter the first name : ");
							String fname = sc.nextLine();
							System.out.println("Enter the last name : ");
							String lname = sc.nextLine();
							System.out.println("Enter the status that you want to keep : ");
							boolean b = sc.nextBoolean();
							System.out.println("Enter the password : ");
							String pass = sc.next();
							Users u = new Users();
							u.setFname(fname);
							u.setLname(lname);
							u.setStatus(b);
							u.setPassword(pass);
							int cnt = ud.updateUser(u);
							System.out.println("Rows upated : "+cnt);
						}
						catch (Exception e) {
							e.printStackTrace();
						}
						break;
					
				case 4: try(UsersDao ud = new UsersDao()){
							List<Users> l = ud.displayIdStatus();
							l.forEach(System.out :: println);
							
						}
						catch (Exception e) {
							e.printStackTrace();
						}
						break;
					
				case 5: try (UsersDao ud = new UsersDao()){
							System.out.print("Enter the option (voters(press 1) or non-voter(press 0)): ");
							int c = sc.nextInt();
							System.out.println("The total number of voters are "+ud.displayVotersCount(c));
						}
						catch (Exception e) {
							e.printStackTrace();
						}
						break;
					
				case 6: try (UsersDao ud = new UsersDao()){
							System.out.println("The users table is as follows :");
							List <Users> l = ud.displayAll();
							l.forEach(c -> System.out.println(c));
						}
						catch (Exception e) {
							e.printStackTrace();
						}
						break;
			}
		}
		
	}

}
