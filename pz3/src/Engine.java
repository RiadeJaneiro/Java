import java.util.Objects;

public class Engine {
    private boolean isRunning;

    public void start() {
        this.isRunning = true;
    }

    public void stop() {
        this.isRunning = false;
    }

    public boolean isRunning() {
        return isRunning;
    }

    @Override
    public String toString() {
        return "Engine{" +
                "isRunning=" + isRunning +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Engine engine = (Engine) o;
        return isRunning == engine.isRunning;
    }

    @Override
    public int hashCode() {
        return Objects.hashCode(isRunning);
    }
}
