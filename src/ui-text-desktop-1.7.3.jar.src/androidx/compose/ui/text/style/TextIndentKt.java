/*    */ package androidx.compose.ui.text.style;
/*    */ 
/*    */ import androidx.compose.ui.text.SpanStyleKt;
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
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ @Metadata(mv = {1, 9, 0}, k = 2, xi = 48, d1 = {"\000\020\n\000\n\002\030\002\n\002\b\003\n\002\020\007\n\000\032\036\020\000\032\0020\0012\006\020\002\032\0020\0012\006\020\003\032\0020\0012\006\020\004\032\0020\005¨\006\006"}, d2 = {"lerp", "Landroidx/compose/ui/text/style/TextIndent;", "start", "stop", "fraction", "", "ui-text"})
/*    */ public final class TextIndentKt
/*    */ {
/*    */   @NotNull
/*    */   public static final TextIndent lerp(@NotNull TextIndent start, @NotNull TextIndent stop, float fraction) {
/* 82 */     Intrinsics.checkNotNullParameter(start, "start"); Intrinsics.checkNotNullParameter(stop, "stop"); return new TextIndent(
/* 83 */         SpanStyleKt.lerpTextUnitInheritable-C3pnCVY(start.getFirstLine-XSAIIZE(), stop.getFirstLine-XSAIIZE(), fraction), 
/* 84 */         SpanStyleKt.lerpTextUnitInheritable-C3pnCVY(start.getRestLine-XSAIIZE(), stop.getRestLine-XSAIIZE(), fraction), null);
/*    */   }
/*    */ }


/* Location:              C:\Users\yuzum\Downloads\ej-release-243.132.63.zip!\ej\li\\ui-text-desktop-1.7.3.jar!\androidx\compos\\ui\text\style\TextIndentKt.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */