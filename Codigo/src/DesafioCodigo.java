public class DesafioCodigo {
    public static void main(String[] args) {
        int t =3;

        int [] n = new int[1000];

        for(int i=0; i<n.length; i++){
            for(int j=0; j<t; j++){

                if(i< n.length){
                    System.out.println("N[" + i  + "] = "+ j  );
                    i++;
    
                    if(j == t-1)
                    i--;

                }
            }
        }
    }
}
