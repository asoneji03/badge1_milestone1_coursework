package dao;

import dto.DVD;

import java.util.List;

public interface DVDLibraryDao {
    DVD addDVD(String title, DVD dvd);
    DVD removeDVD(String title);
    void editDVDLibrary (String title, DVD dvd);
    List<DVD> getAllDVDs();
    DVD getDVD(String title);
    DVD searchDVDByTitle(String title);







}
