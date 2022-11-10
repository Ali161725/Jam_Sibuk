class dosen extends Elemen {
	 //Menggunakan extend untuk pewarisan Polymorphisme, jadi kelas Elemen merupakan superclass dari kelas Dosen
    private int jumlahHariKerja;

    public dosen(String name, int jumlahHariKerja) {
        super(name);
        jamSibuk = jumlahHariKerja * 8;
    }

    public int getJamSibuk() {
        return jamSibuk;
    }

    public void cetak() {
        System.out.println(name + " adalah seorang dosen dengan jam sibuk " + jamSibuk);
    }
}
