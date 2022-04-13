package March;

public class MergeArrays {
        public static void main(String[] args) {
            int arr1[] = {1,3,5,7};
            int n1=arr1.length;
            int arr2[] = {2,4,6,8};
            int n2=arr2.length;
            int arr3[]=new int[n1+n2];
            mergeArrays(arr1,arr2,n1,n2,arr3);
        }
        public static void mergeArrays(int[] vec1, int[] vec2, int n1,
                                       int n2, int[] vec3) {
            int i = 0, j = 0, k = 0;
            while (i < n1 && j < n2) {
                if (vec1[i] < vec2[j])
                    vec3[k++] = vec1[i++];
                else
                    vec3[k++] = vec2[j++];
            }
            while (i < n1)
                vec3[k++] = vec1[i++];
            while (j < n2)
                vec3[k++] = vec2[j++];
        }
    }
