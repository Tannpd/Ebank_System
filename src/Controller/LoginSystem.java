
package controller;

import repository.LoginRepository;
import view.Menu;
import java.util.Locale;


public class LoginSystem extends Menu<String>{
    static String[] mc = {"Vietnamese", "English", "Exit"};
    LoginRepository program;
    Locale vietnamese = new Locale("vi");
    Locale english = Locale.ENGLISH;
    public LoginSystem() {
        super("\nLogin Program", mc);
        program = new LoginRepository();
    }

    @Override
    public void execute(int n) {
        switch (n) {
            case 1:
                program.login(vietnamese);
                break;
            case 2:
                program.login(english);
                break;
            case 3:
                System.exit(0);
        }
    }
    
}