class Wilder{
    private String firstname;
    private boolean aware;

    Wilder(String firstname, boolean aware){

        this.firstname = firstname;
        this.aware = aware;
    }

    public String getFirstname(){
        return this.firstname;
    }
    public void setFirstname(String firstname){
        this.firstname = firstname;
    }

    public boolean isAware(){
        return this.aware;
    }
    public void setAware(){
        this.aware = aware;
    }

    public String whoAmI(){

        String awareString = this.isAware()? " et je suis aware." : " et je ne suis pas aware.";

        return "Je m'appelle "+ this.getFirstname()+ awareString;
    }
}