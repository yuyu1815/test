/*    */ package androidx.compose.ui.text.style;
/*    */ 
/*    */ import androidx.compose.runtime.Stable;
/*    */ import androidx.compose.ui.util.MathHelpersKt;
/*    */ import kotlin.Metadata;
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
/*    */ @Metadata(mv = {1, 9, 0}, k = 2, xi = 48, d1 = {"\000\022\n\000\n\002\030\002\n\002\b\003\n\002\020\007\n\002\b\003\032*\020\000\032\0020\0012\006\020\002\032\0020\0012\006\020\003\032\0020\0012\006\020\004\032\0020\005H\007ø\001\000¢\006\004\b\006\020\007\002\007\n\005\b¡\0360\001¨\006\b"}, d2 = {"lerp", "Landroidx/compose/ui/text/style/BaselineShift;", "start", "stop", "fraction", "", "lerp-jWV1Mfo", "(FFF)F", "ui-text"})
/*    */ public final class BaselineShiftKt
/*    */ {
/*    */   @Stable
/*    */   public static final float lerp-jWV1Mfo(float start, float stop, float fraction) {
/* 60 */     return BaselineShift.constructor-impl(
/* 61 */         MathHelpersKt.lerp(
/* 62 */           start, 
/* 63 */           stop, 
/* 64 */           fraction));
/*    */   }
/*    */ }


/* Location:              C:\Users\yuzum\Downloads\ej-release-243.132.63.zip!\ej\li\\ui-text-desktop-1.7.3.jar!\androidx\compos\\ui\text\style\BaselineShiftKt.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */