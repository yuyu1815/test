/*    */ package org.jetbrains.jewel.ui.icon;
/*    */ 
/*    */ import org.jetbrains.annotations.NotNull;
/*    */ 
/*    */ @GenerateDataFunctions
/*    */ @Metadata(mv = {2, 0, 0}, k = 1, xi = 48, d1 = {"\000\036\n\002\030\002\n\002\030\002\n\000\n\002\020\016\n\000\n\002\030\002\n\002\b\005\n\002\020\013\n\000\b\007\030\0002\0020\001B\033\022\006\020\002\032\0020\003\022\n\020\004\032\006\022\002\b\0030\005¢\006\004\b\006\020\007J\020\020\002\032\0020\0032\006\020\n\032\0020\013H\026R\016\020\002\032\0020\003X\004¢\006\002\n\000R\030\020\004\032\006\022\002\b\0030\005X\004¢\006\b\n\000\032\004\b\b\020\t¨\006\f"}, d2 = {"Lorg/jetbrains/jewel/ui/icon/PathIconKey;", "Lorg/jetbrains/jewel/ui/icon/IconKey;", "path", "", "iconClass", "Ljava/lang/Class;", "<init>", "(Ljava/lang/String;Ljava/lang/Class;)V", "getIconClass", "()Ljava/lang/Class;", "isNewUi", "", "ui"})
/*    */ @StabilityInferred(parameters = 0)
/*    */ public final class PathIconKey implements IconKey {
/*    */   @NotNull
/*    */   private final String path;
/*    */   
/* 12 */   public PathIconKey(@NotNull String path, @NotNull Class<?> iconClass) { this.path = path; this.iconClass = iconClass; } @NotNull private final Class<?> iconClass; public static final int $stable = 8; @NotNull public Class<?> getIconClass() { return this.iconClass; } @NotNull
/* 13 */   public String path(boolean isNewUi) { return this.path; }
/*    */ 
/*    */   
/*    */   public boolean equals(@Nullable Object other) {
/*    */     if (this == other)
/*    */       return true; 
/*    */     if (!(other instanceof PathIconKey))
/*    */       return false; 
/*    */     PathIconKey pathIconKey = (PathIconKey)other;
/*    */     return !Intrinsics.areEqual(this.path, pathIconKey.path) ? false : (!!Intrinsics.areEqual(this.iconClass, pathIconKey.iconClass));
/*    */   }
/*    */   
/*    */   public int hashCode() {
/*    */     result = this.path.hashCode();
/*    */     return result * 31 + this.iconClass.hashCode();
/*    */   }
/*    */   
/*    */   @NotNull
/*    */   public String toString() {
/*    */     return "PathIconKey(path=" + this.path + ", iconClass=" + this.iconClass + ")";
/*    */   }
/*    */ }


/* Location:              C:\Users\yuzum\Downloads\ej-release-243.132.63.zip!\ej\lib\jewel-ui-243-0.27.0.jar!\org\jetbrains\jewe\\ui\icon\PathIconKey.class
 * Java compiler version: 17 (61.0)
 * JD-Core Version:       1.1.3
 */