package com.library.members;

public class Librarian {

    private void checkSchedule() {
        System.out.println("Checking librarian schedule");
    }

    private void manageInventory() {
        System.out.println("Managing library inventory");
    }

    public void assistMember() {
        checkSchedule();
        manageInventory();
        System.out.println("Librarian assisted member");
    }

}
