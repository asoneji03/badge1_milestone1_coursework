package dao;

import dto.DVD;

import java.util.List;

public interface DVDLibraryDao {
    DVD addDVD(String title, DVD dvd)
            throws DVDLibraryDaoException;
    DVD removeDVD(String title)
            throws DVDLibraryDaoException;
    void editDVDLibrary (String title, DVD dvd)
            throws DVDLibraryDaoException;
    void editDVDTitle(String newTitle, DVD dvd)
        throws DVDLibraryDaoException;
    List<DVD> getAllDVDs()
            throws DVDLibraryDaoException;
    DVD getDVD(String title)
            throws  DVDLibraryDaoException;
    DVD searchDVDByTitle(String title)
            throws DVDLibraryDaoException;







}
