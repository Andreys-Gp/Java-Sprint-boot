public class ControlesdeFlujo {
    public static void main(String[] args) throws Exception {
        
        int i;
        for (i = 0; i < 10; i++) {
            if (i == 5) {
                System.out.println("El valor de i es " + i);
                /* break; */
                /* continue; */
                return;
            }
            System.out.println("El valor de i es " + i);
        }


    }
    
}
