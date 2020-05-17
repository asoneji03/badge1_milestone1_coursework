package dao;

import dto.DVD;

import java.io.*;
import java.util.*;

public class DVDLibraryDaoFileImpl implements DVDLibraryDao {

    public static final String LIBRARY_FILE = "library.txt";
    public static final String DELIMITER = "::";

    private void loadLibrary() throws DVDLibraryDaoException{
        Scanner scanner;

        try{
            scanner = new Scanner(new BufferedReader(new FileReader(LIBRARY_FILE)));
        } catch (FileNotFoundException e) {
            throw new DVDLibraryDaoException("-_- Could not load DVD library data into memory.", e);
        }

        String currentLine;
        String[] currentTokens;
        while(scanner.hasNextLine()){
            currentLine = scanner.nextLine();
            currentTokens = currentLine.split(DELIMITER);
            DVD currentDVD = new DVD();
            currentDVD.setTitle(currentTokens[0]);
            currentDVD.setReleaseDate(currentTokens[1]);
            currentDVD.setMpaaRating(currentTokens[2]);
            currentDVD.setDirectorName(currentTokens[3]);
            currentDVD.setStudio(currentTokens[4]);
            currentDVD.setUserRating(currentTokens[5]);

            dvds.put(currentDVD.getTitle(), currentDVD);
        }

        scanner.close();
    }

    private void writeLibrary() throws DVDLibraryDaoException{
        PrintWriter out;

        try{
            out = new PrintWriter(new FileWriter(LIBRARY_FILE));
        }catch (IOException e){
            throw new DVDLibraryDaoException("Could not save DVD data.", e);
        }
        List<DVD> dvdList = this.getAllDVDs();
        for(DVD currentDVD : dvdList){
            out.println(currentDVD.getTitle() + DELIMITER + currentDVD.getReleaseDate() + DELIMITER + currentDVD.getMpaaRating() + DELIMITER + currentDVD.getDirectorName() + DELIMITER + currentDVD.getStudio() + DELIMITER + currentDVD.getUserRating());
            out.flush();
        }
        out.close();
    }

    @Override
    public DVD addDVD(String title, DVD dvd)
    throws DVDLibraryDaoException{
        DVD newDVD = dvds.put(title, dvd);
        writeLibrary();
        return newDVD;
    }

    @Override
    public DVD removeDVD(String title)
    throws  DVDLibraryDaoException{
        DVD removedDvd = dvds.remove(title);
        writeLibrary();
        return removedDvd;
    }

    @Override
    public void editDVDLibrary(String title, DVD dvd)
    throws DVDLibraryDaoException{
        dvds.get(title);
        writeLibrary();
    }

    @Override
    public void editDVDTitle(String newTitle, DVD dvd)
        throws DVDLibraryDaoException{
        dvds.get(newTitle)
    }

    @Override
    public List<DVD> getAllDVDs()
    throws DVDLibraryDaoException{
        loadLibrary();
        return new ArrayList<DVD>(dvds.values());
    }

    @Override
    public DVD getDVD(String title)
    throws DVDLibraryDaoException{
        loadLibrary();
        return dvds.get(title);
    }

    @Override
    public DVD searchDVDByTitle(String title)
    throws DVDLibraryDaoException{
        loadLibrary();
        return dvds.get(title);
    }

    private Map<String, DVD> dvds = new HashMap<>();
}
