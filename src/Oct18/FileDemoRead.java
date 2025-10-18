package Oct18;

public class FileDemoRead {

    private boolean isReadable;
    private boolean isWritable;

    public FileDemoRead(boolean isWritable, boolean isReadable) {
        this.isWritable = isWritable;
        this.isReadable = isReadable;
    }

    public boolean isReadable() {
        return isReadable;
    }

    public boolean isWritable() {
        return isWritable;
    }

   public void isFileReadble(){

        if(isReadable == true && isWritable == false);

       System.out.println("File is read only");

   }



}
