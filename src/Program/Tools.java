package Program;

import Plants.Plants;
import javax.swing.*;

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

   protected int optionsMessage(String question, String option1, String option2, String option3){

        Object[] options = { option1, option2, option3};
        return JOptionPane.showOptionDialog(null, question,"Title", JOptionPane.YES_NO_OPTION,JOptionPane.PLAIN_MESSAGE,null, options, null);
    }

}