package zadatak3;

public class String {
	
	
	java.lang.String string = "n";
	
	public int duzinaStringa(String string){
		return string.lenght();
	}
	
	public String parnePozicije(String string){
		String parni = "";
		for(int i = 0; i < string.length(); i++){
			if(i % 2 == 0){
				parni += string.charAt(i);
			}
		}
		return parni;
	}
	
	public String neparnePozicije(String string){
		String neparni = "";
		for(int i = 0; i < string.length(); i++){
			if(i % 2 != 0){
				neparni += string.charAt(i);
			}
		}
		return neparni;
	}
	
	public int velikaSlova(String string){
		int vSlova = 0;
		for(int i = 0; i < string.length(); i++){
			if(Character.isUpperCase(string.charAt(i))){
				vSlov++;
			}
		}
		return vSlova;
	}
	public int malaSlova(String string){
		int mSlova = 0;
		for(int i = 0; i < string.length(); i++){
			if(Character.isLowerCase(string.charAt(i))){
				mSlova++;
			}
		}
		return mSlova;
	}
	public String ostaliKarakteri(String string){
		String ostali = "";
		for(int i = 0; i < string.length(); i++){
			if(Character.isLetter(string.charAt(i))){
				continue;
			}else{
				ostali += string.charAt(i);
			}
		}
		return ostali;
		
	}

}
