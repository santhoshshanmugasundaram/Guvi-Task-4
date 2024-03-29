package guvi_task4_Q2;

class InvalidAgeException extends Exception {
    public InvalidAgeException(String message) {
        super(message);
    }
}

class Voter {
    private String voterID;
    private String name;
    private int age;

    public Voter(String voterID, String name, int age) throws InvalidAgeException {
        if (age < 18) {
            throw new InvalidAgeException("Invalid age for voter");
        }

        this.voterID = voterID;
        this.name = name;
        this.age = age;
    }

    public String getVoterID() {
        return voterID;
    }

    public void setVoterID(String voterID) {
        this.voterID = voterID;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) throws InvalidAgeException {
        if (age < 18) {
            throw new InvalidAgeException("Invalid age for voter");
        }
        this.age = age;
    }

    @Override
    public String toString() {
        return "Voter{" +
                "voterID='" + voterID + '\'' +
                ", name='" + name + '\'' +
                ", age=" + age +
                '}';
    }
}
