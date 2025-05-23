/*    */ package org.jetbrains.jewel.ui.painter.hints;
/*    */ 
/*    */ import org.jetbrains.jewel.ui.painter.PainterProviderScope;
/*    */ 
/*    */ @GenerateDataFunctions
/*    */ @Metadata(mv = {2, 0, 0}, k = 1, xi = 48, d1 = {"\000\036\n\002\030\002\n\002\030\002\n\000\n\002\020$\n\002\020\016\n\002\b\003\n\002\030\002\n\002\b\002\b\003\030\0002\0020\001B\033\022\022\020\002\032\016\022\004\022\0020\004\022\004\022\0020\0040\003¢\006\004\b\005\020\006J\f\020\007\032\0020\004*\0020\bH\026J\b\020\t\032\0020\004H\026R\032\020\002\032\016\022\004\022\0020\004\022\004\022\0020\0040\003X\004¢\006\002\n\000¨\006\n"}, d2 = {"Lorg/jetbrains/jewel/ui/painter/hints/PathOverrideImpl;", "Lorg/jetbrains/jewel/ui/painter/PainterPathHint;", "overrides", "", "", "<init>", "(Ljava/util/Map;)V", "patch", "Lorg/jetbrains/jewel/ui/painter/PainterProviderScope;", "toString", "ui"})
/*    */ @Immutable
/*    */ final class PathOverrideImpl implements PainterPathHint {
/*  9 */   public boolean canApply(@NotNull PainterProviderScope $this$canApply) { return PainterPathHint.DefaultImpls.canApply(this, $this$canApply); } @NotNull
/*    */   private final Map<String, String> overrides; public PathOverrideImpl(@NotNull Map<String, String> overrides) {
/* 11 */     this.overrides = overrides; } @NotNull
/* 12 */   public String patch(@NotNull PainterProviderScope $this$patch) { Intrinsics.checkNotNullParameter($this$patch, "<this>"); if ((String)this.overrides.get($this$patch.getPath()) == null) (String)this.overrides.get($this$patch.getPath());  return $this$patch.getPath(); } @NotNull
/*    */   public String toString() {
/* 14 */     return "PathOverrideImpl(overrides=" + this.overrides + ")";
/*    */   }
/*    */   
/*    */   public boolean equals(@Nullable Object other) {
/*    */     if (this == other)
/*    */       return true; 
/*    */     if (!(other instanceof PathOverrideImpl))
/*    */       return false; 
/*    */     PathOverrideImpl pathOverrideImpl = (PathOverrideImpl)other;
/*    */     return !!Intrinsics.areEqual(this.overrides, pathOverrideImpl.overrides);
/*    */   }
/*    */   
/*    */   public int hashCode() {
/*    */     return this.overrides.hashCode();
/*    */   }
/*    */ }


/* Location:              C:\Users\yuzum\Downloads\ej-release-243.132.63.zip!\ej\lib\jewel-ui-243-0.27.0.jar!\org\jetbrains\jewe\\ui\painter\hints\PathOverrideImpl.class
 * Java compiler version: 17 (61.0)
 * JD-Core Version:       1.1.3
 */