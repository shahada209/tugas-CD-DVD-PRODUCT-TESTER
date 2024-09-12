// object class
public class DVD  extends product {
    int length;
    String Rating;
    String Studio;

    public DVD() {
        super();
        length = 0;
        Rating = "";
        Studio = "";
    }

    public DVD(int number, String name, int quantity, double price, int length,
    String rating, String studio) {
        super(number, name, quantity, price);
        this.length = length;
        this.Rating = Rating;
        this.Studio = studio;

    }


    public int getLenght() {
        return this.length;
    }

    public void setLenght(int length) {
        this.length = length;
    }

    public String getRating() {
        return this.Rating;
    }

    public void setRating(String Rating) {
        this.Rating = Rating;
    }

    public String getStudio() {
        return this.Studio;
    }

    public void setStudio(String Studio) {
        this.Studio = Studio;
    }

    @Override
    public void print() {
        System.out.println("length: "+ length);
        System.out.println("rating: "+ Rating);
        System.out.println("Studio: "+ Studio);
    
    }

        

    }


   