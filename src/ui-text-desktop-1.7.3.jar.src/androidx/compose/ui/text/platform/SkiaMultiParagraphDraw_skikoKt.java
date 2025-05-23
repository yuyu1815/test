/*    */ package androidx.compose.ui.text.platform;
/*    */ 
/*    */ import androidx.compose.ui.graphics.BlendMode;
/*    */ import androidx.compose.ui.graphics.Brush;
/*    */ import androidx.compose.ui.graphics.Canvas;
/*    */ import androidx.compose.ui.graphics.Shadow;
/*    */ import androidx.compose.ui.graphics.drawscope.DrawStyle;
/*    */ import androidx.compose.ui.text.MultiParagraph;
/*    */ import androidx.compose.ui.text.ParagraphInfo;
/*    */ import androidx.compose.ui.text.style.TextDecoration;
/*    */ import java.util.List;
/*    */ import kotlin.Metadata;
/*    */ import kotlin.jvm.internal.Intrinsics;
/*    */ import kotlin.jvm.internal.SourceDebugExtension;
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
/*    */ @Metadata(mv = {1, 9, 0}, k = 2, xi = 48, d1 = {"\0008\n\000\n\002\020\002\n\002\030\002\n\000\n\002\030\002\n\000\n\002\030\002\n\000\n\002\020\007\n\000\n\002\030\002\n\000\n\002\030\002\n\000\n\002\030\002\n\000\n\002\030\002\n\002\b\003\032^\020\000\032\0020\001*\0020\0022\006\020\003\032\0020\0042\006\020\005\032\0020\0062\b\b\002\020\007\032\0020\b2\n\b\002\020\t\032\004\030\0010\n2\n\b\002\020\013\032\004\030\0010\f2\n\b\002\020\r\032\004\030\0010\0162\b\b\002\020\017\032\0020\020H\000ø\001\000¢\006\004\b\021\020\022\002\007\n\005\b¡\0360\001¨\006\023"}, d2 = {"drawMultiParagraph", "", "Landroidx/compose/ui/text/MultiParagraph;", "canvas", "Landroidx/compose/ui/graphics/Canvas;", "brush", "Landroidx/compose/ui/graphics/Brush;", "alpha", "", "shadow", "Landroidx/compose/ui/graphics/Shadow;", "decoration", "Landroidx/compose/ui/text/style/TextDecoration;", "drawStyle", "Landroidx/compose/ui/graphics/drawscope/DrawStyle;", "blendMode", "Landroidx/compose/ui/graphics/BlendMode;", "drawMultiParagraph-7AXcY_I", "(Landroidx/compose/ui/text/MultiParagraph;Landroidx/compose/ui/graphics/Canvas;Landroidx/compose/ui/graphics/Brush;FLandroidx/compose/ui/graphics/Shadow;Landroidx/compose/ui/text/style/TextDecoration;Landroidx/compose/ui/graphics/drawscope/DrawStyle;I)V", "ui-text"})
/*    */ @SourceDebugExtension({"SMAP\nSkiaMultiParagraphDraw.skiko.kt\nKotlin\n*S Kotlin\n*F\n+ 1 SkiaMultiParagraphDraw.skiko.kt\nandroidx/compose/ui/text/platform/SkiaMultiParagraphDraw_skikoKt\n+ 2 ListUtils.kt\nandroidx/compose/ui/util/ListUtilsKt\n*L\n1#1,45:1\n33#2,6:46\n*S KotlinDebug\n*F\n+ 1 SkiaMultiParagraphDraw.skiko.kt\nandroidx/compose/ui/text/platform/SkiaMultiParagraphDraw_skikoKt\n*L\n40#1:46,6\n*E\n"})
/*    */ public final class SkiaMultiParagraphDraw_skikoKt
/*    */ {
/*    */   public static final void drawMultiParagraph-7AXcY_I(@NotNull MultiParagraph $this$drawMultiParagraph_u2d7AXcY_I, @NotNull Canvas canvas, @NotNull Brush brush, float alpha, @Nullable Shadow shadow, @Nullable TextDecoration decoration, @Nullable DrawStyle drawStyle, int blendMode) {
/* 39 */     Intrinsics.checkNotNullParameter($this$drawMultiParagraph_u2d7AXcY_I, "$this$drawMultiParagraph"); Intrinsics.checkNotNullParameter(canvas, "canvas"); Intrinsics.checkNotNullParameter(brush, "brush"); canvas.save();
/* 40 */     List $this$fastForEach$iv = $this$drawMultiParagraph_u2d7AXcY_I.getParagraphInfoList$ui_text(); int $i$f$fastForEach = 0;
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */     
/* 47 */     int index$iv = 0, i = $this$fastForEach$iv.size(); if (index$iv < i) {
/* 48 */       Object item$iv = $this$fastForEach$iv.get(index$iv);
/* 49 */       ParagraphInfo it = (ParagraphInfo)item$iv; int $i$a$-fastForEach-SkiaMultiParagraphDraw_skikoKt$drawMultiParagraph$1 = 0;
/*    */       it.getParagraph().paint-hn5TExg(canvas, brush, alpha, shadow, decoration, drawStyle, blendMode);
/*    */       canvas.translate(0.0F, it.getParagraph().getHeight());
/*    */     } 
/*    */     canvas.restore();
/*    */   }
/*    */ }


/* Location:              C:\Users\yuzum\Downloads\ej-release-243.132.63.zip!\ej\li\\ui-text-desktop-1.7.3.jar!\androidx\compos\\ui\text\platform\SkiaMultiParagraphDraw_skikoKt.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */