package controller;

import dao.DVDLibraryDao;
import dao.DVDLibraryDaoException;
import dao.DVDLibraryDaoFileImpl;
import dto.DVD;
import ui.DVDLibraryView;
import ui.UserIO;
import ui.UserIOConsoleImpl;

import java.util.List;

public class DVDLibraryController {

    DVDLibraryView view;
    DVDLibraryDao dao;
    public DVDLibraryController(DVDLibraryDao dao, DVDLibraryView view){
        this.dao = dao;
        this.view = view;
    }

    public void run() {
        boolean keepGoing = true;
        int menuSelection = 0;
        try {
            while (keepGoing) {

                menuSelection = getMenuSelection();

                switch (menuSelection) {
                    case 1:
                        createDVD();
                        break;
                    case 2:
                        removeDVD();
                        break;
                    case 3:
                        editDVD();
                        break;
                    case 4:
                        listDVDs();
                        break;
                    case 5:
                        viewDVD();
                        break;
                    case 6:
                        searchDVDByTitle();
                        break;
                    case 7:
                        keepGoing = false;
                        break;
                    default:
                        unknownCommand();
                }
            }
            exitMessage();
        }catch (DVDLibraryDaoException e){
            view.displayErrorMessage(e.getMessage());
        }
    }

    private int getMenuSelection() {
        return view.printMenuAndGetSelection();
    }

    private void createDVD() throws DVDLibraryDaoException {
        view.displayCreateDVDBanner();
        DVD newDVD = view.getNewDVDInfo();
        dao.addDVD(newDVD.getTitle(), newDVD);
        view.displayCreateSuccessBanner();
    }

    private void listDVDs() throws DVDLibraryDaoException{
        view.displayDisplayAllBanner();
        List<DVD> dvdList = dao.getAllDVDs();
        view.displayDVDList(dvdList);
    }

    private void viewDVD() throws DVDLibraryDaoException{
        view.displayDisplayDVDBanner();
        String title = view.getDVDTitleChoice();
        DVD dvd = dao.getDVD(title);
        view.displayDVD(dvd);
    }

    private void removeDVD() throws DVDLibraryDaoException{
        view.displayRemoveDVDBanner();
        String title = view.getDVDTitleChoice();
        dao.removeDVD(title);
        view.displayRemoveSuccessBanner();
    }

    private int getEditDVDSelection() {
        return view.printEditMenuAndGetSelection();
    }

    private void editDVD() throws DVDLibraryDaoException{
        view.displayDvdEditBanner();
        String title = view.getDVDTitleChoice();
        DVD dvd = dao.getDVD(title);
        int menuEditSelection = 0;
        menuEditSelection = getEditDVDSelection();
        switch (menuEditSelection) {
            case 1:
                String updatedTitle = view.editDVDTitle();
                dvd.setTitle(updatedTitle);
                break;
            case 2:
                String updatedReleaseDate = view.editDVDReleaseDate();
                dvd.setReleaseDate(updatedReleaseDate);
                break;
            case 3:
                String updatedMPAARating = view.editDVDMpaaRating();
                dvd.setMpaaRating(updatedMPAARating);
                break;
            case 4:
                String updatedDirectorName = view.editDirectorName();
                dvd.setDirectorName(updatedDirectorName);
                break;
            case 5:
                String updatedStudio = view.editStudio();
                dvd.setStudio(updatedStudio);
                break;
            case 6:
                String updatedUserRating = view.editUserRating();
                dvd.setUserRating(updatedUserRating);
                break;
        }
        dao.editDVDLibrary(title, dvd);
        view.displayEditSuccessBanner();

    }

    private void searchDVDByTitle() throws DVDLibraryDaoException{
        view.displaySearchDVDByTitleBanner();
        String title = view.getDVDTitleChoice();
        DVD dvd = dao.searchDVDByTitle(title);
        view.displaySearchByDVDTitle(dvd);
    }

    private void unknownCommand() {
        view.displayUnknownCommandBanner();
    }

    private void exitMessage(){
        view.displayExitBanner();
    }
}
