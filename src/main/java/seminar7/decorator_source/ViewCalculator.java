package seminar7.decorator_source;

import java.util.Scanner;

public class ViewCalculator {
    private ICalculable iCalculable;

    public ViewCalculator(ICalculable iCalculable) {
        this.iCalculable = iCalculable;
    }

    public void run() {
        int primaryArg = promptInt("Введите первый аргумент ");
        iCalculable.sum(primaryArg);
        while (true) {
            String cmd = prompt("Введите команду(*,+,=) ");
            if (cmd.equals("*")) {
                int arg = promptInt("Введите второй аргумент:");
                iCalculable.multi(arg);
                continue;
            }
            if (cmd.equals("+")) {
                int arg = promptInt("Введите второй аргумент:");
                iCalculable.sum(arg);
                continue;
            }
            if (cmd.equals("=")) {
                int result = iCalculable.getResult();
                System.out.println(result);
                break;
            }

            String cmd1 = prompt("еще посчитать Y/N");
            if (cmd1.equals("y")) {
                continue;
            }
            break;
        }
    }

        private String prompt (String message){
            Scanner in = new Scanner(System.in);
            System.out.println(message);
            return in.nextLine();
        }

        private int promptInt (String message){
            Scanner in = new Scanner(System.in);
            System.out.println(message);
            return Integer.parseInt(in.nextLine());
        }
    }


