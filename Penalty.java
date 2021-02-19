import java.util.Date;

public class Penalty {
	
	float fine;
	
	String info;
	
	Date date;
	
	boolean paid;
	
	Student student;

	/**
	 * @param fine
	 * @param info
	 * @param date
	 */
	public Penalty(float fine, String info, Date date) {
		this.fine = fine;
		this.info = info;
		this.date = date;
	}

	public Penalty() {
		this(0.0f,"<Info>",new Date());
	}

	@Override
	public String toString() {
		return String.format("$%.2f penalty on %tc [%s]", 
				fine, date, paid?"pending payment":"paid"
			);
	}
	
	public boolean paying_penalty() {
		return paid = true;
	}
	
	
}