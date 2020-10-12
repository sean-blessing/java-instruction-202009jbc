package db;

import java.sql.*;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

import business.Actor;

public class ActorDB implements DAO<Actor> {
	
	//p. 677
	private Connection getConnection() throws SQLException {
		String dbURL = "jdbc:mysql://localhost:3306/bmdb";
		String username = "bmdb_user";
		String password = "sesame";
		
		Connection conn = DriverManager.getConnection(
				dbURL, username, password);
		return conn;
		
	}

	@Override
	public Actor get(int id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Actor> getAll() {
		List<Actor> actors = new ArrayList<>();
		//p. 679
		Connection conn = null;
		try {
			conn = getConnection();
			String sql = "select * from actor;";
			Statement stmt = conn.createStatement();
			ResultSet rs = stmt.executeQuery(sql);
			
			//p. 681 - process result set
			while (rs.next()) {
				int id = rs.getInt(1);
				String fn = rs.getString(2);
				String ln = rs.getString(3);
				String g = rs.getString(4);
				String bdStr = rs.getString(5);
				LocalDate bd = LocalDate.parse(bdStr);
				Actor a = new Actor(id,fn,ln,g,bd);
				actors.add(a);
			}
			
		} catch (SQLException e) {
			System.out.println("Error getting all actors!");
			e.printStackTrace();
			actors = null;
		}
		finally {
			try {
				conn.close();
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		return actors;
	}

	@Override
	public boolean add(Actor t) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean update(Actor t) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean delete(Actor t) {
		// TODO Auto-generated method stub
		return false;
	}

}
