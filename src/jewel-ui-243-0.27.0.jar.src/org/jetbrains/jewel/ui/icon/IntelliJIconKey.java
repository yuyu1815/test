/*    */ package org.jetbrains.jewel.ui.icon;
/*    */ 
/*    */ 
/*    */ @GenerateDataFunctions
/*    */ @Metadata(mv = {2, 0, 0}, k = 1, xi = 48, d1 = {"\000\"\n\002\030\002\n\002\030\002\n\000\n\002\020\016\n\002\b\002\n\002\030\002\n\002\b\t\n\002\020\013\n\002\b\002\b\007\030\000 \0212\0020\001:\001\021B#\022\006\020\002\032\0020\003\022\006\020\004\032\0020\003\022\n\020\005\032\006\022\002\b\0030\006¢\006\004\b\007\020\bJ\020\020\016\032\0020\0032\006\020\017\032\0020\020H\026R\021\020\002\032\0020\003¢\006\b\n\000\032\004\b\t\020\nR\021\020\004\032\0020\003¢\006\b\n\000\032\004\b\013\020\nR\030\020\005\032\006\022\002\b\0030\006X\004¢\006\b\n\000\032\004\b\f\020\r¨\006\022"}, d2 = {"Lorg/jetbrains/jewel/ui/icon/IntelliJIconKey;", "Lorg/jetbrains/jewel/ui/icon/IconKey;", "oldUiPath", "", "newUiPath", "iconClass", "Ljava/lang/Class;", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Class;)V", "getOldUiPath", "()Ljava/lang/String;", "getNewUiPath", "getIconClass", "()Ljava/lang/Class;", "path", "isNewUi", "", "Companion", "ui"})
/*    */ @StabilityInferred(parameters = 0)
/*    */ public final class IntelliJIconKey implements IconKey {
/*    */   @NotNull
/*    */   public static final Companion Companion = new Companion(null);
/*    */   @NotNull
/*    */   private final String oldUiPath;
/*    */   @NotNull
/*    */   private final String newUiPath;
/*    */   @NotNull
/*    */   private final Class<?> iconClass;
/*    */   public static final int $stable = 8;
/*    */   
/* 18 */   public IntelliJIconKey(@NotNull String oldUiPath, @NotNull String newUiPath, @NotNull Class<?> iconClass) { this.oldUiPath = oldUiPath;
/* 19 */     this.newUiPath = newUiPath;
/* 20 */     this.iconClass = iconClass; } @NotNull public final String getOldUiPath() { return this.oldUiPath; } @NotNull public Class<?> getIconClass() { return this.iconClass; }
/*    */   @NotNull public final String getNewUiPath() { return this.newUiPath; } @NotNull
/* 22 */   public String path(boolean isNewUi) { return isNewUi ? this.newUiPath : this.oldUiPath; }
/*    */ 
/*    */   
/*    */   public boolean equals(@Nullable Object other) {
/*    */     if (this == other)
/*    */       return true; 
/*    */     if (!(other instanceof IntelliJIconKey))
/*    */       return false; 
/*    */     IntelliJIconKey intelliJIconKey = (IntelliJIconKey)other;
/*    */     return !Intrinsics.areEqual(this.oldUiPath, intelliJIconKey.oldUiPath) ? false : (!Intrinsics.areEqual(this.newUiPath, intelliJIconKey.newUiPath) ? false : (!!Intrinsics.areEqual(this.iconClass, intelliJIconKey.iconClass)));
/*    */   }
/*    */   
/*    */   public int hashCode() {
/*    */     result = this.oldUiPath.hashCode();
/*    */     result = result * 31 + this.newUiPath.hashCode();
/*    */     return result * 31 + this.iconClass.hashCode();
/*    */   }
/*    */   
/*    */   @NotNull
/*    */   public String toString() {
/*    */     return "IntelliJIconKey(oldUiPath=" + this.oldUiPath + ", newUiPath=" + this.newUiPath + ", iconClass=" + this.iconClass + ")";
/*    */   }
/*    */   
/*    */   @Metadata(mv = {2, 0, 0}, k = 1, xi = 48, d1 = {"\000\f\n\002\030\002\n\002\020\000\n\002\b\003\b\003\030\0002\0020\001B\t\b\002¢\006\004\b\002\020\003¨\006\004"}, d2 = {"Lorg/jetbrains/jewel/ui/icon/IntelliJIconKey$Companion;", "", "<init>", "()V", "ui"})
/*    */   public static final class Companion {
/*    */     private Companion() {}
/*    */   }
/*    */ }


/* Location:              C:\Users\yuzum\Downloads\ej-release-243.132.63.zip!\ej\lib\jewel-ui-243-0.27.0.jar!\org\jetbrains\jewe\\ui\icon\IntelliJIconKey.class
 * Java compiler version: 17 (61.0)
 * JD-Core Version:       1.1.3
 */