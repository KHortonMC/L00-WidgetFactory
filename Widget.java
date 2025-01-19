public abstract class Widget {
    public void checkWidget() {
        System.out.println(flipValue(false));
        System.out.println(singleWord());
        System.out.println(process(1));
        System.out.println(creatorName());
    }

    /**
     * Flips a boolean to be the opposite
     * @param value a boolean
     * @return the opposite of the value passed
     */
    public abstract boolean flipValue(boolean value);

    /**
     * Returns a word (keep it clean!)
     * @return A string containing a single word
     */
    public abstract String singleWord();

    /**
     * Performs an operation on an integer
     * @param value an integer to process
     * @return a modified version of the initial value
     */
    public abstract int process(int value);
    
    /**
     * The name of the creator who implemented this widget
     * @return YOUR name for lab credit
     */
    public abstract String creatorName();
}