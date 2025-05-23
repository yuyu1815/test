/*     */ package org.jetbrains.jewel.ui.painter.hints;
/*     */ import androidx.compose.ui.graphics.Color;
/*     */ import androidx.compose.ui.graphics.ColorKt;
/*     */ import java.util.LinkedHashMap;
/*     */ import java.util.List;
/*     */ import java.util.Map;
/*     */ import kotlin.collections.CollectionsKt;
/*     */ import kotlin.collections.MapsKt;
/*     */ import kotlin.jvm.internal.Intrinsics;
/*     */ import kotlin.jvm.internal.SourceDebugExtension;
/*     */ import kotlin.ranges.RangesKt;
/*     */ import org.jetbrains.annotations.NotNull;
/*     */ import org.jetbrains.jewel.ui.painter.PainterProviderScope;
/*     */ import org.w3c.dom.Element;
/*     */ 
/*     */ @GenerateDataFunctions
/*     */ @Metadata(mv = {2, 0, 0}, k = 1, xi = 48, d1 = {"\000H\n\002\030\002\n\002\030\002\n\002\030\002\n\000\n\002\030\002\n\002\b\004\n\002\020\016\n\002\030\002\n\000\n\002\020\002\n\000\n\002\030\002\n\000\n\002\020\013\n\000\n\002\020 \n\002\b\003\n\002\020\000\n\002\b\002\n\002\020\b\n\000\b\003\030\0002\0020\0012\0020\002B\017\022\006\020\003\032\0020\004¢\006\004\b\005\020\006J\f\020\b\032\0020\t*\0020\nH\026J\024\020\013\032\0020\f*\0020\n2\006\020\r\032\0020\016H\026J\f\020\017\032\0020\020*\0020\nH\026J\023\020\024\032\0020\0202\b\020\025\032\004\030\0010\026H\002J\b\020\027\032\0020\tH\026J\b\020\030\032\0020\031H\026R\020\020\003\032\0020\004X\004¢\006\004\n\002\020\007R\024\020\021\032\b\022\004\022\0020\0040\022X\004¢\006\002\n\000R\024\020\023\032\b\022\004\022\0020\0040\022X\004¢\006\002\n\000¨\006\032"}, d2 = {"Lorg/jetbrains/jewel/ui/painter/hints/StrokeImpl;", "Lorg/jetbrains/jewel/ui/painter/PainterSuffixHint;", "Lorg/jetbrains/jewel/ui/painter/PainterSvgPatchHint;", "color", "Landroidx/compose/ui/graphics/Color;", "<init>", "(JLkotlin/jvm/internal/DefaultConstructorMarker;)V", "J", "suffix", "", "Lorg/jetbrains/jewel/ui/painter/PainterProviderScope;", "patch", "", "element", "Lorg/w3c/dom/Element;", "canApply", "", "backgroundPalette", "", "strokeColors", "equals", "other", "", "toString", "hashCode", "", "ui"})
/*     */ @Immutable
/*     */ @SourceDebugExtension({"SMAP\nDarkAndStroke.kt\nKotlin\n*S Kotlin\n*F\n+ 1 DarkAndStroke.kt\norg/jetbrains/jewel/ui/painter/hints/StrokeImpl\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,102:1\n1271#2,2:103\n1285#2,4:105\n*S KotlinDebug\n*F\n+ 1 DarkAndStroke.kt\norg/jetbrains/jewel/ui/painter/hints/StrokeImpl\n*L\n29#1:103,2\n29#1:105,4\n*E\n"})
/*     */ final class StrokeImpl extends PainterSuffixHint implements PainterSvgPatchHint {
/*     */   private final long color;
/*     */   
/*     */   private StrokeImpl(long color) {
/*  24 */     this.color = color;
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */     
/*  37 */     Color[] arrayOfColor = new Color[9]; arrayOfColor[0] = Color.box-impl(ColorKt.Color(4293651696L)); arrayOfColor[1] = 
/*  38 */       Color.box-impl(ColorKt.Color(4293390333L));
/*  39 */     arrayOfColor[2] = Color.box-impl(ColorKt.Color(4292866784L));
/*  40 */     arrayOfColor[3] = Color.box-impl(ColorKt.Color(4294114547L));
/*  41 */     arrayOfColor[4] = Color.box-impl(ColorKt.Color(4294961384L));
/*  42 */     arrayOfColor[5] = Color.box-impl(ColorKt.Color(4294964725L));
/*  43 */     arrayOfColor[6] = Color.box-impl(ColorKt.Color(4294965475L));
/*  44 */     arrayOfColor[7] = Color.box-impl(ColorKt.Color(4294964459L));
/*  45 */     arrayOfColor[8] = Color.box-impl(ColorKt.Color(4293845247L));
/*     */ 
/*     */     
/*     */     this.backgroundPalette = CollectionsKt.listOf((Object[])arrayOfColor);
/*     */     
/*  50 */     arrayOfColor = new Color[12]; arrayOfColor[0] = Color.box-impl(ColorKt.Color(4278190080L)); arrayOfColor[1] = 
/*  51 */       Color.box-impl(ColorKt.Color(4294967295L));
/*  52 */     arrayOfColor[2] = Color.box-impl(ColorKt.Color(4286678420L));
/*  53 */     arrayOfColor[3] = Color.box-impl(ColorKt.Color(4285296766L));
/*  54 */     arrayOfColor[4] = Color.box-impl(ColorKt.Color(4281693424L));
/*  55 */     arrayOfColor[5] = Color.box-impl(ColorKt.Color(4284463205L));
/*  56 */     arrayOfColor[6] = Color.box-impl(ColorKt.Color(4293087826L));
/*  57 */     arrayOfColor[7] = Color.box-impl(ColorKt.Color(4293620081L));
/*  58 */     arrayOfColor[8] = Color.box-impl(ColorKt.Color(4293111373L));
/*  59 */     arrayOfColor[9] = Color.box-impl(ColorKt.Color(4294756187L));
/*  60 */     arrayOfColor[10] = Color.box-impl(ColorKt.Color(4294085685L));
/*  61 */     arrayOfColor[11] = Color.box-impl(ColorKt.Color(4287978208L));
/*     */     this.strokeColors = CollectionsKt.listOf((Object[])arrayOfColor);
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   @NotNull
/*     */   private final List<Color> backgroundPalette;
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   @NotNull
/*     */   private final List<Color> strokeColors;
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   @NotNull
/*     */   public String suffix(@NotNull PainterProviderScope $this$suffix) {
/*     */     Intrinsics.checkNotNullParameter($this$suffix, "<this>");
/*     */     return "_stroke";
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public void patch(@NotNull PainterProviderScope $this$patch, @NotNull Element element) {
/*     */     Intrinsics.checkNotNullParameter($this$patch, "<this>");
/*     */     Intrinsics.checkNotNullParameter(element, "element");
/*     */     if (StringsKt.contains$default($this$patch.getPath(), suffix($this$patch), false, 2, null)) {
/*     */       return;
/*     */     }
/*     */     Iterable<Color> $this$associateWith$iv = this.backgroundPalette;
/*     */     int $i$f$associateWith = 0;
/* 103 */     LinkedHashMap<Object, Object> linkedHashMap1 = new LinkedHashMap<>(RangesKt.coerceAtLeast(MapsKt.mapCapacity(CollectionsKt.collectionSizeOrDefault($this$associateWith$iv, 10)), 16));
/* 104 */     Iterable<Color> iterable1 = $this$associateWith$iv; int $i$f$associateWithTo = 0;
/* 105 */     for (Color element$iv$iv : iterable1) {
/* 106 */       long l = ((Color)element$iv$iv).unbox-impl(); Object object = element$iv$iv; LinkedHashMap<Object, Object> linkedHashMap = linkedHashMap1; int $i$a$-associateWith-StrokeImpl$patch$palette$1 = 0; Color color1 = Color.box-impl(Color.Companion.getTransparent-0d7_KjU()); linkedHashMap.put(object, color1);
/*     */     }  $this$associateWith$iv = this.strokeColors;
/* 108 */     LinkedHashMap<Object, Object> linkedHashMap2 = linkedHashMap1; $i$f$associateWith = 0; LinkedHashMap<Object, Object> result$iv = new LinkedHashMap<>(RangesKt.coerceAtLeast(MapsKt.mapCapacity(CollectionsKt.collectionSizeOrDefault($this$associateWith$iv, 10)), 16)); Iterable<Color> $this$associateWithTo$iv$iv = $this$associateWith$iv; $i$f$associateWithTo = 0; for (Color element$iv$iv : $this$associateWithTo$iv$iv) { long it = ((Color)element$iv$iv).unbox-impl(); Object object = element$iv$iv; LinkedHashMap<Object, Object> linkedHashMap = result$iv; int $i$a$-associateWith-StrokeImpl$patch$palette$2 = 0; Color color1 = Color.box-impl(this.color); linkedHashMap.put(object, color1); }  Map palette = MapsKt.plus(linkedHashMap2, result$iv);
/*     */     ColorBasedPaletteReplacementKt.patchPalette$default(element, palette, null, 2, null);
/*     */   }
/*     */   
/*     */   public boolean canApply(@NotNull PainterProviderScope $this$canApply) {
/*     */     Intrinsics.checkNotNullParameter($this$canApply, "<this>");
/*     */     return true;
/*     */   }
/*     */   
/*     */   public boolean equals(@Nullable Object other) {
/*     */     if (this == other)
/*     */       return true; 
/*     */     if (!(other instanceof StrokeImpl))
/*     */       return false; 
/*     */     if (!Color.equals-impl0(this.color, ((StrokeImpl)other).color))
/*     */       return false; 
/*     */     return true;
/*     */   }
/*     */   
/*     */   @NotNull
/*     */   public String toString() {
/*     */     return "Stroke(color=" + Color.toString-impl(this.color) + ")";
/*     */   }
/*     */   
/*     */   public int hashCode() {
/*     */     return Color.hashCode-impl(this.color);
/*     */   }
/*     */ }


/* Location:              C:\Users\yuzum\Downloads\ej-release-243.132.63.zip!\ej\lib\jewel-ui-243-0.27.0.jar!\org\jetbrains\jewe\\ui\painter\hints\StrokeImpl.class
 * Java compiler version: 17 (61.0)
 * JD-Core Version:       1.1.3
 */