package deep;

public class FindinMountainArray {
    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5,7,3,2,1};
        int target = 4;
        System.out.println(search(arr, target));
    }
    public static int search(int[] arr, int target){
        int peak = findPeakElement(arr);
        int firstTry = oagbunarySearch(arr, target, 0, peak);
        if(firstTry != -1){
            return firstTry;
        }
        return oagbunarySearch(arr, target, peak+1, arr.length-1);
    }
    public static int findPeakElement(int[] arr) {
        int start = 0;
        int end = arr.length -1;
        while (start < end){
            int mid = start + (end - start) / 2;
            if(arr[mid] > arr[mid + 1]){
                end = mid;
            }else{
                start = mid + 1;
            }
        }
        //start and end both search for max
        return end;
    }

    public static int oagbunarySearch(int[] arr, int target, int start, int end){
        boolean isAsc = arr[start] < arr[end];
        while (start <= end){
            int mid = start + (end - start)/2;
            if(arr[mid] == target){
                return mid;
            }
            if(isAsc){
                if(target < arr[mid]){
                    end = mid - 1;
                }else if (target > arr[mid]){
                    start = mid + 1;
                }
            }else{
                if(target > arr[mid]){
                    end = mid - 1;
                }else if (target < arr[mid]){
                    start = mid + 1;
                }
            }
        }
        return -1;
    }
}
