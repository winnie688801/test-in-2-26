package practice;

public class QuarterFinal {
	String team;
	int scoring;
	int turnover;
	public QuarterFinal(String team , int scoring , int turnover) {
		this.team = team;
		this.scoring = scoring;
		this.turnover = turnover;
	}
	
	public void print() {
		System.out.println(team + "\t" + scoring + "\t" + turnover);
	}

}
