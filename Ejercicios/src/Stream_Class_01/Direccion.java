package Stream_Class_01;

public class Direccion {
	private String personal;
	private String trabajo;

	public Direccion(String personal, String trabajo) {
		this.personal = personal;
		this.trabajo = trabajo;
	}

	public String getPersonal() {
		return personal;
	}

	public void setPersonal(String personal) {
		this.personal = personal;
	}

	public String getTrabajo() {
		return trabajo;
	}

	public void setTrabajo(String trabajo) {
		this.trabajo = trabajo;
	}
}
