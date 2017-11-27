import java.util.*;

public class Chronometre {
	private CyclicCounter hour;
	private CyclicCounter minute;
	private CyclicCounter second;

	public Chronometre(){
		hour = new CyclicCounter(0, 24);
		minute = new CyclicCounter(0, 59);
		second = new CyclicCounter(0, 59);
	}

	public void increment(){
		second.increment();
		if(second.getValue() == 0){
			minute.increment();
			if(minute.getValue() == 0){
				hour.increment();
			}
		}
	}

	public void decrement(){
		second.increment();
		if(second.getValue() == 59){
			minute.increment();
			if(minute.getValue() == 59){
				hour.increment();
			}
		}
	}

	public String toString(){
		return hour.getValue() + ":" + minute.getValue() + ":" + second.getValue() ;
	}
}