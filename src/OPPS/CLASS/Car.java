package OPPS.CLASS;

import java.util.Locale;

public class Car
{
     private int wheels;
     private  int doors;
     private  String model;
     private  String colour;
     private  String engine;


    public void setModel(String model)
    {
        String validmodel  = model.toLowerCase(Locale.ROOT);
        if(validmodel.equals("swift_vdi") || validmodel.equals("r8"))
        {
            this.model = model;
        }
        else
        {
             this.model  = "unknow";
        }
    }

    public String getModel()
    {
        return model;
    }
}
