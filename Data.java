package DataStructProject;
public class Data {

	private byte DD;
	private byte MM;
	private short AAAA;
	private boolean bissexto;
	
	public Data(int DD, int MM, int AAAA) {
		this.setMM(MM);
		this.setDD(DD);		
		this.setAAAA(AAAA);
	}
	
	public void setDD(int DD) {
		if(this.MM == 1 || this.MM == 3 || this.MM == 5 || this.MM == 7 || this.MM == 8 || this.MM == 10 || this.MM == 12) {
			if(DD <= 0 || DD > 31) {System.out.println("1");
				System.out.println("Dia Inválido.");
			} else {
				this.DD = (byte) DD;
			}
		} else if(this.MM == 4 || this.MM == 6 || this.MM == 9 || this.MM == 11) {
			if(DD <= 0 || DD > 30) {System.out.println("2");
				System.out.println("Dia Inválido.");
			} else {
				this.DD = (byte) DD;
			}
		} else {
			if (this.bissexto) {
				if(DD <= 0 || DD > 29) {System.out.println("3");
					System.out.println("Dia Inválido.");
				} else {
					this.DD = (byte) DD;
				}	
			} else {
				if(DD <= 0 || DD > 28) {System.out.println("4");
					System.out.println("Dia Inválido.");
				} else {
					this.DD = (byte) DD;
				}
			}
		}
	}
	
	public int getDD() {
		return this.DD;
	}
	
	public void setMM(int MM) {
		if(MM <= 0 || MM > 12) {
			System.out.println("Mês Inválido.");
		} else {
			this.MM = (byte) MM;
		}
	}
	
	public int getMM() {
		return this.MM;
	}
	
	public void setAAAA(int AAAA) {
		if(AAAA <= 0) {
			System.out.println("Ano Inválido.");
		} else {
			this.AAAA = (short) AAAA;
		}
	} 
	
	public int getAAAA() {
		return this.AAAA;
	}
	
	public boolean bissexto(int AAAA) {
		if((AAAA % 400 == 0 ) || (AAAA % 4 == 0 && AAAA % 100 != 0)) {
			this.bissexto = true;
		} else {
			this.bissexto = false;
		}
		return this.bissexto;
	}
	
	public String toString() {
		String dia, mes, ano;
		if(DD <= 9) {
			dia = "0" + DD;
		} else {
			dia = String.valueOf(DD);
		}
		if(MM <= 9) {
			mes = "0" + MM;
		} else {
			mes = String.valueOf(MM);
		}
		if(AAAA <= 9) {
			ano = "000" + AAAA;
		} else if(AAAA >= 10 && AAAA <= 99) {
			ano = "00" + AAAA;
		} else if(AAAA >= 99 && AAAA <= 999) {
			ano = "0" + AAAA;
		} else {
			ano = String.valueOf(AAAA);
		}
		String data = dia + "/" + mes + "/" + ano;
		return data;
	}
	
	public int getDias() {
		int diasAno = 0;
		if(this.MM <= 2) {
			this.AAAA = (short) (this.AAAA - 1);			
		}
		if(this.MM <=2) {
			this.MM = (byte) (this.MM + 13);
		}
		else {
			this.MM = (byte) (this.MM + 1);
		}
		diasAno = (1461*AAAA)/4 + (153*MM)/5 + DD;
		return diasAno;
	}

	public int diasEntreDatas(Data outra) {
		return (int) (outra.getDias() - this.getDias());
	}
}
