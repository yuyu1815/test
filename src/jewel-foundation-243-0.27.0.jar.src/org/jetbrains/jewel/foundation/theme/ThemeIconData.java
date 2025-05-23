/*    */ package org.jetbrains.jewel.foundation.theme;
/*    */ 
/*    */ 
/*    */ @Metadata(mv = {2, 0, 0}, k = 1, xi = 48, d1 = {"\000&\n\002\030\002\n\002\020\000\n\000\n\002\020$\n\002\020\016\n\002\b\002\n\002\020\b\n\002\b\007\n\002\030\002\n\002\b\002\b\007\030\000 \0202\0020\001:\001\020BE\022\022\020\002\032\016\022\004\022\0020\004\022\004\022\0020\0040\003\022\024\020\005\032\020\022\004\022\0020\004\022\006\022\004\030\0010\0040\003\022\022\020\006\032\016\022\004\022\0020\004\022\004\022\0020\0070\003¢\006\004\b\b\020\tJ\022\020\016\032\016\022\004\022\0020\017\022\004\022\0020\0170\003R\035\020\002\032\016\022\004\022\0020\004\022\004\022\0020\0040\003¢\006\b\n\000\032\004\b\n\020\013R\037\020\005\032\020\022\004\022\0020\004\022\006\022\004\030\0010\0040\003¢\006\b\n\000\032\004\b\f\020\013R\035\020\006\032\016\022\004\022\0020\004\022\004\022\0020\0070\003¢\006\b\n\000\032\004\b\r\020\013¨\006\021"}, d2 = {"Lorg/jetbrains/jewel/foundation/theme/ThemeIconData;", "", "iconOverrides", "", "", "colorPalette", "selectionColorPalette", "", "<init>", "(Ljava/util/Map;Ljava/util/Map;Ljava/util/Map;)V", "getIconOverrides", "()Ljava/util/Map;", "getColorPalette", "getSelectionColorPalette", "selectionColorMapping", "Landroidx/compose/ui/graphics/Color;", "Companion", "foundation"})
/*    */ @Immutable
/*    */ @SourceDebugExtension({"SMAP\nThemeIconData.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ThemeIconData.kt\norg/jetbrains/jewel/foundation/theme/ThemeIconData\n+ 2 _Maps.kt\nkotlin/collections/MapsKt___MapsKt\n+ 3 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,42:1\n135#2,9:43\n215#2:52\n216#2:54\n144#2:55\n1#3:53\n*S KotlinDebug\n*F\n+ 1 ThemeIconData.kt\norg/jetbrains/jewel/foundation/theme/ThemeIconData\n*L\n14#1:43,9\n14#1:52\n14#1:54\n14#1:55\n14#1:53\n*E\n"})
/*    */ public final class ThemeIconData {
/*  8 */   public ThemeIconData(@NotNull Map<String, String> iconOverrides, @NotNull Map<String, String> colorPalette, @NotNull Map<String, Integer> selectionColorPalette) { this.iconOverrides = iconOverrides;
/*  9 */     this.colorPalette = colorPalette;
/* 10 */     this.selectionColorPalette = selectionColorPalette; } @NotNull public final Map<String, String> getIconOverrides() { return this.iconOverrides; } @NotNull public final Map<String, Integer> getSelectionColorPalette() { return this.selectionColorPalette; }
/*    */   @NotNull
/*    */   public final Map<String, String> getColorPalette() { return this.colorPalette; } @NotNull
/* 13 */   public final Map<Color, Color> selectionColorMapping() { Map<String, Integer> map1 = this.selectionColorPalette;
/* 14 */     int $i$f$mapNotNull = 0;
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
/* 43 */     Map<String, Integer> map2 = map1; Collection destination$iv$iv = new ArrayList(); int $i$f$mapNotNullTo = 0;
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */     
/* 51 */     Map<String, Integer> $this$forEach$iv$iv$iv = map2; int $i$f$forEach = 0;
/* 52 */     Iterator<Map.Entry> iterator = $this$forEach$iv$iv$iv.entrySet().iterator(); if (iterator.hasNext()) { Map.Entry element$iv$iv$iv = iterator.next(), element$iv$iv = element$iv$iv$iv; int $i$a$-forEach-MapsKt___MapsKt$mapNotNullTo$1$iv$iv = 0; Map.Entry entry1 = element$iv$iv;
/*    */       int $i$a$-mapNotNull-ThemeIconData$selectionColorMapping$1 = 0; }
/*    */     
/* 55 */     return MapsKt.toMap(destination$iv$iv); }
/*    */ 
/*    */   
/*    */   @Metadata(mv = {2, 0, 0}, k = 1, xi = 48, d1 = {"\000\024\n\002\030\002\n\002\020\000\n\002\b\003\n\002\030\002\n\002\b\003\b\003\030\0002\0020\001B\t\b\002¢\006\004\b\002\020\003R\021\020\004\032\0020\005¢\006\b\n\000\032\004\b\006\020\007¨\006\b"}, d2 = {"Lorg/jetbrains/jewel/foundation/theme/ThemeIconData$Companion;", "", "<init>", "()V", "Empty", "Lorg/jetbrains/jewel/foundation/theme/ThemeIconData;", "getEmpty", "()Lorg/jetbrains/jewel/foundation/theme/ThemeIconData;", "foundation"})
/*    */   public static final class Companion {
/*    */     private Companion() {}
/*    */     
/*    */     @NotNull
/*    */     public final ThemeIconData getEmpty() {
/*    */       return ThemeIconData.Empty;
/*    */     }
/*    */   }
/*    */   
/*    */   @NotNull
/*    */   public static final Companion Companion = new Companion(null);
/*    */   @NotNull
/*    */   private final Map<String, String> iconOverrides;
/*    */   @NotNull
/*    */   private final Map<String, String> colorPalette;
/*    */   @NotNull
/*    */   private final Map<String, Integer> selectionColorPalette;
/*    */   public static final int $stable;
/*    */   @NotNull
/*    */   private static final ThemeIconData Empty = new ThemeIconData(MapsKt.emptyMap(), MapsKt.emptyMap(), MapsKt.emptyMap());
/*    */ }


/* Location:              C:\Users\yuzum\Downloads\ej-release-243.132.63.zip!\ej\lib\jewel-foundation-243-0.27.0.jar!\org\jetbrains\jewel\foundation\theme\ThemeIconData.class
 * Java compiler version: 17 (61.0)
 * JD-Core Version:       1.1.3
 */