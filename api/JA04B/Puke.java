package JA04B;

public class Puke {
	private String huase;
	private int daxiao;
	public String getHuase() {
		return huase;
	}
	public void setHuase(String huase) {
		this.huase = huase;
	}
	public int getDaxiao() {
		return daxiao;
	}
	public void setDaxiao(int daxiao) {
		this.daxiao = daxiao;
	}
	public Puke(String huase, int daxiao) {
		super();
		this.huase = huase;
		this.daxiao = daxiao;
	}
	@Override
	public String toString() {
		return "Puke"+" [huase=" + huase + ", daxiao=" + daxiao + "]";
	}
	
}
