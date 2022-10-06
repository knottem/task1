package program;

import plants.Plants;
import javax.swing.*;
import java.text.DecimalFormat;
import java.util.List;

public class Tools {

   DecimalFormat decimalFormat = new DecimalFormat("#.0");

   protected void showMessage(Plants plant){

       String liquid;
       String height;

       if(plant.calculateLiquid() >= 1){
            liquid = (decimalFormat.format(plant.calculateLiquid()) + " Liter ");
       }
       else{
            liquid = (decimalFormat.format(100*plant.calculateLiquid()) + " cl ");
       }
       if(plant.getHeight() >= 100){
           height = ((plant.getHeight()/100) + " m");
       }
       else{
           height = (plant.getHeight() + " cm");
       }

       JOptionPane.showMessageDialog(null, "Planta: " + plant.getName() + "\nTyp: " +  plant.getTypes()
               + "\nHöjd: "+  height + "\nbehöver dagligen:\n" + liquid + plant.getLiquid());
   }

   protected int optionsMessage(String Title, String question, String option1, String option2, String option3){

        Object[] options = { option1, option2, option3};
        return JOptionPane.showOptionDialog(null, question,Title, JOptionPane.YES_NO_OPTION,JOptionPane.PLAIN_MESSAGE,null, options, options[0]);
    }

   protected int questionMessage(List<Plants> plantorna){

        String[] plants = new String[plantorna.size()];
        Object choice = null;

        for (int i = 0; i < plantorna.size(); i++) {
            String test = plantorna.get(i).getName() + " - " + plantorna.get(i).getTypes();
            plants[i] = test;
        }

        try {
            choice = JOptionPane.showInputDialog(null, "Välj Plantan", "Plant väljare", JOptionPane.QUESTION_MESSAGE, null, plants, plants[0]);
        }catch (ArrayIndexOutOfBoundsException e){
            JOptionPane.showMessageDialog(null,"Alla plantor är borttagna");
            System.exit(0);
        }

        int j = 0;
        for (int i = 0; i < plantorna.size(); i++) {
            if (choice == plants[i]) {
                j = i;
            }
        }
        return j;
   }

}