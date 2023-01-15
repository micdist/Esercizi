public class SalutoFemminile extends Saluto{

    /**
     * @param nome takes the user input and passes to father class for it to use the input
     */
    public SalutoFemminile(String nome) {
        super(nome);
    }

    @Override
    public void titolo() {
        System.out.print("signora ");
    }
}
