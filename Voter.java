public class Voter {
   private int VoterId;
   private String name;
   private int age;

   public Voter(int VoterId, String name, int age) throws InvalidAgeException {
      this.VoterId = VoterId;
      this.name = name;
      if (age < 18) {
         throw new InvalidAgeException("Invalid Age,The Age should be above 18 years");
      }
      this.age = age;
   }
      public static void main(String[] args) {
      try {
         Voter validVote = new Voter(21, "Angel", 18);
         System.out.println("Age Created successfully" + validVote.getClass());
         Voter inValidVoter = new Voter(13, "Zuck", 16);
      } catch (InvalidAgeException e){
         System.out.println(e.getMessage());
      }
   }
}