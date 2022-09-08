class Patternx {
     
     static void Xpattern(int height){
     	for (int i = 1; i < height+1; i++) {
            for (int j = 1; j < height+1; j++) {
                if (i == j || i + j == height + 1) {
                    System.out.print("*");
                } else {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
     }
    
      
    public static void main(String[] args) {
        java.util.Scanner sc = new java.util.Scanner(System.in);
      
          int a;

        System.out.println("Enter the height: ");
        a = sc.nextInt();      
        Patternx.Xpattern(a);
    }
}