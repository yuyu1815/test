/*    */ package com.intellij.ml.llm.matterhorn.collections;@Metadata(mv = {2, 1, 0}, k = 1, xi = 48, d1 = {"\000$\n\002\030\002\n\000\n\002\030\002\n\002\b\003\n\002\020!\n\000\n\002\020\b\n\002\b\006\n\002\020\013\n\002\b\004\030\000*\004\b\000\020\0012\b\022\004\022\002H\0010\002B\007¢\006\004\b\003\020\004J\026\020\013\032\0028\0002\006\020\f\032\0020\bH\002¢\006\002\020\rJ\b\020\016\032\0020\017H\026J\023\020\020\032\0020\0172\006\020\021\032\0028\000¢\006\002\020\022R\024\020\005\032\b\022\004\022\0028\0000\006X\004¢\006\002\n\000R\024\020\007\032\0020\b8VX\004¢\006\006\032\004\b\t\020\n¨\006\023"}, d2 = {"Lcom/intellij/ml/llm/matterhorn/collections/AddOnlyList;", "E", "Lkotlin/collections/AbstractList;", "<init>", "()V", "items", "", "size", "", "getSize", "()I", "get", "index", "(I)Ljava/lang/Object;", "isEmpty", "", "add", "item", "(Ljava/lang/Object;)Z", "core"})
/*    */ public final class AddOnlyList<E> extends AbstractList<E> {
/*    */   @NotNull
/*  4 */   private final List<E> items = new ArrayList<>();
/*    */   public int getSize() {
/*  6 */     return this.items.size();
/*    */   } public E get(int index) {
/*  8 */     return this.items.get(index);
/*    */   } public boolean isEmpty() {
/* 10 */     return this.items.isEmpty();
/*    */   } public final boolean add(Object item) {
/* 12 */     return this.items.add((E)item);
/*    */   }
/*    */ }


/* Location:              C:\Users\yuzum\Downloads\ej-release-243.132.63.zip!\ej\lib\ej-243.132.63.jar!\com\intellij\ml\llm\matterhorn\collections\AddOnlyList.class
 * Java compiler version: 17 (61.0)
 * JD-Core Version:       1.1.3
 */