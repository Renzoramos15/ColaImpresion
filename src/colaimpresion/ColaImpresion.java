
package colaimpresion;

public class ColaImpresion {

  
    public static void main(String[] args) {
        // TODO code application logic here
        ColaTareas cola = new ColaTareas();
        
        System.out.println("-------------------------------------");
        cola.agregarTarea(new Tareas(" Hacer las compras"));
        cola.agregarTarea(new Tareas("Estudiar para el examen"));
        cola.agregarTarea(new Tareas("Llamar a la movilidad"));
        cola.agregarTarea(new Tareas("Limpiar la casa"));
        cola.agregarTarea(new Tareas("Tomar una siesta"));
        
        cola.procesarTarea();
        cola.mostrarTareas();


        

        
    }
    
}
