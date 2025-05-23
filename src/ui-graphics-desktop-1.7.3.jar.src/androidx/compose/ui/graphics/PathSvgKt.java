/*     */ package androidx.compose.ui.graphics;
/*     */ 
/*     */ import androidx.compose.ui.geometry.Rect;
/*     */ import androidx.compose.ui.graphics.vector.PathParser;
/*     */ import kotlin.Metadata;
/*     */ import kotlin.jvm.internal.Intrinsics;
/*     */ import org.jetbrains.annotations.NotNull;
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ @Metadata(mv = {1, 9, 0}, k = 2, xi = 48, d1 = {"\000\"\n\000\n\002\020\016\n\000\n\002\030\002\n\002\b\002\n\002\020\002\n\002\030\002\n\002\b\003\n\002\020\013\n\000\032\030\020\000\032\0020\0012\006\020\002\032\0020\0032\006\020\004\032\0020\003H\002\032\022\020\005\032\0020\006*\0020\0072\006\020\b\032\0020\001\032\024\020\t\032\0020\001*\0020\0072\b\b\002\020\n\032\0020\013¨\006\f"}, d2 = {"command", "", "type", "Landroidx/compose/ui/graphics/PathSegment$Type;", "lastType", "addSvg", "", "Landroidx/compose/ui/graphics/Path;", "pathData", "toSvg", "asDocument", "", "ui-graphics"})
/*     */ public final class PathSvgKt
/*     */ {
/*     */   public static final void addSvg(@NotNull Path $this$addSvg, @NotNull String pathData) {
/*  46 */     Intrinsics.checkNotNullParameter($this$addSvg, "<this>"); Intrinsics.checkNotNullParameter(pathData, "pathData"); (new PathParser()).parsePathString(pathData).toPath($this$addSvg);
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   @NotNull
/*     */   public static final String toSvg(@NotNull Path $this$toSvg, boolean asDocument) {
/*  62 */     Intrinsics.checkNotNullParameter($this$toSvg, "<this>"); StringBuilder stringBuilder1 = new StringBuilder(), $this$toSvg_u24lambda_u240 = stringBuilder1; int $i$a$-buildString-PathSvgKt$toSvg$1 = 0;
/*  63 */     Rect bounds = $this$toSvg.getBounds();
/*     */     
/*  65 */     if (asDocument) {
/*  66 */       $this$toSvg_u24lambda_u240.append("<svg xmlns=\"http://www.w3.org/2000/svg\" ");
/*  67 */       Intrinsics.checkNotNullExpressionValue($this$toSvg_u24lambda_u240.append("viewBox=\"" + bounds.getLeft() + ' ' + bounds.getTop() + ' ' + bounds.getWidth() + ' ' + bounds.getHeight() + "\">"), "append(...)"); Intrinsics.checkNotNullExpressionValue($this$toSvg_u24lambda_u240.append("viewBox=\"" + bounds.getLeft() + ' ' + bounds.getTop() + ' ' + bounds.getWidth() + ' ' + bounds.getHeight() + "\">").append('\n'), "append(...)"); $this$toSvg_u24lambda_u240.append("viewBox=\"" + bounds.getLeft() + ' ' + bounds.getTop() + ' ' + bounds.getWidth() + ' ' + bounds.getHeight() + "\">").append('\n');
/*     */     } 
/*     */     
/*  70 */     PathIterator iterator = $this$toSvg.iterator();
/*  71 */     float[] points = new float[8];
/*  72 */     PathSegment.Type lastType = PathSegment.Type.Done;
/*     */     
/*  74 */     if (iterator.hasNext()) {
/*  75 */       if (asDocument) {
/*  76 */         if (PathFillType.equals-impl0($this$toSvg.getFillType-Rg-k1Os(), PathFillType.Companion.getEvenOdd-Rg-k1Os())) {
/*  77 */           $this$toSvg_u24lambda_u240.append("  <path fill-rule=\"evenodd\" d=\"");
/*     */         } else {
/*  79 */           $this$toSvg_u24lambda_u240.append("  <path d=\"");
/*     */         } 
/*     */       }
/*     */       
/*  83 */       while (iterator.hasNext()) {
/*  84 */         PathSegment.Type type = PathIterator.next$default(iterator, points, 0, 2, null);
/*  85 */         switch (WhenMappings.$EnumSwitchMapping$0[type.ordinal()]) {
/*     */           case 1:
/*  87 */             $this$toSvg_u24lambda_u240.append(command(PathSegment.Type.Move, lastType) + points[0] + ' ' + points[1]);
/*     */             break;
/*     */           case 2:
/*  90 */             $this$toSvg_u24lambda_u240.append(command(PathSegment.Type.Line, lastType) + points[2] + ' ' + points[3]);
/*     */             break;
/*     */           case 3:
/*  93 */             $this$toSvg_u24lambda_u240.append(command(PathSegment.Type.Quadratic, lastType));
/*  94 */             $this$toSvg_u24lambda_u240.append(points[2] + ' ' + points[3] + ' ' + points[4] + ' ' + points[5]); break;
/*     */           case 4:
/*     */             continue;
/*     */           case 5:
/*  98 */             $this$toSvg_u24lambda_u240.append(command(PathSegment.Type.Cubic, lastType));
/*  99 */             $this$toSvg_u24lambda_u240.append(points[2] + ' ' + points[3] + ' ');
/* 100 */             $this$toSvg_u24lambda_u240.append(points[4] + ' ' + points[5] + ' ');
/* 101 */             $this$toSvg_u24lambda_u240.append(points[6] + ' ' + points[7]);
/*     */             break;
/*     */           case 6:
/* 104 */             $this$toSvg_u24lambda_u240.append(command(PathSegment.Type.Close, lastType)); break;
/*     */           case 7:
/*     */             continue;
/*     */         } 
/* 108 */         lastType = type;
/*     */       } 
/*     */       
/* 111 */       if (asDocument) {
/* 112 */         Intrinsics.checkNotNullExpressionValue($this$toSvg_u24lambda_u240.append("\"/>"), "append(...)"); Intrinsics.checkNotNullExpressionValue($this$toSvg_u24lambda_u240.append("\"/>").append('\n'), "append(...)"); $this$toSvg_u24lambda_u240.append("\"/>").append('\n');
/*     */       } 
/*     */     } 
/* 115 */     if (asDocument) {
/* 116 */       Intrinsics.checkNotNullExpressionValue($this$toSvg_u24lambda_u240.append("</svg>"), "append(...)"); Intrinsics.checkNotNullExpressionValue($this$toSvg_u24lambda_u240.append("</svg>").append('\n'), "append(...)"); $this$toSvg_u24lambda_u240.append("</svg>").append('\n');
/*     */     } 
/*     */     Intrinsics.checkNotNullExpressionValue(stringBuilder1.toString(), "toString(...)");
/*     */     return stringBuilder1.toString();
/*     */   }
/*     */   private static final String command(PathSegment.Type type, PathSegment.Type lastType) {
/* 122 */     switch (WhenMappings.$EnumSwitchMapping$0[type.ordinal()]) { case 1: 
/*     */       case 2: 
/*     */       case 3: 
/*     */       case 5:
/*     */       
/*     */       case 6:
/* 128 */        }  return (type != lastType) ? "" : 
/*     */       
/* 130 */       " ";
/*     */   }
/*     */ }


/* Location:              C:\Users\yuzum\Downloads\ej-release-243.132.63.zip!\ej\li\\ui-graphics-desktop-1.7.3.jar!\androidx\compos\\ui\graphics\PathSvgKt.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */