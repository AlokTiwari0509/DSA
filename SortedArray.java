import java.util.Arrays;
public class SortedArray{
    public static void sort(int[] arr,int left,int right){
        if(left<right){
            int mid=(left+right)/2;
    
            sort(arr,left,mid);
            sort(arr,mid+1,right);
    
            merge(arr,left,mid,right);
        }
    }

    public static void merge(int[] arr,int left,int mid,int right){
        int len1=mid-left+1;
        int len2=right-mid;
    
        int[] left_arr=new int[len1];
        int[] right_arr=new int[len2];
    
    
        for(int i=0;i<len1;i++){
            left_arr[i]=arr[left+i];
        };
        for(int j=0;j<len2;j++){
            right_arr[j]=arr[mid+1+j];
        };
    
        int i=0,j=0,k=left;
    
        while(i<len1 && j<len2){
            if(left_arr[i]<=right_arr[j]){
                arr[k]=left_arr[i];
                i++;
            }else{
                arr[k]=right_arr[j];
                j++;
            }
            k++;
        }
        
        while(i<len1){
            arr[k]=left_arr[i];
            i++;
            k++;
        }
    
        while(j<len2){
            arr[k]=right_arr[j];
            j++;
            k++;
        }
    }
    public static void main(String[] args) {
        int[] nums={9,7,8,5};
        sort(nums,0,nums.length-1);
        System.out.println(Arrays.toString(nums));
    }
}





