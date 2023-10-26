package com.sunbeam.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import com.sunbeam.classes.Candidate;
import com.sunbeam.classes.DbUtil;
import com.sunbeam.classes.PartyVotes;

public class CandidateDao implements AutoCloseable {
	private Connection con;
	public CandidateDao() throws SQLException {
		con = DbUtil.getConnection();
	}
	
	@Override
	public void close() throws Exception {
		try {
			if (con != null) {
				con.close();
			}
		}
		catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	public int addCandidate(Candidate c) throws SQLException {
		String str = "Insert into candidates values (default,?,?,?)";
		try(PreparedStatement stmt = con.prepareStatement(str)){
			stmt.setString(1,c.getName());
			stmt.setString(2, c.getParty());
			stmt.setInt(3, c.getVotes());
			int cnt = stmt.executeUpdate();
			return cnt;
		}
	}
	
	public int updateCandidate (Candidate c) throws SQLException {
		String str = "update candidates set name = ?, party = ? where id = ?";
		try (PreparedStatement stmt = con.prepareStatement(str)){
			stmt.setString(1, c.getName());
			stmt.setString(2, c.getParty());
			stmt.setInt(3, c.getId());
			int cnt = stmt.executeUpdate();
			return cnt;
		}
	}
	
	public List <PartyVotes> getPartyVotes() throws SQLException{
		List<PartyVotes> list = new ArrayList<>();
		String str = "select party,sum(votes) from candidates group by party";
		try (PreparedStatement stmt = con.prepareStatement(str)){
			try (ResultSet rs = stmt.executeQuery()){
				while (rs.next()){
					String party = rs.getString("party");
					int votes = rs.getInt("sum(votes)");
					PartyVotes p = new PartyVotes(party,votes);
					list.add(p);
				}
			}
		}
		return list;
	}
	

}
