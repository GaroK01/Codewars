 class Kata {
  public static String countingSheep(int num) {
    String sheeps = "";
    for (int i = 1; i < num + 1; i++){
      sheeps = sheeps + i + " sheep...";
    }
    return sheeps;
  }
}
