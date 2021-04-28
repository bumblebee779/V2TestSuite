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
			System.out.println(update278 + " user 278 updated to Atomic DD status NOT STARTED");
			
			int update292 = m_Statement.executeUpdate
					("update business_user "
					+ "set last_eligibility_status = 'ACTION REQUIRED'"
					+ "where user_id = 292");
			System.out.println(update292 + " user 292 updated to Atomic DD status ACTION REQUIRED");
			
			int updateInitAct = m_Statement.executeUpdate
					("update cards set initially_activated_at = null where (account_id = 216 and galileo_status = 'N')");
			System.out.println(updateInitAct + " user 208 initially_activated_at timestamp is removed");
			
			int nullPINCode = m_Statement.executeUpdate
					("update cards set pin_last_set_at = null where (account_id = 216 and galileo_status = 'N')");
			System.out.println(nullPINCode + " user 208 pin_last_set_at timestamp is removed");
			
			int updateConfirm = m_Statement.executeUpdate
					("update cards set confirmed_received_at = null where (account_id = 171 and galileo_status = 'N')");
			System.out.println(updateConfirm + " user 175 confirmed_received_at timestamp is removed");
			
			int updateConfirm2 = m_Statement.executeUpdate
					("update cards set confirmed_received_at = null where (account_id = 331 and galileo_status = 'N')");
			System.out.println(updateConfirm2 + " user 291 confirmed_received_at timestamp is removed");
			
			
		} catch (Exception e) {
			e.printStackTrace();
		}
		
	 }
		
		public void removeConfirm() {
			Connection m_Connection;
			try {
				Class.forName("org.postgresql.Driver");
				m_Connection = DriverManager.getConnection("jdbc:postgresql://clair-postgres-staging.cl5ke5s2m2jt.us-east-1.rds.amazonaws.com/vapor","vapor","H9iMJmk8XMDOr1MGZGwnTcaaqaTOhVBBEIck12cO");
				m_Statement = m_Connection.createStatement();
				int updateConfirm3 = m_Statement.executeUpdate
						("update cards set confirmed_received_at = null where (account_id = 216 and galileo_status = 'N')");
				System.out.println(updateConfirm3 + " user 208 confirmed_received_at timestamp is removed");
				
		}catch (Exception e) {
			e.printStackTrace();
	}
	
	
		}
		
	 }



