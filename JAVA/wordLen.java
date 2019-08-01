public Map<String, Integer> wordLen(String[] strings) {
  Map<String, Integer> len = new HashMap<String, Integer>();
  
  for (int words = 0; words<strings.length; words++){
    if(len.containsKey(strings[words])){
      len.put(strings[words], strings[words].length());
    }
    else{
      len.put(strings[words], strings[words].length());
    }
  }
  return len;
}
