class mahasiswa extends Elemen {//Menggunakan extend untuk pewarisan Polymorphisme, jadi kelas Elemen merupakan superclass dari kelas Mahasiswa
    private int sks;

    public mahasiswa(String name, int sks) {
        super(name);
        jamSibuk = sks * 3;
    }

    public int getJamSibuk() {
        return jamSibuk;
    }

    public void cetak() {
        System.out.println(name + " adalah seorang mahasiswa dengan jam sibuk " + jamSibuk);
    }
}
