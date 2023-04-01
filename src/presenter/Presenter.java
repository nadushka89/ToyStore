package presenter;
import model.Service;
import view.View;

import java.io.IOException;

public class Presenter {
    private View view;
    private Service service=new Service();

    public Presenter(View view){
        this.view = view;
        view.setPresenter(this);
    }
    public String myToys(){
        return service.myToys();
    }
    public String loadData() throws IOException {
        return service.loadData();
    }
    public String saveData() throws Exception {
        return service.saveData();
    }
    public String addToy( String toy,Integer count,Integer lossOfWinnings){
        return service.addToys(toy,count, lossOfWinnings);
    }
    public String printToys(){
        return service.printToys();
    }
    public String deleteToy(int number){
        return service.deleteToy(number);

    }
//    public String changeToy(int number){
//        return service.changeToy(number);
//    }

    public String resultWin() throws IOException {
        return service.resultWin();
    }
}
