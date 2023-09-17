package PerpustakaanApp;

import View.ViewImpl;
import repository.LibraryRepoImpl;
import service.LibraryServiceImpl;

public class Main {
    public static void main(String[] args) {
        start();
    }
    public static void start(){
        LibraryRepoImpl repo = new LibraryRepoImpl();
        LibraryServiceImpl service = new LibraryServiceImpl(repo);
        ViewImpl view = new ViewImpl(service);
        view.mainMenu();
    }
}
