class Without_add_OP{
    public int getSum(int a, int b) {
         while (b != 0) {
            int carry = a & b;     // Step 1: Find carry
            a = a ^ b;             // Step 2: Add without carry
            b = carry << 1;        // Step 3: Shift carry and repeat
        }
        return a;
    }
    public static void main(String[] args) {
 Without_add_OP w1 = new Without_add_OP();
 System.out.println(w1.getSum(20, 20));

}
}