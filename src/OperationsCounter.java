
public class OperationsCounter {

	private int ifCount;
	private int arithmeticCount;
	private long startTime;
	private long stopTime;
	private int assignmentCount;

	public void increaseIf() {
		this.ifCount++;
		
	}


	public int getIfCount() {
		// TODO Auto-generated method stub
		return this.ifCount; 
	}

	public void resetIfCount() {
		this.ifCount = 0;
	}


	public void increaseArithmetic(int numberOfOperations) {
		this.arithmeticCount += numberOfOperations;
		
	}


	public int getAddCount() {
		// TODO Auto-generated method stub
		return this.arithmeticCount;
	}


	public long getTime() {
		// TODO Auto-generated method stub
		return (this.stopTime - this.startTime);
	}


	public void startTimer() {
		this.startTime = System.currentTimeMillis();		
	}


	public void stopTimer() {
		this.stopTime = System.currentTimeMillis();	
		
	}


	public void resetAddCount() {
	this.arithmeticCount = 0;
		
	}


	public void increaseAssignmentOperations(int i) {
		this.assignmentCount += i;
	}


	public int getAssignmentCount() {

		return this.assignmentCount;
	}

}
