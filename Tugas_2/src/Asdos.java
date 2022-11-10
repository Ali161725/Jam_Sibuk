class asdos extends mahasiswa {  //Menggunakan extend untuk pewarisan Polymorphisme, jadi kelas Mahasiswa merupakan superclass dari kelas Asdos
    private int jamNgasdos;

    public asdos(String name, int sks, int jamNgasdos) {
        super(name, sks);
        jamSibuk = jamSibuk + jamNgasdos;

    }

    public int getJamSibuk() {
        return jamSibuk;
    }

    public void cetak() {
        /*
         * method cetak() adalah bentuk UPCASTING,
         * karena mengubah referensi methodnya sendiri,dan tidak mengambil isi method
         * atau referensi
         * dari class induknya
         */
        System.out.println(name + " adalah seorang asdos dengan jam sibuk " + jamSibuk);
    }
}