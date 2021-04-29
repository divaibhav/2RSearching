package implementation;

public class Searching {
    //array to be searched
    int[] brr;
    public Searching() {
    }

    public Searching(int[] brr) {
        this.brr = brr;
    }


    public boolean search(int[] arr, int searchElement){
        boolean response = false;
        for (int i = 0; i < arr.length; i++) {
            if(arr[i] == searchElement){
                response = true;
                break;
            }
        }

        return response;
    }
    public <E> boolean searchGeneric(E[] arr, E searchElement){
        boolean response = false;
        for (int i = 0; i < arr.length; i++) {
            if(arr[i].equals(searchElement)){
                response = true;
                break;
            }
        }
        return response;
    }
    public int findIndex(int[] arr, int searchElement){
        int response = -1;
        int occurrenceCount = 0;
        for (int i = 0; i < arr.length; i++) {
            if(arr[i] == searchElement){
                occurrenceCount++;
                if(occurrenceCount == 2){
                    response = i;
                    break;
                }
            }
        }
        return response;
    }

    public boolean binarySearch(int searchElement, int low, int high) {
        if(low > high){
            return false;
        }
        int mid = (low + high) / 2;
        if(searchElement == brr[mid]){
            return true;
        }
        else if(searchElement < brr[mid]){
            return binarySearch(searchElement, low, mid - 1);
        }
        else{
            return binarySearch(searchElement, mid + 1, high);
        }
    }
}
