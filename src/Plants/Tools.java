package Plants;

import javax.swing.*;

public interface Tools {

    default double convertLToCl(double amount){
        double converted = amount * 100;
        return converted;
    }

    static void showMessage(Plants plant){

        String liquid;

        if(plant.calculateLiquid() > 1){
            liquid = (plant.calculateLiquid() + " Liter ");
        }
        else{
            liquid = (Math.round(plant.convertLToCl(plant.calculateLiquid())) + " CL ");
        }

            JOptionPane.showMessageDialog(null, "Din planta " + plant.getName() + " behöver dagligen:\n"
                    + liquid + (plant.getLiquidType()));
    }

    static int optionsMessage(String question, String option1, String option2, String option3){

        Object[] options = { option1, option2, option3};
        return JOptionPane.showOptionDialog(null, question,"Title", JOptionPane.YES_NO_OPTION,JOptionPane.PLAIN_MESSAGE,null, options, null);
    }

}

