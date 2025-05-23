/*      */ package androidx.compose.ui.graphics;
/*      */ 
/*      */ import androidx.annotation.RestrictTo;
/*      */ import androidx.collection.FloatFloatPair;
/*      */ import androidx.compose.ui.util.MathHelpersKt;
/*      */ import kotlin.Metadata;
/*      */ import kotlin.NoWhenBranchMatchedException;
/*      */ import kotlin.collections.ArraysKt;
/*      */ import kotlin.jvm.internal.Intrinsics;
/*      */ import kotlin.jvm.internal.SourceDebugExtension;
/*      */ import org.jetbrains.annotations.NotNull;
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ @Metadata(mv = {1, 9, 0}, k = 2, xi = 48, d1 = {"\000>\n\000\n\002\020\006\n\000\n\002\020\007\n\002\b\002\n\002\030\002\n\002\b\013\n\002\030\002\n\002\b\005\n\002\020\024\n\000\n\002\020\b\n\002\b&\n\002\020\013\n\002\b\021\n\002\020\002\n\002\b\t\032\021\020\017\032\0020\0032\006\020\020\032\0020\003H\b\032?\020\021\032\0020\0222\006\020\023\032\0020\0032\006\020\024\032\0020\0032\006\020\025\032\0020\0032\006\020\026\032\0020\0032\006\020\027\032\0020\0302\b\b\002\020\031\032\0020\032H\007¢\006\002\020\033\032'\020\034\032\0020\0222\006\020\035\032\0020\0062\006\020\027\032\0020\0302\b\b\002\020\031\032\0020\032H\007¢\006\002\020\036\032'\020\037\032\0020\0222\006\020\035\032\0020\0062\006\020\027\032\0020\0302\b\b\002\020\031\032\0020\032H\000¢\006\002\020\036\032H\020 \032\0020\0032\006\020!\032\0020\0032\006\020\"\032\0020\0032\006\020#\032\0020\0032\006\020$\032\0020\0032\006\020%\032\0020\0032\006\020&\032\0020\0032\006\020'\032\0020\0032\006\020(\032\0020\003H\000\032 \020)\032\0020\0322\006\020*\032\0020\0302\006\020+\032\0020\0302\006\020,\032\0020\030H\002\0320\020-\032\0020\0322\006\020.\032\0020\0302\006\020/\032\0020\0032\006\0200\032\0020\0032\006\0201\032\0020\0302\006\0202\032\0020\030H\000\032 \0203\032\0020\0032\006\0204\032\0020\0032\006\0205\032\0020\0032\006\0206\032\0020\003H\007\0320\0203\032\0020\0032\006\0207\032\0020\0032\006\0204\032\0020\0032\006\0205\032\0020\0032\006\0208\032\0020\0032\006\0206\032\0020\003H\002\032 \0209\032\0020\0032\006\020\023\032\0020\0032\006\020\024\032\0020\0032\006\0206\032\0020\003H\002\032(\020:\032\0020\0032\006\0207\032\0020\0032\006\0204\032\0020\0032\006\0205\032\0020\0032\006\0206\032\0020\003H\002\032\030\020;\032\0020\0032\006\020\035\032\0020\0062\006\0206\032\0020\003H\002\032\030\020<\032\0020\0032\006\020\035\032\0020\0062\006\0206\032\0020\003H\007\032\030\020=\032\0020\0322\006\020*\032\0020\0302\006\020>\032\0020\030H\002\032(\020?\032\0020\0322\006\020\035\032\0020\0062\006\020@\032\0020A2\006\020\027\032\0020\0302\006\020\031\032\0020\032H\002\032(\020B\032\0020\0032\006\0207\032\0020\0032\006\0204\032\0020\0032\006\0205\032\0020\0032\006\0208\032\0020\003H\007\032\031\020C\032\0020\0032\006\0207\032\0020\0032\006\0204\032\0020\003H\b\032 \020D\032\0020\0032\006\0207\032\0020\0032\006\0204\032\0020\0032\006\0205\032\0020\003H\002\032\030\020E\032\0020\0032\006\020\035\032\0020\0062\006\020F\032\0020\003H\007\032+\020G\032\0020\0322\006\0207\032\0020\0032\006\0204\032\0020\0032\006\020\027\032\0020\0302\b\b\002\020\031\032\0020\032H\b\0322\020H\032\0020\0322\006\0207\032\0020\0032\006\0204\032\0020\0032\006\0205\032\0020\0032\006\020\027\032\0020\0302\b\b\002\020\031\032\0020\032H\002\032 \020I\032\0020A2\006\020\"\032\0020\0032\006\020$\032\0020\0032\006\020&\032\0020\003H\002\032 \020J\032\0020\0322\006\020.\032\0020\0302\006\020/\032\0020\0032\006\0200\032\0020\003H\000\032(\020K\032\0020\0322\006\020.\032\0020\0302\006\020L\032\0020\0322\006\020/\032\0020\0032\006\0200\032\0020\003H\002\0320\020M\032\0020\0322\006\020.\032\0020\0302\006\020L\032\0020\0322\006\020/\032\0020\0032\006\0200\032\0020\0032\006\0202\032\0020\030H\002\032\030\020N\032\0020\0322\006\020O\032\0020\0302\006\020+\032\0020\030H\002\0320\020P\032\0020\0322\006\020.\032\0020\0302\006\020/\032\0020\0032\006\0200\032\0020\0032\006\020Q\032\0020\0302\006\0202\032\0020\030H\000\0320\020R\032\0020S2\006\020T\032\0020\0302\006\020U\032\0020\0322\006\020+\032\0020\0302\006\020V\032\0020\0322\006\0206\032\0020\003H\002\032 \020W\032\0020S2\006\020T\032\0020\0302\006\020+\032\0020\0302\006\0206\032\0020\003H\002\032\030\020X\032\0020\0032\006\020/\032\0020\0032\006\0200\032\0020\003H\002\032 \020Y\032\0020\0322\006\020\020\032\0020\0032\006\020\027\032\0020\0302\006\020\031\032\0020\032H\002\032\025\020Z\032\0020A*\0020\0012\006\020[\032\0020\001H\b\032\025\020Z\032\0020A*\0020\0032\006\020[\032\0020\003H\b\"\016\020\000\032\0020\001XT¢\006\002\n\000\"\016\020\002\032\0020\003XT¢\006\002\n\000\"\016\020\004\032\0020\001XT¢\006\002\n\000\"\030\020\005\032\0020\003*\0020\0068BX\004¢\006\006\032\004\b\007\020\b\"\030\020\t\032\0020\003*\0020\0068BX\004¢\006\006\032\004\b\n\020\b\"\031\020\013\032\0020\003*\0020\0068Â\002X\004¢\006\006\032\004\b\f\020\b\"\031\020\r\032\0020\003*\0020\0068Â\002X\004¢\006\006\032\004\b\016\020\b¨\006\\"}, d2 = {"Epsilon", "", "FloatEpsilon", "", "Tau", "endX", "Landroidx/compose/ui/graphics/PathSegment;", "getEndX", "(Landroidx/compose/ui/graphics/PathSegment;)F", "endY", "getEndY", "startX", "getStartX", "startY", "getStartY", "clampValidRootInUnitRange", "r", "computeCubicVerticalBounds", "Landroidx/collection/FloatFloatPair;", "p0y", "p1y", "p2y", "p3y", "roots", "", "index", "", "(FFFF[FI)J", "computeHorizontalBounds", "segment", "(Landroidx/compose/ui/graphics/PathSegment;[FI)J", "computeVerticalBounds", "cubicArea", "x0", "y0", "x1", "y1", "x2", "y2", "x3", "y3", "cubicToMonotonicCubics", "cubic", "dst", "tmpRoot", "cubicWinding", "points", "x", "y", "tmpCubics", "tmpRoots", "evaluateCubic", "p1", "p2", "t", "p0", "p3", "evaluateLine", "evaluateQuadratic", "evaluateX", "evaluateY", "findCubicExtremaY", "dstRoots", "findDerivativeRoots", "horizontal", "", "findFirstCubicRoot", "findFirstLineRoot", "findFirstQuadraticRoot", "findFirstRoot", "fraction", "findLineRoot", "findQuadraticRoots", "isQuadraticMonotonic", "lineWinding", "monotonicCubicWinding", "offset", "monotonicQuadraticWinding", "quadraticToMonotonicQuadratics", "quadratic", "quadraticWinding", "tmpQuadratics", "splitCubicAt", "", "src", "srcOffset", "dstOffset", "splitQuadraticAt", "unitDivide", "writeValidRootInUnitRange", "closeTo", "b", "ui-graphics"})
/*      */ @SourceDebugExtension({"SMAP\nBezier.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Bezier.kt\nandroidx/compose/ui/graphics/BezierKt\n+ 2 MathHelpers.kt\nandroidx/compose/ui/util/MathHelpersKt\n*L\n1#1,1120:1\n230#1:1121\n571#1,7:1122\n571#1,7:1129\n571#1,7:1136\n571#1,7:1143\n571#1,7:1150\n560#1:1157\n560#1:1158\n560#1:1159\n571#1,7:1160\n571#1,7:1167\n571#1,7:1174\n571#1,7:1197\n571#1,7:1204\n571#1,7:1211\n571#1,7:1218\n571#1,7:1225\n571#1,7:1232\n359#1:1239\n359#1:1240\n1094#1:1241\n1094#1:1242\n1108#1:1243\n1108#1:1244\n359#1:1245\n571#1,7:1246\n563#1:1253\n563#1:1256\n97#2,16:1181\n49#2:1254\n60#2:1255\n71#2,16:1257\n*S KotlinDebug\n*F\n+ 1 Bezier.kt\nandroidx/compose/ui/graphics/BezierKt\n*L\n201#1:1121\n201#1:1122,7\n230#1:1129,7\n254#1:1136,7\n257#1:1143,7\n259#1:1150,7\n293#1:1157\n295#1:1158\n297#1:1159\n300#1:1160,7\n305#1:1167,7\n308#1:1174,7\n329#1:1197,7\n332#1:1204,7\n335#1:1211,7\n339#1:1218,7\n342#1:1225,7\n349#1:1232,7\n442#1:1239\n461#1:1240\n484#1:1241\n485#1:1242\n511#1:1243\n512#1:1244\n544#1:1245\n586#1:1246,7\n726#1:1253\n910#1:1256\n325#1:1181,16\n889#1:1254\n892#1:1255\n950#1:1257,16\n*E\n"})
/*      */ public final class BezierKt
/*      */ {
/*      */   private static final double Tau = 6.283185307179586D;
/*      */   private static final double Epsilon = 1.0E-7D;
/*      */   private static final float FloatEpsilon = 8.34465E-7F;
/*      */   
/*      */   private static final float evaluateX(PathSegment segment, float t) {
/*   50 */     float[] points = segment.getPoints();
/*      */     
/*   52 */     switch (WhenMappings.$EnumSwitchMapping$0[segment.getType().ordinal()]) {
/*      */       case 1:
/*      */       
/*      */ 
/*      */ 
/*      */       
/*      */       case 2:
/*      */       
/*      */ 
/*      */ 
/*      */       
/*      */       case 3:
/*      */       
/*      */ 
/*      */ 
/*      */       
/*      */       case 4:
/*      */       
/*      */ 
/*      */ 
/*      */       
/*      */       case 5:
/*      */       
/*      */ 
/*      */       
/*      */       case 6:
/*      */       
/*      */ 
/*      */       
/*      */       case 7:
/*      */       
/*      */     } 
/*      */ 
/*      */     
/*   86 */     throw new NoWhenBranchMatchedException();
/*      */   }
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP_PREFIX})
/*      */   public static final float evaluateY(@NotNull PathSegment segment, float t) {
/*   99 */     Intrinsics.checkNotNullParameter(segment, "segment"); float[] points = segment.getPoints();
/*      */     
/*  101 */     switch (WhenMappings.$EnumSwitchMapping$0[segment.getType().ordinal()]) {
/*      */       case 1:
/*      */       
/*      */ 
/*      */ 
/*      */       
/*      */       case 2:
/*      */       
/*      */ 
/*      */ 
/*      */       
/*      */       case 3:
/*      */       
/*      */ 
/*      */ 
/*      */       
/*      */       case 4:
/*      */       
/*      */ 
/*      */ 
/*      */       
/*      */       case 5:
/*      */       
/*      */ 
/*      */       
/*      */       case 6:
/*      */       
/*      */ 
/*      */       
/*      */       case 7:
/*      */       
/*      */     } 
/*      */ 
/*      */     
/*  135 */     throw new NoWhenBranchMatchedException();
/*      */   }
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   private static final float evaluateLine(float p0y, float p1y, float t) {
/*  143 */     return (p1y - p0y) * t + p0y;
/*      */   }
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   private static final float evaluateQuadratic(float p0, float p1, float p2, float t) {
/*  151 */     float by = 2.0F * (p1 - p0);
/*  152 */     float ay = p2 - 2.0F * p1 + p0;
/*  153 */     return (ay * t + by) * t + p0;
/*      */   }
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   private static final float evaluateCubic(float p0, float p1, float p2, float p3, float t) {
/*  163 */     float a = p3 + 3.0F * (p1 - p2) - p0;
/*  164 */     float b = 3.0F * (p2 - 2.0F * p1 + p0);
/*  165 */     float c = 3.0F * (p1 - p0);
/*  166 */     return ((a * t + b) * t + c) * t + p0;
/*      */   }
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP_PREFIX})
/*      */   public static final float evaluateCubic(float p1, float p2, float t) {
/*  181 */     float a = 0.33333334F + p1 - p2;
/*  182 */     float b = p2 - 2.0F * p1;
/*  183 */     float c = p1;
/*  184 */     return 3.0F * ((a * t + b) * t + c) * t;
/*      */   }
/*      */ 
/*      */ 
/*      */   
/*      */   @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP_PREFIX})
/*      */   public static final float findFirstRoot(@NotNull PathSegment segment, float fraction)
/*      */   {
/*      */     float f1, p1$iv;
/*      */     int $i$f$findFirstLineRoot;
/*      */     float r$iv$iv;
/*      */     int $i$f$clampValidRootInUnitRange;
/*  196 */     Intrinsics.checkNotNullParameter(segment, "segment"); float[] points = segment.getPoints();
/*  197 */     switch (WhenMappings.$EnumSwitchMapping$0[segment.getType().ordinal()])
/*      */     { case 1:
/*      */       
/*      */       
/*      */       case 2:
/*  202 */         f1 = points[0] - fraction;
/*  203 */         p1$iv = points[2] - fraction;
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */         
/*      */         $i$f$findFirstLineRoot = 0;
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */         
/* 1121 */         r$iv$iv = -f1 / (p1$iv - f1); $i$f$clampValidRootInUnitRange = 0;
/*      */       case 3: 
/*      */       case 4: 
/*      */       case 5:
/*      */       
/*      */       case 6:
/*      */       
/*      */       case 7:
/* 1129 */        }  throw new NoWhenBranchMatchedException(); } private static final float findFirstLineRoot(float p0, float p1) { int $i$f$findFirstLineRoot = 0; float r$iv = -p0 / (p1 - p0); int $i$f$clampValidRootInUnitRange = 0; return (r$iv < 0.0F) ? (
/* 1130 */       (r$iv >= -8.34465E-7F) ? 0.0F : Float.NaN) : (
/* 1131 */       (r$iv > 1.0F) ? (
/* 1132 */       (r$iv <= 1.0000008F) ? 1.0F : Float.NaN) : 
/*      */       
/* 1134 */       r$iv); } private static final float findFirstQuadraticRoot(float p0, float p1, float p2) { double a = p0; double b = p1; double c = p2; double d = a - 2.0D * b + c; if (!((d == 0.0D) ? 1 : 0)) {
/*      */       double v1 = -Math.sqrt(b * b - a * c); double v2 = -a + b; float r$iv = (float)(-(v1 + v2) / d); int $i$f$clampValidRootInUnitRange = 0;
/* 1136 */       float root = (r$iv < 0.0F) ? (
/* 1137 */         (r$iv >= -8.34465E-7F) ? 0.0F : Float.NaN) : (
/* 1138 */         (r$iv > 1.0F) ? (
/* 1139 */         (r$iv <= 1.0000008F) ? 1.0F : Float.NaN) : 
/*      */         
/* 1141 */         r$iv); if (!Float.isNaN(root))
/*      */         return root;  r$iv = (float)((v1 - v2) / d); $i$f$clampValidRootInUnitRange = 0;
/* 1143 */       return (r$iv < 0.0F) ? (
/* 1144 */         (r$iv >= -8.34465E-7F) ? 0.0F : Float.NaN) : (
/* 1145 */         (r$iv > 1.0F) ? (
/* 1146 */         (r$iv <= 1.0000008F) ? 1.0F : Float.NaN) : 
/*      */         
/* 1148 */         r$iv);
/*      */     }  if (!((b == c) ? 1 : 0)) {
/* 1150 */       float r$iv = (float)((2.0D * b - c) / (2.0D * b - 2.0D * c)); int $i$f$clampValidRootInUnitRange = 0; return (r$iv < 0.0F) ? (
/* 1151 */         (r$iv >= -8.34465E-7F) ? 0.0F : Float.NaN) : (
/* 1152 */         (r$iv > 1.0F) ? (
/* 1153 */         (r$iv <= 1.0000008F) ? 1.0F : Float.NaN) : 
/*      */         
/* 1155 */         r$iv);
/*      */     }  return Float.NaN; } @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP_PREFIX}) public static final float findFirstCubicRoot(float p0, float p1, float p2, float p3) { double a = 3.0D * (p0 - 2.0D * p1 + p2); double b = 3.0D * (p1 - p0); double c = p0; double d = -p0 + 3.0D * (p1 - p2) + p3; double d1 = d, b$iv = 0.0D; int $i$f$closeTo = 0;
/* 1157 */     if ((Math.abs(d1 - b$iv) < 1.0E-7D)) {
/* 1158 */       double $this$closeTo$iv = a; b$iv = 0.0D; $i$f$closeTo = 0; if ((Math.abs($this$closeTo$iv - b$iv) < 1.0E-7D)) {
/* 1159 */         $this$closeTo$iv = b; b$iv = 0.0D; $i$f$closeTo = 0; if ((Math.abs($this$closeTo$iv - b$iv) < 1.0E-7D))
/* 1160 */           return Float.NaN;  float f = (float)(-c / b); int j = 0; return (f < 0.0F) ? (
/* 1161 */           (f >= -8.34465E-7F) ? 0.0F : Float.NaN) : (
/* 1162 */           (f > 1.0F) ? (
/* 1163 */           (f <= 1.0000008F) ? 1.0F : Float.NaN) : 
/*      */           
/* 1165 */           f);
/*      */       }  double q = Math.sqrt(b * b - 4.0D * a * c); double a2 = 2.0D * a; float f1 = (float)((q - b) / a2); int i = 0;
/* 1167 */       float root = (f1 < 0.0F) ? (
/* 1168 */         (f1 >= -8.34465E-7F) ? 0.0F : Float.NaN) : (
/* 1169 */         (f1 > 1.0F) ? (
/* 1170 */         (f1 <= 1.0000008F) ? 1.0F : Float.NaN) : 
/*      */         
/* 1172 */         f1); if (!Float.isNaN(root))
/*      */         return root;  f1 = (float)((-b - q) / a2); i = 0;
/* 1174 */       return (f1 < 0.0F) ? (
/* 1175 */         (f1 >= -8.34465E-7F) ? 0.0F : Float.NaN) : (
/* 1176 */         (f1 > 1.0F) ? (
/* 1177 */         (f1 <= 1.0000008F) ? 1.0F : Float.NaN) : 
/*      */         
/* 1179 */         f1);
/*      */     }  a /= d; b /= d; c /= d; double o3 = (3.0D * b - a * a) / 9.0D; double q2 = (2.0D * a * a * a - 9.0D * a * b + 27.0D * c) / 54.0D; double discriminant = q2 * q2 + o3 * o3 * o3; double a3 = a / 3.0D; if (discriminant < 0.0D) {
/* 1181 */       double mp33 = -(o3 * o3 * o3); double r = Math.sqrt(mp33); double t = -q2 / r; double d2 = t, d3 = -1.0D, maximumValue$iv = 1.0D; int $i$f$fastCoerceIn = 0; double $this$fastCoerceAtLeast$iv$iv = d2; int $i$f$fastCoerceAtLeast = 0;
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */       
/* 1188 */       double $this$fastCoerceAtMost$iv$iv = ($this$fastCoerceAtLeast$iv$iv < d3) ? d3 : $this$fastCoerceAtLeast$iv$iv;
/*      */ 
/*      */ 
/*      */       
/*      */       int $i$f$fastCoerceAtMost = 0;
/*      */ 
/*      */ 
/*      */       
/* 1196 */       double cosPhi = ($this$fastCoerceAtMost$iv$iv > maximumValue$iv) ? maximumValue$iv : $this$fastCoerceAtMost$iv$iv; double phi = Math.acos(cosPhi); float t1 = 2.0F * MathHelpersKt.fastCbrt((float)r); float f1 = (float)(t1 * Math.cos(phi / 3.0D) - a3); int i = 0;
/* 1197 */       float root = (f1 < 0.0F) ? (
/* 1198 */         (f1 >= -8.34465E-7F) ? 0.0F : Float.NaN) : (
/* 1199 */         (f1 > 1.0F) ? (
/* 1200 */         (f1 <= 1.0000008F) ? 1.0F : Float.NaN) : 
/*      */         
/* 1202 */         f1); if (!Float.isNaN(root))
/*      */         return root;  f1 = (float)(t1 * Math.cos((phi + 6.283185307179586D) / 3.0D) - a3); i = 0;
/* 1204 */       root = (f1 < 0.0F) ? (
/* 1205 */         (f1 >= -8.34465E-7F) ? 0.0F : Float.NaN) : (
/* 1206 */         (f1 > 1.0F) ? (
/* 1207 */         (f1 <= 1.0000008F) ? 1.0F : Float.NaN) : 
/*      */         
/* 1209 */         f1); if (!Float.isNaN(root))
/*      */         return root;  f1 = (float)(t1 * Math.cos((phi + 12.566370614359172D) / 3.0D) - a3); i = 0;
/* 1211 */       return (f1 < 0.0F) ? (
/* 1212 */         (f1 >= -8.34465E-7F) ? 0.0F : Float.NaN) : (
/* 1213 */         (f1 > 1.0F) ? (
/* 1214 */         (f1 <= 1.0000008F) ? 1.0F : Float.NaN) : 
/*      */         
/* 1216 */         f1);
/*      */     }  if ((discriminant == 0.0D)) {
/* 1218 */       float f1 = -MathHelpersKt.fastCbrt((float)q2); float f2 = 2.0F * f1 - (float)a3; int i = 0; float root = (f2 < 0.0F) ? (
/* 1219 */         (f2 >= -8.34465E-7F) ? 0.0F : Float.NaN) : (
/* 1220 */         (f2 > 1.0F) ? (
/* 1221 */         (f2 <= 1.0000008F) ? 1.0F : Float.NaN) : 
/*      */         
/* 1223 */         f2); if (!Float.isNaN(root))
/*      */         return root;  f2 = -f1 - (float)a3; i = 0;
/* 1225 */       return (f2 < 0.0F) ? (
/* 1226 */         (f2 >= -8.34465E-7F) ? 0.0F : Float.NaN) : (
/* 1227 */         (f2 > 1.0F) ? (
/* 1228 */         (f2 <= 1.0000008F) ? 1.0F : Float.NaN) : 
/*      */         
/* 1230 */         f2);
/*      */     }  double sd = Math.sqrt(discriminant); float u1 = MathHelpersKt.fastCbrt((float)(-q2 + sd)); float v1 = MathHelpersKt.fastCbrt((float)(q2 + sd)); float r$iv = (float)((u1 - v1) - a3); int $i$f$clampValidRootInUnitRange = 0;
/* 1232 */     return (r$iv < 0.0F) ? (
/* 1233 */       (r$iv >= -8.34465E-7F) ? 0.0F : Float.NaN) : (
/* 1234 */       (r$iv > 1.0F) ? (
/* 1235 */       (r$iv <= 1.0000008F) ? 1.0F : Float.NaN) : 
/*      */       
/* 1237 */       r$iv); } private static final int findLineRoot(float p0, float p1, float[] roots, int index) { int $i$f$findLineRoot = 0; return writeValidRootInUnitRange(-p0 / (p1 - p0), roots, index); }
/*      */   private static final int findQuadraticRoots(float p0, float p1, float p2, float[] roots, int index) { double a = p0; double b = p1; double c = p2; double d = a - 2.0D * b + c; int rootCount = 0; if (!((d == 0.0D) ? 1 : 0)) { double v1 = -Math.sqrt(b * b - a * c); double v2 = -a + b; rootCount += writeValidRootInUnitRange((float)(-(v1 + v2) / d), roots, index); rootCount += writeValidRootInUnitRange((float)((v1 - v2) / d), roots, index + rootCount); if (rootCount > 1) { float s = roots[index]; float t = roots[index + 1]; if (s > t) { roots[index] = t; roots[index + 1] = s; } else if ((s == t)) { rootCount--; }  }  } else if (!((b == c) ? 1 : 0)) { rootCount += writeValidRootInUnitRange((float)((2.0D * b - c) / (2.0D * b - 2.0D * c)), roots, index); }  return rootCount; }
/*      */   private static final int findDerivativeRoots(PathSegment segment, boolean horizontal, float[] roots, int index) { float d0, d1; int $i$f$findLineRoot; float d2; int count; float dd0, dd1; int index$iv, i, offset = horizontal ? 0 : 1; float[] points = segment.getPoints(); switch (WhenMappings.$EnumSwitchMapping$0[segment.getType().ordinal()]) { case 1: case 2: case 3: d0 = 2 * (points[offset + 2] - points[offset + 0]); d1 = 2 * (points[offset + 4] - points[offset + 2]); $i$f$findLineRoot = 0;case 4: case 5: d0 = 3.0F * (points[offset + 2] - points[offset + 0]); d1 = 3.0F * (points[offset + 4] - points[offset + 2]); d2 = 3.0F * (points[offset + 6] - points[offset + 4]); count = findQuadraticRoots(d0, d1, d2, roots, index); dd0 = 2.0F * (d1 - d0); dd1 = 2.0F * (d2 - d1); index$iv = index + count; i = 0;case 6: 
/*      */       case 7:  }  throw new NoWhenBranchMatchedException(); }
/* 1241 */   @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP_PREFIX}) public static final long computeHorizontalBounds(@NotNull PathSegment segment, @NotNull float[] roots, int index) { Intrinsics.checkNotNullParameter(segment, "segment"); Intrinsics.checkNotNullParameter(roots, "roots"); int count = findDerivativeRoots(segment, true, roots, index); PathSegment $this$startX$iv = segment; int $i$f$getStartX = 0; float f1 = $this$startX$iv.getPoints()[0]; float f3 = getEndX(segment), minX = Math.min(f1, f3); PathSegment pathSegment1 = segment; int j = 0;
/* 1242 */     float f2 = pathSegment1.getPoints()[0]; float f4 = getEndX(segment), maxX = Math.max(f2, f4); for (int i = 0; i < count; i++) { float t = roots[i]; float x = evaluateX(segment, t); minX = Math.min(minX, x); maxX = Math.max(maxX, x); }
/* 1243 */      return FloatFloatPair.constructor-impl(minX, maxX); } public static final long computeVerticalBounds(@NotNull PathSegment segment, @NotNull float[] roots, int index) { Intrinsics.checkNotNullParameter(segment, "segment"); Intrinsics.checkNotNullParameter(roots, "roots"); int count = findDerivativeRoots(segment, false, roots, index); PathSegment $this$startY$iv = segment; int $i$f$getStartY = 0; float f1 = $this$startY$iv.getPoints()[1]; float f3 = getEndY(segment), minY = Math.min(f1, f3); PathSegment pathSegment1 = segment; int j = 0;
/* 1244 */     float f2 = pathSegment1.getPoints()[1]; float f4 = getEndY(segment), maxY = Math.max(f2, f4); for (int i = 0; i < count; i++) { float t = roots[i]; float x = evaluateY(segment, t); minY = Math.min(minY, x); maxY = Math.max(maxY, x); }
/* 1245 */      return FloatFloatPair.constructor-impl(minY, maxY); } @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP_PREFIX}) public static final long computeCubicVerticalBounds(float p0y, float p1y, float p2y, float p3y, @NotNull float[] roots, int index) { Intrinsics.checkNotNullParameter(roots, "roots"); float d0 = 3.0F * (p1y - p0y); float d1 = 3.0F * (p2y - p1y); float d2 = 3.0F * (p3y - p2y); int count = findQuadraticRoots(d0, d1, d2, roots, index); float dd0 = 2.0F * (d1 - d0); float dd1 = 2.0F * (d2 - d1); int index$iv = index + count, $i$f$findLineRoot = 0; count += writeValidRootInUnitRange(-dd0 / (dd1 - dd0), roots, index$iv); float minY = Math.min(p0y, p3y); float maxY = Math.max(p0y, p3y); for (int i = 0, j = count; i < j; i++) { float t = roots[i]; float y = evaluateCubic(p0y, p1y, p2y, p3y, t); minY = Math.min(minY, y); maxY = Math.max(maxY, y); }  return FloatFloatPair.constructor-impl(minY, maxY); } public static final boolean closeTo(double $this$closeTo, double b) { int $i$f$closeTo = 0; return (Math.abs($this$closeTo - b) < 1.0E-7D); } public static final boolean closeTo(float $this$closeTo, float b) { int $i$f$closeTo = 0; return (Math.abs($this$closeTo - b) < 8.34465E-7F); } private static final float clampValidRootInUnitRange(float r) { int $i$f$clampValidRootInUnitRange = 0; return (r < 0.0F) ? ((r >= -8.34465E-7F) ? 0.0F : Float.NaN) : ((r > 1.0F) ? ((r <= 1.0000008F) ? 1.0F : Float.NaN) : r); }
/* 1246 */   private static final int writeValidRootInUnitRange(float r, float[] roots, int index) { int $i$f$clampValidRootInUnitRange = 0; float v = (r < 0.0F) ? (
/* 1247 */       (r >= -8.34465E-7F) ? 0.0F : Float.NaN) : (
/* 1248 */       (r > 1.0F) ? (
/* 1249 */       (r <= 1.0000008F) ? 1.0F : Float.NaN) : 
/*      */       
/* 1251 */       r); roots[index] = v; return Float.isNaN(v) ? 0 : 1; } public static final int lineWinding(@NotNull float[] points, float x, float y) { Intrinsics.checkNotNullParameter(points, "points"); float x0 = points[0]; float y0 = points[1]; float yo = y0; float x1 = points[2]; float y1 = points[3]; float dy = y1 - y0; int direction = 1; if (y0 > y1) { y0 = y1; y1 = yo; direction = -1; }  if (y < y0 || y >= y1) return 0;  float crossProduct = (x1 - x0) * (y - yo) - dy * (x - x0); if ((crossProduct == 0.0F)) { direction = 0; } else if ((int)Math.signum(crossProduct) == direction) { direction = 0; }  return direction; } private static final boolean isQuadraticMonotonic(float y0, float y1, float y2) { return !((Math.signum(y0 - y1) + Math.signum(y1 - y2) == 0.0F) ? 1 : 0); }
/*      */   public static final int quadraticWinding(@NotNull float[] points, float x, float y, @NotNull float[] tmpQuadratics, @NotNull float[] tmpRoots) { Intrinsics.checkNotNullParameter(points, "points"); Intrinsics.checkNotNullParameter(tmpQuadratics, "tmpQuadratics"); Intrinsics.checkNotNullParameter(tmpRoots, "tmpRoots"); float y0 = points[1]; float y1 = points[3]; float y2 = points[5]; if (isQuadraticMonotonic(y0, y1, y2)) return monotonicQuadraticWinding(points, 0, x, y, tmpRoots);  int rootCount = quadraticToMonotonicQuadratics(points, tmpQuadratics); int winding = monotonicQuadraticWinding(tmpQuadratics, 0, x, y, tmpRoots); if (rootCount > 0) winding += monotonicQuadraticWinding(tmpQuadratics, 4, x, y, tmpRoots);  return winding; }
/* 1253 */   private static final int monotonicQuadraticWinding(float[] points, int offset, float x, float y, float[] tmpRoots) { float y0 = points[offset + 1]; float y2 = points[offset + 5]; int direction = 1; if (y0 > y2) { float swap = y2; y2 = y0; y0 = swap; direction = -1; }  if (y < y0 || y >= y2) return 0;  y0 = points[offset + 1]; float y1 = points[offset + 3]; y2 = points[offset + 5]; int rootCount = findQuadraticRoots$default(y0 - 2.0F * y1 + y2, 2.0F * (y1 - y0), y0 - y, tmpRoots, 0, 16, null); float xt = (rootCount == 0) ? points[(1 - direction) * 2] : evaluateQuadratic(points[0], points[2], points[4], tmpRoots[0]); float $this$closeTo$iv = xt; int $i$f$closeTo = 0; if (((Math.abs($this$closeTo$iv - x) < 8.34465E-7F)) && (!((x == points[4]) ? 1 : 0) || !((y == y2) ? 1 : 0))) return 0;  return (xt < x) ? direction : 0; }
/* 1254 */   private static final int quadraticToMonotonicQuadratics(float[] quadratic, float[] dst) { float y0 = quadratic[1]; float y1 = quadratic[3]; float y2 = quadratic[5]; if (!isQuadraticMonotonic(y0, y1, y2)) { float t = unitDivide(y0 - y1, y0 - y1 - y1 + y2); if (!Float.isNaN(t)) { splitQuadraticAt(quadratic, dst, t); return 1; }  y1 = (Math.abs(y0 - y1) < Math.abs(y1 - y2)) ? y0 : y2; }  ArraysKt.copyInto(quadratic, dst, 0, 0, 6); dst[3] = y1; return 0; } private static final void splitQuadraticAt(float[] src, float[] dst, float t) { float p0x = src[0]; float p0y = src[1]; float p1x = src[2]; float p1y = src[3]; float p2x = src[4]; float p2y = src[5]; float abx = MathHelpersKt.lerp(p0x, p1x, t); float aby = MathHelpersKt.lerp(p0y, p1y, t); dst[0] = p0x; dst[1] = p0y; dst[2] = abx; dst[3] = aby; float bcx = MathHelpersKt.lerp(p1x, p2x, t); float bcy = MathHelpersKt.lerp(p1y, p2y, t); float abcx = MathHelpersKt.lerp(abx, bcx, t); float abcy = MathHelpersKt.lerp(aby, bcy, t); dst[4] = abcx; dst[5] = abcy; dst[6] = bcx; dst[7] = bcy; dst[8] = p2x; dst[9] = p2y; } private static final int monotonicCubicWinding(float[] points, int offset, float x, float y) { float y0 = points[offset + 1]; float y3 = points[offset + 7]; int direction = 1; if (y0 > y3) { float swap = y3; y3 = y0; y0 = swap; direction = -1; }  if (y < y0 || y >= y3) return 0;  float x0 = points[offset + 0]; float x1 = points[offset + 2]; float x2 = points[offset + 4]; float x3 = points[offset + 6]; int $i$f$fastMinOf = 0; float min = Math.min(x0, Math.min(x1, Math.min(x2, x3))); if (x < min)
/* 1255 */       return 0;  int $i$f$fastMaxOf = 0; float max = Math.max(x0, Math.max(x1, Math.max(x2, x3))); if (x > max) return direction;  y0 = points[offset + 1]; float y1 = points[offset + 3]; float y2 = points[offset + 5]; y3 = points[offset + 7]; float root = findFirstCubicRoot(y0 - y, y1 - y, y2 - y, y3 - y); if (Float.isNaN(root))
/* 1256 */       return 0;  float xt = evaluateCubic(x0, x1, x2, x3, root); float $this$closeTo$iv = xt; int $i$f$closeTo = 0; if (((Math.abs($this$closeTo$iv - x) < 8.34465E-7F)) && (!((x == x3) ? 1 : 0) || !((y == y3) ? 1 : 0))) return 0;  return (xt < x) ? direction : 0; }
/* 1257 */   private static final float unitDivide(float x, float y) { float n = x; float d = y; if (n < 0.0F) { n = -n; d = -d; }  if (((d == 0.0F)) || ((n == 0.0F)) || n >= d) return Float.NaN;  float r = n / d; if ((r == 0.0F)) return Float.NaN;  return r; } public static final int cubicWinding(@NotNull float[] points, float x, float y, @NotNull float[] tmpCubics, @NotNull float[] tmpRoots) { Intrinsics.checkNotNullParameter(points, "points"); Intrinsics.checkNotNullParameter(tmpCubics, "tmpCubics"); Intrinsics.checkNotNullParameter(tmpRoots, "tmpRoots"); int splits = cubicToMonotonicCubics(points, tmpCubics, tmpRoots); int winding = 0; int i = 0; if (i <= splits) while (true) { winding += monotonicCubicWinding(tmpCubics, i * 3 * 2, x, y); if (i != splits) { i++; continue; }  break; }   return winding; } private static final int cubicToMonotonicCubics(float[] cubic, float[] dst, float[] tmpRoot) { int rootCount = findCubicExtremaY(cubic, tmpRoot); if (rootCount == 0) { ArraysKt.copyInto(cubic, dst, 0, 0, 8); } else { float lastT = 0.0F; int dstOffset = 0; float[] src = cubic; int i = 0; if (i < rootCount) { float t = tmpRoot[i]; float f1 = (t - lastT) / (1.0F - lastT), f2 = 0.0F, maximumValue$iv = 1.0F; int $i$f$fastCoerceIn = 0; float $this$fastCoerceAtLeast$iv$iv = f1; int $i$f$fastCoerceAtLeast = 0;
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */         
/* 1264 */         float $this$fastCoerceAtMost$iv$iv = ($this$fastCoerceAtLeast$iv$iv < f2) ? f2 : $this$fastCoerceAtLeast$iv$iv;
/*      */ 
/*      */ 
/*      */         
/*      */         int $i$f$fastCoerceAtMost = 0;
/*      */ 
/*      */ 
/*      */         
/* 1272 */         t = ($this$fastCoerceAtMost$iv$iv > maximumValue$iv) ? maximumValue$iv : $this$fastCoerceAtMost$iv$iv;
/*      */         lastT = t;
/*      */         splitCubicAt(src, dstOffset, dst, dstOffset, t);
/*      */         src = dst;
/*      */         dstOffset += 6;
/*      */         i++; }
/*      */       else
/*      */       { return rootCount; }
/*      */        }
/*      */     
/*      */     return rootCount; }
/*      */ 
/*      */   
/*      */   private static final int findCubicExtremaY(float[] cubic, float[] dstRoots) {
/*      */     float a = cubic[1];
/*      */     float b = cubic[3];
/*      */     float c = cubic[5];
/*      */     float d = cubic[7];
/*      */     float A = d - a + 3.0F * (b - c);
/*      */     float B = 2.0F * (a - b - b - c);
/*      */     float C = b - a;
/*      */     return findQuadraticRoots(A, B, C, dstRoots, 0);
/*      */   }
/*      */   
/*      */   private static final void splitCubicAt(float[] src, int srcOffset, float[] dst, int dstOffset, float t) {
/*      */     if (t >= 1.0F) {
/*      */       ArraysKt.copyInto(src, dst, dstOffset, srcOffset, 8);
/*      */       float x = src[srcOffset + 6];
/*      */       float y = src[srcOffset + 7];
/*      */       dst[dstOffset + 8] = x;
/*      */       dst[dstOffset + 9] = y;
/*      */       dst[dstOffset + 10] = x;
/*      */       dst[dstOffset + 11] = y;
/*      */       dst[dstOffset + 12] = x;
/*      */       dst[dstOffset + 13] = y;
/*      */       return;
/*      */     } 
/*      */     float p0x = src[srcOffset + 0];
/*      */     float p0y = src[srcOffset + 1];
/*      */     dst[dstOffset + 0] = p0x;
/*      */     dst[dstOffset + 1] = p0y;
/*      */     float p1x = src[srcOffset + 2];
/*      */     float p1y = src[srcOffset + 3];
/*      */     float abx = MathHelpersKt.lerp(p0x, p1x, t);
/*      */     float aby = MathHelpersKt.lerp(p0y, p1y, t);
/*      */     dst[dstOffset + 2] = abx;
/*      */     dst[dstOffset + 3] = aby;
/*      */     float p2x = src[srcOffset + 4];
/*      */     float p2y = src[srcOffset + 5];
/*      */     float bcx = MathHelpersKt.lerp(p1x, p2x, t);
/*      */     float bcy = MathHelpersKt.lerp(p1y, p2y, t);
/*      */     float abcx = MathHelpersKt.lerp(abx, bcx, t);
/*      */     float abcy = MathHelpersKt.lerp(aby, bcy, t);
/*      */     dst[dstOffset + 4] = abcx;
/*      */     dst[dstOffset + 5] = abcy;
/*      */     float p3x = src[srcOffset + 6];
/*      */     float p3y = src[srcOffset + 7];
/*      */     float cdx = MathHelpersKt.lerp(p2x, p3x, t);
/*      */     float cdy = MathHelpersKt.lerp(p2y, p3y, t);
/*      */     float bcdx = MathHelpersKt.lerp(bcx, cdx, t);
/*      */     float bcdy = MathHelpersKt.lerp(bcy, cdy, t);
/*      */     float abcdx = MathHelpersKt.lerp(abcx, bcdx, t);
/*      */     float abcdy = MathHelpersKt.lerp(abcy, bcdy, t);
/*      */     dst[dstOffset + 6] = abcdx;
/*      */     dst[dstOffset + 7] = abcdy;
/*      */     dst[dstOffset + 8] = bcdx;
/*      */     dst[dstOffset + 9] = bcdy;
/*      */     dst[dstOffset + 10] = cdx;
/*      */     dst[dstOffset + 11] = cdy;
/*      */     dst[dstOffset + 12] = p3x;
/*      */     dst[dstOffset + 13] = p3y;
/*      */   }
/*      */   
/*      */   public static final float cubicArea(float x0, float y0, float x1, float y1, float x2, float y2, float x3, float y3) {
/*      */     return ((y3 - y0) * (x1 + x2) - (x3 - x0) * (y1 + y2) + y1 * (x0 - x2) - x1 * (y0 - y2) + y3 * (x2 + x0 / 3.0F) - x3 * (y2 + y0 / 3.0F)) * 3.0F / 20.0F;
/*      */   }
/*      */   
/*      */   private static final float getStartX(PathSegment $this$startX) {
/*      */     int $i$f$getStartX = 0;
/*      */     return $this$startX.getPoints()[0];
/*      */   }
/*      */   
/*      */   private static final float getEndX(PathSegment $this$endX) {
/*      */     switch (WhenMappings.$EnumSwitchMapping$0[$this$endX.getType().ordinal()]) {
/*      */       case 1:
/*      */       
/*      */       case 2:
/*      */       
/*      */       case 3:
/*      */       
/*      */       case 4:
/*      */       
/*      */       case 5:
/*      */       
/*      */       case 6:
/*      */       
/*      */       case 7:
/*      */       
/*      */     } 
/*      */     throw new NoWhenBranchMatchedException();
/*      */   }
/*      */   
/*      */   private static final float getStartY(PathSegment $this$startY) {
/*      */     int $i$f$getStartY = 0;
/*      */     return $this$startY.getPoints()[1];
/*      */   }
/*      */   
/*      */   private static final float getEndY(PathSegment $this$endY) {
/*      */     switch (WhenMappings.$EnumSwitchMapping$0[$this$endY.getType().ordinal()]) {
/*      */       case 1:
/*      */       
/*      */       case 2:
/*      */       
/*      */       case 3:
/*      */       
/*      */       case 4:
/*      */       
/*      */       case 5:
/*      */       
/*      */       case 6:
/*      */       
/*      */       case 7:
/*      */       
/*      */     } 
/*      */     throw new NoWhenBranchMatchedException();
/*      */   }
/*      */ }


/* Location:              C:\Users\yuzum\Downloads\ej-release-243.132.63.zip!\ej\li\\ui-graphics-desktop-1.7.3.jar!\androidx\compos\\ui\graphics\BezierKt.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */