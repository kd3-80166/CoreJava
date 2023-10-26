package com.sunbeam.tester;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import com.sunbeam.classes.Candidate;
import com.sunbeam.classes.PartyVotes;
import com.sunbeam.dao.CandidateDao;

public class Tester2 {
	
	public static int emenu () {
		int choice;
		System.out.println("***********************************************");
		System.out.println("0. To exit.");
		System.out.println("1. To add new candidate.");
		System.out.println("2. To update party and votes (by Id).");
		System.out.println("3. To get total votes (partywise).");
		System.out.println("***********************************************");
		System.out.print("Enter your choice :");
		choice = new Scanner(System.in).nextInt();
		
		return choice;
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int choice;
		
		while ((choice = emenu())!=0) {
			switch (choice) {
				case 1 :try(CandidateDao dao = new CandidateDao()){
							System.out.println("Enter the name of candidate : ");
							String name = sc.nextLine();
							System.out.println("Enter the party of candidate : ");
							String party = sc.nextLine();
							System.out.println("Enter the votes of candidate : ");
							int votes = sc.nextInt();
							Candidate c = new Candidate();
							c.setName(name);
							c.setParty(party);
							c.setVotes(votes);
							int cnt = dao.addCandidate(c);
							System.out.println("Rows added : " + cnt);
							
						}
						catch (Exception e) {
							e.printStackTrace();
						}
						break;
						
				case 2 : try(CandidateDao dao1 = new CandidateDao()){
							Scanner sc1 = new Scanner(System.in);
							System.out.println("Enter the id that you want to modify : ");
							int id = sc1.nextInt();
							System.out.println("Enter the name of candidate : ");
							String name = sc1.next();
							System.out.println("Enter the party of candidate : ");
							String party = sc1.next();
							Candidate c = new Candidate();
							c.setName(name);
							c.setParty(party);
							c.setId(id);
							int cnt = dao1.updateCandidate(c);
							System.out.println("Rows updated : " + cnt);
						 }
						 catch (Exception e) {
							 e.printStackTrace();
						 }
				
				case 3 : try(CandidateDao dao1 = new CandidateDao()){
							List<PartyVotes> l = dao1.getPartyVotes();
							l.forEach(c->System.out.println(c));
						 }
						 catch (Exception e) {
							 e.printStackTrace();
						 }
				}
			
			}
		
		}

	}
