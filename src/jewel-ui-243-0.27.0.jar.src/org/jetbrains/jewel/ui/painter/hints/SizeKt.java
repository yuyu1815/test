/*    */ package org.jetbrains.jewel.ui.painter.hints;
/*    */ 
/*    */ import kotlin.Metadata;
/*    */ import kotlin.jvm.internal.SourceDebugExtension;
/*    */ import org.jetbrains.annotations.NotNull;
/*    */ import org.jetbrains.jewel.ui.painter.PainterHint;
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
/*    */ @Metadata(mv = {2, 0, 0}, k = 2, xi = 48, d1 = {"\000\020\n\000\n\002\030\002\n\000\n\002\020\b\n\002\b\003\032\016\020\000\032\0020\0012\006\020\002\032\0020\003\032\026\020\000\032\0020\0012\006\020\004\032\0020\0032\006\020\005\032\0020\003¨\006\006"}, d2 = {"Size", "Lorg/jetbrains/jewel/ui/painter/PainterHint;", "size", "", "width", "height", "ui"})
/*    */ @SourceDebugExtension({"SMAP\nSize.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Size.kt\norg/jetbrains/jewel/ui/painter/hints/SizeKt\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,73:1\n1#2:74\n*E\n"})
/*    */ public final class SizeKt
/*    */ {
/*    */   @NotNull
/*    */   public static final PainterHint Size(int size) {
/* 49 */     if (!((size > 0) ? 1 : 0))
/*    */     
/*    */     { 
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
/* 74 */       int $i$a$-require-SizeKt$Size$1 = 0; String str = "Size must be positive"; throw new IllegalArgumentException(str.toString()); }  return (PainterHint)new SizeImpl(size, size); } @NotNull public static final PainterHint Size(int width, int height) { if (!((width > 0 && height > 0) ? 1 : 0)) { int $i$a$-require-SizeKt$Size$2 = 0;
/*    */       String str = "Width and height must be positive";
/*    */       throw new IllegalArgumentException(str.toString()); }
/*    */     
/*    */     return (PainterHint)new SizeImpl(width, height); }
/*    */ 
/*    */ }


/* Location:              C:\Users\yuzum\Downloads\ej-release-243.132.63.zip!\ej\lib\jewel-ui-243-0.27.0.jar!\org\jetbrains\jewe\\ui\painter\hints\SizeKt.class
 * Java compiler version: 17 (61.0)
 * JD-Core Version:       1.1.3
 */