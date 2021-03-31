import java.util.ArrayList;

public class Window {
    private ArrayList<Menu> menuList = new ArrayList<Menu>();
    private Titlebar titlebar;
    private Scrollbar scrollbar;
    public Window(Titlebar titlebar, Scrollbar scrollbar) {
        this.titlebar = titlebar;
        this.scrollbar = scrollbar;
    }
    public void addMenu(Menu menu){
        menuList.add(menu);
    }
    public Titlebar getTitlebar() {
        return titlebar;
    }
    public void setTitlebar(Titlebar titlebar) {
        this.titlebar = titlebar;
    }
    public Scrollbar getScrollbar() {
        return scrollbar;
    }
    public void setScrollbar(Scrollbar scrollbar) {
        this.scrollbar = scrollbar;
    }
    
}
