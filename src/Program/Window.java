package Program;

import Plants.*;

import javax.swing.*;
import java.util.List;

public class Window extends Tools{

    protected int rerun;

    public void askWindow(List<Plants> plantorna){

        while(true) {
            int answer = JOptionPane.showConfirmDialog(null, "Hej vill du lägga till en planta eller använda dem som redan finns?\n YES för att lägga till, NO för att gå till nuvarande listan","Title", JOptionPane.YES_NO_OPTION);
                if(answer == 0){

                    String name = JOptionPane.showInputDialog(null,"Vad heter Plantan?");

                    double height;
                    try {
                        height = Double.parseDouble(JOptionPane.showInputDialog(null, "Hur hög är plantan i cm?"));
                    }catch (NumberFormatException e){
                        JOptionPane.showMessageDialog(null, "Du måste lägga in ett value");
                        continue;
                    }
                    if(height <= 0){
                        JOptionPane.showMessageDialog(null, "Plantan kan inte vara 0 cm eller negativt value");
                        continue;
                    }

                    String[] plantType = new String[]{"Kaktus", "Köttätande växt", "Palm"};
                    Object choice = JOptionPane.showInputDialog(null, "Välj Plant typen", "Plant väljare", JOptionPane.QUESTION_MESSAGE, null, plantType, plantType[0]);

                        if(choice == "Kaktus"){
                            plantorna.add(new Cactus(name, height));
                        }
                        else if(choice == "Köttätande växt"){
                            plantorna.add(new Carnivorousplant(name, height));
                        }
                        else if(choice == "Palm"){
                            plantorna.add(new Palmtree(name, height));
                        }
                        else{
                            System.exit(0);
                        }
                }
                else if(answer == 1){
                    break;
                }
                else{
                    System.exit(0);
                }
        }
    }

    public int showWindow(List<Plants> plantorna){

        rerun = 0;

        while (true) {

            String[] plants = new String[plantorna.size()];

            for (int i = 0; i < plantorna.size(); i++) {
                String test = plantorna.get(i).getName() + " - " + plantorna.get(i).getTypes();
                plants[i] = test;
            }

            Object choice = JOptionPane.showInputDialog(null, "Välj Plantan", "Plant väljare", JOptionPane.QUESTION_MESSAGE, null, plants, plants[0]);

            for (int i = 0; i < plantorna.size(); i++) {
                if (choice == plants[i]) {
                    showMessage(plantorna.get(i));
                }
            }

            int answer = optionsMessage("Kör Programmet igen?","Kör listan igen", "Kör hela programmet igen", "Quit");
            
            if(answer == -1){
                System.exit(0);
            }
            else if(answer == 1){
                rerun = 1;
                break;
            }
            else if(answer == 2){
                break;
            }
        }
        return rerun;
    }


}
