package clases;

public class Tablero {
    private int totalFilas;
    private int totalColumnas;
    private Flota flota;
    public Tablero(int f, int c){
        if(f>6&&c>6){
            this.totalFilas=f;
            this.totalColumnas = c;
            this.flota = new Flota();
        }else{
            throw new IllegalArgumentException();
        }
    }
    public Tablero(int n){
        if(n>6){
            this.totalFilas=n;
            this.totalColumnas = n;
            this.flota = new Flota();
        }else{
            throw new IllegalArgumentException();
        }
    }
    public Tablero(){
        this.totalFilas=7;
        this.totalColumnas=7;
        this.flota=new Flota();
    }
    public int getTotalFilas(){
        return this.totalFilas;
    }
    public int getTotalColumnas(){
        return this.totalColumnas;
    }
    public Flota getFlota(){
        return this.flota;
    }
    public char getEstado(int f, int c){

        if(this.flota.getBarco(f,c)==null){
            return '.';
        }else {
            int aux = this.flota.getBarco(f, c).getEstado(f, c);
            switch (aux){
                case 0 : return 'B';
                case 1 : return '*';
                case 2 : return 'x';
                default : return 0;
            }
            /*
            if (this.flota.getBarco(f, c).getEstado(f, c) == 2) {
                return 'x';
            } else if (this.flota.getBarco(f, c).getEstado(f, c) == 1) {
                return '*';
            } else if (this.flota.getBarco(f, c).getEstado(f, c) == 0) {
                return 'B';
            }else{
                return '0';
            }
            */
        }
    }
    public void dibujar(boolean mostrarBarcos){
        for(int i = 1;i<this.totalFilas+1;i++){
            for(int j = 1;j<this.totalColumnas+1;j++){
                if(!mostrarBarcos){
                    if(getEstado(i,j)=='B'){
                        System.out.print(".");
                    }else{
                        System.out.print(getEstado(i,j));
                    }
                }else{
                    System.out.print(getEstado(i, j));
                }
            }
            System.out.println("");
        }
    }
}
