package LogicalPrograms;

import LogicalPrograms.Polimophism.TextBox2;
import LogicalPrograms.Polimophism.UIControl2;


public class LogicalPrograms {

public static void main(String[] args) {
//    *****************************************using Abstraction
//    var mailService = new Abstraction();
//    mailService.sendMail();
//    ***************************************using inheritance
//    var textBox = new TextBox();
//    textBox.enable();
//    ***********************************************Polimophism
    drawUIControl(new TextBox2());
}
    public static void drawUIControl(UIControl2 control){
        control.draw();
    }


}
