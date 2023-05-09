
package lab5;

import static org.junit.Assert.assertEquals;

import org.junit.Test;
/**
 * This is Subclass of SalesChief  that has its features and we add bonus to it . 
 * @author Amir
 *
 */
public class SalesVP extends SalesChief {
	    private double bonus;

	    public SalesVP(String name, int age, String location, String department, double bonus) {
	        super(name, age, location, department);
	        this.bonus = bonus;
	    }

	    public double getBonus() {
	        return bonus;
	    }

	    public void setBonus(double bonus) {
	        this.bonus = bonus;
	    }
/**
 * @return this is String of super calss and bonus that we added.
 */
	    @Override
	    public String toString() {
	        return"Sales VP [super="+ super.toString() + ", bonus=" + bonus + '}';
	    }

	    @Override
	    public boolean equals(Object obj) {
	        if (!(obj instanceof SalesVP)) return false;
	        SalesVP salesVP = (SalesVP) obj;
	        double bonusDifference = Math.abs(this.bonus - salesVP.getBonus());
	        return super.equals(obj) && bonusDifference <= 0.005;
	    }
	    
	    
}

