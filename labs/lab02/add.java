  public static int add(int a, int b) {
    int result = a + b;
    return result; 
  }

  public static void main(String[] args) {
    int a = 4;
    int b = 8;
    int c = add(b, a);
    System.out.printf("%d + %d = %d\n", a, b, c);
  }


