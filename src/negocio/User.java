package negocio;

public class User {
	
	private String name;
	
	private Selection s1Qf;
	private Selection s2Qf;
	private Selection s3Qf;
	private Selection s4Qf;
	private Selection s5Qf;
	private Selection s6Qf;
	private Selection s7Qf;
	private Selection s8Qf;
	
	private Selection s1Sf;
	private Selection s2Sf;
	private Selection s3Sf;
	private Selection s4Sf;
	
	private Selection s1F;
	private Selection s2F;
	
	private Selection s1G;
	
	public User() {
		this.s1F=new Selection();
		this.s1G=new Selection();
		this.s1Qf=new Selection();
		this.s1Sf=new Selection();
		this.s2F=new Selection();
		this.s2Qf=new Selection();
		this.s2Sf=new Selection();
		this.s3Qf=new Selection();
		this.s3Sf=new Selection();
		this.s4Qf=new Selection();
		this.s4Sf=new Selection();
		this.s5Qf=new Selection();
		this.s6Qf=new Selection();
		this.s7Qf=new Selection();
		this.s8Qf=new Selection();
	}
	public String getName() {
		return name;
	}

	public Selection getS1Qf() {
		return s1Qf;
	}

	public Selection getS2Qf() {
		return s2Qf;
	}

	public Selection getS3Qf() {
		return s3Qf;
	}

	public Selection getS4Qf() {
		return s4Qf;
	}

	public Selection getS5Qf() {
		return s5Qf;
	}

	public Selection getS6Qf() {
		return s6Qf;
	}

	public Selection getS7Qf() {
		return s7Qf;
	}

	public Selection getS8Qf() {
		return s8Qf;
	}

	public Selection getS1Sf() {
		return s1Sf;
	}

	public Selection getS2Sf() {
		return s2Sf;
	}

	public Selection getS3Sf() {
		return s3Sf;
	}

	public Selection getS4Sf() {
		return s4Sf;
	}

	public Selection getS1F() {
		return s1F;
	}

	public Selection getS2F() {
		return s2F;
	}

	public Selection getS1G() {
		return s1G;
	}
	
	public void setName(String name) {
		this.name = name;
	}
	
	public void setS1Qf(Selection s1Qf) {
		this.s1Qf = s1Qf;
	}
	
	public void setS2Qf(Selection s2Qf) {
		this.s2Qf = s2Qf;
	}
	
	public void setS3Qf(Selection s3Qf) {
		this.s3Qf = s3Qf;
	}
	
	public void setS4Qf(Selection s4Qf) {
		this.s4Qf = s4Qf;
	}
	
	public void setS5Qf(Selection s5Qf) {
		this.s5Qf = s5Qf;
	}
	
	public void setS6Qf(Selection s6Qf) {
		this.s6Qf = s6Qf;
	}
	
	public void setS7Qf(Selection s7Qf) {
		this.s7Qf = s7Qf;
	}
	
	public void setS8Qf(Selection s8Qf) {
		this.s8Qf = s8Qf;
	}
	
	public void setS1Sf(Selection s1Sf) {
		this.s1Sf = s1Sf;
	}
	
	public void setS2Sf(Selection s2Sf) {
		this.s2Sf = s2Sf;
	}
	
	public void setS3Sf(Selection s3Sf) {
		this.s3Sf = s3Sf;
	}
	
	public void setS4Sf(Selection s4Sf) {
		this.s4Sf = s4Sf;
	}
	
	public void setS1F(Selection s1f) {
		s1F = s1f;
	}
	
	public void setS2F(Selection s2f) {
		s2F = s2f;
	}
	
	public void setS1G(Selection s1g) {
		s1G = s1g;
	}

}
