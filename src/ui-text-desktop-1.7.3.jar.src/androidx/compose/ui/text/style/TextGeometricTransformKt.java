/*    */ package androidx.compose.ui.text.style;
/*    */ 
/*    */ import androidx.compose.ui.util.MathHelpersKt;
/*    */ import kotlin.Metadata;
/*    */ import kotlin.jvm.internal.Intrinsics;
/*    */ import org.jetbrains.annotations.NotNull;
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
/*    */ @Metadata(mv = {1, 9, 0}, k = 2, xi = 48, d1 = {"\000\020\n\000\n\002\030\002\n\002\b\003\n\002\020\007\n\000\032\036\020\000\032\0020\0012\006\020\002\032\0020\0012\006\020\003\032\0020\0012\006\020\004\032\0020\005¨\006\006"}, d2 = {"lerp", "Landroidx/compose/ui/text/style/TextGeometricTransform;", "start", "stop", "fraction", "", "ui-text"})
/*    */ public final class TextGeometricTransformKt
/*    */ {
/*    */   @NotNull
/*    */   public static final TextGeometricTransform lerp(@NotNull TextGeometricTransform start, @NotNull TextGeometricTransform stop, float fraction) {
/* 73 */     Intrinsics.checkNotNullParameter(start, "start"); Intrinsics.checkNotNullParameter(stop, "stop"); return new TextGeometricTransform(
/* 74 */         MathHelpersKt.lerp(start.getScaleX(), stop.getScaleX(), fraction), 
/* 75 */         MathHelpersKt.lerp(start.getSkewX(), stop.getSkewX(), fraction));
/*    */   }
/*    */ }


/* Location:              C:\Users\yuzum\Downloads\ej-release-243.132.63.zip!\ej\li\\ui-text-desktop-1.7.3.jar!\androidx\compos\\ui\text\style\TextGeometricTransformKt.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */