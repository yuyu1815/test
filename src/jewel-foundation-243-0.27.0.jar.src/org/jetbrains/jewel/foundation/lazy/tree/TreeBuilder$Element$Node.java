/*    */ package org.jetbrains.jewel.foundation.lazy.tree;
/*    */ 
/*    */ import kotlin.Unit;
/*    */ import kotlin.jvm.functions.Function1;
/*    */ import kotlin.jvm.internal.Intrinsics;
/*    */ import org.jetbrains.annotations.NotNull;
/*    */ import org.jetbrains.annotations.Nullable;
/*    */ 
/*    */ @GenerateDataFunctions
/*    */ @Metadata(mv = {2, 0, 0}, k = 1, xi = 48, d1 = {"\000(\n\002\030\002\n\000\n\002\030\002\n\002\b\002\n\002\020\000\n\000\n\002\030\002\n\002\030\002\n\002\020\002\n\002\030\002\n\002\b\t\b\007\030\000*\004\b\002\020\0012\b\022\004\022\002H\0010\002B8\022\006\020\003\032\0028\002\022\b\020\004\032\004\030\0010\005\022\035\020\006\032\031\022\n\022\b\022\004\022\0028\0020\b\022\004\022\0020\t0\007¢\006\002\b\n¢\006\004\b\013\020\fR\023\020\003\032\0028\002¢\006\n\n\002\020\017\032\004\b\r\020\016R\026\020\004\032\004\030\0010\005X\004¢\006\b\n\000\032\004\b\020\020\016R(\020\006\032\031\022\n\022\b\022\004\022\0028\0020\b\022\004\022\0020\t0\007¢\006\002\b\n¢\006\b\n\000\032\004\b\021\020\022¨\006\023"}, d2 = {"Lorg/jetbrains/jewel/foundation/lazy/tree/TreeBuilder$Element$Node;", "T", "Lorg/jetbrains/jewel/foundation/lazy/tree/TreeBuilder$Element;", "data", "id", "", "childrenGenerator", "Lkotlin/Function1;", "Lorg/jetbrains/jewel/foundation/lazy/tree/ChildrenGeneratorScope;", "", "Lkotlin/ExtensionFunctionType;", "<init>", "(Ljava/lang/Object;Ljava/lang/Object;Lkotlin/jvm/functions/Function1;)V", "getData", "()Ljava/lang/Object;", "Ljava/lang/Object;", "getId", "getChildrenGenerator", "()Lkotlin/jvm/functions/Function1;", "foundation"})
/*    */ @StabilityInferred(parameters = 0)
/*    */ public final class Node<T> extends TreeBuilder.Element<T> {
/*    */   private final T data;
/*    */   @Nullable
/*    */   private final Object id;
/*    */   
/* 17 */   public final T getData() { return this.data; } @NotNull private final Function1<ChildrenGeneratorScope<T>, Unit> childrenGenerator; public static final int $stable = 8; @Nullable
/* 18 */   public Object getId() { return this.id; } @NotNull
/* 19 */   public final Function1<ChildrenGeneratorScope<T>, Unit> getChildrenGenerator() { return this.childrenGenerator; } public Node(Object data, @Nullable Object id, @NotNull Function1<ChildrenGeneratorScope<T>, Unit> childrenGenerator) {
/* 20 */     super(null);
/*    */     this.data = (T)data;
/*    */     this.id = id;
/*    */     this.childrenGenerator = childrenGenerator;
/*    */   }
/*    */   
/*    */   public boolean equals(@Nullable Object other) {
/*    */     if (this == other)
/*    */       return true; 
/*    */     if (!(other instanceof Node))
/*    */       return false; 
/*    */     Node node = (Node)other;
/*    */     return !Intrinsics.areEqual(this.data, node.data) ? false : (!Intrinsics.areEqual(this.id, node.id) ? false : (!!Intrinsics.areEqual(this.childrenGenerator, node.childrenGenerator)));
/*    */   }
/*    */   
/*    */   public int hashCode() {
/*    */     result = (this.data == null) ? 0 : this.data.hashCode();
/*    */     result = result * 31 + ((this.id == null) ? 0 : this.id.hashCode());
/*    */     return result * 31 + this.childrenGenerator.hashCode();
/*    */   }
/*    */   
/*    */   @NotNull
/*    */   public String toString() {
/*    */     return "Node(data=" + this.data + ", id=" + this.id + ", childrenGenerator=" + this.childrenGenerator + ")";
/*    */   }
/*    */ }


/* Location:              C:\Users\yuzum\Downloads\ej-release-243.132.63.zip!\ej\lib\jewel-foundation-243-0.27.0.jar!\org\jetbrains\jewel\foundation\lazy\tree\TreeBuilder$Element$Node.class
 * Java compiler version: 17 (61.0)
 * JD-Core Version:       1.1.3
 */