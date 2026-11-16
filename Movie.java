

public class Movie {

    //private String name;
    private String movieName;
    private int numMinutes;
    private boolean isKidFriendly;
    private int numCastMembers;
    private String [] castMembers;

    public Movie(){
        this.movieName = "Flick";
        this.numMinutes = 0;
        this.isKidFriendly = false;
        this.numCastMembers = 0;
        this.castMembers = new String[10];
    }
    // Overloaded constructor
    public Movie(String movieName, int numMinutes, boolean isKidFriendly, String[] castMembers){
        this.movieName = movieName;
        this.numMinutes = numMinutes;
        this.isKidFriendly = isKidFriendly;
        this.castMembers = castMembers;
        this.numCastMembers = castMembers.length;

       /* if(castMembers != null){
            this.castMembers = new String[castMembers.length];
            for(int i = 0; i < castMembers.length;i++) {
            	this.castMembers[i] = castMembers[i];
            }
            this.numCastMembers = castMembers.length;
        }
        else{
            this.castMembers = new String[10];
            this.numCastMembers = 0;
        }*/

    }
    // Setters
    public void setMovieName(String movieName){
        this.movieName = movieName;
    }
    public void setNumMinutes(int numMinutes){
        this.numMinutes = numMinutes;
    }
    public void setIsKidFriendly(boolean isKidFriendly){
        this.isKidFriendly = isKidFriendly;
    }
    // Getters
    public String getMovieName(){
        return movieName;
    }
    public int getNumMinutes(){
        return numMinutes;
    }
    public boolean isKidFriendly(){
        return isKidFriendly;
    }
    public String[] getCastMembers(){
        String[] copyOfCastMembers = new String[castMembers.length];
        for(int i = 0; i < castMembers.length; i++){
            copyOfCastMembers[i] = castMembers[i];
        }
        return copyOfCastMembers;
    }
    public int getNumCastMembers(){
        return numCastMembers;
    }
    // f
    public boolean replaceCastMember(int index, String castMemberName){
        if(index > -1 && index < numCastMembers){

            castMembers[index] = castMemberName;

            return true;
        }
        else{
            return false;
        }
    }
    // g
    public boolean doArraysMatch(String[] arr, String[] arr2){

        if(arr == null && arr2 == null){
            return true;
        }
        if(arr != null && arr2 == null){
            return false;
        }
        if(arr == null && arr2 != null){
            return false;
        }

        if(arr.length != arr2.length){
            return false;
        }

        for(int i = 0; i < arr.length; i++){

            if(!arr[i].equalsIgnoreCase(arr2[i])){
                return false;
            }

        }
        return true;
    }
    // h
    public String getCastMemberNamesAsString(){

        if(numCastMembers == 0){
            return "none";
        }

        String result = "";

        for(int i = 0; i < numCastMembers; i++){
            result += castMembers[i];

            if(i < numCastMembers - 1){
                result += ", ";
            }

        }

        return result;


    }
    // i
    public String toString(){
        String kidFriendly;

        if(isKidFriendly == false){
            kidFriendly = "not kid friendly";
        }
        else{
            kidFriendly = "is kid friendly";
        }

        String movieInfo = String.format("Movie: [ Minutes %03d | Movie Name: %20s | %s | Number of Cast Members: %d | Cast Members: %s ]", numMinutes, movieName, kidFriendly,numCastMembers,getCastMemberNamesAsString());

        return movieInfo;

    }
    public boolean equals(Movie other){

        if(other == null){
            return false;
        }



        if(!this.movieName.equals(other.movieName)){
            return false;
        }
        if(this.numMinutes != other.numMinutes){
            return false;
        }
        if(this.isKidFriendly != other.isKidFriendly){
            return false;
        }

        if(!doArraysMatch(this.castMembers, other.castMembers)){
            return false;
        }
        return true;
    }



}
