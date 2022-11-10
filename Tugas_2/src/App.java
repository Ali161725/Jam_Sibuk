
public class App {
	public static void main(String[] args) {
        asdos Fairuzikun = new asdos("fairuzikun",23,4);
        dosen Raja_OP_Damanik = new dosen("Raja OP Damanik",5);
        asdos Angel_Chan = new asdos("Angel-chan",19,7);
        mahasiswa Firman = new mahasiswa("Firman",20);
        mahasiswa Nid_to_pass_this_sem = new mahasiswa("Nid to pass this sem", 23);
        dosen Nivotko = new dosen("Nivotko",3);

        Fairuzikun.cetak();
        Raja_OP_Damanik.cetak();
        Angel_Chan.cetak();
        Firman.cetak();
        Nid_to_pass_this_sem.cetak();
        Nivotko.cetak();

        int totJamSibuk = Fairuzikun.jamSibuk + Raja_OP_Damanik.jamSibuk + 
        Angel_Chan.jamSibuk + Firman.jamSibuk + Nid_to_pass_this_sem.jamSibuk +  Nivotko.jamSibuk;

        System.out.println("Total jam sibuk elemen fasilkom adalah "+totJamSibuk);
}
}
