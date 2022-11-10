
public class Elemen {
	 public String name;
	    public int jamSibuk;

	    public Elemen(String name) {
	        //Downcasting terbentuk dari constructor superclass karena referensi bagi subclass.
	        //jika dibuatkan constructor untuk superclass maka subclass juga harus dibuatan constructornya jika tidak akan terjadi errora
	        this.name = name;
}
}
