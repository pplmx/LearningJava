package individual.cy.learn.pattern.creational.builder;

/**
 * @author mystic
 */
public class Computer {
    /**
     * Required
     */
    private final String cpu;
    /**
     * Required
     */
    private final String ram;
    private final String keyboard;
    private final String headset;
    private final String display;

    public Computer(ComputerBuilder builder) {
        this.cpu = builder.cpu;
        this.ram = builder.ram;
        this.keyboard = builder.keyboard;
        this.headset = builder.headset;
        this.display = builder.display;
    }

    public static Computer.ComputerBuilder builder(String cpu, String ram) {
        return new Computer.ComputerBuilder(cpu, ram);
    }

    @Override
    public String toString() {
        return "Computer{" +
            "cpu='" + cpu + '\'' +
            ", ram='" + ram + '\'' +
            ", keyboard='" + keyboard + '\'' +
            ", headset='" + headset + '\'' +
            ", display='" + display + '\'' +
            '}';
    }

    public static class ComputerBuilder {
        private final String cpu;
        private final String ram;
        private String keyboard;
        private String headset;
        private String display;

        public ComputerBuilder(String cpu, String ram) {
            this.cpu = cpu;
            this.ram = ram;
        }

        public Computer build() {
            return new Computer(this);
        }

        public Computer.ComputerBuilder keyboard(String keyboard) {
            this.keyboard = keyboard;
            return this;
        }

        public Computer.ComputerBuilder headset(String headset) {
            this.headset = headset;
            return this;
        }

        public Computer.ComputerBuilder display(String display) {
            this.display = display;
            return this;
        }
    }
}
