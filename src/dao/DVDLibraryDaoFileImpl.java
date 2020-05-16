package dao;

import dto.DVD;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class DVDLibraryDaoFileImpl implements DVDLibraryDao {
    @Override
    public DVD addDVD(String title, DVD dvd) {
        DVD newDVD = dvds.put(title, dvd);
        return newDVD;
    }

    @Override
    public DVD removeDVD(String title) {
        DVD removedDvd = dvds.remove(title);
        return removedDvd;
    }

    @Override
    public void editDVDLibrary(String title, DVD dvd) {
        dvds.get(title);

    }

    @Override
    public List<DVD> getAllDVDs() {
        return new ArrayList<DVD>(dvds.values());
    }

    @Override
    public DVD getDVD(String title) {
        return dvds.get(title);
    }

    @Override
    public DVD searchDVDByTitle(String title) {
        return null;
    }

    private Map<String, DVD> dvds = new HashMap<>();
}
