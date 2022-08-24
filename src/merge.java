public class merge {
    public static void arrAdd( int arr[], int si , int ei, int mid){
        int merged [] = new  int[ei-si+1];

        int idx1 = si;
        int idx2 = ei;
        int x = 0;
        while(idx1<= mid && idx2<= ei){
            if(arr[idx1]<= arr[idx2]){
                merged[x++]=arr[idx1++];
             //   x++; idx1++;
            }
            else {
              merged[x++]= arr[idx2++];
            }
        }
        while(idx1<=mid){
            merged[x++]=arr[idx1++];

        }
        while (idx2<=mid){
            merged[x++]= arr[idx2++];
        }
        for (int i=0,  j=si; i<merged.length; i++, j++ )
            arr[j]=merged[i];
    }
    public static void mergeSortD(int arr[], int si, int ei){
        if(si>=ei){
            return;
        }
        int mid = si+(si-ei)/2;
        mergeSortD(arr, si , mid);
        mergeSortD(arr, mid+1, ei);
        arrAdd(arr,si, mid,ei);


    }
    public static void main(String args[]){
        int arr[]= {6,3,2,7,1,8};
        int n= arr.length;
        mergeSortD(arr ,0 , n-1);
       // arrAdd(arr,0,n-1,0);
            for (int i =0; i<n; i++){
                System.out.println(arr[i]+"");}
        System.out.println();
    }
}
