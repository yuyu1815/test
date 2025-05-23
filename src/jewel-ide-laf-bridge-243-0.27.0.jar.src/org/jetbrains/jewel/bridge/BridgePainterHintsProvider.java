/*     */ package org.jetbrains.jewel.bridge;
/*     */ 
/*     */ import androidx.compose.runtime.Composer;
/*     */ import androidx.compose.runtime.ComposerKt;
/*     */ import androidx.compose.ui.graphics.Color;
/*     */ import com.intellij.ide.ui.laf.UIThemeExportableBean;
/*     */ import com.intellij.ide.ui.laf.UIThemeLookAndFeelInfo;
/*     */ import com.intellij.openapi.diagnostic.Logger;
/*     */ import java.util.LinkedHashMap;
/*     */ import java.util.List;
/*     */ import java.util.Map;
/*     */ import kotlin.jvm.internal.DefaultConstructorMarker;
/*     */ import kotlin.jvm.internal.Intrinsics;
/*     */ import org.jetbrains.annotations.NotNull;
/*     */ import org.jetbrains.jewel.ui.painter.PainterHint;
/*     */ import org.jetbrains.jewel.ui.painter.hints.ColorBasedPaletteReplacementKt;
/*     */ 
/*     */ @InternalJewelApi
/*     */ @Metadata(mv = {2, 0, 0}, k = 1, xi = 48, d1 = {"\000B\n\002\030\002\n\002\030\002\n\000\n\002\020\013\n\000\n\002\020$\n\002\020\016\n\002\b\002\n\002\030\002\n\002\b\003\n\002\030\002\n\002\b\t\n\002\020\002\n\000\n\002\020%\n\002\b\004\n\002\020 \n\002\b\004\b\007\030\000 !2\0020\001:\001!BY\b\002\022\006\020\002\032\0020\003\022\026\b\002\020\004\032\020\022\004\022\0020\006\022\006\022\004\030\0010\0060\005\022\026\b\002\020\007\032\020\022\004\022\0020\006\022\006\022\004\030\0010\0060\005\022\026\b\002\020\b\032\020\022\004\022\0020\006\022\006\022\004\030\0010\t0\005¢\006\004\b\n\020\013J,\020\026\032\0020\0272\022\020\030\032\016\022\004\022\0020\t\022\004\022\0020\t0\0312\006\020\032\032\0020\0062\006\020\033\032\0020\006H\002J,\020\034\032\0020\0272\022\020\030\032\016\022\004\022\0020\006\022\004\022\0020\t0\0312\006\020\032\032\0020\0062\006\020\033\032\0020\006H\002J\033\020\035\032\b\022\004\022\0020\r0\0362\006\020\037\032\0020\006H\027¢\006\002\020 R\024\020\f\032\0020\rX\004¢\006\b\n\000\032\004\b\016\020\017R\024\020\020\032\0020\rX\004¢\006\b\n\000\032\004\b\021\020\017R\024\020\022\032\0020\rX\004¢\006\b\n\000\032\004\b\023\020\017R\024\020\024\032\0020\rX\004¢\006\b\n\000\032\004\b\025\020\017¨\006\""}, d2 = {"Lorg/jetbrains/jewel/bridge/BridgePainterHintsProvider;", "Lorg/jetbrains/jewel/ui/painter/PalettePainterHintsProvider;", "isDark", "", "intellijIconPalette", "", "", "themeIconPalette", "themeColorPalette", "Landroidx/compose/ui/graphics/Color;", "<init>", "(ZLjava/util/Map;Ljava/util/Map;Ljava/util/Map;)V", "checkBoxByColorPaletteHint", "Lorg/jetbrains/jewel/ui/painter/PainterHint;", "getCheckBoxByColorPaletteHint", "()Lorg/jetbrains/jewel/ui/painter/PainterHint;", "checkBoxByKeyPaletteHint", "getCheckBoxByKeyPaletteHint", "treePaletteHint", "getTreePaletteHint", "uiPaletteHint", "getUiPaletteHint", "registerColorBasedReplacement", "", "map", "", "key", "value", "registerIdBasedReplacement", "hints", "", "path", "(Ljava/lang/String;Landroidx/compose/runtime/Composer;I)Ljava/util/List;", "Companion", "ide-laf-bridge"})
/*     */ @StabilityInferred(parameters = 1)
/*     */ @SourceDebugExtension({"SMAP\nBridgePainterHintsProvider.kt\nKotlin\n*S Kotlin\n*F\n+ 1 BridgePainterHintsProvider.kt\norg/jetbrains/jewel/bridge/BridgePainterHintsProvider\n+ 2 logger.kt\ncom/intellij/openapi/diagnostic/LoggerKt\n*L\n1#1,145:1\n24#2:146\n*S KotlinDebug\n*F\n+ 1 BridgePainterHintsProvider.kt\norg/jetbrains/jewel/bridge/BridgePainterHintsProvider\n*L\n104#1:146\n*E\n"})
/*     */ public final class BridgePainterHintsProvider extends PalettePainterHintsProvider {
/*     */   @NotNull
/*     */   public static final Companion Companion;
/*     */   @NotNull
/*     */   private final PainterHint checkBoxByColorPaletteHint;
/*     */   @NotNull
/*     */   private final PainterHint checkBoxByKeyPaletteHint;
/*     */   
/*  30 */   private BridgePainterHintsProvider(boolean isDark, Map intellijIconPalette, Map themeIconPalette, Map themeColorPalette) { super(isDark, intellijIconPalette, themeIconPalette, themeColorPalette);
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */     
/*  37 */     Map<Object, Object> ui = new LinkedHashMap<>();
/*  38 */     Map<Object, Object> checkBoxesByColor = new LinkedHashMap<>();
/*  39 */     Map<Object, Object> checkBoxesByKey = new LinkedHashMap<>();
/*  40 */     Map<Object, Object> trees = new LinkedHashMap<>();
/*     */ 
/*     */     
/*  43 */     for (Map.Entry entry : themeIconPalette.entrySet()) { String key = (String)entry.getKey(), value = (String)entry.getValue();
/*  44 */       if (value != null) {
/*     */         Map<Color, Color> map;
/*     */ 
/*     */ 
/*     */         
/*  49 */         if (StringsKt.startsWith$default(key, "Checkbox.", false, 2, null) && NewUI.isEnabled()) {
/*  50 */           registerIdBasedReplacement((Map)checkBoxesByKey, key, value);
/*     */         }
/*     */         
/*  53 */         if (selectMap(key, checkBoxesByColor, trees, ui) == null) { selectMap(key, checkBoxesByColor, trees, ui); continue; }
/*  54 */          registerColorBasedReplacement(map, key, value);
/*     */       }  }
/*     */     
/*  57 */     this.checkBoxByKeyPaletteHint = KeyBasedPaletteReplacementKt.KeyBasedPaletteReplacement(checkBoxesByKey);
/*  58 */     this.checkBoxByColorPaletteHint = ColorBasedPaletteReplacementKt.ColorBasedPaletteReplacement(checkBoxesByColor);
/*  59 */     this.treePaletteHint = ColorBasedPaletteReplacementKt.ColorBasedPaletteReplacement(trees);
/*  60 */     this.uiPaletteHint = ColorBasedPaletteReplacementKt.ColorBasedPaletteReplacement(ui); }
/*     */   @NotNull
/*     */   private final PainterHint treePaletteHint;
/*     */   @NotNull
/*     */   private final PainterHint uiPaletteHint;
/*     */   public static final int $stable;
/*     */   @NotNull
/*     */   protected PainterHint getCheckBoxByColorPaletteHint() { return this.checkBoxByColorPaletteHint; } @NotNull
/*     */   protected PainterHint getCheckBoxByKeyPaletteHint() { return this.checkBoxByKeyPaletteHint; } @NotNull
/*     */   protected PainterHint getTreePaletteHint() { return this.treePaletteHint; } @NotNull
/*     */   protected PainterHint getUiPaletteHint() { return this.uiPaletteHint; } private final void registerColorBasedReplacement(Map map, String key, String value) {
/*     */     // Byte code:
/*     */     //   0: aload_0
/*     */     //   1: aload_2
/*     */     //   2: aload_0
/*     */     //   3: invokevirtual getIntellijIconPalette : ()Ljava/util/Map;
/*     */     //   6: aload_0
/*     */     //   7: invokevirtual isDark : ()Z
/*     */     //   10: invokevirtual resolveKeyColor-8tov2TA : (Ljava/lang/String;Ljava/util/Map;Z)Landroidx/compose/ui/graphics/Color;
/*     */     //   13: dup
/*     */     //   14: ifnull -> 23
/*     */     //   17: invokevirtual unbox-impl : ()J
/*     */     //   20: goto -> 25
/*     */     //   23: pop
/*     */     //   24: return
/*     */     //   25: lstore #4
/*     */     //   27: aload_0
/*     */     //   28: aload_3
/*     */     //   29: invokevirtual resolveColor-ijrfgN4 : (Ljava/lang/String;)Landroidx/compose/ui/graphics/Color;
/*     */     //   32: dup
/*     */     //   33: ifnull -> 42
/*     */     //   36: invokevirtual unbox-impl : ()J
/*     */     //   39: goto -> 44
/*     */     //   42: pop
/*     */     //   43: return
/*     */     //   44: lstore #6
/*     */     //   46: lload #4
/*     */     //   48: invokestatic box-impl : (J)Landroidx/compose/ui/graphics/Color;
/*     */     //   51: astore #8
/*     */     //   53: lload #6
/*     */     //   55: invokestatic box-impl : (J)Landroidx/compose/ui/graphics/Color;
/*     */     //   58: astore #9
/*     */     //   60: aload_1
/*     */     //   61: aload #8
/*     */     //   63: aload #9
/*     */     //   65: invokeinterface put : (Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
/*     */     //   70: pop
/*     */     //   71: return
/*     */     // Line number table:
/*     */     //   Java source line number -> byte code offset
/*     */     //   #65	-> 0
/*     */     //   #66	-> 27
/*     */     //   #69	-> 60
/*     */     //   #70	-> 71
/*     */     // Local variable table:
/*     */     //   start	length	slot	name	descriptor
/*     */     //   27	45	4	keyAsColor	J
/*     */     //   46	26	6	resolvedColor	J
/*     */     //   0	72	0	this	Lorg/jetbrains/jewel/bridge/BridgePainterHintsProvider;
/*     */     //   0	72	1	map	Ljava/util/Map;
/*     */     //   0	72	2	key	Ljava/lang/String;
/*     */     //   0	72	3	value	Ljava/lang/String;
/*     */   } private final void registerIdBasedReplacement(Map<String, Color> map, String key, String value) {
/*  73 */     String adjustedKey = isDark() ? StringsKt.removeSuffix(key, ".Dark") : key;
/*     */     
/*  75 */     if (!supportedCheckboxKeys.contains(adjustedKey)) {
/*  76 */       logger.debug((isDark() ? "Dark" : "Light") + " theme: color key " + (isDark() ? "Dark" : "Light") + " is not supported, will be ignored");
/*     */       
/*     */       return;
/*     */     } 
/*  80 */     if (!Intrinsics.areEqual(adjustedKey, key)) {
/*  81 */       logger.warn((
/*  82 */           isDark() ? "Dark" : "Light") + " theme: color key " + (isDark() ? "Dark" : "Light") + " is deprecated, use " + key + " instead");
/*     */     }
/*     */ 
/*     */     
/*  86 */     Color parsedValue = resolveColor-ijrfgN4(value);
/*  87 */     if (parsedValue == null) {
/*  88 */       logger.info((isDark() ? "Dark" : "Light") + " theme: color key " + (isDark() ? "Dark" : "Light") + " has invalid value: '" + key + "'");
/*     */       
/*     */       return;
/*     */     } 
/*  92 */     map.put(adjustedKey, parsedValue);
/*     */   }
/*     */   @Composable
/*     */   @NotNull
/*  96 */   public List<PainterHint> hints(@NotNull String path, @Nullable Composer $composer, int $changed) { Intrinsics.checkNotNullParameter(path, "path"); $composer.startReplaceGroup(1115015623); if (ComposerKt.isTraceInProgress()) ComposerKt.traceEventStart(1115015623, $changed, -1, "org.jetbrains.jewel.bridge.BridgePainterHintsProvider.hints (BridgePainterHintsProvider.kt:95)");  List<BridgeOverride> list1 = CollectionsKt.createListBuilder(), $this$hints_u24lambda_u240 = list1; int $i$a$-buildList-BridgePainterHintsProvider$hints$1 = 0;
/*  97 */     $this$hints_u24lambda_u240.add(BridgeOverride.INSTANCE);
/*  98 */     $this$hints_u24lambda_u240.add(getPaletteHint(path, BridgeUtilsKt.isNewUiTheme()));
/*  99 */     $this$hints_u24lambda_u240.add(HiDpiKt.HiDpi());
/* 100 */     $this$hints_u24lambda_u240.add(DarkAndStrokeKt.Dark(JewelTheme.Companion.isDark($composer, 6)));
/*     */     List<PainterHint> list = CollectionsKt.build(list1);
/*     */     if (ComposerKt.isTraceInProgress())
/*     */       ComposerKt.traceEventEnd(); 
/*     */     $composer.endReplaceGroup();
/*     */     return list; } @Metadata(mv = {2, 0, 0}, k = 1, xi = 48, d1 = {"\000(\n\002\030\002\n\002\020\000\n\002\b\003\n\002\030\002\n\000\n\002\030\002\n\000\n\002\020\013\n\000\n\002\020\"\n\002\020\016\n\000\b\003\030\0002\0020\001B\t\b\002¢\006\004\b\002\020\003J\021\020\006\032\0020\0072\006\020\b\032\0020\tH\002R\016\020\004\032\0020\005X\004¢\006\002\n\000R\024\020\n\032\b\022\004\022\0020\f0\013X\004¢\006\002\n\000¨\006\r"}, d2 = {"Lorg/jetbrains/jewel/bridge/BridgePainterHintsProvider$Companion;", "", "<init>", "()V", "logger", "Lcom/intellij/openapi/diagnostic/Logger;", "invoke", "Lorg/jetbrains/jewel/ui/painter/PalettePainterHintsProvider;", "isDark", "", "supportedCheckboxKeys", "", "", "ide-laf-bridge"}) @SourceDebugExtension({"SMAP\nBridgePainterHintsProvider.kt\nKotlin\n*S Kotlin\n*F\n+ 1 BridgePainterHintsProvider.kt\norg/jetbrains/jewel/bridge/BridgePainterHintsProvider$Companion\n+ 2 Maps.kt\nkotlin/collections/MapsKt__MapsKt\n+ 3 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,145:1\n462#2:146\n412#2:147\n462#2:152\n412#2:153\n1246#3,4:148\n1246#3,4:154\n*S KotlinDebug\n*F\n+ 1 BridgePainterHintsProvider.kt\norg/jetbrains/jewel/bridge/BridgePainterHintsProvider$Companion\n*L\n113#1:146\n113#1:147\n121#1:152\n121#1:153\n113#1:148,4\n121#1:154,4\n*E\n"})
/*     */   public static final class Companion { private Companion() {} @NotNull
/*     */     public final PalettePainterHintsProvider invoke(boolean isDark) { UIThemeLookAndFeelInfo uiTheme;
/* 108 */       if (UiThemeExtensionsKt.currentUiThemeOrNull() == null) { UiThemeExtensionsKt.currentUiThemeOrNull(); return new BridgePainterHintsProvider(isDark, null, null, null, 14, null); }
/* 109 */        BridgePainterHintsProvider.logger.info("Parsing theme info from theme " + uiTheme.getName() + " (id: " + uiTheme.getId() + ", isDark: " + uiTheme.isDark() + ")");
/*     */       
/* 111 */       UIThemeExportableBean bean = uiTheme.describe();
/*     */       
/* 113 */       Intrinsics.checkNotNull(bean.getColorPalette(), "null cannot be cast to non-null type kotlin.collections.Map<kotlin.String, kotlin.Any?>"); Map $this$mapValues$iv = bean.getColorPalette(); int $i$f$mapValues = 0;
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */       
/* 146 */       Map map2 = $this$mapValues$iv; Map<Object, Object> destination$iv$iv = new LinkedHashMap<>(MapsKt.mapCapacity($this$mapValues$iv.size())); int $i$f$mapValuesTo = 0;
/* 147 */       Iterable $this$associateByTo$iv$iv$iv = map2.entrySet(); int $i$f$associateByTo = 0;
/* 148 */       for (Object element$iv$iv$iv : $this$associateByTo$iv$iv$iv) {
/* 149 */         Map.Entry entry1 = (Map.Entry)element$iv$iv$iv; Map<Object, Object> map5 = destination$iv$iv; int $i$a$-associateByTo-MapsKt__MapsKt$mapValuesTo$1$iv$iv = 0; Map.Entry entry2 = (Map.Entry)element$iv$iv$iv; Object object1 = entry1.getKey(); Map<Object, Object> map6 = map5; int $i$a$-mapValues-BridgePainterHintsProvider$Companion$invoke$iconColorPalette$1 = 0;
/*     */       } 
/* 151 */       Map<Object, Object> iconColorPalette = destination$iv$iv; Map keyPalette = UITheme.Companion.getColorPalette(); Map map1 = bean.getColors(); int i = 0;
/* 152 */       Map map3 = map1; Map<Object, Object> map4 = new LinkedHashMap<>(MapsKt.mapCapacity(map1.size())); int j = 0;
/* 153 */       Iterable iterable1 = map3.entrySet(); int k = 0;
/* 154 */       for (Object element$iv$iv$iv : iterable1) {
/* 155 */         Map.Entry entry = (Map.Entry)element$iv$iv$iv; Map<Object, Object> map5 = map4; int $i$a$-associateByTo-MapsKt__MapsKt$mapValuesTo$1$iv$iv = 0; Object value = element$iv$iv$iv, object1 = entry.getKey(); Map<Object, Object> map6 = map5; int $i$a$-mapValues-BridgePainterHintsProvider$Companion$invoke$themeColors$1 = 0;
/*     */       } 
/* 157 */       Map<Object, Object> themeColors = map4;
/*     */       return new BridgePainterHintsProvider(isDark, keyPalette, iconColorPalette, themeColors, null); }
/*     */      }
/*     */ 
/*     */   
/*     */   static {
/*     */     Object $this$thisLogger$iv = Companion = new Companion(null);
/*     */     int $i$f$thisLogger = 0;
/*     */     Intrinsics.checkNotNullExpressionValue(Logger.getInstance(Companion.class), "getInstance(...)");
/*     */   }
/*     */   
/*     */   static {
/*     */     $this$thisLogger$iv = new String[9];
/*     */     $this$thisLogger$iv[0] = "Checkbox.Background.Default";
/*     */     $this$thisLogger$iv[1] = "Checkbox.Border.Default";
/*     */     $this$thisLogger$iv[2] = "Checkbox.Foreground.Selected";
/*     */     $this$thisLogger$iv[3] = "Checkbox.Background.Selected";
/*     */     $this$thisLogger$iv[4] = "Checkbox.Border.Selected";
/*     */     $this$thisLogger$iv[5] = "Checkbox.Focus.Wide";
/*     */     $this$thisLogger$iv[6] = "Checkbox.Foreground.Disabled";
/*     */     $this$thisLogger$iv[7] = "Checkbox.Background.Disabled";
/*     */     $this$thisLogger$iv[8] = "Checkbox.Border.Disabled";
/*     */     supportedCheckboxKeys = SetsKt.setOf((Object[])$this$thisLogger$iv);
/*     */   }
/*     */   
/*     */   @NotNull
/*     */   private static final Logger logger = Logger.getInstance(Companion.class);
/*     */   @NotNull
/*     */   private static final Set<String> supportedCheckboxKeys;
/*     */ }


/* Location:              C:\Users\yuzum\Downloads\ej-release-243.132.63.zip!\ej\lib\jewel-ide-laf-bridge-243-0.27.0.jar!\org\jetbrains\jewel\bridge\BridgePainterHintsProvider.class
 * Java compiler version: 17 (61.0)
 * JD-Core Version:       1.1.3
 */