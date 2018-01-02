
public class ClassDataArray {

    private Person[] a; // reference to array
    private int nElems; // number of data items

    public ClassDataArray(int max){
        //constructor
        this.a = new Person[max];   // create the array
        this.nElems = 0;            // no items yet
    }
//----------------------------------------------------------
    public Person find(String searchName) {
        int j;
        for(j=0; j<nElems; j++) // for each element
            if(a[j].getLast().equals(searchName))
                break;
        if(j==nElems)
            return null;
        else
            return a[j];
    } // end find
//----------------------------------------------------------
    public void insert(String first, String last, int age){
        a[nElems] = new Person(first, last, age);
        nElems++;
    }
//----------------------------------------------------------
    public boolean delete(String searchName) {
        int j;
        for(j=0; j<nElems; j++)
            if(a[j].getLast().equals(searchName))
                break;
        if(j==nElems)
            return false;
        else {
            for (int k=j; k<nElems; k++)
                a[k] = a[k+1];
            nElems--;
            return true;
        } // end delete
    }
//----------------------------------------------------------
    public void displayA() {
        for(int j=0; j<nElems; j++)
            a[j].displayPerson();
    }
}
