package q3;

public class Main {
    public static void main(String[] args) {
        Soccer sc=new Soccer();
        Sports sr=new Sports();
        System.out.println(sc.getName());
        sc.getNumberOfTeamMembers();
        System.out.println(sr.getName());
        sr.getNumberOfTeamMembers();
    }
}
class Sports{
    String getName(){
        return "Generic Sports";
    }
    void getNumberOfTeamMembers(){
        System.out.println( "Each team has n players in " + getName() );
    }
}
class Soccer extends Sports{
    @Override
    String getName(){
        return "Soccer Class";
    }
    @Override
    void getNumberOfTeamMembers(){
        System.out.println( "Each team has 11 players in " + getName() );
    }
}
