public class SalutoMaschile extends Saluto{

    /**
     * this method exists so that one can pass a par when this method is instantiated
     * @param nome takes the user input and passes to father class for it to use the input
     */
    public SalutoMaschile(String nome) {
        super(nome);
    }

    @Override
    public void titolo() {
        System.out.print("signor ");
    }


}
