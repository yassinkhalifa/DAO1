
public class program {

	public static void main(String[] args) {
		Patient testpat = new Patient("Yassin", "Khalifa");
		testpat.setSSN("111111ddd11");
		testpat.setPhNum("12234455666");
		DAOImpl newtest = new DAOImpl();
		newtest.insert_patient(testpat);
	}

}
