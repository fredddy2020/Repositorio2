
package pagos;

import javax.swing.JOptionPane;

public class Pagosemanall {
    public static void main(String[] args){     
   
        int horas;
        float salariosemanal;

        horas = Integer.parseInt(JOptionPane.showInputDialog("Ingrese el total de horas"));
        
        if(horas <= 40){
             salariosemanal = horas*16;
        }
        else{
             salariosemanal = (16*40) + 20*(horas-40);
        }

        JOptionPane.showMessageDialog(null, "El salario semanal es: "+salariosemanal+" soles");

}
}