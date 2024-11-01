/* 
import javax.swing.JOptionPane;

public class ExectarGame {
    public static void main(String[] args) {
        BichinhoVirtual a1 = new BichinhoVirtual("pato");
        BichinhoVirtual a2 = new BichinhoVirtual("bode", 0, 
        true, 10, 10);         
                
        public String MenuDeOpcoe(){
            return "1 - nascer" + "/n" +
                   "2 - correr" + "/n" +
                   "3 - dormir " + "/n" +
                   "4 - morrer" + "/n" +
                   JOptionPane.showInputDialog("digite uma opção");
               } 
        int op = 1;
        while ((op != 0) && (op <= 4)) {
            op = Integer.valueOf(MenuDeOpcoe());

            if (op == 1) {
                a1.Nascer();
            }

            if (op == 2) {
                a1.Correr();
            }

            if (op == 3) {
                a1.Dormir();
            }

            if (op == 4) {
                a1.Morrer2();
            }
}
}
}*/

import javax.swing.JOptionPane;

public class ExectarGame {
    public static void main(String[] args) {
        BichinhoVirtual b1 = new BichinhoVirtual("Fluffy");

        b1.Nascer();
        JOptionPane.showMessageDialog(null, b1.Nascer(), "Nacer", 3);

        b1.Correr();
        JOptionPane.showMessageDialog(null, b1.Comer(), "Comer", 3);

        b1.Comer();
        JOptionPane.showMessageDialog(null, b1.Correr(), "Correr", 3);

        b1.Dormir();
        JOptionPane.showMessageDialog(null, b1.Dormir(), "Dormir", 3);

        while (b1.isVivo()) {
            b1.EStadoAnimal();
        }
        System.out.println("Animal morreu: " + b1.getNome());
    }
}