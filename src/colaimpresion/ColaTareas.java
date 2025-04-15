
package colaimpresion;

import java.util.LinkedList;

public class ColaTareas {
    LinkedList<Tareas> tareas = new LinkedList<>();
    
    public void agregarTarea (Tareas tarea){
        tareas.offer(tarea);
    }
    
    public void procesarTarea(){
        if(!tareas.isEmpty()){
            System.out.println("Procesando tarea: " + tareas.poll()); //extraer
        }
        else {
            System.out.println("No existe tareas pendientes...");
        }
    }
    
    public void mostrarTareas(){
        System.out.println(tareas);
    }
    
}
