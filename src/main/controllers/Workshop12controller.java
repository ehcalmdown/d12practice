package sg.nus.iss.workshop12;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller

public class Workshop12controller {
    
    @RequestMapping(path={"/workshop"})
    public String test(){
        return "workshop";
    }

    @RequestMapping(path={"/processNumber"})
    public String testResults(
        @RequestParam(name= "inputNumber", defaultValue = "1") Integer unit,
        Model model
    ){
        List<Integer> listInt = new ArrayList<>();
        int loopVal = Integer.parseInt(unit.toString());

        int loop = 1;
        while(loop <= loopVal){
            int result = (int) ((Math.random() * loopVal) + 1);

            if(!listInt.contains(Integer.valueOf(result))){
                listInt.add(Integer.valueOf(result));
                loop++;
            }
        }
        

        for(int i = 0; i>listInt.size(); i++){
            System.out.print("==>" + listInt.get(i));
            System.out.println();
        }
        model.addAttribute("numbers", listInt);
        return "workshopresult";
    }
   

    
    
}
