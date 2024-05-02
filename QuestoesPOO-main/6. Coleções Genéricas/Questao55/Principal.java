import java.util.LinkedList;
import java.util.Queue;

public class Principal {
    public static void main(String[] args) {
        int minutos = 1440;
        int pacienteAtendidos = 0;
        int pacientesFila = 0;
        int mins = 0;

        Paciente paciente;
        Queue<Paciente> pacientes = new LinkedList<>();
        Queue<Paciente> pacientesPriority = new LinkedList<>();

        while(minutos != 0 && pacienteAtendidos != 20){
            if(mins % 4 == 0 && pacientesFila < 20){
                paciente = new Paciente();
                pacientesFila++;

                System.out.println("\tMais um Paciente...\n\t" + paciente + "\n");

                if(paciente.getIdade() >= 60){
                    pacientesPriority.offer(paciente);
                } else {
                    pacientes.offer(paciente);
                }
            }
            
            if(mins % 5 == 0 && (!pacientesPriority.isEmpty() || !pacientes.isEmpty())){
                if(!pacientesPriority.isEmpty()){
                    System.out.println(" - - - - - - - - - - - - - - - - \nAtendendo um paciente prioritário...\n - - - - - - - - - - - - - - - - \n");
                    pacientesPriority.poll();
                    pacienteAtendidos++;
                } else {
                    System.out.println(" - - - - - - - - - - - - - - - - \nAtendendo um paciente...\n - - - - - - - - - - - - - - - - \n");
                    pacientes.poll();
                    pacienteAtendidos++;
                }
            }

            mins++;
            minutos++;
        }
    }
}

