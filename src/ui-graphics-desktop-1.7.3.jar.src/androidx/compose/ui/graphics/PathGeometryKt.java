/*     */ package androidx.compose.ui.graphics;
/*     */ 
/*     */ import java.util.ArrayList;
/*     */ import java.util.Arrays;
/*     */ import java.util.List;
/*     */ import kotlin.Metadata;
/*     */ import kotlin.NoWhenBranchMatchedException;
/*     */ import kotlin.collections.ArraysKt;
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
/*     */ @Metadata(mv = {1, 9, 0}, k = 2, xi = 48, d1 = {"\000 \n\000\n\002\020\b\n\000\n\002\030\002\n\000\n\002\030\002\n\002\030\002\n\000\n\002\020!\n\002\b\004\032\020\020\000\032\0020\0012\006\020\002\032\0020\003H\002\032\n\020\004\032\0020\005*\0020\006\032 \020\007\032\b\022\004\022\0020\0060\b*\0020\0062\016\b\002\020\t\032\b\022\004\022\0020\0060\b\032\024\020\n\032\0020\006*\0020\0062\b\b\002\020\013\032\0020\006¨\006\f"}, d2 = {"floatCountForType", "", "type", "Landroidx/compose/ui/graphics/PathSegment$Type;", "computeDirection", "Landroidx/compose/ui/graphics/Path$Direction;", "Landroidx/compose/ui/graphics/Path;", "divide", "", "contours", "reverse", "destination", "ui-graphics"})
/*     */ @SourceDebugExtension({"SMAP\nPathGeometry.kt\nKotlin\n*S Kotlin\n*F\n+ 1 PathGeometry.kt\nandroidx/compose/ui/graphics/PathGeometryKt\n+ 2 Bezier.kt\nandroidx/compose/ui/graphics/BezierKt\n*L\n1#1,362:1\n563#2:363\n*S KotlinDebug\n*F\n+ 1 PathGeometry.kt\nandroidx/compose/ui/graphics/PathGeometryKt\n*L\n148#1:363\n*E\n"})
/*     */ public final class PathGeometryKt
/*     */ {
/*     */   @NotNull
/*     */   public static final Path.Direction computeDirection(@NotNull Path $this$computeDirection) {
/*  41 */     Intrinsics.checkNotNullParameter($this$computeDirection, "<this>"); boolean first = true;
/*     */     
/*  43 */     PathIterator iterator = $this$computeDirection.iterator();
/*  44 */     float[] points = new float[8];
/*     */     
/*  46 */     float area = 0.0F;
/*     */     
/*  48 */     float startX = 0.0F;
/*  49 */     float startY = 0.0F;
/*     */     
/*  51 */     float endX = 0.0F;
/*  52 */     float endY = 0.0F;
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */     
/*  63 */     PathSegment.Type type = PathIterator.next$default(iterator, points, 0, 2, null);
/*  64 */     while (type != PathSegment.Type.Done) {
/*     */       float x0, $this$closeTo$iv, y0; int $i$f$closeTo; float x1, y1, x2, y2, c1x, c1y, c2x, c2y;
/*  66 */       switch (WhenMappings.$EnumSwitchMapping$0[type.ordinal()]) {
/*     */         case 1:
/*  68 */           if (!first) {
/*     */             break;
/*     */           }
/*     */           
/*  72 */           first = false;
/*     */           
/*  74 */           startX = points[0];
/*  75 */           startY = points[1];
/*     */           break;
/*     */         case 2:
/*  78 */           x0 = points[0];
/*  79 */           y0 = points[1];
/*     */           
/*  81 */           x1 = points[2];
/*  82 */           y1 = points[3];
/*     */ 
/*     */ 
/*     */ 
/*     */           
/*  87 */           area += BezierKt.cubicArea(
/*  88 */               x0, 
/*  89 */               y0, 
/*  90 */               x0, 
/*  91 */               y0, 
/*  92 */               x1, 
/*  93 */               y1, 
/*  94 */               x1, 
/*  95 */               y1);
/*     */ 
/*     */           
/*  98 */           endX = x1;
/*  99 */           endY = y1;
/*     */           break;
/*     */         case 3:
/* 102 */           x0 = points[0];
/* 103 */           y0 = points[1];
/*     */           
/* 105 */           x1 = points[2];
/* 106 */           y1 = points[3];
/*     */           
/* 108 */           x2 = points[4];
/* 109 */           y2 = points[5];
/*     */           
/* 111 */           c1x = x0 + 0.6666667F * (x1 - x0);
/* 112 */           c1y = y0 + 0.6666667F * (y1 - y0);
/*     */           
/* 114 */           c2x = x2 + 0.6666667F * (x1 - x2);
/* 115 */           c2y = y2 + 0.6666667F * (y1 - y2);
/*     */           
/* 117 */           area += BezierKt.cubicArea(
/* 118 */               x0, 
/* 119 */               y0, 
/* 120 */               c1x, 
/* 121 */               c1y, 
/* 122 */               c2x, 
/* 123 */               c2y, 
/* 124 */               x2, 
/* 125 */               y2);
/*     */ 
/*     */           
/* 128 */           endX = x2;
/* 129 */           endY = y2; break;
/*     */         case 4:
/*     */           continue;
/*     */         case 5:
/* 133 */           area += BezierKt.cubicArea(
/* 134 */               points[0], 
/* 135 */               points[1], 
/* 136 */               points[2], 
/* 137 */               points[3], 
/* 138 */               points[4], 
/* 139 */               points[5], 
/* 140 */               points[6], 
/* 141 */               points[7]);
/*     */ 
/*     */           
/* 144 */           endX = points[6];
/* 145 */           endY = points[7];
/*     */           break;
/*     */         case 6:
/* 148 */           $this$closeTo$iv = endX; $i$f$closeTo = 0;
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */         
/*     */         case 7:
/*     */           break;
/*     */       } 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */       
/* 166 */       type = PathIterator.next$default(iterator, points, 0, 2, null);
/*     */     } 
/*     */     
/* 169 */     return (area >= 0.0F) ? 
/* 170 */       Path.Direction.Clockwise : 
/*     */       
/* 172 */       Path.Direction.CounterClockwise;
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
/*     */   @NotNull
/*     */   public static final List<Path> divide(@NotNull Path $this$divide, @NotNull List<Path> contours) {
/* 201 */     Intrinsics.checkNotNullParameter($this$divide, "<this>"); Intrinsics.checkNotNullParameter(contours, "contours"); Path path = SkiaBackedPath_skikoKt.Path();
/*     */     
/* 203 */     boolean first = true;
/* 204 */     boolean isEmpty = true;
/*     */     
/* 206 */     PathIterator iterator = $this$divide.iterator();
/* 207 */     float[] points = new float[8];
/*     */     
/* 209 */     PathSegment.Type type = PathIterator.next$default(iterator, points, 0, 2, null);
/* 210 */     while (type != PathSegment.Type.Done) {
/*     */       
/* 212 */       switch (WhenMappings.$EnumSwitchMapping$0[type.ordinal()]) {
/*     */         case 1:
/* 214 */           if (!first && !isEmpty) {
/* 215 */             contours.add(path);
/* 216 */             path = SkiaBackedPath_skikoKt.Path();
/*     */           } 
/* 218 */           first = false;
/* 219 */           isEmpty = true;
/* 220 */           path.moveTo(points[0], points[1]);
/*     */           break;
/*     */         case 2:
/* 223 */           path.lineTo(points[2], points[3]);
/* 224 */           isEmpty = false;
/*     */           break;
/*     */         case 3:
/* 227 */           path.quadraticTo(
/* 228 */               points[2], 
/* 229 */               points[3], 
/* 230 */               points[4], 
/* 231 */               points[5]);
/*     */           
/* 233 */           isEmpty = false; break;
/*     */         case 4:
/*     */           continue;
/*     */         case 5:
/* 237 */           path.cubicTo(
/* 238 */               points[2], 
/* 239 */               points[3], 
/* 240 */               points[4], 
/* 241 */               points[5], 
/* 242 */               points[6], 
/* 243 */               points[7]);
/*     */           
/* 245 */           isEmpty = false; break;
/*     */         case 6:
/* 247 */           path.close(); break;
/*     */         case 7:
/*     */           continue;
/* 250 */       }  type = PathIterator.next$default(iterator, points, 0, 2, null);
/*     */     } 
/*     */     
/* 253 */     if (!first && !isEmpty) {
/* 254 */       contours.add(path);
/*     */     }
/*     */     
/* 257 */     return contours;
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
/*     */   @NotNull
/*     */   public static final Path reverse(@NotNull Path $this$reverse, @NotNull Path destination) {
/* 279 */     Intrinsics.checkNotNullParameter($this$reverse, "<this>"); Intrinsics.checkNotNullParameter(destination, "destination"); PathIterator iterator = $this$reverse.iterator();
/*     */     
/* 281 */     int count = iterator.calculateSize(false);
/* 282 */     ArrayList<PathSegment.Type> segments = new ArrayList(count);
/* 283 */     ArrayList<float[]> data = new ArrayList(count);
/*     */ 
/*     */ 
/*     */ 
/*     */     
/* 288 */     float[] points = new float[8];
/* 289 */     PathSegment.Type type = PathIterator.next$default(iterator, points, 0, 2, null);
/* 290 */     while (type != PathSegment.Type.Done) {
/* 291 */       segments.add(type);
/* 292 */       if (type != PathSegment.Type.Close) {
/* 293 */         Intrinsics.checkNotNullExpressionValue(Arrays.copyOf(points, floatCountForType(type)), "copyOf(...)"); data.add(Arrays.copyOf(points, floatCountForType(type)));
/*     */       } 
/* 295 */       type = PathIterator.next$default(iterator, points, 0, 2, null);
/*     */     } 
/*     */     
/* 298 */     boolean insertMove = true;
/* 299 */     boolean insertClose = false;
/* 300 */     int dataIndex = data.size();
/*     */     
/* 302 */     for (int i = segments.size() - 1; -1 < i; i--) {
/* 303 */       if (insertMove) {
/* 304 */         dataIndex--;
/* 305 */         Intrinsics.checkNotNullExpressionValue(data.get(dataIndex), "get(...)"); points = data.get(dataIndex);
/* 306 */         int offset = ArraysKt.getLastIndex(points);
/* 307 */         destination.moveTo(points[offset - 1], points[offset]);
/* 308 */         insertMove = false;
/*     */       } else {
/* 310 */         Intrinsics.checkNotNullExpressionValue(data.get(dataIndex), "get(...)"); points = data.get(dataIndex);
/*     */       } 
/*     */       
/* 313 */       switch (WhenMappings.$EnumSwitchMapping$0[((PathSegment.Type)segments.get(i)).ordinal()]) {
/*     */         case 1:
/* 315 */           if (insertClose) {
/* 316 */             destination.close();
/* 317 */             insertClose = false;
/*     */           } 
/* 319 */           insertMove = true;
/*     */           break;
/*     */         case 2:
/* 322 */           destination.lineTo(points[0], points[1]);
/* 323 */           dataIndex--;
/*     */           break;
/*     */         case 3:
/* 326 */           destination.quadraticTo(
/* 327 */               points[2], points[3], 
/* 328 */               points[0], points[1]);
/*     */           
/* 330 */           dataIndex--;
/*     */           break;
/*     */         
/*     */         case 5:
/* 334 */           destination.cubicTo(
/* 335 */               points[4], points[5], 
/* 336 */               points[2], points[3], 
/* 337 */               points[0], points[1]);
/*     */           
/* 339 */           dataIndex--; break;
/*     */         case 6:
/* 341 */           insertClose = true;
/*     */           break;
/*     */       } 
/*     */     
/*     */     } 
/* 346 */     if (insertClose) {
/* 347 */       destination.close();
/*     */     }
/*     */     
/* 350 */     return destination;
/*     */   }
/*     */   private static final int floatCountForType(PathSegment.Type type) {
/* 353 */     switch (WhenMappings.$EnumSwitchMapping$0[type.ordinal()]) { case 1: 
/*     */       case 2: 
/*     */       case 3: 
/*     */       case 4: 
/*     */       case 5: 
/*     */       case 6: 
/*     */       case 7:
/* 360 */        }  throw new NoWhenBranchMatchedException();
/*     */   }
/*     */ }


/* Location:              C:\Users\yuzum\Downloads\ej-release-243.132.63.zip!\ej\li\\ui-graphics-desktop-1.7.3.jar!\androidx\compos\\ui\graphics\PathGeometryKt.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */