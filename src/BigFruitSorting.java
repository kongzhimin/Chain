public class BigFruitSorting extends AbstractFruitSort{
    public BigFruitSorting(int weight) {
        super(weight);
    }
    protected void pushBox(String fruit){
        fruitBox.add("超市:"+fruit);
    }

    @Override
    public void setNextSort(AbstractFruitSort sfs) {

    }
}
