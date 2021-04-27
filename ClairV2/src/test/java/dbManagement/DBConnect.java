package dbManagement;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

public class DBConnect {
	
	 Statement m_Statement;
	 ResultSet m_ResultSet;
	 String query;
	
	
	 public void getAnswerFromDB() {
		Connection m_Connection;
		try {
			Class.forName("org.postgresql.Driver");
			m_Connection = DriverManager.getConnection("jdbc:postgresql://clair-postgres-staging.cl5ke5s2m2jt.us-east-1.rds.amazonaws.com/vapor","vapor","H9iMJmk8XMDOr1MGZGwnTcaaqaTOhVBBEIck12cO");
			m_Statement = m_Connection.createStatement();
			int deleteAtomicTasks = m_Statement.executeUpdate
					("delete from atomic_tasks where user_id in (278,292)");
			System.out.println(deleteAtomicTasks + " Rows deleted");
			
			int update278 = m_Statement.executeUpdate
					("update business_user "
					+ "set eligible_notification_sent_at = null, "
					+ "last_eligibility_status = 'NOT STARTED' "
					+ "where user_id = 278");
			System.out.println(update278 + " Row updated");
			int update292 = m_Statement.executeUpdate
					("update business_user "
					+ "set last_eligibility_status = 'ACTION REQUIRED'"
					+ "where user_id = 292");
			System.out.println(update292 + " Row updated");
			
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	
	}



