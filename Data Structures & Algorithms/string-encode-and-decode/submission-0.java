class Solution {

    public String encode(List<String> strs) {
        StringBuilder sb = new StringBuilder();
        for(String str : strs){
            int length = str.length();
            sb.append(length).append('#').append(str);
        }
        return sb.toString();
    }

    public List<String> decode(String str) {
        List<String> list = new ArrayList<>();
        int i = 0;
        while(i < str.length()){
            int separate = str.indexOf('#', i);
            String lengthText = str.substring(i, separate);
            int length = Integer.parseInt(lengthText);
            int start = separate + 1;
            int end = start + length;
            list.add(str.substring(start, end));
            i = end;
        }

        return list; 
    }
}
