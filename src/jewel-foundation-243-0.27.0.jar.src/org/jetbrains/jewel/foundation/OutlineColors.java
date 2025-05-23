/*    */ package org.jetbrains.jewel.foundation;
/*    */ 
/*    */ import androidx.compose.runtime.Immutable;
/*    */ import androidx.compose.ui.graphics.Color;
/*    */ import kotlin.Metadata;
/*    */ import kotlin.jvm.internal.DefaultConstructorMarker;
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
/*    */ @GenerateDataFunctions
/*    */ @Metadata(mv = {2, 0, 0}, k = 1, xi = 48, d1 = {"\000\022\n\002\030\002\n\002\020\000\n\000\n\002\030\002\n\002\b\017\b\007\030\000 \0212\0020\001:\001\021B/\022\006\020\002\032\0020\003\022\006\020\004\032\0020\003\022\006\020\005\032\0020\003\022\006\020\006\032\0020\003\022\006\020\007\032\0020\003¢\006\004\b\b\020\tR\023\020\002\032\0020\003¢\006\n\n\002\020\f\032\004\b\n\020\013R\023\020\004\032\0020\003¢\006\n\n\002\020\f\032\004\b\r\020\013R\023\020\005\032\0020\003¢\006\n\n\002\020\f\032\004\b\016\020\013R\023\020\006\032\0020\003¢\006\n\n\002\020\f\032\004\b\017\020\013R\023\020\007\032\0020\003¢\006\n\n\002\020\f\032\004\b\020\020\013¨\006\022"}, d2 = {"Lorg/jetbrains/jewel/foundation/OutlineColors;", "", "focused", "Landroidx/compose/ui/graphics/Color;", "focusedWarning", "focusedError", "warning", "error", "<init>", "(JJJJJLkotlin/jvm/internal/DefaultConstructorMarker;)V", "getFocused-0d7_KjU", "()J", "J", "getFocusedWarning-0d7_KjU", "getFocusedError-0d7_KjU", "getWarning-0d7_KjU", "getError-0d7_KjU", "Companion", "foundation"})
/*    */ @Immutable
/*    */ public final class OutlineColors
/*    */ {
/*    */   @NotNull
/*    */   public static final Companion Companion = new Companion(null);
/*    */   private final long focused;
/*    */   private final long focusedWarning;
/*    */   private final long focusedError;
/*    */   private final long warning;
/*    */   private final long error;
/*    */   public static final int $stable;
/*    */   
/*    */   private OutlineColors(long focused, long focusedWarning, long focusedError, long warning, long error) {
/* 40 */     this.focused = focused;
/* 41 */     this.focusedWarning = focusedWarning;
/* 42 */     this.focusedError = focusedError;
/* 43 */     this.warning = warning;
/* 44 */     this.error = error; } public final long getError-0d7_KjU() { return this.error; }
/*    */ 
/*    */   
/*    */   public final long getFocused-0d7_KjU() {
/*    */     return this.focused;
/*    */   }
/*    */   
/*    */   public final long getFocusedWarning-0d7_KjU() {
/*    */     return this.focusedWarning;
/*    */   }
/*    */   
/*    */   public final long getFocusedError-0d7_KjU() {
/*    */     return this.focusedError;
/*    */   }
/*    */   
/*    */   public final long getWarning-0d7_KjU() {
/*    */     return this.warning;
/*    */   }
/*    */   
/*    */   public boolean equals(@Nullable Object other) {
/*    */     if (this == other)
/*    */       return true; 
/*    */     if (!(other instanceof OutlineColors))
/*    */       return false; 
/*    */     OutlineColors outlineColors = (OutlineColors)other;
/*    */     return !Color.equals-impl0(this.focused, outlineColors.focused) ? false : (!Color.equals-impl0(this.focusedWarning, outlineColors.focusedWarning) ? false : (!Color.equals-impl0(this.focusedError, outlineColors.focusedError) ? false : (!Color.equals-impl0(this.warning, outlineColors.warning) ? false : (!!Color.equals-impl0(this.error, outlineColors.error)))));
/*    */   }
/*    */   
/*    */   public int hashCode() {
/*    */     result = Color.hashCode-impl(this.focused);
/*    */     result = result * 31 + Color.hashCode-impl(this.focusedWarning);
/*    */     result = result * 31 + Color.hashCode-impl(this.focusedError);
/*    */     result = result * 31 + Color.hashCode-impl(this.warning);
/*    */     return result * 31 + Color.hashCode-impl(this.error);
/*    */   }
/*    */   
/*    */   @NotNull
/*    */   public String toString() {
/*    */     return "OutlineColors(focused=" + Color.toString-impl(this.focused) + ", focusedWarning=" + Color.toString-impl(this.focusedWarning) + ", focusedError=" + Color.toString-impl(this.focusedError) + ", warning=" + Color.toString-impl(this.warning) + ", error=" + Color.toString-impl(this.error) + ")";
/*    */   }
/*    */   
/*    */   @Metadata(mv = {2, 0, 0}, k = 1, xi = 48, d1 = {"\000\f\n\002\030\002\n\002\020\000\n\002\b\003\b\003\030\0002\0020\001B\t\b\002¢\006\004\b\002\020\003¨\006\004"}, d2 = {"Lorg/jetbrains/jewel/foundation/OutlineColors$Companion;", "", "<init>", "()V", "foundation"})
/*    */   public static final class Companion {
/*    */     private Companion() {}
/*    */   }
/*    */ }


/* Location:              C:\Users\yuzum\Downloads\ej-release-243.132.63.zip!\ej\lib\jewel-foundation-243-0.27.0.jar!\org\jetbrains\jewel\foundation\OutlineColors.class
 * Java compiler version: 17 (61.0)
 * JD-Core Version:       1.1.3
 */