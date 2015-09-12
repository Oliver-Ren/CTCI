public class OnlineBookReadingSystem {
    private UserManager umanager;
    private Library lib;
    private Display display;
    private Book currBook;
    private User currUser;

    public OnlineBookReadingSystem() {
        userManager = new UserManager();
        library = new Library();
        display = new Display();
    }

    // getters for the properties.
    public Library getLibrary() {
        return lib;
    }

    public UserManager getUserManager() {
        return umanager;
    }

    public Display getDisplay() {
        return display;
    }

    public Book getCurrBook() {
        return currBook;
    }

    public User getCurrUser() {
        return currUser;
    }

    public void setCurrBook(Book newBook) {
        this.currBook = newBook;
        // be careful
        display.displayBook(newBook);
    }

    public void setCurrUser(User newUser) {
        this.currUser = newUser;
        // care
        display.displayUser(newUser);
    }



    
