import java.sql.*;
public class testTicle {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}
	public void show(){
		Connection conn = null;
		Statement stmt = null;
		ResultSet rs = null;
		
		try{
			Class.forName("com.mysql.jdbc.Driver").newInstance();

		    conn = DriverManager.getConnection("jdbc:mysql://localhost/mydata?user=root&password=root");
		    stmt = conn.createStatement();
		    rs = stmt.executeQuery("select * from dept");
		    while(rs.next()){
		    	System.out.println(rs.getString("deptno")); 
		    	
		    }			
		}
		catch(Exception e){
			
		}
	}
	public void tree(Connection tion,int level,int id){
		Statement stmt = null;
		ResultSet rs = null;
		
		StringBuffer sb = new StringBuffer();
		for(int i=0;i<level;++i){
			sb.append(level);
		}
		
		
	}

}
