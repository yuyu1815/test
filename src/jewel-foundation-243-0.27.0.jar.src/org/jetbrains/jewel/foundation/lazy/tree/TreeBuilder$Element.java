/*    */ package org.jetbrains.jewel.foundation.lazy.tree;@Metadata(mv = {2, 0, 0}, k = 1, xi = 48, d1 = {"\000\030\n\002\030\002\n\000\n\002\020\000\n\002\b\007\n\002\030\002\n\002\030\002\n\000\b7\030\000*\004\b\001\020\0012\0020\002:\002\b\tB\t\b\004¢\006\004\b\003\020\004R\024\020\005\032\004\030\0010\002X¦\004¢\006\006\032\004\b\006\020\007\001\002\n\013¨\006\f"}, d2 = {"Lorg/jetbrains/jewel/foundation/lazy/tree/TreeBuilder$Element;", "T", "", "<init>", "()V", "id", "getId", "()Ljava/lang/Object;", "Leaf", "Node", "Lorg/jetbrains/jewel/foundation/lazy/tree/TreeBuilder$Element$Leaf;", "Lorg/jetbrains/jewel/foundation/lazy/tree/TreeBuilder$Element$Node;", "foundation"})
/*    */ @StabilityInferred(parameters = 2)
/*    */ public abstract class Element<T> { public static final int $stable;
/*    */   private Element() {}
/*    */   @Nullable
/*    */   public abstract Object getId();
/*    */   @GenerateDataFunctions
/*    */   @Metadata(mv = {2, 0, 0}, k = 1, xi = 48, d1 = {"\000\026\n\002\030\002\n\000\n\002\030\002\n\002\b\002\n\002\020\000\n\002\b\007\b\007\030\000*\004\b\002\020\0012\b\022\004\022\002H\0010\002B\031\022\006\020\003\032\0028\002\022\b\020\004\032\004\030\0010\005¢\006\004\b\006\020\007R\023\020\003\032\0028\002¢\006\n\n\002\020\n\032\004\b\b\020\tR\026\020\004\032\004\030\0010\005X\004¢\006\b\n\000\032\004\b\013\020\t¨\006\f"}, d2 = {"Lorg/jetbrains/jewel/foundation/lazy/tree/TreeBuilder$Element$Leaf;", "T", "Lorg/jetbrains/jewel/foundation/lazy/tree/TreeBuilder$Element;", "data", "id", "", "<init>", "(Ljava/lang/Object;Ljava/lang/Object;)V", "getData", "()Ljava/lang/Object;", "Ljava/lang/Object;", "getId", "foundation"})
/*    */   @StabilityInferred(parameters = 0)
/*    */   public static final class Leaf<T> extends Element<T> { private final T data; @Nullable
/*    */     private final Object id; public static final int $stable = 8;
/*    */     
/* 13 */     public Leaf(Object data, @Nullable Object id) { super(null); this.data = (T)data; this.id = id; } public final T getData() { return this.data; } @Nullable public Object getId() { return this.id; } public boolean equals(@Nullable Object other) { if (this == other) return true;  if (!(other instanceof Leaf))
/*    */         return false;  Leaf leaf = (Leaf)other; return !Intrinsics.areEqual(this.data, leaf.data) ? false : (!!Intrinsics.areEqual(this.id, leaf.id)); } public int hashCode() { result = (this.data == null) ? 0 : this.data.hashCode(); return result * 31 + ((this.id == null) ? 0 : this.id.hashCode()); } @NotNull public String toString() { return "Leaf(data=" + this.data + ", id=" + this.id + ")"; } }
/*    */    @GenerateDataFunctions @Metadata(mv = {2, 0, 0}, k = 1, xi = 48, d1 = {"\000(\n\002\030\002\n\000\n\002\030\002\n\002\b\002\n\002\020\000\n\000\n\002\030\002\n\002\030\002\n\002\020\002\n\002\030\002\n\002\b\t\b\007\030\000*\004\b\002\020\0012\b\022\004\022\002H\0010\002B8\022\006\020\003\032\0028\002\022\b\020\004\032\004\030\0010\005\022\035\020\006\032\031\022\n\022\b\022\004\022\0028\0020\b\022\004\022\0020\t0\007¢\006\002\b\n¢\006\004\b\013\020\fR\023\020\003\032\0028\002¢\006\n\n\002\020\017\032\004\b\r\020\016R\026\020\004\032\004\030\0010\005X\004¢\006\b\n\000\032\004\b\020\020\016R(\020\006\032\031\022\n\022\b\022\004\022\0028\0020\b\022\004\022\0020\t0\007¢\006\002\b\n¢\006\b\n\000\032\004\b\021\020\022¨\006\023"}, d2 = {"Lorg/jetbrains/jewel/foundation/lazy/tree/TreeBuilder$Element$Node;", "T", "Lorg/jetbrains/jewel/foundation/lazy/tree/TreeBuilder$Element;", "data", "id", "", "childrenGenerator", "Lkotlin/Function1;", "Lorg/jetbrains/jewel/foundation/lazy/tree/ChildrenGeneratorScope;", "", "Lkotlin/ExtensionFunctionType;", "<init>", "(Ljava/lang/Object;Ljava/lang/Object;Lkotlin/jvm/functions/Function1;)V", "getData", "()Ljava/lang/Object;", "Ljava/lang/Object;", "getId", "getChildrenGenerator", "()Lkotlin/jvm/functions/Function1;", "foundation"}) @StabilityInferred(parameters = 0) public static final class Node<T> extends Element<T>
/*    */   {
/* 17 */     private final T data; @Nullable private final Object id; public final T getData() { return this.data; } @NotNull private final Function1<ChildrenGeneratorScope<T>, Unit> childrenGenerator; public static final int $stable = 8; @Nullable
/* 18 */     public Object getId() { return this.id; } @NotNull
/* 19 */     public final Function1<ChildrenGeneratorScope<T>, Unit> getChildrenGenerator() { return this.childrenGenerator; } public Node(Object data, @Nullable Object id, @NotNull Function1<ChildrenGeneratorScope<T>, Unit> childrenGenerator) {
/* 20 */       super(null);
/*    */       this.data = (T)data;
/*    */       this.id = id;
/*    */       this.childrenGenerator = childrenGenerator;
/*    */     }
/*    */     
/*    */     public boolean equals(@Nullable Object other) {
/*    */       if (this == other)
/*    */         return true; 
/*    */       if (!(other instanceof Node))
/*    */         return false; 
/*    */       Node node = (Node)other;
/*    */       return !Intrinsics.areEqual(this.data, node.data) ? false : (!Intrinsics.areEqual(this.id, node.id) ? false : (!!Intrinsics.areEqual(this.childrenGenerator, node.childrenGenerator)));
/*    */     }
/*    */     
/*    */     public int hashCode() {
/*    */       result = (this.data == null) ? 0 : this.data.hashCode();
/*    */       result = result * 31 + ((this.id == null) ? 0 : this.id.hashCode());
/*    */       return result * 31 + this.childrenGenerator.hashCode();
/*    */     }
/*    */     
/*    */     @NotNull
/*    */     public String toString() {
/*    */       return "Node(data=" + this.data + ", id=" + this.id + ", childrenGenerator=" + this.childrenGenerator + ")";
/*    */     }
/*    */   } }


/* Location:              C:\Users\yuzum\Downloads\ej-release-243.132.63.zip!\ej\lib\jewel-foundation-243-0.27.0.jar!\org\jetbrains\jewel\foundation\lazy\tree\TreeBuilder$Element.class
 * Java compiler version: 17 (61.0)
 * JD-Core Version:       1.1.3
 */