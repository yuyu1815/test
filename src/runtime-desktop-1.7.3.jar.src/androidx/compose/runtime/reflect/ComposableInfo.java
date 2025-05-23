/*    */ package androidx.compose.runtime.reflect;
/*    */ 
/*    */ import androidx.compose.runtime.internal.StabilityInferred;
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
/*    */ @Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\000\036\n\002\030\002\n\002\020\000\n\000\n\002\020\013\n\000\n\002\020\b\n\002\b\021\n\002\020\016\n\000\b\b\030\0002\0020\001B%\022\006\020\002\032\0020\003\022\006\020\004\032\0020\005\022\006\020\006\032\0020\005\022\006\020\007\032\0020\005¢\006\002\020\bJ\t\020\016\032\0020\003HÆ\003J\t\020\017\032\0020\005HÆ\003J\t\020\020\032\0020\005HÆ\003J\t\020\021\032\0020\005HÆ\003J1\020\022\032\0020\0002\b\b\002\020\002\032\0020\0032\b\b\002\020\004\032\0020\0052\b\b\002\020\006\032\0020\0052\b\b\002\020\007\032\0020\005HÆ\001J\023\020\023\032\0020\0032\b\020\024\032\004\030\0010\001HÖ\003J\t\020\025\032\0020\005HÖ\001J\t\020\026\032\0020\027HÖ\001R\021\020\006\032\0020\005¢\006\b\n\000\032\004\b\t\020\nR\021\020\007\032\0020\005¢\006\b\n\000\032\004\b\013\020\nR\021\020\002\032\0020\003¢\006\b\n\000\032\004\b\002\020\fR\021\020\004\032\0020\005¢\006\b\n\000\032\004\b\r\020\n¨\006\030"}, d2 = {"Landroidx/compose/runtime/reflect/ComposableInfo;", "", "isComposable", "", "realParamsCount", "", "changedParams", "defaultParams", "(ZIII)V", "getChangedParams", "()I", "getDefaultParams", "()Z", "getRealParamsCount", "component1", "component2", "component3", "component4", "copy", "equals", "other", "hashCode", "toString", "", "runtime"})
/*    */ @StabilityInferred(parameters = 1)
/*    */ public final class ComposableInfo
/*    */ {
/*    */   private final boolean isComposable;
/*    */   private final int realParamsCount;
/*    */   private final int changedParams;
/*    */   private final int defaultParams;
/*    */   public static final int $stable;
/*    */   
/*    */   public ComposableInfo(boolean isComposable, int realParamsCount, int changedParams, int defaultParams) {
/* 48 */     this.isComposable = isComposable;
/* 49 */     this.realParamsCount = realParamsCount;
/* 50 */     this.changedParams = changedParams;
/* 51 */     this.defaultParams = defaultParams; } public final int getDefaultParams() { return this.defaultParams; }
/*    */ 
/*    */   
/*    */   public final boolean isComposable() {
/*    */     return this.isComposable;
/*    */   }
/*    */   
/*    */   public final int getRealParamsCount() {
/*    */     return this.realParamsCount;
/*    */   }
/*    */   
/*    */   public final int getChangedParams() {
/*    */     return this.changedParams;
/*    */   }
/*    */   
/*    */   public final boolean component1() {
/*    */     return this.isComposable;
/*    */   }
/*    */   
/*    */   public final int component2() {
/*    */     return this.realParamsCount;
/*    */   }
/*    */   
/*    */   public final int component3() {
/*    */     return this.changedParams;
/*    */   }
/*    */   
/*    */   public final int component4() {
/*    */     return this.defaultParams;
/*    */   }
/*    */   
/*    */   @NotNull
/*    */   public final ComposableInfo copy(boolean isComposable, int realParamsCount, int changedParams, int defaultParams) {
/*    */     return new ComposableInfo(isComposable, realParamsCount, changedParams, defaultParams);
/*    */   }
/*    */   
/*    */   @NotNull
/*    */   public String toString() {
/*    */     return "ComposableInfo(isComposable=" + this.isComposable + ", realParamsCount=" + this.realParamsCount + ", changedParams=" + this.changedParams + ", defaultParams=" + this.defaultParams + ')';
/*    */   }
/*    */   
/*    */   public int hashCode() {
/*    */     result = Boolean.hashCode(this.isComposable);
/*    */     result = result * 31 + Integer.hashCode(this.realParamsCount);
/*    */     result = result * 31 + Integer.hashCode(this.changedParams);
/*    */     return result * 31 + Integer.hashCode(this.defaultParams);
/*    */   }
/*    */   
/*    */   public boolean equals(@Nullable Object other) {
/*    */     if (this == other)
/*    */       return true; 
/*    */     if (!(other instanceof ComposableInfo))
/*    */       return false; 
/*    */     ComposableInfo composableInfo = (ComposableInfo)other;
/*    */     return (this.isComposable != composableInfo.isComposable) ? false : ((this.realParamsCount != composableInfo.realParamsCount) ? false : ((this.changedParams != composableInfo.changedParams) ? false : (!(this.defaultParams != composableInfo.defaultParams))));
/*    */   }
/*    */ }


/* Location:              C:\Users\yuzum\Downloads\ej-release-243.132.63.zip!\ej\lib\runtime-desktop-1.7.3.jar!\androidx\compose\runtime\reflect\ComposableInfo.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */