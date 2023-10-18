package pr2lab3;

public class MainClass {

	public static void main(String[] args) {
		int varsta=20;
		int inaltime=140; 
		int sex=0;
		
		short info_impachetata;
	    info_impachetata=(short)((varsta<<9)|(sex<<8)|(inaltime));
		
	    
	    varsta= (info_impachetata>>9)& 0x7f;
	    sex= (info_impachetata>>8)&1;
	    inaltime=info_impachetata &0xff;
	    		
	     System.out.println("Varsta despachetat este:"+varsta);
	     System.out.println("Inaltimea despachetata este:"+inaltime);
	     System.out.println("Sexus despachetat este:"+ sex);
		

	}

}
