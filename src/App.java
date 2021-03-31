public class App {
    public static void main(String[] args) throws Exception {
        Scrollbar scrollbar = new Scrollbar();
        Titlebar titlebar = new Titlebar();
        Menu menu = new Menu();
        Window window = new Window(titlebar, scrollbar);
        window.addMenu(menu);
    }
}
