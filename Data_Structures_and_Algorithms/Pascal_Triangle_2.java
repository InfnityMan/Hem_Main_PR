class Solution {
    public List<Integer> getRow(int rowIndex) {
      if(rowIndex==0){
        List<Integer>i=new ArrayList<>();i.add(1);return i;
      }
      List<List<Integer>>pt=new ArrayList<>();
      pt.add(new ArrayList<>());
      pt.get(0).add(1);
      for(int r=1;r<rowIndex+1;r++){
        List<Integer>c=new ArrayList<>();
        List<Integer>p=pt.get(r-1);
        c.add(1);
        for(int col=1;col<p.size();col++)c.add(p.get(col-1)+p.get(col));
        c.add(1);
        pt.add(c);
      }
      return pt.get(pt.size()-1);
    }
}
