class GroupAnagrams {

  public List<List<String>> groupAnagrams(String[] strs) {
    HashMap<String, List<String>> obj = new HashMap<>();

    for (String word : strs) {
      char[] chars = word.toCharArray();
      Arrays.sort(chars);
      String sortedValue = new String(chars);

      if (!obj.containsKey(sortedValue)) {
        obj.put(sortedValue, new ArrayList<>());
      }
      obj.get(sortedValue).add(word);
    }

    return new ArrayList<>(obj.values());
  }
}
