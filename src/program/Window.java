package program;

import plants.*;

import javax.swing.*;
import java.util.List;

public class Window extends Tools{

    protected int rerun;

    public void askWindow(List<Plants> plantorna){

        while(true) {
            int answer = optionsMessage("Plant väljare","Vad vill du göra?", "Lägga till planta?","Ta bort planta?", "Visa plantorna");

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
                    int i = questionMessage(plantorna);
                    plantorna.remove(i);
                }
                else if(answer == 2){
                    break;
                }
                else if(answer == -1){
                    System.exit(0);
                }
        }
    }

    public int showWindow(List<Plants> plantorna){

        rerun = 0;

        while (true) {

            int i = questionMessage(plantorna);
            showMessage(plantorna.get(i));

            int answer = optionsMessage("Title","Kör Programmet igen?","Kör listan igen", "Kör hela programmet igen", "Quit");
            
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
