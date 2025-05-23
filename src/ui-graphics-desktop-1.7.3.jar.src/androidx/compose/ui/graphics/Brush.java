/*     */ package androidx.compose.ui.graphics;
/*     */ 
/*     */ import androidx.compose.runtime.Immutable;
/*     */ import androidx.compose.runtime.Stable;
/*     */ import androidx.compose.ui.geometry.Offset;
/*     */ import androidx.compose.ui.geometry.OffsetKt;
/*     */ import androidx.compose.ui.geometry.Size;
/*     */ import java.util.ArrayList;
/*     */ import java.util.Arrays;
/*     */ import java.util.List;
/*     */ import kotlin.Metadata;
/*     */ import kotlin.Pair;
/*     */ import kotlin.jvm.internal.DefaultConstructorMarker;
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
/*     */ @Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\0004\n\002\030\002\n\002\020\000\n\002\b\002\n\002\030\002\n\002\b\004\n\002\020\002\n\002\b\002\n\002\030\002\n\000\n\002\020\007\n\002\b\003\n\002\030\002\n\002\030\002\n\000\b7\030\000 \0212\0020\001:\001\021B\007\b\004¢\006\002\020\002J*\020\b\032\0020\t2\006\020\n\032\0020\0042\006\020\013\032\0020\f2\006\020\r\032\0020\016H&ø\001\000¢\006\004\b\017\020\020R\034\020\003\032\0020\004X\004ø\001\000ø\001\001¢\006\n\n\002\020\007\032\004\b\005\020\006\001\002\022\023\002\013\n\005\b¡\0360\001\n\002\b!¨\006\024"}, d2 = {"Landroidx/compose/ui/graphics/Brush;", "", "()V", "intrinsicSize", "Landroidx/compose/ui/geometry/Size;", "getIntrinsicSize-NH-jbRc", "()J", "J", "applyTo", "", "size", "p", "Landroidx/compose/ui/graphics/Paint;", "alpha", "", "applyTo-Pq9zytI", "(JLandroidx/compose/ui/graphics/Paint;F)V", "Companion", "Landroidx/compose/ui/graphics/ShaderBrush;", "Landroidx/compose/ui/graphics/SolidColor;", "ui-graphics"})
/*     */ @Immutable
/*     */ public abstract class Brush
/*     */ {
/*     */   @NotNull
/*     */   public static final Companion Companion = new Companion(null);
/*  39 */   private final long intrinsicSize = Size.Companion.getUnspecified-NH-jbRc(); private Brush() {} public long getIntrinsicSize-NH-jbRc() { return this.intrinsicSize; }
/*     */    public abstract void applyTo-Pq9zytI(long paramLong, @NotNull Paint paramPaint, float paramFloat);
/*     */   @Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\000>\n\002\030\002\n\002\020\000\n\002\b\002\n\002\030\002\n\000\n\002\020\021\n\002\030\002\n\002\020\007\n\002\030\002\n\002\b\003\n\002\030\002\n\002\b\003\n\002\020 \n\002\b\003\n\002\030\002\n\002\b\023\b\003\030\0002\0020\001B\007\b\002¢\006\002\020\002J\\\020\003\032\0020\0042*\020\005\032\026\022\022\b\001\022\016\022\004\022\0020\b\022\004\022\0020\t0\0070\006\"\016\022\004\022\0020\b\022\004\022\0020\t0\0072\b\b\002\020\n\032\0020\b2\b\b\002\020\013\032\0020\b2\b\b\002\020\f\032\0020\rH\007ø\001\000¢\006\004\b\016\020\017J>\020\003\032\0020\0042\f\020\020\032\b\022\004\022\0020\t0\0212\b\b\002\020\n\032\0020\b2\b\b\002\020\013\032\0020\b2\b\b\002\020\f\032\0020\rH\007ø\001\000¢\006\004\b\016\020\022J\\\020\023\032\0020\0042*\020\005\032\026\022\022\b\001\022\016\022\004\022\0020\b\022\004\022\0020\t0\0070\006\"\016\022\004\022\0020\b\022\004\022\0020\t0\0072\b\b\002\020\024\032\0020\0252\b\b\002\020\026\032\0020\0252\b\b\002\020\f\032\0020\rH\007ø\001\000¢\006\004\b\027\020\030J>\020\023\032\0020\0042\f\020\020\032\b\022\004\022\0020\t0\0212\b\b\002\020\024\032\0020\0252\b\b\002\020\026\032\0020\0252\b\b\002\020\f\032\0020\rH\007ø\001\000¢\006\004\b\027\020\031J\\\020\032\032\0020\0042*\020\005\032\026\022\022\b\001\022\016\022\004\022\0020\b\022\004\022\0020\t0\0070\006\"\016\022\004\022\0020\b\022\004\022\0020\t0\0072\b\b\002\020\033\032\0020\0252\b\b\002\020\034\032\0020\b2\b\b\002\020\f\032\0020\rH\007ø\001\000¢\006\004\b\035\020\036J>\020\032\032\0020\0042\f\020\020\032\b\022\004\022\0020\t0\0212\b\b\002\020\033\032\0020\0252\b\b\002\020\034\032\0020\b2\b\b\002\020\f\032\0020\rH\007ø\001\000¢\006\004\b\035\020\037JH\020 \032\0020\0042*\020\005\032\026\022\022\b\001\022\016\022\004\022\0020\b\022\004\022\0020\t0\0070\006\"\016\022\004\022\0020\b\022\004\022\0020\t0\0072\b\b\002\020\033\032\0020\025H\007ø\001\000¢\006\004\b!\020\"J*\020 \032\0020\0042\f\020\020\032\b\022\004\022\0020\t0\0212\b\b\002\020\033\032\0020\025H\007ø\001\000¢\006\004\b!\020#J\\\020$\032\0020\0042*\020\005\032\026\022\022\b\001\022\016\022\004\022\0020\b\022\004\022\0020\t0\0070\006\"\016\022\004\022\0020\b\022\004\022\0020\t0\0072\b\b\002\020%\032\0020\b2\b\b\002\020&\032\0020\b2\b\b\002\020\f\032\0020\rH\007ø\001\000¢\006\004\b'\020\017J>\020$\032\0020\0042\f\020\020\032\b\022\004\022\0020\t0\0212\b\b\002\020%\032\0020\b2\b\b\002\020&\032\0020\b2\b\b\002\020\f\032\0020\rH\007ø\001\000¢\006\004\b'\020\022\002\007\n\005\b¡\0360\001¨\006("}, d2 = {"Landroidx/compose/ui/graphics/Brush$Companion;", "", "()V", "horizontalGradient", "Landroidx/compose/ui/graphics/Brush;", "colorStops", "", "Lkotlin/Pair;", "", "Landroidx/compose/ui/graphics/Color;", "startX", "endX", "tileMode", "Landroidx/compose/ui/graphics/TileMode;", "horizontalGradient-8A-3gB4", "([Lkotlin/Pair;FFI)Landroidx/compose/ui/graphics/Brush;", "colors", "", "(Ljava/util/List;FFI)Landroidx/compose/ui/graphics/Brush;", "linearGradient", "start", "Landroidx/compose/ui/geometry/Offset;", "end", "linearGradient-mHitzGk", "([Lkotlin/Pair;JJI)Landroidx/compose/ui/graphics/Brush;", "(Ljava/util/List;JJI)Landroidx/compose/ui/graphics/Brush;", "radialGradient", "center", "radius", "radialGradient-P_Vx-Ks", "([Lkotlin/Pair;JFI)Landroidx/compose/ui/graphics/Brush;", "(Ljava/util/List;JFI)Landroidx/compose/ui/graphics/Brush;", "sweepGradient", "sweepGradient-Uv8p0NA", "([Lkotlin/Pair;J)Landroidx/compose/ui/graphics/Brush;", "(Ljava/util/List;J)Landroidx/compose/ui/graphics/Brush;", "verticalGradient", "startY", "endY", "verticalGradient-8A-3gB4", "ui-graphics"})
/*     */   @SourceDebugExtension({"SMAP\nBrush.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Brush.kt\nandroidx/compose/ui/graphics/Brush$Companion\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,670:1\n1#2:671\n*E\n"})
/*     */   public static final class Companion {
/*     */     private Companion() {}
/*     */     @Stable
/*     */     @NotNull
/*     */     public final Brush linearGradient-mHitzGk(@NotNull List colors, long start, long end, int tileMode) {
/*     */       Intrinsics.checkNotNullParameter(colors, "colors");
/*     */       return new LinearGradient(colors, null, start, end, tileMode, null);
/*     */     }
/*     */     @Stable
/*     */     @NotNull
/*     */     public final Brush horizontalGradient-8A-3gB4(@NotNull List<Color> colors, float startX, float endX, int tileMode) {
/*     */       Intrinsics.checkNotNullParameter(colors, "colors");
/*     */       return linearGradient-mHitzGk(colors, OffsetKt.Offset(startX, 0.0F), OffsetKt.Offset(endX, 0.0F), tileMode);
/*     */     }
/*     */     @Stable
/*     */     @NotNull
/*     */     public final Brush horizontalGradient-8A-3gB4(@NotNull Pair[] colorStops, float startX, float endX, int tileMode) {
/*     */       Intrinsics.checkNotNullParameter(colorStops, "colorStops");
/*     */       return linearGradient-mHitzGk(Arrays.<Pair<Float, Color>>copyOf((Pair<Float, Color>[])colorStops, colorStops.length), OffsetKt.Offset(startX, 0.0F), OffsetKt.Offset(endX, 0.0F), tileMode);
/*     */     }
/*     */     @Stable
/*     */     @NotNull
/*     */     public final Brush verticalGradient-8A-3gB4(@NotNull List<Color> colors, float startY, float endY, int tileMode) {
/*     */       Intrinsics.checkNotNullParameter(colors, "colors");
/*     */       return linearGradient-mHitzGk(colors, OffsetKt.Offset(0.0F, startY), OffsetKt.Offset(0.0F, endY), tileMode);
/*     */     }
/*     */     @Stable
/*     */     @NotNull
/*     */     public final Brush verticalGradient-8A-3gB4(@NotNull Pair[] colorStops, float startY, float endY, int tileMode) {
/*     */       Intrinsics.checkNotNullParameter(colorStops, "colorStops");
/*     */       return linearGradient-mHitzGk(Arrays.<Pair<Float, Color>>copyOf((Pair<Float, Color>[])colorStops, colorStops.length), OffsetKt.Offset(0.0F, startY), OffsetKt.Offset(0.0F, endY), tileMode);
/*     */     }
/*     */     @Stable
/*     */     @NotNull
/*  77 */     public final Brush linearGradient-mHitzGk(@NotNull Pair[] colorStops, long start, long end, int tileMode) { Intrinsics.checkNotNullParameter(colorStops, "colorStops"); int i; ArrayList<Color> arrayList1; byte b;
/*  78 */       for (i = colorStops.length, arrayList1 = new ArrayList(i), b = 0; b < i; ) { byte b1 = b, b2 = b1;
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */         
/* 671 */         ArrayList<Color> arrayList = arrayList1; int $i$a$-List-Brush$Companion$linearGradient$1 = 0; arrayList.add(Color.box-impl(((Color)colorStops[b2].getSecond()).unbox-impl())); b++; }  ArrayList<Color> arrayList2; for (i = colorStops.length, arrayList2 = arrayList1, arrayList1 = new ArrayList<>(i), b = 0; b < i; ) { byte b1 = b; int k = b1; ArrayList<Color> arrayList = arrayList1; int $i$a$-List-Brush$Companion$linearGradient$2 = 0; arrayList.add(Float.valueOf(((Number)colorStops[k].getFirst()).floatValue())); b++; }  DefaultConstructorMarker defaultConstructorMarker = null; int j = tileMode; long l1 = end, l2 = start; ArrayList<Color> arrayList3 = arrayList1, arrayList4 = arrayList2; return new LinearGradient(arrayList4, arrayList3, l2, l1, j, defaultConstructorMarker); } @Stable @NotNull public final Brush radialGradient-P_Vx-Ks(@NotNull Pair[] colorStops, long center, float radius, int tileMode) { Intrinsics.checkNotNullParameter(colorStops, "colorStops"); int i; ArrayList<Color> arrayList1; byte b; for (i = colorStops.length, arrayList1 = new ArrayList(i), b = 0; b < i; ) { byte b1 = b, b2 = b1; ArrayList<Color> arrayList = arrayList1; int $i$a$-List-Brush$Companion$radialGradient$1 = 0; arrayList.add(Color.box-impl(((Color)colorStops[b2].getSecond()).unbox-impl())); b++; }  ArrayList<Color> arrayList2; for (i = colorStops.length, arrayList2 = arrayList1, arrayList1 = new ArrayList<>(i), b = 0; b < i; ) { byte b1 = b; int k = b1; ArrayList<Color> arrayList = arrayList1; int $i$a$-List-Brush$Companion$radialGradient$2 = 0; arrayList.add(Float.valueOf(((Number)colorStops[k].getFirst()).floatValue())); b++; }  DefaultConstructorMarker defaultConstructorMarker = null; int j = tileMode; float f = radius; long l = center; ArrayList<Color> arrayList3 = arrayList1, arrayList4 = arrayList2; return new RadialGradient(arrayList4, arrayList3, l, f, j, defaultConstructorMarker); } @Stable @NotNull public final Brush sweepGradient-Uv8p0NA(@NotNull Pair[] colorStops, long center) { Intrinsics.checkNotNullParameter(colorStops, "colorStops"); int i; ArrayList<Color> arrayList3; byte b1; for (i = colorStops.length, arrayList3 = new ArrayList(i), b1 = 0; b1 < i; ) { byte b3 = b1, b4 = b3; ArrayList<Color> arrayList = arrayList3; int $i$a$-List-Brush$Companion$sweepGradient$1 = 0; arrayList.add(Color.box-impl(((Color)colorStops[b4].getSecond()).unbox-impl())); b1++; }  ArrayList<Color> arrayList1 = arrayList3; int j; ArrayList<Float> arrayList4; byte b2; for (j = colorStops.length, arrayList4 = new ArrayList(j), b2 = 0; b2 < j; ) { int k = b2, m = k; ArrayList<Float> arrayList = arrayList4; int $i$a$-List-Brush$Companion$sweepGradient$2 = 0;
/*     */         arrayList.add(Float.valueOf(((Number)colorStops[m].getFirst()).floatValue()));
/*     */         b2++; }
/*     */       
/*     */       ArrayList<Float> arrayList2 = arrayList4;
/*     */       return new SweepGradient(center, arrayList1, arrayList2, null); }
/*     */ 
/*     */     
/*     */     @Stable
/*     */     @NotNull
/*     */     public final Brush radialGradient-P_Vx-Ks(@NotNull List colors, long center, float radius, int tileMode) {
/*     */       Intrinsics.checkNotNullParameter(colors, "colors");
/*     */       return new RadialGradient(colors, null, center, radius, tileMode, null);
/*     */     }
/*     */     
/*     */     @Stable
/*     */     @NotNull
/*     */     public final Brush sweepGradient-Uv8p0NA(@NotNull List colors, long center) {
/*     */       Intrinsics.checkNotNullParameter(colors, "colors");
/*     */       return new SweepGradient(center, colors, null, null);
/*     */     }
/*     */   }
/*     */ }


/* Location:              C:\Users\yuzum\Downloads\ej-release-243.132.63.zip!\ej\li\\ui-graphics-desktop-1.7.3.jar!\androidx\compos\\ui\graphics\Brush.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */