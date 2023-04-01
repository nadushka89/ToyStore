import presenter.Presenter;
import view.*;


public class Main {
    public static void main(String[] args) throws Exception {
        View view = new Console();
        new Presenter(view);
        view.start();
    }
}