    enum AnimalType {
        MAMMAL,
        BIRD,
        REPTILE,
        AMPHIBIAN,
        FISH
    }

    abstract class Animal {
        private String name;
        private int age;
        private AnimalType type;
        private String habitat;

        public Animal(String name, int age, AnimalType type, String habitat) {
            this.name = name;
            this.age = age;
            this.type = type;
            this.habitat = habitat;
        }

        public void setName(String name) {
            this.name = name;
        }

        public void setAge(int age) {
            this.age = age;
        }

        public void setType(AnimalType type) {
            this.type = type;
        }

        public void setHabitat(String habitat) {
            this.habitat = habitat;
        }

        public String getName() {
            return name;
        }

        public int getAge() {
            return age;
        }

        public AnimalType getType() {
            return type;
        }

        public String getHabitat() {
            return habitat;
        }

        public abstract void receiveTreatment();
    }

    class Dog extends Animal {
        private String breed;

        public Dog(String name, int age, AnimalType type, String habitat, String breed) {
            super(name, age, type, habitat);
            this.breed = breed;
        }

        public void bark() {
            System.out.println("Mango Miyvars");
        }

        @Override
        public void receiveTreatment() {
            System.out.println(getName() + " Anos Uyvars Mango da Naabarot");
        }
    }

    class Parrot extends Animal implements Pet, Bird {
        private String color;

        public Parrot(String name, int age, AnimalType type, String habitat, String color) {
            super(name, age, type, habitat);
            this.color = color;
        }

        public void mimic() {
            System.out.println(getName() + " Mango bevrs chams");
        }

        @Override
        public void receiveTreatment() {
            System.out.println(getName() + " Anos Uyvars Mango da Naabarot");
        }

        @Override
        public void playWith() {
            System.out.println(getName() + " mango ar ikbineba getamaseba");
        }

        @Override
        public void fly() {
            System.out.println(getName() + " dafrinavs ");
        }
    }

    interface Pet {
        void playWith();
    }

    interface Bird {
        void fly();
    }

    public class Main {
        public static void main(String[] args) {
            Dog myDog = new Dog("Mango", 3, AnimalType.MAMMAL, "Saxli", "German Shepherd");
            Parrot myParrot = new Parrot("Daisy", 2, AnimalType.BIRD, "Veluri buneba", "Green");

            myDog.bark();
            myParrot.mimic();

            myDog.receiveTreatment();
            myParrot.receiveTreatment();

            myParrot.playWith();
            myParrot.fly();
        }
    }



