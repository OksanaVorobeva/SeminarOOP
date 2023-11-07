package seminar7Kostik.creational.singleton;

public class SingleResource {
    private static SingleResource singleResource;

    public synchronized static  SingleResource getSingleResource(){
        if(singleResource==null){
            singleResource=new SingleResource();
        }
        return singleResource;
    }

    private SingleResource(){

    }
}
