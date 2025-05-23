/*     */ package androidx.compose.ui.graphics.vector;
/*     */ 
/*     */ import java.util.ArrayList;
/*     */ import java.util.List;
/*     */ import kotlin.Metadata;
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
/*     */ @Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\0002\n\002\030\002\n\002\020\000\n\002\b\002\n\002\030\002\n\002\030\002\n\002\030\002\n\000\n\002\020 \n\002\b\004\n\002\020\007\n\002\b\003\n\002\020\013\n\002\b&\030\0002\0020\001B\005¢\006\002\020\002J>\020\013\032\0020\0002\006\020\f\032\0020\r2\006\020\016\032\0020\r2\006\020\017\032\0020\r2\006\020\020\032\0020\0212\006\020\022\032\0020\0212\006\020\023\032\0020\r2\006\020\024\032\0020\rJ>\020\025\032\0020\0002\006\020\026\032\0020\r2\006\020\027\032\0020\r2\006\020\017\032\0020\r2\006\020\020\032\0020\0212\006\020\022\032\0020\0212\006\020\030\032\0020\r2\006\020\031\032\0020\rJ\006\020\032\032\0020\000J6\020\033\032\0020\0002\006\020\023\032\0020\r2\006\020\024\032\0020\r2\006\020\034\032\0020\r2\006\020\035\032\0020\r2\006\020\036\032\0020\r2\006\020\037\032\0020\rJ6\020 \032\0020\0002\006\020\030\032\0020\r2\006\020\031\032\0020\r2\006\020!\032\0020\r2\006\020\"\032\0020\r2\006\020#\032\0020\r2\006\020$\032\0020\rJ\016\020%\032\0020\0002\006\020&\032\0020\rJ\016\020'\032\0020\0002\006\020(\032\0020\rJ\026\020)\032\0020\0002\006\020&\032\0020\r2\006\020*\032\0020\rJ\026\020+\032\0020\0002\006\020(\032\0020\r2\006\020,\032\0020\rJ\026\020-\032\0020\0002\006\020&\032\0020\r2\006\020*\032\0020\rJ\026\020.\032\0020\0002\006\020(\032\0020\r2\006\020,\032\0020\rJ&\020/\032\0020\0002\006\020\023\032\0020\r2\006\020\024\032\0020\r2\006\020\034\032\0020\r2\006\020\035\032\0020\rJ&\0200\032\0020\0002\006\020\030\032\0020\r2\006\020\031\032\0020\r2\006\020!\032\0020\r2\006\020\"\032\0020\rJ&\0201\032\0020\0002\006\020\023\032\0020\r2\006\020\024\032\0020\r2\006\020\034\032\0020\r2\006\020\035\032\0020\rJ&\0202\032\0020\0002\006\020\030\032\0020\r2\006\020\031\032\0020\r2\006\020!\032\0020\r2\006\020\"\032\0020\rJ\026\0203\032\0020\0002\006\020\023\032\0020\r2\006\020\024\032\0020\rJ\026\0204\032\0020\0002\006\020\030\032\0020\r2\006\020\031\032\0020\rJ\016\0205\032\0020\0002\006\020*\032\0020\rJ\016\0206\032\0020\0002\006\020,\032\0020\rR\036\020\003\032\022\022\004\022\0020\0050\004j\b\022\004\022\0020\005`\006X\004¢\006\002\n\000R\027\020\007\032\b\022\004\022\0020\0050\b8F¢\006\006\032\004\b\t\020\n¨\0067"}, d2 = {"Landroidx/compose/ui/graphics/vector/PathBuilder;", "", "()V", "_nodes", "Ljava/util/ArrayList;", "Landroidx/compose/ui/graphics/vector/PathNode;", "Lkotlin/collections/ArrayList;", "nodes", "", "getNodes", "()Ljava/util/List;", "arcTo", "horizontalEllipseRadius", "", "verticalEllipseRadius", "theta", "isMoreThanHalf", "", "isPositiveArc", "x1", "y1", "arcToRelative", "a", "b", "dx1", "dy1", "close", "curveTo", "x2", "y2", "x3", "y3", "curveToRelative", "dx2", "dy2", "dx3", "dy3", "horizontalLineTo", "x", "horizontalLineToRelative", "dx", "lineTo", "y", "lineToRelative", "dy", "moveTo", "moveToRelative", "quadTo", "quadToRelative", "reflectiveCurveTo", "reflectiveCurveToRelative", "reflectiveQuadTo", "reflectiveQuadToRelative", "verticalLineTo", "verticalLineToRelative", "ui-graphics"})
/*     */ public final class PathBuilder
/*     */ {
/*     */   @NotNull
/*  25 */   private final ArrayList<PathNode> _nodes = new ArrayList<>(32);
/*     */ 
/*     */ 
/*     */   
/*     */   @NotNull
/*     */   public final List<PathNode> getNodes() {
/*  31 */     return this._nodes;
/*     */   }
/*     */ 
/*     */   
/*     */   @NotNull
/*     */   public final PathBuilder close() {
/*  37 */     this._nodes.add(PathNode.Close.INSTANCE);
/*  38 */     return this;
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   @NotNull
/*     */   public final PathBuilder moveTo(float x, float y) {
/*  49 */     this._nodes.add(new PathNode.MoveTo(x, y));
/*  50 */     return this;
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   @NotNull
/*     */   public final PathBuilder moveToRelative(float dx, float dy) {
/*  61 */     this._nodes.add(new PathNode.RelativeMoveTo(dx, dy));
/*  62 */     return this;
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   @NotNull
/*     */   public final PathBuilder lineTo(float x, float y) {
/*  74 */     this._nodes.add(new PathNode.LineTo(x, y));
/*  75 */     return this;
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
/*     */   @NotNull
/*     */   public final PathBuilder lineToRelative(float dx, float dy) {
/*  88 */     this._nodes.add(new PathNode.RelativeLineTo(dx, dy));
/*  89 */     return this;
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   @NotNull
/*     */   public final PathBuilder horizontalLineTo(float x) {
/* 101 */     this._nodes.add(new PathNode.HorizontalTo(x));
/* 102 */     return this;
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
/*     */   @NotNull
/*     */   public final PathBuilder horizontalLineToRelative(float dx) {
/* 115 */     this._nodes.add(new PathNode.RelativeHorizontalTo(dx));
/* 116 */     return this;
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   @NotNull
/*     */   public final PathBuilder verticalLineTo(float y) {
/* 128 */     this._nodes.add(new PathNode.VerticalTo(y));
/* 129 */     return this;
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
/*     */   @NotNull
/*     */   public final PathBuilder verticalLineToRelative(float dy) {
/* 142 */     this._nodes.add(new PathNode.RelativeVerticalTo(dy));
/* 143 */     return this;
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
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   @NotNull
/*     */   public final PathBuilder curveTo(float x1, float y1, float x2, float y2, float x3, float y3) {
/* 167 */     this._nodes.add(new PathNode.CurveTo(x1, y1, x2, y2, x3, y3));
/* 168 */     return this;
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
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
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
/*     */   public final PathBuilder curveToRelative(float dx1, float dy1, float dx2, float dy2, float dx3, float dy3) {
/* 198 */     this._nodes.add(new PathNode.RelativeCurveTo(dx1, dy1, dx2, dy2, dx3, dy3));
/* 199 */     return this;
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
/*     */ 
/*     */   
/*     */   @NotNull
/*     */   public final PathBuilder reflectiveCurveTo(float x1, float y1, float x2, float y2) {
/* 217 */     this._nodes.add(new PathNode.ReflectiveCurveTo(x1, y1, x2, y2));
/* 218 */     return this;
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
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   @NotNull
/*     */   public final PathBuilder reflectiveCurveToRelative(float dx1, float dy1, float dx2, float dy2) {
/* 238 */     this._nodes.add(new PathNode.RelativeReflectiveCurveTo(dx1, dy1, dx2, dy2));
/* 239 */     return this;
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
/*     */   @NotNull
/*     */   public final PathBuilder quadTo(float x1, float y1, float x2, float y2) {
/* 254 */     this._nodes.add(new PathNode.QuadTo(x1, y1, x2, y2));
/* 255 */     return this;
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
/*     */ 
/*     */ 
/*     */   
/*     */   @NotNull
/*     */   public final PathBuilder quadToRelative(float dx1, float dy1, float dx2, float dy2) {
/* 274 */     this._nodes.add(new PathNode.RelativeQuadTo(dx1, dy1, dx2, dy2));
/* 275 */     return this;
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
/*     */   @NotNull
/*     */   public final PathBuilder reflectiveQuadTo(float x1, float y1) {
/* 290 */     this._nodes.add(new PathNode.ReflectiveQuadTo(x1, y1));
/* 291 */     return this;
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
/*     */   public final PathBuilder reflectiveQuadToRelative(float dx1, float dy1) {
/* 307 */     this._nodes.add(new PathNode.RelativeReflectiveQuadTo(dx1, dy1));
/* 308 */     return this;
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
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
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
/*     */   public final PathBuilder arcTo(float horizontalEllipseRadius, float verticalEllipseRadius, float theta, boolean isMoreThanHalf, boolean isPositiveArc, float x1, float y1) {
/* 350 */     this._nodes.add(
/* 351 */         new PathNode.ArcTo(
/* 352 */           horizontalEllipseRadius, 
/* 353 */           verticalEllipseRadius, 
/* 354 */           theta, 
/* 355 */           isMoreThanHalf, 
/* 356 */           isPositiveArc, 
/* 357 */           x1, 
/* 358 */           y1));
/*     */ 
/*     */     
/* 361 */     return this;
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
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
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
/*     */   public final PathBuilder arcToRelative(float a, float b, float theta, boolean isMoreThanHalf, boolean isPositiveArc, float dx1, float dy1) {
/* 403 */     this._nodes.add(new PathNode.RelativeArcTo(a, b, theta, isMoreThanHalf, isPositiveArc, dx1, dy1));
/* 404 */     return this;
/*     */   }
/*     */ }


/* Location:              C:\Users\yuzum\Downloads\ej-release-243.132.63.zip!\ej\li\\ui-graphics-desktop-1.7.3.jar!\androidx\compos\\ui\graphics\vector\PathBuilder.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */