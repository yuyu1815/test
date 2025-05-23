/*     */ package androidx.compose.ui.graphics.vector;
/*     */ 
/*     */ import androidx.compose.ui.graphics.Path;
/*     */ import androidx.compose.ui.graphics.SkiaBackedPath_skikoKt;
/*     */ import java.util.List;
/*     */ import kotlin.Metadata;
/*     */ import kotlin.jvm.internal.Intrinsics;
/*     */ import kotlin.jvm.internal.SourceDebugExtension;
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
/*     */ @Metadata(mv = {1, 9, 0}, k = 2, xi = 48, d1 = {"\0002\n\000\n\002\020\024\n\002\b\003\n\002\020\002\n\000\n\002\030\002\n\000\n\002\020\006\n\002\b\016\n\002\020\013\n\002\b\002\n\002\020 \n\002\030\002\n\002\b\003\032X\020\004\032\0020\0052\006\020\006\032\0020\0072\006\020\b\032\0020\t2\006\020\n\032\0020\t2\006\020\013\032\0020\t2\006\020\f\032\0020\t2\006\020\r\032\0020\t2\006\020\016\032\0020\t2\006\020\017\032\0020\t2\006\020\020\032\0020\t2\006\020\021\032\0020\tH\002\032X\020\022\032\0020\0052\006\020\006\032\0020\0072\006\020\023\032\0020\t2\006\020\024\032\0020\t2\006\020\025\032\0020\t2\006\020\026\032\0020\t2\006\020\013\032\0020\t2\006\020\f\032\0020\t2\006\020\017\032\0020\t2\006\020\027\032\0020\0302\006\020\031\032\0020\030H\002\032\032\020\032\032\0020\007*\b\022\004\022\0020\0340\0332\b\b\002\020\035\032\0020\007\032\r\020\036\032\0020\t*\0020\tH\b\"\024\020\000\032\0020\001X\004¢\006\b\n\000\032\004\b\002\020\003¨\006\037"}, d2 = {"EmptyArray", "", "getEmptyArray", "()[F", "arcToBezier", "", "p", "Landroidx/compose/ui/graphics/Path;", "cx", "", "cy", "a", "b", "e1x", "e1y", "theta", "start", "sweep", "drawArc", "x0", "y0", "x1", "y1", "isMoreThanHalf", "", "isPositiveArc", "toPath", "", "Landroidx/compose/ui/graphics/vector/PathNode;", "target", "toRadians", "ui-graphics"})
/*     */ @SourceDebugExtension({"SMAP\nPathParser.kt\nKotlin\n*S Kotlin\n*F\n+ 1 PathParser.kt\nandroidx/compose/ui/graphics/vector/PathParserKt\n+ 2 ListUtils.kt\nandroidx/compose/ui/util/ListUtilsKt\n*L\n1#1,589:1\n588#1:596\n33#2,6:590\n*S KotlinDebug\n*F\n+ 1 PathParser.kt\nandroidx/compose/ui/graphics/vector/PathParserKt\n*L\n441#1:596\n211#1:590,6\n*E\n"})
/*     */ public final class PathParserKt
/*     */ {
/*     */   @NotNull
/*  49 */   private static final float[] EmptyArray = new float[0]; @NotNull public static final float[] getEmptyArray() { return EmptyArray; }
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
/*     */   public static final Path toPath(@NotNull List<PathNode> $this$toPath, @NotNull Path target) {
/* 197 */     Intrinsics.checkNotNullParameter($this$toPath, "<this>"); Intrinsics.checkNotNullParameter(target, "target"); int fillType = target.getFillType-Rg-k1Os();
/* 198 */     target.rewind();
/* 199 */     target.setFillType-oQ8Xj4U(fillType);
/*     */     
/* 201 */     float currentX = 0.0F;
/* 202 */     float currentY = 0.0F;
/* 203 */     float ctrlX = 0.0F;
/* 204 */     float ctrlY = 0.0F;
/* 205 */     float segmentX = 0.0F;
/* 206 */     float segmentY = 0.0F;
/* 207 */     float reflectiveCtrlX = 0.0F;
/* 208 */     float reflectiveCtrlY = 0.0F;
/*     */     
/* 210 */     Object previousNode = null; previousNode = $this$toPath.isEmpty() ? PathNode.Close.INSTANCE : $this$toPath.get(0);
/* 211 */     List<PathNode> $this$fastForEach$iv = $this$toPath; int $i$f$fastForEach = 0;
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
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */     
/* 591 */     int index$iv = 0, i = $this$fastForEach$iv.size(); if (index$iv < i) {
/* 592 */       Object item$iv = $this$fastForEach$iv.get(index$iv);
/* 593 */       PathNode node = (PathNode)item$iv; int $i$a$-fastForEach-PathParserKt$toPath$1 = 0; PathNode pathNode1 = node;
/*     */     }  return target; } private static final void drawArc(Path p, double x0, double y0, double x1, double y1, double a, double b, double theta, boolean isMoreThanHalf, boolean isPositiveArc) { double $this$toRadians$iv = theta;
/*     */     int $i$f$toRadians = 0;
/* 596 */     double thetaD = $this$toRadians$iv / '´' * Math.PI;
/*     */     double cosTheta = Math.cos(thetaD);
/*     */     double sinTheta = Math.sin(thetaD);
/*     */     double x0p = (x0 * cosTheta + y0 * sinTheta) / a;
/*     */     double y0p = (-x0 * sinTheta + y0 * cosTheta) / b;
/*     */     double x1p = (x1 * cosTheta + y1 * sinTheta) / a;
/*     */     double y1p = (-x1 * sinTheta + y1 * cosTheta) / b;
/*     */     double dx = x0p - x1p;
/*     */     double dy = y0p - y1p;
/*     */     double xm = (x0p + x1p) / 2;
/*     */     double ym = (y0p + y1p) / 2;
/*     */     double dsq = dx * dx + dy * dy;
/*     */     if ((dsq == 0.0D))
/*     */       return; 
/*     */     double disc = 1.0D / dsq - 0.25D;
/*     */     if (disc < 0.0D) {
/*     */       float adjust = (float)(Math.sqrt(dsq) / 1.99999D);
/*     */       drawArc(p, x0, y0, x1, y1, a * adjust, b * adjust, theta, isMoreThanHalf, isPositiveArc);
/*     */       return;
/*     */     } 
/*     */     double s = Math.sqrt(disc);
/*     */     double sdx = s * dx;
/*     */     double sdy = s * dy;
/*     */     double cx = 0.0D;
/*     */     double cy = 0.0D;
/*     */     if (isMoreThanHalf == isPositiveArc) {
/*     */       cx = xm - sdy;
/*     */       cy = ym + sdx;
/*     */     } else {
/*     */       cx = xm + sdy;
/*     */       cy = ym - sdx;
/*     */     } 
/*     */     double eta0 = Math.atan2(y0p - cy, x0p - cx);
/*     */     double eta1 = Math.atan2(y1p - cy, x1p - cx);
/*     */     double sweep = eta1 - eta0;
/*     */     if (isPositiveArc != ((sweep >= 0.0D)))
/*     */       if (sweep > 0.0D) {
/*     */         sweep -= 6.283185307179586D;
/*     */       } else {
/*     */         sweep += 6.283185307179586D;
/*     */       }  
/*     */     cx *= a;
/*     */     cy *= b;
/*     */     double tcx = cx;
/*     */     cx = cx * cosTheta - cy * sinTheta;
/*     */     cy = tcx * sinTheta + cy * cosTheta;
/*     */     arcToBezier(p, cx, cy, a, b, x0, y0, thetaD, eta0, sweep); }
/*     */ 
/*     */   
/*     */   private static final void arcToBezier(Path p, double cx, double cy, double a, double b, double e1x, double e1y, double theta, double start, double sweep) {
/*     */     double eta1x = e1x;
/*     */     double eta1y = e1y;
/*     */     int numSegments = (int)Math.ceil(Math.abs(sweep * 4 / Math.PI));
/*     */     double eta1 = start;
/*     */     double cosTheta = Math.cos(theta);
/*     */     double sinTheta = Math.sin(theta);
/*     */     double cosEta1 = Math.cos(eta1);
/*     */     double sinEta1 = Math.sin(eta1);
/*     */     double ep1x = -a * cosTheta * sinEta1 - b * sinTheta * cosEta1;
/*     */     double ep1y = -a * sinTheta * sinEta1 + b * cosTheta * cosEta1;
/*     */     double anglePerSegment = sweep / numSegments;
/*     */     for (int i = 0; i < numSegments; i++) {
/*     */       double eta2 = eta1 + anglePerSegment;
/*     */       double sinEta2 = Math.sin(eta2);
/*     */       double cosEta2 = Math.cos(eta2);
/*     */       double e2x = cx + a * cosTheta * cosEta2 - b * sinTheta * sinEta2;
/*     */       double e2y = cy + a * sinTheta * cosEta2 + b * cosTheta * sinEta2;
/*     */       double ep2x = -a * cosTheta * sinEta2 - b * sinTheta * cosEta2;
/*     */       double ep2y = -a * sinTheta * sinEta2 + b * cosTheta * cosEta2;
/*     */       double tanDiff2 = Math.tan((eta2 - eta1) / 2);
/*     */       double alpha = Math.sin(eta2 - eta1) * (Math.sqrt(4 + 3.0D * tanDiff2 * tanDiff2) - true) / 3;
/*     */       double q1x = eta1x + alpha * ep1x;
/*     */       double q1y = eta1y + alpha * ep1y;
/*     */       double q2x = e2x - alpha * ep2x;
/*     */       double q2y = e2y - alpha * ep2y;
/*     */       p.cubicTo((float)q1x, (float)q1y, (float)q2x, (float)q2y, (float)e2x, (float)e2y);
/*     */       eta1 = eta2;
/*     */       eta1x = e2x;
/*     */       eta1y = e2y;
/*     */       ep1x = ep2x;
/*     */       ep1y = ep2y;
/*     */     } 
/*     */   }
/*     */   
/*     */   private static final double toRadians(double $this$toRadians) {
/*     */     int $i$f$toRadians = 0;
/*     */     return $this$toRadians / '´' * Math.PI;
/*     */   }
/*     */ }


/* Location:              C:\Users\yuzum\Downloads\ej-release-243.132.63.zip!\ej\li\\ui-graphics-desktop-1.7.3.jar!\androidx\compos\\ui\graphics\vector\PathParserKt.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */