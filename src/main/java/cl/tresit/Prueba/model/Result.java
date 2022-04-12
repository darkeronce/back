package cl.tresit.Prueba.model;

public class Result {
	
	private boolean rockamount;
	private boolean popamount;
	private boolean jazzamount;
	private boolean classicamount;
	private boolean etcamount;
	
	
	
	
	public Result() {
		super();
	}

	public Result(boolean rockamount, boolean popamount, boolean jazzamount, boolean classicamount, boolean etcamount) {
		super();
		this.rockamount = rockamount;
		this.popamount = popamount;
		this.jazzamount = jazzamount;
		this.classicamount = classicamount;
		this.etcamount = etcamount;
	}
	
	public boolean isRockamount() {
		return rockamount;
	}
	public void setRockamount(boolean rockamount) {
		this.rockamount = rockamount;
	}
	public boolean isPopamount() {
		return popamount;
	}
	public void setPopamount(boolean popamount) {
		this.popamount = popamount;
	}
	public boolean isJazzamount() {
		return jazzamount;
	}
	public void setJazzamount(boolean jazzamount) {
		this.jazzamount = jazzamount;
	}
	public boolean isClassicamount() {
		return classicamount;
	}
	public void setClassicamount(boolean classicamount) {
		this.classicamount = classicamount;
	}
	public boolean isEtcamount() {
		return etcamount;
	}
	public void setEtcamount(boolean etcamount) {
		this.etcamount = etcamount;
	}
	
	
}
