class Solution {
    public boolean checkIfPangram(String sentence) {
    //     boolean a = true;
       
    //     if(sentence.length() < 26){
    //         return false;
    //     }
    //     for(char i = 'a' ; i<= 'z' ; i++){
    //         if(sentence.contains(i + "")){
    //             a = true;

    //         }
    //         else{
    //             a = false;
    //         }
    //     }
    //     return a;

    int[] arr = new int[26];

    for(int i =0; i<sentence.length() ; i++){
        int val = (int)(sentence.charAt(i) - 'a');
        arr[val] = 1;
    }

    for(int i =0; i<26; i++){
        if(arr[i] == 0){
            return false;}
        }
        return true;
    }
}