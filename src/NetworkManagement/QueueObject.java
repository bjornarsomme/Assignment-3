package NetworkManagement;

public class QueueObject implements Comparable<QueueObject>{

    private Vertex vertex;
    private int priority;

    public QueueObject(Vertex vertex, int priority){
        this.vertex = vertex;
        this.priority = priority;
    }

    @Override
    public int compareTo(QueueObject queueObject){
        return Integer.compare(this.priority, queueObject.priority);
    }

    public Vertex getVertex() {
        return vertex;
    }

    public void setVertex(Vertex vertex) {
        this.vertex = vertex;
    }

    public int getPriority() {
        return priority;
    }

    public void setPriority(int priority) {
        this.priority = priority;
    }
}
