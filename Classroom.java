class Classroom{
    
    public static void main(String[] args){

        Wilder marie = new Wilder("Marie", true);
        Wilder toto = new Wilder("Toto", false);

        System.out.println(marie.whoAmI());
        System.out.println(toto.whoAmI());
    }
}