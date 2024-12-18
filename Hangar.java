class Hangar{
    
    public static void main(String[] args){

       Car clio = new Car("Clio", 50);
       Boat titanic = new Boat("Titanic", 800);

        System.out.println(clio.doStuff());
        System.out.println(titanic.doStuff());
    }
}