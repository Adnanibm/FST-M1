package activities;

public class Activity5 {
    public static void main(String[] args) {
        // Create object of MyBook
        MyBook newNovel = new MyBook();

        // Set the title
        String title = "Learning Java with Activities";
        newNovel.setTitle(title);

        // Get and print the title
        System.out.println("The title is: " + newNovel.getTitle());
    }
}
