/*    */ package org.jetbrains.jewel.ui.component.styling;
/*    */ 
/*    */ @GenerateDataFunctions
/*    */ @Metadata(mv = {2, 0, 0}, k = 1, xi = 48, d1 = {"\000\022\n\002\030\002\n\002\020\000\n\000\n\002\030\002\n\002\b\f\b\007\030\000 \0162\0020\001:\001\016B'\022\006\020\002\032\0020\003\022\006\020\004\032\0020\003\022\006\020\005\032\0020\003\022\006\020\006\032\0020\003¢\006\004\b\007\020\bR\021\020\002\032\0020\003¢\006\b\n\000\032\004\b\t\020\nR\021\020\004\032\0020\003¢\006\b\n\000\032\004\b\013\020\nR\021\020\005\032\0020\003¢\006\b\n\000\032\004\b\f\020\nR\021\020\006\032\0020\003¢\006\b\n\000\032\004\b\r\020\n¨\006\017"}, d2 = {"Lorg/jetbrains/jewel/ui/component/styling/DefaultBannerStyles;", "", "information", "Lorg/jetbrains/jewel/ui/component/styling/DefaultBannerStyle;", "success", "warning", "error", "<init>", "(Lorg/jetbrains/jewel/ui/component/styling/DefaultBannerStyle;Lorg/jetbrains/jewel/ui/component/styling/DefaultBannerStyle;Lorg/jetbrains/jewel/ui/component/styling/DefaultBannerStyle;Lorg/jetbrains/jewel/ui/component/styling/DefaultBannerStyle;)V", "getInformation", "()Lorg/jetbrains/jewel/ui/component/styling/DefaultBannerStyle;", "getSuccess", "getWarning", "getError", "Companion", "ui"})
/*    */ @Stable
/*    */ public final class DefaultBannerStyles {
/*    */   @NotNull
/*    */   public static final Companion Companion = new Companion(null);
/*    */   @NotNull
/*    */   private final DefaultBannerStyle information;
/*    */   @NotNull
/*    */   private final DefaultBannerStyle success;
/*    */   
/* 14 */   public DefaultBannerStyles(@NotNull DefaultBannerStyle information, @NotNull DefaultBannerStyle success, @NotNull DefaultBannerStyle warning, @NotNull DefaultBannerStyle error) { this.information = information;
/* 15 */     this.success = success;
/* 16 */     this.warning = warning;
/* 17 */     this.error = error; } @NotNull private final DefaultBannerStyle warning; @NotNull private final DefaultBannerStyle error; public static final int $stable; @NotNull public final DefaultBannerStyle getInformation() { return this.information; } @NotNull public final DefaultBannerStyle getError() { return this.error; }
/*    */ 
/*    */   
/*    */   @NotNull
/*    */   public final DefaultBannerStyle getSuccess() {
/*    */     return this.success;
/*    */   }
/*    */   
/*    */   @NotNull
/*    */   public final DefaultBannerStyle getWarning() {
/*    */     return this.warning;
/*    */   }
/*    */   
/*    */   public boolean equals(@Nullable Object other) {
/*    */     if (this == other)
/*    */       return true; 
/*    */     if (!(other instanceof DefaultBannerStyles))
/*    */       return false; 
/*    */     DefaultBannerStyles defaultBannerStyles = (DefaultBannerStyles)other;
/*    */     return !Intrinsics.areEqual(this.information, defaultBannerStyles.information) ? false : (!Intrinsics.areEqual(this.success, defaultBannerStyles.success) ? false : (!Intrinsics.areEqual(this.warning, defaultBannerStyles.warning) ? false : (!!Intrinsics.areEqual(this.error, defaultBannerStyles.error))));
/*    */   }
/*    */   
/*    */   public int hashCode() {
/*    */     result = this.information.hashCode();
/*    */     result = result * 31 + this.success.hashCode();
/*    */     result = result * 31 + this.warning.hashCode();
/*    */     return result * 31 + this.error.hashCode();
/*    */   }
/*    */   
/*    */   @NotNull
/*    */   public String toString() {
/*    */     return "DefaultBannerStyles(information=" + this.information + ", success=" + this.success + ", warning=" + this.warning + ", error=" + this.error + ")";
/*    */   }
/*    */   
/*    */   @Metadata(mv = {2, 0, 0}, k = 1, xi = 48, d1 = {"\000\f\n\002\030\002\n\002\020\000\n\002\b\003\b\003\030\0002\0020\001B\t\b\002¢\006\004\b\002\020\003¨\006\004"}, d2 = {"Lorg/jetbrains/jewel/ui/component/styling/DefaultBannerStyles$Companion;", "", "<init>", "()V", "ui"})
/*    */   public static final class Companion {
/*    */     private Companion() {}
/*    */   }
/*    */ }


/* Location:              C:\Users\yuzum\Downloads\ej-release-243.132.63.zip!\ej\lib\jewel-ui-243-0.27.0.jar!\org\jetbrains\jewe\\ui\component\styling\DefaultBannerStyles.class
 * Java compiler version: 17 (61.0)
 * JD-Core Version:       1.1.3
 */