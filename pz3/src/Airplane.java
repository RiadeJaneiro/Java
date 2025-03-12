import java.util.Objects;

//Создать приложение, удовлетворяющее требованиям, приведенным в
//задании. Наследование применять только в тех заданиях, в которых это
//логически обосновано. Аргументировать принадлежность классу каждого
//создаваемого метода и корректно переопределить для каждого класса методы
//equals(), hashCode(), toString().
//3. Создать объект класса Самолет, используя классы Крыло, Шасси,
//Двигатель. Методы: летать, задавать маршрут, вывести на консоль
//маршрут.
public class Airplane {
    private Wing wing;
    private Chassis chassis;
    private Engine engine;
    private String route;

    public Airplane(Wing wing, Chassis chassis, Engine engine) {
        this.wing = wing;
        this.chassis = chassis;
        this.engine = engine;
    }

    public void fly() {
        if (engine.isRunning()) {
            System.out.println("Самолёт летит по маршруту: " + route);
        } else {
            System.out.println("Двигатель выключен взлёт не возможен!");
        }
    }

    public void setRoute(String route) {
        this.route = route;
    }

    public void print() {
        System.out.println("Маршрут самолёта: " + (route != null ? route : "не задан"));
    }

    @Override
    public String toString() {
        return "Airplane{" +
                "wing=" + wing +
                ", chassis=" + chassis +
                ", engine=" + engine +
                ", route='" + route + '\'' +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Airplane airplane = (Airplane) o;
        return Objects.equals(wing, airplane.wing) && Objects.equals(chassis, airplane.chassis) && Objects.equals(engine, airplane.engine) && Objects.equals(route, airplane.route);
    }

    @Override
    public int hashCode() {
        return Objects.hash(wing, chassis, engine, route);
    }

    public static void main(String[] args) {
        Wing wing1 = new Wing();
        Engine engine1 = new Engine();
        Chassis chassis1 = new Chassis();

        Airplane airplane1 = new Airplane(wing1, chassis1, engine1);

        airplane1.setRoute("Москва -> Париж");
        airplane1.fly();
        engine1.start();
        airplane1.fly();

        airplane1.print();
        System.out.println(airplane1);
    }
}
