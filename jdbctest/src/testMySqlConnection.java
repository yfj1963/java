import java.sql.*;
public class testMySqlConnection {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
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
		catch(ClassNotFoundException ex){
		     ex.printStackTrace();
		}
		catch(Exception e){
			e.printStackTrace();
		}finally{
			try{
				if(rs!=null){
					rs.close();
					rs = null;
				}
				if(stmt !=null){
					stmt.close();
					stmt = null;
				}
				if(conn != null){
					conn.close();
					conn = null;
				}
				
			}catch(SQLException e){
				e.printStackTrace();
			}
		}
		
		}
		// TODO Auto-generated method stub

	}


