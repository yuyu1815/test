/*    */ package androidx.compose.ui.graphics;
/*    */ 
/*    */ import androidx.compose.ui.geometry.Offset;
/*    */ import java.util.List;
/*    */ import kotlin.Metadata;
/*    */ import kotlin.jvm.functions.Function1;
/*    */ import kotlin.jvm.internal.DefaultConstructorMarker;
/*    */ import kotlin.jvm.internal.Lambda;
/*    */ import kotlin.jvm.internal.SourceDebugExtension;
/*    */ import org.jetbrains.annotations.NotNull;
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ @Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\000@\n\002\030\002\n\002\020\000\n\000\n\002\030\002\n\000\n\002\020 \n\002\030\002\n\002\b\002\n\002\030\002\n\000\n\002\020\b\n\000\n\002\020\025\n\002\b\002\n\002\020\027\n\002\b\002\n\002\020\024\n\002\b\n\030\0002\0020\001BE\022\006\020\002\032\0020\003\022\f\020\004\032\b\022\004\022\0020\0060\005\022\f\020\007\032\b\022\004\022\0020\0060\005\022\f\020\b\032\b\022\004\022\0020\t0\005\022\f\020\n\032\b\022\004\022\0020\0130\005¢\006\002\020\fJ\026\020\032\032\0020\r2\f\020\b\032\b\022\004\022\0020\t0\005H\002J\026\020\033\032\0020\0232\f\020\034\032\b\022\004\022\0020\0060\005H\002R\021\020\b\032\0020\r¢\006\b\n\000\032\004\b\016\020\017R\021\020\n\032\0020\020¢\006\b\n\000\032\004\b\021\020\022R\021\020\004\032\0020\023¢\006\b\n\000\032\004\b\024\020\025R\021\020\007\032\0020\023¢\006\b\n\000\032\004\b\026\020\025R\031\020\002\032\0020\003ø\001\000ø\001\001¢\006\n\n\002\020\031\032\004\b\027\020\030\002\013\n\005\b¡\0360\001\n\002\b!¨\006\035"}, d2 = {"Landroidx/compose/ui/graphics/Vertices;", "", "vertexMode", "Landroidx/compose/ui/graphics/VertexMode;", "positions", "", "Landroidx/compose/ui/geometry/Offset;", "textureCoordinates", "colors", "Landroidx/compose/ui/graphics/Color;", "indices", "", "(ILjava/util/List;Ljava/util/List;Ljava/util/List;Ljava/util/List;Lkotlin/jvm/internal/DefaultConstructorMarker;)V", "", "getColors", "()[I", "", "getIndices", "()[S", "", "getPositions", "()[F", "getTextureCoordinates", "getVertexMode-c2xauaI", "()I", "I", "encodeColorList", "encodePointList", "points", "ui-graphics"})
/*    */ @SourceDebugExtension({"SMAP\nVertices.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Vertices.kt\nandroidx/compose/ui/graphics/Vertices\n+ 2 ListUtils.kt\nandroidx/compose/ui/util/ListUtilsKt\n*L\n1#1,76:1\n101#2,2:77\n33#2,6:79\n103#2:85\n*S KotlinDebug\n*F\n+ 1 Vertices.kt\nandroidx/compose/ui/graphics/Vertices\n*L\n42#1:77,2\n42#1:79,6\n42#1:85\n*E\n"})
/*    */ public final class Vertices
/*    */ {
/*    */   private final int vertexMode;
/*    */   @NotNull
/*    */   private final float[] positions;
/*    */   
/*    */   private Vertices(int vertexMode, List<Offset> positions, List<Offset> textureCoordinates, List<Color> colors, List indices) {
/* 24 */     this.vertexMode = vertexMode;
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
/* 37 */     Function1 outOfBounds = new Vertices$outOfBounds$1(positions);
/* 38 */     if (textureCoordinates.size() != positions.size())
/* 39 */       throw new IllegalArgumentException("positions and textureCoordinates lengths must match."); 
/* 40 */     if (colors.size() != positions.size())
/* 41 */       throw new IllegalArgumentException("positions and colors lengths must match."); 
/* 42 */     List $this$fastAny$iv = indices; int $i$f$fastAny = 0;
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
/* 78 */     List $this$fastForEach$iv$iv = $this$fastAny$iv; int $i$f$fastForEach = 0;
/*    */     
/* 80 */     int index$iv$iv = 0, i = $this$fastForEach$iv$iv.size(); if (index$iv$iv < i);
/*    */     if (false)
/*    */       throw new IllegalArgumentException("indices values must be valid indices in the positions list."); 
/*    */     this.positions = encodePointList(positions);
/*    */     this.textureCoordinates = encodePointList(textureCoordinates);
/*    */     this.colors = encodeColorList(colors);
/*    */     short[] arrayOfShort;
/*    */     Vertices vertices;
/*    */     for (byte b = 0; b < $i$f$fastAny; ) {
/*    */       $i$f$fastForEach = b;
/*    */       arrayOfShort[$i$f$fastForEach] = (short)((Number)indices.get($i$f$fastForEach)).intValue();
/*    */       b++;
/*    */     } 
/*    */     vertices.indices = arrayOfShort;
/*    */   }
/*    */   
/*    */   @NotNull
/*    */   private final float[] textureCoordinates;
/*    */   @NotNull
/*    */   private final int[] colors;
/*    */   @NotNull
/*    */   private final short[] indices;
/*    */   
/*    */   public final int getVertexMode-c2xauaI() {
/*    */     return this.vertexMode;
/*    */   }
/*    */   
/*    */   @NotNull
/*    */   public final float[] getPositions() {
/*    */     return this.positions;
/*    */   }
/*    */   
/*    */   @NotNull
/*    */   public final float[] getTextureCoordinates() {
/*    */     return this.textureCoordinates;
/*    */   }
/*    */   
/*    */   @NotNull
/*    */   public final int[] getColors() {
/*    */     return this.colors;
/*    */   }
/*    */   
/*    */   @NotNull
/*    */   public final short[] getIndices() {
/*    */     return this.indices;
/*    */   }
/*    */   
/*    */   @Metadata(mv = {1, 9, 0}, k = 3, xi = 48, d1 = {"\000\020\n\000\n\002\020\013\n\000\n\002\020\b\n\002\b\002\020\000\032\0020\0012\006\020\002\032\0020\003H\n¢\006\004\b\004\020\005"}, d2 = {"<anonymous>", "", "it", "", "invoke", "(I)Ljava/lang/Boolean;"})
/*    */   static final class Vertices$outOfBounds$1 extends Lambda implements Function1<Integer, Boolean> {
/*    */     Vertices$outOfBounds$1(List<Offset> $positions) {
/*    */       super(1);
/*    */     }
/*    */     
/*    */     @NotNull
/*    */     public final Boolean invoke(int it) {
/*    */       return Boolean.valueOf((it < 0 || it >= this.$positions.size()));
/*    */     }
/*    */   }
/*    */   
/*    */   private final int[] encodeColorList(List colors) {
/*    */     byte b;
/*    */     int i;
/*    */     int[] arrayOfInt;
/*    */     for (b = 0, i = colors.size(), arrayOfInt = new int[i]; b < i; ) {
/*    */       byte b1 = b;
/*    */       arrayOfInt[b1] = ColorKt.toArgb-8_81llA(((Color)colors.get(b1)).unbox-impl());
/*    */       b++;
/*    */     } 
/*    */     return arrayOfInt;
/*    */   }
/*    */   
/*    */   private final float[] encodePointList(List<Offset> points) {
/*    */     byte b;
/*    */     int i;
/*    */     float[] arrayOfFloat;
/*    */     for (b = 0, i = points.size() * 2, arrayOfFloat = new float[i]; b < i; ) {
/*    */       byte b1 = b;
/*    */       int pointIndex = b1 / 2;
/*    */       long point = ((Offset)points.get(pointIndex)).unbox-impl();
/*    */       arrayOfFloat[b1] = (b1 % 2 == 0) ? Offset.getX-impl(point) : Offset.getY-impl(point);
/*    */       b++;
/*    */     } 
/*    */     return arrayOfFloat;
/*    */   }
/*    */ }


/* Location:              C:\Users\yuzum\Downloads\ej-release-243.132.63.zip!\ej\li\\ui-graphics-desktop-1.7.3.jar!\androidx\compos\\ui\graphics\Vertices.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */