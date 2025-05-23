/*    */ package org.jetbrains.jewel.foundation.lazy.tree;
/*    */ 
/*    */ import androidx.compose.runtime.internal.StabilityInferred;
/*    */ import kotlin.jvm.internal.Intrinsics;
/*    */ import org.jetbrains.annotations.Nullable;
/*    */ 
/*    */ @GenerateDataFunctions
/*    */ @Metadata(mv = {2, 0, 0}, k = 1, xi = 48, d1 = {"\000\026\n\002\030\002\n\000\n\002\030\002\n\002\b\002\n\002\020\000\n\002\b\007\b\007\030\000*\004\b\002\020\0012\b\022\004\022\002H\0010\002B\031\022\006\020\003\032\0028\002\022\b\020\004\032\004\030\0010\005¢\006\004\b\006\020\007R\023\020\003\032\0028\002¢\006\n\n\002\020\n\032\004\b\b\020\tR\026\020\004\032\004\030\0010\005X\004¢\006\b\n\000\032\004\b\013\020\t¨\006\f"}, d2 = {"Lorg/jetbrains/jewel/foundation/lazy/tree/TreeBuilder$Element$Leaf;", "T", "Lorg/jetbrains/jewel/foundation/lazy/tree/TreeBuilder$Element;", "data", "id", "", "<init>", "(Ljava/lang/Object;Ljava/lang/Object;)V", "getData", "()Ljava/lang/Object;", "Ljava/lang/Object;", "getId", "foundation"})
/*    */ @StabilityInferred(parameters = 0)
/*    */ public final class Leaf<T> extends TreeBuilder.Element<T> {
/*    */   private final T data;
/*    */   
/* 13 */   public Leaf(Object data, @Nullable Object id) { super(null); this.data = (T)data; this.id = id; } @Nullable private final Object id; public static final int $stable = 8; public final T getData() { return this.data; } @Nullable public Object getId() { return this.id; }
/*    */ 
/*    */   
/*    */   public boolean equals(@Nullable Object other) {
/*    */     if (this == other)
/*    */       return true; 
/*    */     if (!(other instanceof Leaf))
/*    */       return false; 
/*    */     Leaf leaf = (Leaf)other;
/*    */     return !Intrinsics.areEqual(this.data, leaf.data) ? false : (!!Intrinsics.areEqual(this.id, leaf.id));
/*    */   }
/*    */   
/*    */   public int hashCode() {
/*    */     result = (this.data == null) ? 0 : this.data.hashCode();
/*    */     return result * 31 + ((this.id == null) ? 0 : this.id.hashCode());
/*    */   }
/*    */   
/*    */   @NotNull
/*    */   public String toString() {
/*    */     return "Leaf(data=" + this.data + ", id=" + this.id + ")";
/*    */   }
/*    */ }


/* Location:              C:\Users\yuzum\Downloads\ej-release-243.132.63.zip!\ej\lib\jewel-foundation-243-0.27.0.jar!\org\jetbrains\jewel\foundation\lazy\tree\TreeBuilder$Element$Leaf.class
 * Java compiler version: 17 (61.0)
 * JD-Core Version:       1.1.3
 */