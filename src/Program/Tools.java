package Program;

import Plants.Plants;
import javax.swing.*;
import java.util.List;

public class Tools {

   protected double convertLToCl(double amount){
        return amount * 100;
    }

   protected void showMessage(Plants plant){

        String liquid;

        if(plant.calculateLiquid() >= 1){
            liquid = (plant.calculateLiquid() + " Liter ");
        }
        else{
            liquid = (Math.round(convertLToCl(plant.calculateLiquid())) + " CL ");
        }

        JOptionPane.showMessageDialog(null, "Planta: " + plant.getName() + "\nTyp: " +  plant.getTypes()
                                            + "\nbehöver dagligen:\n" + liquid + (plant.getLiquidType()));
    }

   protected int optionsMessage(String Title, String question, String option1, String option2, String option3){

        Object[] options = { option1, option2, option3};
        return JOptionPane.showOptionDialog(null, question,Title, JOptionPane.YES_NO_OPTION,JOptionPane.PLAIN_MESSAGE,null, options, null);
    }

   protected int questionMessage(List<Plants> plantorna){
        String[] plants = new String[plantorna.size()];

        for (int i = 0; i < plantorna.size(); i++) {
            String test = plantorna.get(i).getName() + " - " + plantorna.get(i).getTypes();
            plants[i] = test;
        }

        Object choice = JOptionPane.showInputDialog(null, "Välj Plantan", "Plant väljare", JOptionPane.QUESTION_MESSAGE, null, plants, plants[0]);

        int j = 0;
        for (int i = 0; i < plantorna.size(); i++) {
            if (choice == plants[i]) {
                j = i;
            }
        }
        return j;
   }

}