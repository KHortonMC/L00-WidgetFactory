import java.util.ArrayList;
import java.util.Random;

public class Factory {
    static ArrayList<Widget> widgets = new ArrayList();
    static Validator validator = new Validator();
    static InformationKiosk informationKiosk = new InformationKiosk();
    static NumberCruncher numberCruncher = new NumberCruncher();
    static ReportParticipation reportParticipation = new ReportParticipation();

    static void add(Widget w) {
        widgets.add(w);
        w.checkWidget();
    }

    public static void main(String[] args) {
        //add(new ProfHorton());
        //add(new YourName());
        //add(new YourName());
        //add(new YourName());
        //add(new YourName());
        //add(new YourName());
        //add(new YourName());
        //add(new YourName());
        //add(new YourName());
        //add(new YourName());
        //add(new YourName());
        //add(new YourName());

        System.out.println("We have created " + widgets.size() + " number of widgets!");

        validator.performTask(widgets);
        informationKiosk.performTask(widgets);
        numberCruncher.performTask(widgets);
        reportParticipation.performTask(widgets);
    }
}