package com.example.servletjspdemo.web;
 
public class Alcohol {
	private String typ; 
    private String marka; // nazwa 
    private String[] rodzaj; 
    private String[] pojemnosc; 
    private String info;
       
    public enum TypEnum {
    	piwo ("piwo"),
    	wodka ("wodka"),
    	wino ("wino"),
    	nalewka ("nalewka"),
    	gin ("gin"),
    	whisky ("whisky"),
    	koniak ("koniak"),
    	brandy ("brandy"),
    	likier ("likier");
    
    	private String slownie;
    	
    	TypEnum(String slownie) {
			this.slownie = slownie;
		}
    	
    	public String slownieToString() {
    		return slownie;
    	}
    }
    
    public enum RodzajEnum {
    	czysta ("czysta"),
		palona ("palona"),
		gorzka ("gorzka"),
		wisniowa ("wisniowa"),
		porzeczkow ("porzeczkowa"),
		zurawinowa ("zurawinowa"),
		ananasowa ("ananasowa"),
		cytrynowa ("cytrynowa"),
		mango ("mango"),
		maracuja ("maracuja"),
		limonka ("lime&mint"),
		arbuzowa ("arbuzowa"),
		czporz ("czarnaporzeczka"),
		orzech ("orzechlaskowy"),
		pigwa ("pigwowa"),
		malina ("malinowa"),
		cw ("czerwone_wytrawne"),
		cpw ("czerwone_polwytrawne"),
		cs ("czerwone_slodkie"),
		cps ("czerwone_polslodkie"),
		bw ("biale_wytrawne"),
		bpw ("biale_polwytrawne"),
		bs ("biale_slodkie"),
		bps ("biale_polslodkie"),
		rw ("rozowe_wytrawne"),
		rpw ("rozowe_polwytrawne"),
		rs ("rozowe_slodkie"),
		rps ("rozowe_polslodkie");
    	
    	private String slownie;
    	
    	RodzajEnum(String slownie) {
    		this.slownie = slownie;
    	}
    	
    	public String rodzajToString() {
    		return slownie;
    	}
    }
    
    public enum PojemnoscEnum {
    	piecdziesiat ("50ml"),
    	malpka ("100ml"),
    	cwiartka ("200ml"),
    	trzysetki ("350ml"),
    	piecset	 ("500ml"),
    	krowka ("700ml"),
    	winiacz ("750ml"),
    	litr ("1000ml");
    
    	private final String slownie;
    
    	PojemnoscEnum(String slownie) {
    		this.slownie = slownie;
		}

    	public String slownieToStirng() {
    		return slownie;
    	}
    } 
    
    
    
    public Alcohol() {
    }
 
    public Alcohol(String typ, String marka, String[] rodzaj, String[] pojemnosc, String info) {
        super(); // wywolanie konstruktora nadklasy
        this.typ = typ;
        this.marka = marka;
        this.rodzaj = rodzaj;
        this.pojemnosc = pojemnosc;
        this.info = info;
    }
 
    public String getTyp() {
        return typ;
    }
 
    public void setTyp(String typ) {
        this.typ = typ;
    }
 
    public String getMarka() {
        return marka;
    }
 
    public void setMarka(String marka) {
        this.marka = marka;
    }
    
    public String[] getRodzaj() {
        return rodzaj;
    }
 
    public void setRodzaj(String[] rodzaj) {
        this.rodzaj = rodzaj;
    }
 
    public String[] getPojemnosc() {
        return pojemnosc;
    }
 
    public void setPojemnosc(String[] pojemnosc) {
        this.pojemnosc = pojemnosc;
    }
 
    public String getInfo() {
        return info;
    }
 
    public void setInfo(String info) {
        this.info = info;
    }
     
    public String getRodzajToString() {
        String rodz = "";
        for(int i = 0; i < rodzaj.length; i++)
            rodz = rodz + rodzaj[i] + ", ";
        return rodz;
    }
     
    public String getPojemnoscToString() {
        String rodz = "";
        for(int i = 0; i < pojemnosc.length; i++)
            rodz = rodz + pojemnosc[i] + ", ";
        return rodz;
    }
}

