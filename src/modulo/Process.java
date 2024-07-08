package modulo;

public class Process {
   private int id;
   private String nombre;
   private int time;

    public Process() {
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getTime() {
        return time;
    }

    public void setTime(int time) {
        this.time = time;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    @Override
    public String toString() {
        return "Process{" +
                "id=" + id +
                ", nombre='" + nombre + '\'' +
                ", time=" + time +
                '}';
    }
}
