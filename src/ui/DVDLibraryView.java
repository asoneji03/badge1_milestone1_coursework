package ui;

import dto.DVD;

import java.util.List;

public class DVDLibraryView {

    UserIO io = new UserIOConsoleImpl();

    public int printMenuAndGetSelection(){
        io.print("Main Menu");
        io.print("1. Add DVD");
        io.print("2. Remove DVD");
        io.print("3. Edit DVD Information");
        io.print("4. List all DVDs");
        io.print("5. View DVD Information");
        io.print("6. Search for DVD by Title");
        io.print("7. Exit");

        return io.readInt("Please select from the above choices.", 1, 7);
    }

    public DVD getNewDVDInfo(){
        String title = io.readString("Please enter the DVD Title");
        String releaseDate = io.readString("Please enter the release date");
        String mpaaRating = io.readString("Please enter the MPAA Rating");
        String directorName = io.readString("Please enter the director's name");
        String studio = io.readString("Please enter the studio");
        String userRating = io.readString("Please enter the additional information for User Rating");
        DVD currentDVD = new DVD();
        currentDVD.setTitle(title);
        currentDVD.setReleaseDate(releaseDate);
        currentDVD.setMpaaRating(mpaaRating);
        currentDVD.setDirectorName(directorName);
        currentDVD.setStudio(studio);
        currentDVD.setUserRating(userRating);
        return currentDVD;
    }

    public void displayCreateDVDBanner(){
        io.print("===Create DVD===");
    }

    public void displayCreateSuccessBanner(){
        io.readString("DVD successfully created. Please hit enter to continue.");
    }

    public void displayDVDList(List<DVD> dvdList){
        for(DVD currentDVD : dvdList){
            io.print(currentDVD.getTitle() + ": " + currentDVD.getReleaseDate() + ": " + currentDVD.getMpaaRating() + ": " + currentDVD.getDirectorName() + ": " + currentDVD.getStudio() + ": " + currentDVD.getUserRating());
        }
        io.readString("Please hit enter to continue.");
    }

    public void displayDisplayAllBanner(){
        io.print("===Display All DVDs===");
    }

    public void displayDisplayDVDBanner(){
        io.print("===Display DVD===");
    }

    public String getDVDTitleChoice(){
        return io.readString("Please enter the DVD title:");
    }

    public void displayDVD(DVD dvd){
        if(dvd != null){
            io.print(dvd.getTitle());
            io.print(dvd.getReleaseDate());
            io.print(dvd.getMpaaRating());
            io.print(dvd.getDirectorName());
            io.print(dvd.getStudio());
            io.print(dvd.getUserRating());
            io.print("");
        }else{
            io.print("No such dvd.");
        }
        io.readString("Please hit enter to continue");
    }

    public void displayRemoveDVDBanner(){
        io.print("===Remove Student===");
    }

    public void displayRemoveSuccessBanner(){
        io.readString("DVD successfully removed. Please hit enter to continue.");
    }

    public void displayDvdEditBanner(){
        io.print("===Edit Existing DVD Menu===");
    }

    public int printEditMenuAndGetSelection(){
        io.print("1. Title");
        io.print("2. Release Date");
        io.print("3. MPAA Rating");
        io.print("4. Director's Name");
        io.print("5. Studio");
        io.print("6. User Rating");

        return io.readInt("Please select which item you want to edit", 1, 6);
    }

    public String editDVDTitle(){
        return io.readString("Please enter the updated title.");
    }

    public String editDVDReleaseDate(){
        return io.readString("Please enter the updated Release Date.");
    }

    public String editDVDMpaaRating(){
        return io.readString("Please enter the updated MPAA Rating.");
    }

    public String editDirectorName(){
        return io.readString("Please enter the director's name.");
    }

    public String editStudio(){
        return io.readString("Please enter the updated Studio.");
    }

    public String editUserRating(){
        return io.readString("Please enter the updated User Rating");
    }

    public void displayEditSuccessBanner(){
        io.readString("DVD Edited. Press enter to go to main menu.");
    }


}
