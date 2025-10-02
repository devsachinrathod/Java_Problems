// class ExEnum {
//     enum level {
//         LOW, MEDIUM, HIGH
//     }

//     public static void main(String args[]) {
//         level myVar = level.MEDIUM;
//         System.out.println(myVar);
//         switch(myVar) {
//             case LOW:
//                 System.out.println("Low level");
//                 break;
//             case MEDIUM:
//                 System.out.println("Medium level");
//                 break;
//             case HIGH:
//                 System.out.println("High level");
//                 break;
//         }
//     }
// }

enum Level {
   PINK("tHIS IS LOVE COLOR"),
   RED("THIS IS DANGER COLOR"),
   WHITE("tHIS IS SILENT COLOR");

     String description; // field

    // Constructor
    Level(String description) {
        this.description = description;
    }

    // Method
    public String getRank() {
        return description;
    }
}

public class ExEnum{
    public static void main(String[] args) {
        Level myVar = Level.RED;
        Level myLevel = Level.PINK;

        System.out.println("Value: " + myVar);            // MEDIUM
        System.out.println("Rank: " + myVar.getRank());
        
              System.out.println("Value: " + myLevel);            // MEDIUM
        System.out.println("Rank: " + myLevel.getRank());   // 2
    }
}

