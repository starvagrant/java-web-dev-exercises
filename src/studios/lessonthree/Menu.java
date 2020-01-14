package studios.lessonthree;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class Menu {
    private List<MenuItem> menuItems;
    private LocalDate lastUpdated;

    public Menu(List<MenuItem> menuItems) {
        this.menuItems = menuItems;
    }

    public void addMenuItem(MenuItem item) {
        this.menuItems.add(item);
        this.lastUpdated = LocalDate.now();
    }

    public void removeMenuItem(MenuItem item) {
        this.menuItems.remove(item);
        this.lastUpdated = LocalDate.now();
    }
}