/*     */ package org.jetbrains.jewel.foundation.lazy.tree;
/*     */ 
/*     */ import androidx.compose.runtime.internal.StabilityInferred;
/*     */ import kotlin.Metadata;
/*     */ import kotlin.jvm.internal.Intrinsics;
/*     */ import org.jetbrains.annotations.NotNull;
/*     */ import org.jetbrains.annotations.Nullable;
/*     */ import org.jetbrains.jewel.foundation.GenerateDataFunctions;
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ @GenerateDataFunctions
/*     */ @Metadata(mv = {2, 0, 0}, k = 1, xi = 48, d1 = {"\000\026\n\002\030\002\n\000\n\002\020\000\n\002\b\002\n\002\020\b\n\002\b\n\b\007\030\000*\004\b\001\020\0012\0020\002B\037\022\006\020\003\032\0028\001\022\006\020\004\032\0020\005\022\006\020\006\032\0020\005¢\006\004\b\007\020\bR\023\020\003\032\0028\001¢\006\n\n\002\020\013\032\004\b\t\020\nR\021\020\004\032\0020\005¢\006\b\n\000\032\004\b\f\020\rR\021\020\006\032\0020\005¢\006\b\n\000\032\004\b\016\020\r¨\006\017"}, d2 = {"Lorg/jetbrains/jewel/foundation/lazy/tree/ChildrenGeneratorScope$ParentInfo;", "T", "", "data", "depth", "", "index", "<init>", "(Ljava/lang/Object;II)V", "getData", "()Ljava/lang/Object;", "Ljava/lang/Object;", "getDepth", "()I", "getIndex", "foundation"})
/*     */ @StabilityInferred(parameters = 1)
/*     */ public final class ParentInfo<T>
/*     */ {
/*     */   private final T data;
/*     */   private final int depth;
/*     */   private final int index;
/*     */   public static final int $stable;
/*     */   
/*     */   public ParentInfo(Object data, int depth, int index) {
/* 135 */     this.data = (T)data; this.depth = depth; this.index = index; } public final T getData() { return this.data; } public final int getDepth() { return this.depth; } public final int getIndex() { return this.index; }
/*     */ 
/*     */   
/*     */   public boolean equals(@Nullable Object other) {
/*     */     if (this == other)
/*     */       return true; 
/*     */     if (!(other instanceof ParentInfo))
/*     */       return false; 
/*     */     ParentInfo parentInfo = (ParentInfo)other;
/*     */     return !Intrinsics.areEqual(this.data, parentInfo.data) ? false : ((this.depth != parentInfo.depth) ? false : (!(this.index != parentInfo.index)));
/*     */   }
/*     */   
/*     */   public int hashCode() {
/*     */     result = (this.data == null) ? 0 : this.data.hashCode();
/*     */     result = result * 31 + this.depth;
/*     */     return result * 31 + this.index;
/*     */   }
/*     */   
/*     */   @NotNull
/*     */   public String toString() {
/*     */     return "ParentInfo(data=" + this.data + ", depth=" + this.depth + ", index=" + this.index + ")";
/*     */   }
/*     */ }


/* Location:              C:\Users\yuzum\Downloads\ej-release-243.132.63.zip!\ej\lib\jewel-foundation-243-0.27.0.jar!\org\jetbrains\jewel\foundation\lazy\tree\ChildrenGeneratorScope$ParentInfo.class
 * Java compiler version: 17 (61.0)
 * JD-Core Version:       1.1.3
 */