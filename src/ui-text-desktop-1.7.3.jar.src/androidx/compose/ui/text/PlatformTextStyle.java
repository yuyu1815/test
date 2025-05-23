/*    */ package androidx.compose.ui.text;
/*    */ 
/*    */ import androidx.compose.runtime.internal.StabilityInferred;
/*    */ import kotlin.Metadata;
/*    */ import kotlin.jvm.internal.DefaultConstructorMarker;
/*    */ import kotlin.jvm.internal.Intrinsics;
/*    */ import org.jetbrains.annotations.Nullable;
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ @Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\000.\n\002\030\002\n\002\020\000\n\000\n\002\030\002\n\000\n\002\030\002\n\002\b\002\n\002\030\002\n\002\b\006\n\002\020\013\n\002\b\002\n\002\020\b\n\000\b\007\030\0002\0020\001B\033\b\026\022\b\020\002\032\004\030\0010\003\022\b\020\004\032\004\030\0010\005¢\006\002\020\006B\021\b\027\022\b\020\007\032\004\030\0010\b¢\006\002\020\tJ\023\020\016\032\0020\0172\b\020\020\032\004\030\0010\001H\002J\b\020\021\032\0020\022H\026R\023\020\004\032\004\030\0010\005¢\006\b\n\000\032\004\b\n\020\013R\023\020\002\032\004\030\0010\003¢\006\b\n\000\032\004\b\f\020\r¨\006\023"}, d2 = {"Landroidx/compose/ui/text/PlatformTextStyle;", "", "spanStyle", "Landroidx/compose/ui/text/PlatformSpanStyle;", "paragraphStyle", "Landroidx/compose/ui/text/PlatformParagraphStyle;", "(Landroidx/compose/ui/text/PlatformSpanStyle;Landroidx/compose/ui/text/PlatformParagraphStyle;)V", "textDecorationLineStyle", "Landroidx/compose/ui/text/TextDecorationLineStyle;", "(Landroidx/compose/ui/text/TextDecorationLineStyle;Lkotlin/jvm/internal/DefaultConstructorMarker;)V", "getParagraphStyle", "()Landroidx/compose/ui/text/PlatformParagraphStyle;", "getSpanStyle", "()Landroidx/compose/ui/text/PlatformSpanStyle;", "equals", "", "other", "hashCode", "", "ui-text"})
/*    */ @StabilityInferred(parameters = 1)
/*    */ public final class PlatformTextStyle
/*    */ {
/*    */   @Nullable
/*    */   private final PlatformSpanStyle spanStyle;
/*    */   @Nullable
/*    */   private final PlatformParagraphStyle paragraphStyle;
/*    */   public static final int $stable;
/*    */   
/*    */   @Nullable
/*    */   public final PlatformSpanStyle getSpanStyle() {
/* 27 */     return this.spanStyle; } @Nullable
/* 28 */   public final PlatformParagraphStyle getParagraphStyle() { return this.paragraphStyle; }
/*    */ 
/*    */ 
/*    */ 
/*    */   
/*    */   public PlatformTextStyle(@Nullable PlatformSpanStyle spanStyle, @Nullable PlatformParagraphStyle paragraphStyle) {
/* 34 */     this.spanStyle = spanStyle;
/* 35 */     this.paragraphStyle = paragraphStyle;
/*    */   }
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */   
/*    */   private PlatformTextStyle(TextDecorationLineStyle textDecorationLineStyle) {
/* 47 */     this(
/* 48 */         new PlatformSpanStyle(textDecorationLineStyle, null), 
/* 49 */         (PlatformParagraphStyle)null);
/*    */   }
/*    */   
/*    */   public boolean equals(@Nullable Object other) {
/* 53 */     if (this == other) return true; 
/* 54 */     if (!(other instanceof PlatformTextStyle)) return false; 
/* 55 */     if (!Intrinsics.areEqual(this.paragraphStyle, ((PlatformTextStyle)other).paragraphStyle)) return false; 
/* 56 */     if (!Intrinsics.areEqual(this.spanStyle, ((PlatformTextStyle)other).spanStyle)) return false; 
/* 57 */     return true;
/*    */   }
/*    */   
/*    */   public int hashCode() {
/* 61 */     int result = (this.spanStyle != null) ? this.spanStyle.hashCode() : 0;
/* 62 */     result = 31 * result + ((this.paragraphStyle != null) ? this.paragraphStyle.hashCode() : 0);
/* 63 */     return result;
/*    */   }
/*    */ }


/* Location:              C:\Users\yuzum\Downloads\ej-release-243.132.63.zip!\ej\li\\ui-text-desktop-1.7.3.jar!\androidx\compos\\ui\text\PlatformTextStyle.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */