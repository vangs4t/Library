package test;

import View.ViewImpl;
import repository.LibraryRepoImpl;
import service.LibraryServiceImpl;

public class Testapp {
    public static void main(String[] args) {
        pinjam();
    }
    public static void add(){
        LibraryRepoImpl repo = new LibraryRepoImpl();
        LibraryServiceImpl lib = new LibraryServiceImpl(repo);
        lib.addLibrary("123422","Cahaya","Aio", "Tersedia");
        lib.addLibrary("126422","Cahay","Ai", "Tersedia");
        lib.rentBook("123422");
        lib.returBook("123422");
        lib.getLibrary();
    }
    public static void view(){
        LibraryRepoImpl repo = new LibraryRepoImpl();
        LibraryServiceImpl lib = new LibraryServiceImpl(repo);
        lib.addLibrary("123422","Cahaya","Aio", "Tersedia");
        lib.addLibrary("126422","Cahay","Ai", "Tersedia");
        lib.rentBook("123422");
        ViewImpl repo1 = new ViewImpl(lib);
        repo1.tambahBuku();
    }
    public static void search(){
        LibraryRepoImpl repo = new LibraryRepoImpl();
        LibraryServiceImpl lib = new LibraryServiceImpl(repo);
        ViewImpl repo1 = new ViewImpl(lib);
        lib.addLibrary("123422","Cahaya","Aio", "Tersedia");
        lib.addLibrary("126422","Cahay","Ai", "Tersedia");
        repo1.cariBuku();
    }
    public static void pinjam(){
        LibraryRepoImpl repo = new LibraryRepoImpl();
        LibraryServiceImpl lib = new LibraryServiceImpl(repo);
        ViewImpl repo1 = new ViewImpl(lib);
        lib.addLibrary("123422","Cahaya","Aio", "Tersedia");
        lib.addLibrary("126422","Cahay","Ai", "Tersedia");
        repo1.pinjamBuku();
        repo1.listLibrary();
    }
    public static void retur(){
        LibraryRepoImpl repo = new LibraryRepoImpl();
        LibraryServiceImpl lib = new LibraryServiceImpl(repo);
        ViewImpl repo1 = new ViewImpl(lib);
        lib.addLibrary("123422","Cahaya","Aio", "Tersedia");
        lib.addLibrary("126422","Cahay","Ai", "Tersedia");
        lib.rentBook("123422");
        repo1.kembalikanBuku();
    }
}
