import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.util.List;
import javax.swing.JOptionPane;

public class DAOImpl implements PatientDAO {
	public void insert_patient(Patient patient){
		try{
			Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
			Connection conn = DriverManager.getConnection("jdbc:sqlserver://DESKTOP-JA5ASAC;databaseName=Hospital", "sa", "MedStreaming77");
			PreparedStatement psmt = conn.prepareStatement("insert into Patient values (?,?,?,?,?)");
			psmt.setString(1, patient.getSSN());
			psmt.setString(2, patient.getlname());
			psmt.setString(3, patient.getfname());
			psmt.setString(4, "any address");
			psmt.setString(5, patient.getPhNum());
			int i = psmt.executeUpdate();
			if (i > 0) {
				JOptionPane.showMessageDialog(null, "Patient was successfully added");
			}
			else {
				JOptionPane.showMessageDialog(null, "Patient was not added");
			}
		}
		catch (Exception e) {
			JOptionPane.showMessageDialog(null, e);
		}
	}
//	public Patient getPatient(String SSN){
//		Patient result = new Patient(fname, lname);
//		
//		return result;
//	}
//	public List<Patient> getPatients(String Name){
//		
//	}
}
