package main;

public class Dissertation extends Item {
	
	private String question;

	public Dissertation(int id, String question) {
		super(id);
		this.setQuestion(question);
	}

	public String getQuestion() {
		return question;
	}

	public void setQuestion(String question) {
		this.question = question;
	}

}
