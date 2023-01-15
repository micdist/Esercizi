public abstract class Saluto {
    private String nome;

    /**
     * @param nome bho
     */
    public Saluto(String nome) {
        this.nome = nome;
    }

    public void saluta(){
        buongiorno();
        titolo();
        nome();
    }
    private void buongiorno(){
        System.out.print("Buongiorno ");
    }
    public abstract void titolo();

    public void nome() {
        System.out.print(this.nome + "\n");
    }

}
