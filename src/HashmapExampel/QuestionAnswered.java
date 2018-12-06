package HashmapExampel;

public class QuestionAnswered {

	private String fondsNumber;
	
	private String pspNo;

	private String typeOfReport;

	private String textTag = "NOT_SET";

	private String question;
	

	public QuestionAnswered(String fondsNumber, String pspNo, String typeOfReport, String textTag, String question) {
		super();
		this.fondsNumber = fondsNumber;
		this.pspNo = pspNo;
		this.typeOfReport = typeOfReport;
		this.textTag = textTag;
		this.question = question;
	}
	

	public String getFondsNumber() {
		return fondsNumber;
	}

	public void setFondsNumber(String fondsNumber) {
		this.fondsNumber = fondsNumber;
	}

	public String getPspNo() {
		return pspNo;
	}

	public void setPspNo(String pspNo) {
		this.pspNo = pspNo;
	}

	public String getTypeOfReport() {
		return typeOfReport;
	}

	public void setTypeOfReport(String typeOfReport) {
		this.typeOfReport = typeOfReport;
	}

	public String getTextTag() {
		return textTag;
	}

	public void setTextTag(String textTag) {
		this.textTag = textTag;
	}

	public String getQuestion() {
		return question;
	}

	public void setQuestion(String question) {
		this.question = question;
	}


	@Override
	public String toString() {
		return "QuestionAnswered [fondsNumber=" + fondsNumber + ", pspNo=" + pspNo + ", typeOfReport=" + typeOfReport
				+ ", textTag=" + textTag + ", question=" + question + "]";
	}
	
	
	

}
