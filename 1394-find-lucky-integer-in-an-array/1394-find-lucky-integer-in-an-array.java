class Solution {
    public int findLucky(int[] arr) {
        Map<Integer, Integer> map = new HashMap<>();
        for(int i=0;i<arr.length;i++){
            map.put(arr[i],map.getOrDefault(arr[i],0)+1);
        }
        int max=-1;
        for(int x:map.keySet()){
            if(map.get(x)==x){
                max=Math.max(max,x);
            }
        }
        return max;
    }
}