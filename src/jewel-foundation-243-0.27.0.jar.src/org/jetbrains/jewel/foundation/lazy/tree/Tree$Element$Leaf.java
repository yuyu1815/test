/*    */ package org.jetbrains.jewel.foundation.lazy.tree;
/*    */ 
/*    */ import androidx.compose.runtime.internal.StabilityInferred;
/*    */ import java.util.List;
/*    */ import kotlin.Metadata;
/*    */ import org.jetbrains.annotations.NotNull;
/*    */ import org.jetbrains.annotations.Nullable;
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ @Metadata(mv = {2, 0, 0}, k = 1, xi = 48, d1 = {"\000\036\n\002\030\002\n\000\n\002\030\002\n\002\b\002\n\002\020\b\n\002\b\005\n\002\020\000\n\002\b\021\b\007\030\000*\004\b\002\020\0012\b\022\004\022\002H\0010\002BW\022\006\020\003\032\0028\002\022\006\020\004\032\0020\005\022\006\020\006\032\0020\005\022\016\020\007\032\n\022\004\022\0028\002\030\0010\002\022\016\020\b\032\n\022\004\022\0028\002\030\0010\002\022\016\020\t\032\n\022\004\022\0028\002\030\0010\002\022\006\020\n\032\0020\013¢\006\004\b\f\020\rR\026\020\003\032\0028\002X\004¢\006\n\n\002\020\020\032\004\b\016\020\017R\024\020\004\032\0020\005X\004¢\006\b\n\000\032\004\b\021\020\022R\024\020\006\032\0020\005X\004¢\006\b\n\000\032\004\b\023\020\022R\034\020\007\032\n\022\004\022\0028\002\030\0010\002X\004¢\006\b\n\000\032\004\b\024\020\025R\"\020\b\032\n\022\004\022\0028\002\030\0010\002X\016¢\006\016\n\000\032\004\b\026\020\025\"\004\b\027\020\030R\"\020\t\032\n\022\004\022\0028\002\030\0010\002X\016¢\006\016\n\000\032\004\b\031\020\025\"\004\b\032\020\030R\024\020\n\032\0020\013X\004¢\006\b\n\000\032\004\b\033\020\017¨\006\034"}, d2 = {"Lorg/jetbrains/jewel/foundation/lazy/tree/Tree$Element$Leaf;", "T", "Lorg/jetbrains/jewel/foundation/lazy/tree/Tree$Element;", "data", "depth", "", "childIndex", "parent", "previous", "next", "id", "", "<init>", "(Ljava/lang/Object;IILorg/jetbrains/jewel/foundation/lazy/tree/Tree$Element;Lorg/jetbrains/jewel/foundation/lazy/tree/Tree$Element;Lorg/jetbrains/jewel/foundation/lazy/tree/Tree$Element;Ljava/lang/Object;)V", "getData", "()Ljava/lang/Object;", "Ljava/lang/Object;", "getDepth", "()I", "getChildIndex", "getParent", "()Lorg/jetbrains/jewel/foundation/lazy/tree/Tree$Element;", "getPrevious", "setPrevious", "(Lorg/jetbrains/jewel/foundation/lazy/tree/Tree$Element;)V", "getNext", "setNext", "getId", "foundation"})
/*    */ @StabilityInferred(parameters = 0)
/*    */ public final class Leaf<T>
/*    */   implements Tree.Element<T>
/*    */ {
/*    */   private final T data;
/*    */   private final int depth;
/*    */   private final int childIndex;
/*    */   @Nullable
/*    */   private final Tree.Element<T> parent;
/*    */   @Nullable
/*    */   private Tree.Element<T> previous;
/*    */   @Nullable
/*    */   private Tree.Element<T> next;
/*    */   @NotNull
/*    */   private final Object id;
/*    */   public static final int $stable = 8;
/*    */   
/*    */   public Leaf(Object data, int depth, int childIndex, @Nullable Tree.Element<T> parent, @Nullable Tree.Element<T> previous, @Nullable Tree.Element<T> next, @NotNull Object id) {
/* 60 */     this.data = (T)data;
/* 61 */     this.depth = depth;
/* 62 */     this.childIndex = childIndex;
/* 63 */     this.parent = parent;
/* 64 */     this.previous = previous;
/* 65 */     this.next = next;
/* 66 */     this.id = id; } @NotNull public Object getId() { return this.id; }
/*    */ 
/*    */   
/*    */   @NotNull
/*    */   public List<Tree.Element<T>> path() {
/*    */     return Tree.Element.DefaultImpls.path(this);
/*    */   }
/*    */   
/*    */   @NotNull
/*    */   public Iterable<Tree.Element<T>> previousElementsIterable() {
/*    */     return Tree.Element.DefaultImpls.previousElementsIterable(this);
/*    */   }
/*    */   
/*    */   @NotNull
/*    */   public Iterable<Tree.Element<T>> nextElementsIterable() {
/*    */     return Tree.Element.DefaultImpls.nextElementsIterable(this);
/*    */   }
/*    */   
/*    */   public T getData() {
/*    */     return this.data;
/*    */   }
/*    */   
/*    */   public int getDepth() {
/*    */     return this.depth;
/*    */   }
/*    */   
/*    */   public int getChildIndex() {
/*    */     return this.childIndex;
/*    */   }
/*    */   
/*    */   @Nullable
/*    */   public Tree.Element<T> getParent() {
/*    */     return this.parent;
/*    */   }
/*    */   
/*    */   @Nullable
/*    */   public Tree.Element<T> getPrevious() {
/*    */     return this.previous;
/*    */   }
/*    */   
/*    */   public void setPrevious(@Nullable Tree.Element<T> <set-?>) {
/*    */     this.previous = <set-?>;
/*    */   }
/*    */   
/*    */   @Nullable
/*    */   public Tree.Element<T> getNext() {
/*    */     return this.next;
/*    */   }
/*    */   
/*    */   public void setNext(@Nullable Tree.Element<T> <set-?>) {
/*    */     this.next = <set-?>;
/*    */   }
/*    */ }


/* Location:              C:\Users\yuzum\Downloads\ej-release-243.132.63.zip!\ej\lib\jewel-foundation-243-0.27.0.jar!\org\jetbrains\jewel\foundation\lazy\tree\Tree$Element$Leaf.class
 * Java compiler version: 17 (61.0)
 * JD-Core Version:       1.1.3
 */